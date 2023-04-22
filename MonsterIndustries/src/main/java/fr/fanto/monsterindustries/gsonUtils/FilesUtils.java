package fr.fanto.monsterindustries.gsonUtils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;

public class FilesUtils {

    public static void createFile(File file) throws IOException {
        if (!file.exists()) {
            file.getParentFile().mkdirs();
            file.createNewFile();
        }
    }

    public static void save(File file, String text) {
        final FileWriter fileWriter;

        try {
            createFile(file);
            fileWriter = new FileWriter(file);
            fileWriter.write(text);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String load(File file) {
        if(file.exists()) {
            try {
                final BufferedReader reader = new BufferedReader(new FileReader(file));
                final StringBuilder text = new StringBuilder();

                String line;

                while((line = reader.readLine()) != null) {
                    text.append(line);
                }
                reader.close();

                return text.toString();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}

