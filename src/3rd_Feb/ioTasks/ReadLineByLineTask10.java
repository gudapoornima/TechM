package ioTasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineByLineTask10 {
    public static void main(String[] args) {
        String filePath = "C:/Users/katik/Desktop/test.txt"; 

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line); 
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
