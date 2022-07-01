package org.oracle.entity;
/**
 * 
 */


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author gaurkuku
 *
 */
@Entity
@Table(name = "DATASOURCECONFIG")
public class DataSourceConfig {

	@Id
	@Column(name = "ID")
	private Integer id;
	@Column(name = "TENANTNAME")
	private String tenantName;
	@Column(name = "URL")
	private String url;
	@Column(name = "USERNAME")
	private String userName;
	@Column(name = "PASSWORD")
	private String password;
	@Column(name = "DRIVERCLASSNAME")
	private String driverClassName;

	/**
	 * 
	 */
	public DataSourceConfig() {

	}

	/**
	 * @param id
	 * @param tenantName
	 * @param url
	 * @param userName
	 * @param password
	 * @param driverClassName
	 */
	public DataSourceConfig(Integer id, String tenantName, String url, String userName, String password,
			String driverClassName) {
		this.id = id;
		this.tenantName = tenantName;
		this.url = url;
		this.userName = userName;
		this.password = password;
		this.driverClassName = driverClassName;
	}



	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the tenantName
	 */
	public String getTenantName() {
		return tenantName;
	}

	/**
	 * @param tenantName the tenantName to set
	 */
	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * @return the driverClassName
	 */
	public String getDriverClassName() {
		return driverClassName;
	}

	/**
	 * @param driverClassName the driverClassName to set
	 */
	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	@Override
	public String toString() {
		return String.format(
				"DataSourceConfig [id=%s, tenantName=%s, url=%s, userName=%s, password=%s, driverClassName=%s]", id,
				tenantName, url, userName, password, driverClassName);
	}

}
