package org.example.myClasses;

import java.io.*;
import java.util.*;
    /**
    * Чтение Потока для более удобного чтения файлов
    */
public class StreamReader {

    private Scanner sc;

    /**
    * Constructor
    * @param inputStream поток чтения команд
    */

    public StreamReader(InputStream inputStream){
        sc = new Scanner(inputStream);
    }

    /**
    * set Scanner
    * @param inputStream
    */
    public void setScanner(InputStream inputStream){
        sc = new Scanner(inputStream);
    }
    /**
    * read line from stream
    * @return input from stream | null
    */
    public String readLine(){
        try {
            return sc.nextLine();
        }catch (NoSuchElementException nse){
            System.out.println(nse.toString());
            return null;
        }
    }

}
