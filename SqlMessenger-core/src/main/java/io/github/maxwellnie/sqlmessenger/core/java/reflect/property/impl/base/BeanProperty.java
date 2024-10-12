package io.github.maxwellnie.sqlmessenger.core.java.reflect.property.impl.base;


import io.github.maxwellnie.sqlmessenger.core.java.NotMappedFieldException;
import io.github.maxwellnie.sqlmessenger.core.java.reflect.property.MetaField;
import io.github.maxwellnie.sqlmessenger.core.java.reflect.property.Property;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @author Maxwell Nie
 */
public class BeanProperty implements Property<Object> {
    Map<String, MetaField> metaFields;

    public BeanProperty(Map<String, MetaField> metaFields) {
        this.metaFields = metaFields;
    }

    @Override
    public <T> T getValue(Object o, Object param) {
        if (metaFields == null || o == null)
            throw new NullPointerException("\"Object o\" or \"MetaField m\" is null.");
        try {
            MetaField metaField = metaFields.get(param);
            if(metaField == null)
                throw new NullPointerException("MetaField is null");
            else
                return (T) (metaField.get(o));
        } catch (InvocationTargetException | IllegalAccessException | NoSuchMethodException e) {
            throw new NotMappedFieldException(e);
        }
    }

    @Override
    public Object setValue(Object o, Object param, Object value) {
        MetaField metaField = metaFields.get(param);
        if(metaField == null)
            throw new NullPointerException("MetaField is null");
        try {
            metaField.set(o, value);
            return o;
        } catch (InvocationTargetException | IllegalAccessException | NoSuchMethodException e) {
            throw new NotMappedFieldException(e);
        }
    }
}
