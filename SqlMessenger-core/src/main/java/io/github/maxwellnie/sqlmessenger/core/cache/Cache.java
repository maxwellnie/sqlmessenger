package io.github.maxwellnie.sqlmessenger.core.cache;

/**
 * @author Maxwell Nie
 */
public interface Cache <K,V>{
    V get(K k);
    boolean put(K k, V v);
    boolean remove(K k);
    boolean exists(K k);
    void clear();
    K session();
}
