package io.github.maxwellnie.sqlmessenger.core.database.jdbc.datasource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Maxwell Nie
 */
public class DefaultDataSource implements MultipleDataSource {
    private final ThreadLocal<String> dataSourceName = new ThreadLocal<>();
    private final Map<Object, DataSource> dataSourceMap = new ConcurrentHashMap<>();
    private final String defaultDataSourceName;

    public DefaultDataSource(String defaultDataSourceName, DataSource defaultDataSource) {
        this.defaultDataSourceName = defaultDataSourceName;
        register(defaultDataSourceName, defaultDataSource);
    }

    @Override
    public DataSource getCurrentDataSource() {
        return dataSourceMap.get(dataSourceName.get());
    }

    @Override
    public DataSource getDefaultDataSource() {
        return dataSourceMap.get(defaultDataSourceName);
    }

    @Override
    public boolean setCurrentDataSource(String dataSourceName) {
        this.dataSourceName.set(defaultDataSourceName);
        return true;
    }

    @Override
    public boolean removeCurrentDataSource() {
        dataSourceName.remove();
        return true;
    }

    @Override
    public Connection getConnection() throws SQLException {
        return getCurrentDataSource().getConnection();
    }

    @Override
    public void register(Object key, DataSource object) {
        this.dataSourceMap.put(key, object);
    }

    @Override
    public DataSource get(Object key) {
        return this.dataSourceMap.get(key);
    }
}
