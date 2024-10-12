package io.github.maxwellnie.sqlmessenger.core.database.session;

import io.github.maxwellnie.sqlmessenger.core.database.jdbc.datasource.MultipleDataSource;
import io.github.maxwellnie.sqlmessenger.core.java.api.Factory;

/**
 * @author Maxwell Nie
 */
public interface SessionFactory extends Factory<Session> {
    Session getSession(MultipleDataSource dataSource);
}
