/**
 * 
 */
package org.oracle.controller;

import java.util.List;

import org.oracle.entity.DataSourceConfig;
import org.oracle.service.DataSourceConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gaurkuku
 *
 */
@RestController
@RequestMapping("/db")
public class DSConfigController {

	@Autowired
	DataSourceConfigService dsConfigService;
	
	@GetMapping("/getAll")
	public List<DataSourceConfig> getAllStudents() {
		
		return dsConfigService.getAllDataSources();
	}
}
