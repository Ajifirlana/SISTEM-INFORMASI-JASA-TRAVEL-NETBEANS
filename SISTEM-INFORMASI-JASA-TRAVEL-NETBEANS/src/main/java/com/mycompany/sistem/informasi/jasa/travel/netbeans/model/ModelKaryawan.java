package com.mycompany.sistem.informasi.jasa.travel.netbeans.model;

import javax.swing.table.AbstractTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ModelKaryawan extends AbstractTableModel {
    private ResultSet resultSet;

    // Provide meaningful column names
    private String[] columnNames = {"ID Karyawan", 
        "Nama","Username","Password"};

    public ModelKaryawan(ResultSet rs) {
        this.resultSet = rs;
    }

    @Override
    public int getRowCount() {
        try {
            resultSet.last();
            return resultSet.getRow();
        } catch (SQLException e) {
            // Log the exception or notify the user
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int getColumnCount() {
        // Return the number of columns
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        try {
            resultSet.absolute(rowIndex + 1);
            return resultSet.getObject(columnIndex + 1);
        } catch (SQLException e) {
            // Log the exception or notify the user
            e.printStackTrace();
            return null;
        }
    }

    // Override this method to provide column names
    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
}
