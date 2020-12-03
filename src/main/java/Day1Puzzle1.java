import util.Reader;

import java.util.List;

public class Day1Puzzle1 {
    public static void main(String[] args) throws Exception {
        List<Integer> expenses = Reader.fileToIntegerList("Day1_input.txt");

        expenses.sort(Integer::compareTo);

        int i = 0;
        int j = expenses.size() - 1;

        Integer result = null;
        while (i < j && result == null) {
            if (expenses.get(i) + expenses.get(j) == 2020)
                result = expenses.get(i) * expenses.get(j);
            else if (expenses.get(i) + expenses.get(j) < 2020)
                i++;
            else
                j--;
        }

        System.out.println(expenses.get(i) + " + " + expenses.get(j));
        System.out.println("Multiply: " + result);
    }
}
