package org.oracle.config;
/**
 * 
 */


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gaurkuku
 *
 */

public class TenantContext {

	private static final ThreadLocal<String> CONTEXT = new ThreadLocal<String>();
	private static final String DEFAULTTENANT ="public";
	static Logger logger = LoggerFactory.getLogger(TenantContext.class);

	public static void setTenantId(String tenantId) {

		logger.info("Setting tenant id to : " + tenantId);
		CONTEXT.set(tenantId);
	}

	public static String getTenantId() {
		

		return CONTEXT.get() != null? CONTEXT.get() : DEFAULTTENANT;
	}

	public static void clear() {

		logger.info("clearing tenant id of : " + CONTEXT.get());
		CONTEXT.remove();
	}

}
