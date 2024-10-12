package io.github.maxwellnie.sqlmessenger.core.database.sql;

import io.github.maxwellnie.sqlmessenger.core.java.type.TypeHandler;

/**
 * @author Maxwell Nie
 */
public class SqlParameter {
    private final Object value;
    private final TypeHandler typeHandler;

    public SqlParameter(Object value, TypeHandler typeHandler) {
        this.value = value;
        this.typeHandler = typeHandler;
    }

    public Object getValue() {
        return value;
    }

    public TypeHandler getTypeHandler() {
        return typeHandler;
    }
}
