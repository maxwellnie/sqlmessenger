package io.github.maxwellnie.sqlmessenger.core.database.sql;

import java.util.List;

/**
 * @author Maxwell Nie
 */
public class ExecutableSql {
    private String[] sqlList;
    private List<SqlParameter[]> parametersList;
    private SqlType type;

    public ExecutableSql(String[] sqlList, List<SqlParameter[]> parametersList, SqlType type) {
        this.sqlList = sqlList;
        this.parametersList = parametersList;
        this.type = type;
    }

    public ExecutableSql() {
    }

    public String[] getSqlList() {
        return sqlList;
    }

    public void setSqlList(String[] sqlList) {
        this.sqlList = sqlList;
    }

    public List<SqlParameter[]> getParametersList() {
        return parametersList;
    }

    public void setParametersList(List<SqlParameter[]> parametersList) {
        this.parametersList = parametersList;
    }

    public SqlType getType() {
        return type;
    }

    public void setType(SqlType type) {
        this.type = type;
    }
}
