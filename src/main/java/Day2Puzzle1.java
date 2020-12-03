import util.Reader;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day2Puzzle1 {
    public static void main(String[] args) {
        List<String> passwords = Reader.fileToStringList("Day2_input.txt");
        Pattern p = Pattern.compile("(.*?)-(.*?) (.): (.*)");

        int counter = 0;
        for (String pw : passwords) {
            Matcher m = p.matcher(pw);
            if (m.matches()) {
                int min = Integer.parseInt(m.group(1));
                int max = Integer.parseInt(m.group(2));
                char letter = m.group(3).charAt(0);
                String password = m.group(4);

                long occurrence = password.chars().filter(c -> c == letter).count();
                if (min <= occurrence && occurrence <= max) counter++;
            }
        }
        System.out.println("Count: " + counter);
    }
}
