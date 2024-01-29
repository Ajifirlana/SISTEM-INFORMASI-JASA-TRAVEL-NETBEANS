/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem.informasi.jasa.travel.netbeans.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Aji
 */

public class ModelMobil extends AbstractTableModel{
    private ResultSet resultSet;

    // Provide meaningful column names
    private String[] columnNames = {"ID", 
        "Nama","Alamat","No Telepon","Kode Jadwal"};

    public ModelMobil(ResultSet rs) {
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
