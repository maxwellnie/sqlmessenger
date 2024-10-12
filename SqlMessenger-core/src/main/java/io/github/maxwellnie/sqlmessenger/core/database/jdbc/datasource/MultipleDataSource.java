package io.github.maxwellnie.sqlmessenger.core.database.jdbc.datasource;

import io.github.maxwellnie.sqlmessenger.core.java.api.Registry;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author Maxwell Nie
 */
public interface MultipleDataSource extends Registry<Object, DataSource> {
    /**
     * 获取当前使用的数据源
     * @return DataSource
     */
    DataSource getCurrentDataSource();
    /**
     * 获取默认的数据源
     * @return DataSource
     */
    DataSource getDefaultDataSource();
    /**
     * 设置当前使用的数据源
     * @param dataSourceName 数据源名称
     * @return boolean
     */
    boolean setCurrentDataSource(String dataSourceName);
    /**
     * 移除当前使用的数据源
     * @return boolean
     */
    boolean removeCurrentDataSource();
    /**
     * 获取连接
     * @return Connection
     * @throws SQLException
     */
    Connection getConnection() throws SQLException;
}
