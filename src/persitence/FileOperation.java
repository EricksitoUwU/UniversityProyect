package persitence;

import models.Property;
import models.TaxCalculator;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class FileOperation {

    /**
     * Este metodo es para leer los archivos le llega como parametro la dire
     * Retorna un array list con todas las lineas del archivo
     * **/
    public static ArrayList<String> loadTextFile(String path) throws IOException{
        ArrayList<String> list = new ArrayList<String>(); //genera un arrayList para guardar varias lineas
        BufferedReader buffer = new BufferedReader(new FileReader(path));   //Buffered reader para leer el archivo

        String line;
        for (int i = 0; i < 40; i++) {
            line = buffer.readLine();
            list.add(line);
        }
        // while ((line = buffer.readLine()) != null){ //Este metodo es para leer ABSOLUTAMENTE TODO EL ARCHIVO
        // 	list.add(line);
        // }
        return list;
    }

}
