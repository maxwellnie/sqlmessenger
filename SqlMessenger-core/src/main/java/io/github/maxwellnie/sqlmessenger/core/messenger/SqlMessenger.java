package io.github.maxwellnie.sqlmessenger.core.messenger;

import io.github.maxwellnie.sqlmessenger.core.cache.Cache;
import io.github.maxwellnie.sqlmessenger.core.database.DBInfo;
import io.github.maxwellnie.sqlmessenger.core.database.jdbc.datasource.MultipleDataSource;
import io.github.maxwellnie.sqlmessenger.core.database.sql.SqlKey;
import io.github.maxwellnie.sqlmessenger.core.database.sql.SqlResource;

/**
 * @author Maxwell Nie
 */
public class SqlMessenger {
    DBInfo dbInfo;
    MultipleDataSource dataSource;
    Cache<SqlKey, SqlResource> sqlResourceCache;
}
