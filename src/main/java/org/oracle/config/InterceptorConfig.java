/**
 * 
 */
package org.oracle.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author gaurkuku
 *
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
	
    @Autowired
    private RestRequestInterceptor requestInterceptor;
    
//    @Autowired
//    private WebCustomRequestInterceptor requesInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		//registry.addInterceptor(new WebRequestHandlerInterceptorAdapter(requesInterceptor));
		registry.addInterceptor(requestInterceptor);
	}
}
