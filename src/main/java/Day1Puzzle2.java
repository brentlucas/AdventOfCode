import util.Reader;

import java.util.List;

public class Day1Puzzle2 {
    public static void main(String[] args) throws Exception {
        List<Integer> expenses = Reader.fileToIntegerList("Day1_input.txt");

        expenses.sort(Integer::compareTo);

        for (int a = 0; a < expenses.size(); a++) {
            int fixed = expenses.get(a);
            int i = a + 1;
            int j = expenses.size() - 1;

            while (i < j) {
                if (expenses.get(i) + fixed + expenses.get(j) == 2020) {
                    System.out.println(expenses.get(i) + " + " + fixed + " + " + expenses.get(j));
                    System.out.println("Multiply: " + expenses.get(i) * fixed * expenses.get(j));
                    return;
                } else if (expenses.get(i) + fixed + expenses.get(j) < 2020) {
                    i++;
                } else {
                    j--;
                }
            }
        }
    }
}
