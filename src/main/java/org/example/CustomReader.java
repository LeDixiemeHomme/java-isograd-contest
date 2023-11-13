package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CustomReader {
    private String path;
    private int number;

    public CustomReader(String path, int number) {
        this.path = path;
        this.number = number;
    }

    public List<String> readFile(String fileName, int num) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path + fileName + num + ".txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line.trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    public List<List<String>> inputs() {
        List<List<String>> inputValues = new ArrayList<>();
        for (int n = 1; n <= number; n++) {
            inputValues.add(readFile("input", n));
        }
        return inputValues;
    }

    public List<List<String>> outputs() {
        List<List<String>> inputValues = new ArrayList<>();
        for (int n = 1; n <= number; n++) {
            inputValues.add(readFile("output", n));
        }
        return inputValues;
    }
}
