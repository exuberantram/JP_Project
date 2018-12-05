package com.company;

import java.io.FileReader;

//driver class to test ProcessFiles.java
public class ViewFileInfo {
    public static void main(String[] args) {
        try {
            FileReader fr =
                    new FileReader("C:\\LineTests\\TestResults");
            int i;
            while (( i = fr.read()) != -1){
                //read it character by character
                System.out.println((char) i);
            }
        } catch (Exception ex){
            System.out.println("Problem in read");
        }
    }
}
