package io.github.maxwellnie.sqlmessenger.core.java.reflect.property;

/**
 * 属性接口
 * @author Maxwell Nie
 */
public interface Property<P>{
    <T> T getValue(Object o, P p);
    Object setValue(Object o, P p, Object value);
}
