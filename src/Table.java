package table;

import java.util.ArrayList;

public class Table {
    String nom;
    String[] columnName;
    ArrayList<String> columnValue;

    public ArrayList<String> getColumnValue() {
        return columnValue;
    }
    public void setColumnValue(ArrayList<String> columnValue) {
        this.columnValue = columnValue;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String[] getColumnName() {
        return columnName;
    }
    public void setColumnName(String[] columnName) {
        this.columnName = columnName;
    }
    public void test(){
    }
 }
