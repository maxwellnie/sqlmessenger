package io.github.maxwellnie.sqlmessenger.core.java.concurrent;

import io.github.maxwellnie.sqlmessenger.core.cache.CacheKey;

import java.io.Serializable;

/**
 * @author Maxwell Nie
 */
public interface SqlTaskQueue extends Serializable {
    /**
     * 请求排队
     * @param group
     * @param cacheKey
     * @param task
     */
    void require(String group, CacheKey cacheKey, Runnable task);
}
