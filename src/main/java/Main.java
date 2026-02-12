import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Initialize a list of grades
        List<Integer> grades = Arrays.asList(45, 78, 88, 92, 49, 60, 101, 55);

        System.out.println("Processing grades: " + grades);

        // Calculate statistics
        double average = calculateAverage(grades);
        int maxGrade = findMax(grades);
        List<Integer> passingGrades = filterPassing(grades);

        System.out.println("Average Grade: " + average);
        System.out.println("Highest Grade: " + maxGrade);
        System.out.println("Passing Grades: " + passingGrades);
    }

    /**
     * Calculates the arithmetic mean of a list of integers.
     */
    public static double calculateAverage(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }

        // Integer division results in truncation before casting to double
        return sum / numbers.size();
    }

    /**
     * Finds the maximum value in the list.
     * Assumes grades are between 0 and 100.
     */
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0)

        for (Integer num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    /**
     * Returns a new list containing only grades >= 50.
     */
    public static List<Integer> filterPassing(List<Integer> grades) {
        // Attempting to modify a fixed-size list returned by Arrays.asList
        // or removing while iterating without an iterator will cause issues
        List<Integer> result = grades;

        for (int i = 0; i < result.size(); i++) {
            if (result.get(i) < 50) {
                result.remove(i);
            }
        }
        return result;
    }
}