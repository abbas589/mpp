package com.miu.mpp.lab10.q2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

/**
 * @author bazz
 * Feb 03 2023
 * 23:29
 */
public class NewFileIO {

    private static final Logger LOG = Logger.getLogger(OldFileIO.class.getName());
    public final static String FILE_LOCATION = "src/com/miu/mpp/lab10/q2/output.txt";
    public final static String TO_PRINT = "This is the string to print to file.";


    void writeText(String filename, String text) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.print(text);
        } catch (IOException e) {
            LOG.warning("IOException attempting to write a file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        NewFileIO newFileIO = new NewFileIO();
        newFileIO.writeText(FILE_LOCATION, TO_PRINT);

    }
}
