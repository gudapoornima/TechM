package ioTasks;

import java.io.File;
import java.util.Scanner;

public class FilePerCheckTask4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file or directory path: ");
        String path = sc.nextLine();
        sc.close();

        File file = new File(path);

        if (file.exists()) {
            System.out.println("Read permission: " + (file.canRead() ? "Yes" : "No"));
            System.out.println("Write permission: " + (file.canWrite() ? "Yes" : "No"));
        } else {
            System.out.println("The specified file or directory does not exist.");
        }
    }
}
