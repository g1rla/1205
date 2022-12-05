package ru.levelup.universities.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileIO {
    public List<String> readFileLines(String filepath) {
        File file = new File(filepath);
        // Существует ли файл на файловой системе:
        //file.exists();
        // try - with - resources
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            List<String> lines = new ArrayList<>();

            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.isBlank()) {
                    lines.add(line);
                }

            }
            return lines;
        } catch (IOException exc) {
            System.out.println("Error during reading the file: " + filepath);
            throw new RuntimeException(exc);
        }
    }
    public void writeFileLines(String filepath, List<String> lines) {
        File file = new File(filepath);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();

            }
        } catch (IOException exc) {
            System.out.println("Error during writing to the file: " + filepath);

        }
    }
  //  public void writeLine(String filepath, List<String> lines) {
  //      File file = new File(filepath);
  //      try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
  //          for (String line : lines) {
  //              writer.write(line);
  //              writer.newLine();

            }
  //      } catch (IOException exc) {
 //           System.out.println("Error during writing to the file: " + filepath);

            //}
