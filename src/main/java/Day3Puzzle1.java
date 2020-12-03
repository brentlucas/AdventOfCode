import util.Reader;

import java.util.List;

public class Day3Puzzle1 {
    public static void main(String[] args) {
        List<String> path = Reader.fileToStringList("Day3_input.txt");

        int aantalBomen = 0;
        int currentHorizontalIndex = 0;
        int maxIndex = path.get(0).length();

        for (String line : path) {
            if (line.charAt(currentHorizontalIndex) == '#') {
                aantalBomen++;
            }

            currentHorizontalIndex += 3;
            if (currentHorizontalIndex >= maxIndex) {
                currentHorizontalIndex -= maxIndex;
            }
        }

        System.out.println("Aantal bomen: " + aantalBomen);
    }
}
