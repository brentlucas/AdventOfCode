package util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Reader {

    public static List<String> fileToStringList(String resource) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(Reader.class.getClassLoader().getResourceAsStream(resource)));

        List<String> stringList = new ArrayList<>();
        try {
            while (reader.ready()) {
                stringList.add(reader.readLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public static List<Integer> fileToIntegerList(String resource) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(Reader.class.getClassLoader().getResourceAsStream(resource)));

        List<Integer> intList = new ArrayList<>();
        try {
            while (reader.ready()) {
                intList.add(Integer.parseInt(reader.readLine()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return intList;
    }
}
