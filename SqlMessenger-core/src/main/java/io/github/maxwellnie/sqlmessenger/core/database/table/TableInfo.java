package io.github.maxwellnie.sqlmessenger.core.database.table;

import java.util.Map;

/**
 * @author Maxwell Nie
 */
public class TableInfo {
    private Map<String, ColumnInfo> columnInfos;
    private String tableName;
    private Class<?> mappingClass;
    private String primaryKey;
    private String[] uniqueKeys;
    private String[] indexKeys;
    private JoinInfo[] joinInfo;

    public Map<String, ColumnInfo> getColumnInfos() {
        return columnInfos;
    }

    public void setColumnInfos(Map<String, ColumnInfo> columnInfos) {
        this.columnInfos = columnInfos;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public Class<?> getMappingClass() {
        return mappingClass;
    }

    public void setMappingClass(Class<?> mappingClass) {
        this.mappingClass = mappingClass;
    }

    public String getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
    }

    public String[] getUniqueKeys() {
        return uniqueKeys;
    }

    public void setUniqueKeys(String[] uniqueKeys) {
        this.uniqueKeys = uniqueKeys;
    }

    public String[] getIndexKeys() {
        return indexKeys;
    }

    public void setIndexKeys(String[] indexKeys) {
        this.indexKeys = indexKeys;
    }

    public JoinInfo[] getJoinInfo() {
        return joinInfo;
    }

    public void setJoinInfo(JoinInfo[] joinInfo) {
        this.joinInfo = joinInfo;
    }
}
