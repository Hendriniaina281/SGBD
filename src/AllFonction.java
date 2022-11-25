package allfunction;

import java.io.*;
import java.util.*;
import table.Table;

public class AllFonction{
    ArrayList<Table> allTable = new ArrayList<>();

    public void createTable(String request){
        String[] wordRequest = request.split(" ");
        try {
            File file = new File(wordRequest[2]+".txt");
            if(!file.exists()){
                file.createNewFile();
            }
            Table table = new Table();
            table.setNom(wordRequest[2]);

            String[] column = wordRequest[4].split(",");
            table.setColumnName(column);
        
            allTable.add(table);
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
}