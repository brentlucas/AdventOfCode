import util.Reader;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day2Puzzle2 {
    public static void main(String[] args) {
        List<String> passwords = Reader.fileToStringList("Day2_input.txt");
        Pattern p = Pattern.compile("(.*?)-(.*?) (.): (.*)");

        int counter = 0;
        for (String pw : passwords) {
            Matcher m = p.matcher(pw);
            int pos1 = Integer.parseInt(m.group(1));
            int pos2 = Integer.parseInt(m.group(2));
            char letter = m.group(3).charAt(0);
            String password = m.group(4);

            boolean isPos1 = password.charAt(pos1 - 1) == letter;
            boolean isPos2 = password.charAt(pos2 - 1) == letter;

            if (isPos1 ^ isPos2) counter++;
        }

        System.out.println("Count: " + counter);
    }
}
