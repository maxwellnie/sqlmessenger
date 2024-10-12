package io.github.maxwellnie.sqlmessenger.core.database;

import io.github.maxwellnie.sqlmessenger.core.database.script.kewords.KeyWordsHandler;
import io.github.maxwellnie.sqlmessenger.core.database.name.NameHandler;

/**
 * @author Maxwell Nie
 */
public interface Dialect {
    KeyWordsHandler getKeyWordsHandler();
    NameHandler getNameHandler();
}
