package io.github.maxwellnie.sqlmessenger.core.database.session;

import io.github.maxwellnie.sqlmessenger.core.cache.Cache;
import io.github.maxwellnie.sqlmessenger.core.cache.DirtyDataManager;
import io.github.maxwellnie.sqlmessenger.core.java.concurrent.SqlTaskQueue;

/**
 * @author Maxwell Nie
 */
public interface Session extends AutoCloseable{
    DirtyDataManager getDirtyDataManager();
    void setAutoCommit(boolean autoCommit);
    void commit();
    void rollback();
    Cache<Object, Object> getCache();
    SqlTaskQueue getTaskQueue();
    boolean isClosed();
}
