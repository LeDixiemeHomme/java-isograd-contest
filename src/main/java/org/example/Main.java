package org.example;

import exercices.Exo1;

import java.util.List;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        String fileName = "sample-cWFudGR6NDByZ0lEaU5WbklhZTNoZz09Ojqgl8NyhOxIq9MdJq32k8IZ";

        CustomReader reader = new CustomReader("./samples/" + fileName + "/", 10);

        List<List<String>> results = new ArrayList<>();

        for (List<String> lines : reader.inputs()) {
            results.add(Exo1.runner(lines));
        }

        for (int index = 0; index < results.size(); index++) {
            int exoNumber = index + 1;
            List<String> result = results.get(index);
            List<String> outputValues = reader.outputs().get(index);
            if (result.equals(outputValues)) {
                System.out.println("\033[32m" + exoNumber + " - Success !\033[0m");
            } else {
                System.out.println("\033[31m" + exoNumber + " - Fail !\033[0m");
            }

            System.out.println(exoNumber + " " + result + " == " + outputValues);
        }
    }

}
