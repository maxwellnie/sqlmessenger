package io.github.maxwellnie.sqlmessenger.core.utils;

import io.github.maxwellnie.sqlmessenger.core.java.reflect.property.PropertyType;

import java.time.temporal.TemporalAccessor;
import java.util.Collection;
import java.util.Date;

/**
 * @author Maxwell Nie
 */
public class TypeUtils {
    public static boolean isCollection(Class<?> clazz) {
        return Collection.class.isAssignableFrom(clazz);
    }

    public static boolean isMap(Class<?> clazz) {
        return java.util.Map.class.isAssignableFrom(clazz);
    }

    public static boolean isArray(Class<?> clazz) {
        return clazz.isArray();
    }

    public static boolean isSet(Class<?> clazz) {
        return java.util.Set.class.isAssignableFrom(clazz);
    }
    public static boolean isBasic(Class<?> clazz){
        String name = clazz.getName();
        return clazz.isPrimitive()
                || clazz.isEnum()
                || Date.class.isAssignableFrom(clazz)
                || TemporalAccessor.class.isAssignableFrom(clazz)
                || name.startsWith("java.math")
                || String.class.isAssignableFrom(clazz);
    }
    public static boolean likeBean(Class<?> clazz){
        return !isBasic(clazz) && !isArray(clazz) && !isCollection(clazz);
    }
    public static PropertyType getPropertyType(Class<?> clazz) {
        if (isArray(clazz)) {
            return PropertyType.ARRAY;
        } else if (isMap(clazz)) {
            return PropertyType.MAP;
        } else if (isList(clazz)) {
            return PropertyType.LIST;
        } else if (isSet(clazz)){
            return PropertyType.SET;
        }else if (isCollection(clazz)) {
             return PropertyType.COLLECTION;
        } else if (likeBean(clazz)){
            return PropertyType.BEAN;
        }else
            return PropertyType.BASIC;
    }
    public static boolean isList(Class<?> clazz) {
        return java.util.List.class.isAssignableFrom(clazz);
    }
}
