package io.github.maxwellnie.sqlmessenger.core.java.reflect.property.impl.base;


import io.github.maxwellnie.sqlmessenger.core.java.reflect.property.Property;

/**
 * @author Maxwell Nie
 */
public class SelfProperty implements Property<Object> {
    SelfProperty() {
    }
    public static final SelfProperty INSTANCE = new SelfProperty();
    @Override
    public Object getValue(Object o, Object o2) {
        return o;
    }

    @Override
    public Object setValue(Object o, Object o2, Object value) {
        return o;
    }
}
