package hw5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class Main {
    public static void main(String[] args) {

        File path = new File("src", "main/resources/test");
        String filePath = path.getAbsolutePath();

        Map<String, Integer> wordCount = new HashMap<>();


        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.substring(0, line.length()).split(", ");
                for (String word : words) {
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        }


        List<String> sortedWords = new ArrayList<>(wordCount.keySet());
        Collections.sort(sortedWords);


        System.out.println("Статистика слов:");
        for (String word : sortedWords) {
            System.out.println(word + ": " + wordCount.get(word));
        }


        String maxWord = null;
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxWord = entry.getKey();
            }
        }

        if (maxWord != null) {
            System.out.println("Слово с максимальным количеством повторений: \"" + maxWord + "\" встречается " + maxCount + " раз.");
        }
    }
}
