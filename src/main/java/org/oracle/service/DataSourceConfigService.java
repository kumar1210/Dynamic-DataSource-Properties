/**
 * 
 */
package org.oracle.service;

import java.util.List;

import org.oracle.entity.DataSourceConfig;
import org.oracle.repository.DataSourceConfigRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author gaurkuku
 *
 */
@Service
public class DataSourceConfigService {

	@Autowired
	DataSourceConfigRepository dsRepo;
	
	public List<DataSourceConfig> getAllDataSources() {
		
		return dsRepo.findAll();
	}
}
