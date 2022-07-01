/**
 * 
 */
package org.oracle.repository;

import org.oracle.entity.DataSourceConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author gaurkuku
 *
 */
@Repository
public interface DataSourceConfigRepository extends JpaRepository<DataSourceConfig, Integer> {

}
