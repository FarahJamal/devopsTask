package com.example.read_data.connector;

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.SQLException;

public class DatabaseConnection {
    public DataSource dataSource;

    public DatabaseConnection() {
        try {
            dataSource = getDataSource();
        } catch (Exception err) {
        }
    }

    private DataSource getDataSource() throws SQLException {
        MysqlDataSource ds = new MysqlDataSource();
        ds.setServerName("127.0.0.1");
        ds.setPort(33061);
        ds.setDatabaseName("data_collector");
        ds.setUser("root");
        ds.setPassword("password");
        ds.setUseSSL(false);
        ds.setAllowPublicKeyRetrieval(true);

        return ds;
    }
}