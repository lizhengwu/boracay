package com.hex.bigdata.metadata.db.jdbcsql.helper;

import com.hex.bigdata.metadata.db.jdbcsql.BaseJdbcSqlHelper;
import com.hex.bigdata.metadata.db.util.DBType;

import java.sql.Connection;

/**
 * Created by junjiem on 2016-6-20.
 */
public class ImpalaForOracleJdbcSqlHelper extends BaseJdbcSqlHelper {
    public ImpalaForOracleJdbcSqlHelper(Connection conn) {
        super(conn);
    }

    @Override
    public String getCurrentDbNameSql() {
        return null;
    }

    @Override
    public String getColumnTypeSql() {
        return null;
    }

    @Override
    public String getDatabasesSql() {
        return null;
    }

    @Override
    public String getTablesSql(String dbName) {
        return null;
    }

    @Override
    public String getColumnsSql(String dbName, String tbName) {
        return null;
    }

    @Override
    protected String getDbType() {
        return DBType.IMPALA_FOR_ORACLE.getValue();
    }
}
