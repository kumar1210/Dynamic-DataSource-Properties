/**
 * 
 */
package org.oracle.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * @author gaurkuku
 *
 */
@Configuration(value = "propConfig")
@ComponentScan(basePackages = "org.oracle.*")
public class PropertiesConfig implements EnvironmentAware {

	@Autowired
	private Environment environment;

    @Override
    public void setEnvironment(final Environment environment) {
        this.environment = environment;
    }

	/**
	 * @return the environment
	 */
	public Environment getEnvironment() {
		return environment;
	}


	@Bean
    public void testBean() {
        System.out.println(environment.getProperty("datasourceone.datasource.url"));
    }
	
}
