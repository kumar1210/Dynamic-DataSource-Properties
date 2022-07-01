/**
 * 
 */
package org.oracle.config;

/**
 * @author gaurkuku
 *
 */
public enum DataSourceEnum {
	JDBC1 ("jdbc1")
	, JDBC2 ("jdbc2");

	private final String name;

	DataSourceEnum(String string) {
		this.name = string;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	
}
