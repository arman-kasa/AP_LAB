package ceit.aut.ac.ir.utils;

import java.io.*;

public class FileUtils {

    private static final String NOTES_PATH = "./notes/";

    //It's a static initializer. It's executed when the class is loaded.
    //It's similar to constructor
    static {
        boolean isSuccessful = new File(NOTES_PATH).mkdirs();
        System.out.println("Creating " + NOTES_PATH + " directory is successful: " + isSuccessful);
    }

    public static File[] getFilesInDirectory() {
        return new File(NOTES_PATH).listFiles();
    }


    public static String fileReader(File file) {
        try
        {
            StringBuilder output = new StringBuilder();
            FileReader reader = new FileReader(file);
            int c;
            while((c = reader.read())!= -1)
            {
                output.append((char)c);
            }
            reader.close();
            return output.toString();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        
        return "";
    }

    public static void fileWriter(String content) {
        try
        {
            String fileName = getProperFileName(content);
            FileWriter writer = new FileWriter(NOTES_PATH + fileName + ".txt");
            writer.write(content);
            writer.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    //TODO: Phase1: define method here for reading file with InputStream
    public static String fileInputStream(File file)
    {
        try
        {
            FileInputStream inputStream = new FileInputStream(file);
            StringBuilder output = new StringBuilder();
            int c;
            while((c = inputStream.read())!= -1)
            {
                output.append((char)c);
            }
            inputStream.close();
            return output.toString();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return "";
    }
    
    //TODO: Phase1: define method here for writing file with OutputStream
    public static void fileOutputStream(String content) {
        try
        {
            String fileName = getProperFileName(content);
            FileOutputStream writer = new FileOutputStream(NOTES_PATH + fileName + ".txt");
            for (byte b : content.getBytes())
            {
                writer.write(b);
            }
            writer.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    
    public static String fileBufferedReader(File file)
    {
        try
        {
            StringBuilder output = new StringBuilder();
            Reader in = new FileReader(file);
            BufferedReader reader = new BufferedReader(in);
            int c;
            while((c = reader.read())!= -1)
            {
                output.append((char)c);
            }
            reader.close();
            return output.toString();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return "";
    }
    //TODO: Phase2: proper methods for handling serialization

    private static String getProperFileName(String content) {
        int loc = content.indexOf("\n");
        if (loc != -1) {
            return content.substring(0, loc);
        }
        if (!content.isEmpty()) {
            return content;
        }
        return System.currentTimeMillis() + "_new file.txt";
    }
}
