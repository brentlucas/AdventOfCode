import util.Reader;

import java.util.List;

public class Day3Puzzle2 {
    public static void main(String[] args) {
        List<String> path = Reader.fileToStringList("Day3_input.txt");

        int aantalBomen1 = aantalBomen(path, 1, 1);
        int aantalBomen2 = aantalBomen(path, 1, 3);
        int aantalBomen3 = aantalBomen(path, 1, 5);
        int aantalBomen4 = aantalBomen(path, 1, 7);
        int aantalBomen5 = aantalBomen(path, 2, 1);

        int multiply = aantalBomen1 * aantalBomen2 * aantalBomen3 * aantalBomen4 * aantalBomen5;

        System.out.println("Multiply: " + multiply);
    }

    public static int aantalBomen(List<String> path, int down, int right) {
        int aantalBomen = 0;
        int currentHorizontalIndex = 0;
        int maxIndex = path.get(0).length();

        for (int i = 0; i < path.size(); i += down) {
            String line = path.get(i);
            if (line.charAt(currentHorizontalIndex) == '#') {
                aantalBomen++;
            }

            currentHorizontalIndex += right;
            if (currentHorizontalIndex >= maxIndex) {
                currentHorizontalIndex -= maxIndex;
            }
        }
        return aantalBomen;
    }
}
