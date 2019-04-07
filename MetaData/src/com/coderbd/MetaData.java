package com.coderbd;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MetaData {

    static Connection connection = CustomDBConnection.getDBConnection();
    static DatabaseMetaData metaData = null;

    static {
        try {
            metaData = connection.getMetaData();
        } catch (Exception e) {
        }

    }

    public static void printgeneralMetadata() throws SQLException {
        System.out.println("Database Name:" + metaData.getDatabaseProductName());

        System.out.println("Database Version:" + metaData.getDatabaseProductVersion());

        System.out.println("Logged User: " + metaData.getUserName());

        System.out.println("JDBC Driver: " + metaData.getDriverName());

        System.out.println("Driver Version: " + metaData.getDriverVersion());

        System.out.println("\n");

    }

    public static ArrayList getTableMetadata() throws Exception {

        String table[] = {"TABLE"};

        ResultSet rs = null;
        ArrayList tables = null;

        rs = metaData.getTables(null, null, null, table);
        tables = new ArrayList();
        while (rs.next()) {
            tables.add(rs.getString("TABLE_NAME"));
        }

        return tables;

    }

    public static void getColumnsMetaData(ArrayList tables) throws Exception {

        ResultSet rs = null;

        for (Object actualTable : tables) {
            rs = metaData.getColumns(null, null, actualTable.toString(), null);
            System.out.println(actualTable.toString().toUpperCase());

            while (rs.next()) {
                System.out.println(rs.getString("COLUMN_Name") + " " + rs.getString("Type_Name") + " " + rs.getString("Column_Size"));

            }
            System.out.println("\n");

        }
    }

    public static void main(String[] args) {
        try {
            printgeneralMetadata();

            getColumnsMetaData(getTableMetadata());
        } catch (SQLException ex) {
            Logger.getLogger(MetaData.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(MetaData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
