/**
 * 
 */
package org.oracle.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author gaurkuku
 *         <p>
 *         We are using <code {@link RestRequestInterceptor}></code> instead of
 *         <code {@link WebCustomRequestInterceptor}></code> because here we can
 *         form a response.
 */
@Configuration
public class RestRequestInterceptor implements HandlerInterceptor {

	private static final String TENANT_HEADER = "X-tenantId";
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception {

		String requestURI = request.getRequestURI();
		String tenantID = request.getHeader(TENANT_HEADER);
		logger.info("RequestURI::" + requestURI + " || Search for X-TenantID  :: " + tenantID);
		if (!StringUtils.hasLength(tenantID)) {
			response.getWriter().write("X-tenantId not present in the Request Header");
			response.setStatus(400);
			return false;
		}
		TenantContext.setTenantId(tenantID);
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		TenantContext.clear();
	}

}
