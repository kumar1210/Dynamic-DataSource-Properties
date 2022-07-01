/**
 * 
 */
package org.oracle.config;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.context.annotation.DependsOn;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.stereotype.Component;

/**
 * @author gaurkuku
 *
 */
@Component
@DependsOn("propConfig")
public class MultiTenantDSRouting extends AbstractRoutingDataSource {
	
	//@Autowired(required = true)
	private PropertiesConfig propConfig;

	@Override
	protected Object determineCurrentLookupKey() {
		return TenantContext.getTenantId();
	}
	
	
	public MultiTenantDSRouting(PropertiesConfig prop) {

		this.propConfig = prop;
		Map<Object, Object> dataSourceMap = new HashMap<>();
		dataSourceMap.put(DataSourceEnum.JDBC1.getName(), dataSourceOne());
		dataSourceMap.put(DataSourceEnum.JDBC2.getName(), dataSourceTwo());
		this.setTargetDataSources(dataSourceMap);
		this.setDefaultTargetDataSource(dataSourceOne());
	}
	
	public DataSource dataSourceOne() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl(propConfig.getEnvironment().getProperty("datasourceone.datasource.url"));
		dataSource.setUsername(propConfig.getEnvironment().getProperty("datasourceone.datasource.username"));
		dataSource.setPassword(propConfig.getEnvironment().getProperty("datasourceone.datasource.password"));
		return dataSource;
	}

	public DataSource dataSourceTwo() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl(propConfig.getEnvironment().getProperty("datasourcetwo.datasource.url"));
		dataSource.setUsername(propConfig.getEnvironment().getProperty("datasourcetwo.datasource.username"));
		dataSource.setPassword(propConfig.getEnvironment().getProperty("datasourcetwo.datasource.password"));
		return dataSource;
	}
	

}
