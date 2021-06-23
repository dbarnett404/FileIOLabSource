import javax.swing.*;
import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {
    public static final String fileName = "datafile.txt";

    private static void fileMessage(String fileName, String message, String title, int type){
        JOptionPane.showMessageDialog(null,
                fileName + " " + message + " at " + Paths.get("").toAbsolutePath().normalize().toString(),
                title, type);
    }


}
