package io.github.maxwellnie.sqlmessenger.core.database;

import java.util.Collection;

/**
 * @author Maxwell Nie
 */
public interface DatabaseMetaDataAPI {
    boolean existsTable(String name);
    Collection<String> allTableNames();
}
