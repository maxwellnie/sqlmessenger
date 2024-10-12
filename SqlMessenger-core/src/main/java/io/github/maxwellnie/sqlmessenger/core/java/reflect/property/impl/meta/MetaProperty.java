package io.github.maxwellnie.sqlmessenger.core.java.reflect.property.impl.meta;

import io.github.maxwellnie.sqlmessenger.core.java.reflect.property.Property;
import io.github.maxwellnie.sqlmessenger.core.java.reflect.property.PropertyType;
import io.github.maxwellnie.sqlmessenger.core.utils.TypeUtils;

import java.util.Map;

/**
 * @author Maxwell Nie
 */
public class MetaProperty {
    private Class<?> type;
    private Property property;
    private Map<String, MetaProperty> metaProperties;
    private PropertyType propertyType;


    public MetaProperty(Class<?> type, Property property, Map<String, MetaProperty> metaProperties) {
        this.type = type;
        this.property = property;
        this.propertyType = TypeUtils.getPropertyType(type);
        this.metaProperties = metaProperties;
    }

    public Class<?> getType() {
        return type;
    }

    public Property getProperty() {
        return property;
    }

    public PropertyType getPropertyType() {
        return propertyType;
    }

    public Map<String, MetaProperty> getMetaProperties() {
        return metaProperties;
    }
    public MetaProperty getChild(String name) {
        if (metaProperties == null)
            return null;
        return metaProperties.get(name);
    }
    public boolean hasChildren() {
        return metaProperties != null && !metaProperties.isEmpty();
    }
}
