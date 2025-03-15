import java.util.Scanner;  // Import Scanner for user input

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create Scanner object

        // Prompt user for input
        System.out.print("Enter your score: ");
        int score = scanner.nextInt();  // Read user input

        // Determine the grade
        char grade = calculateGrade(score);

        // Display the result
        System.out.println("Your Grade is: " + grade);

        scanner.close();  // Close the scanner
    }

    // Method to determine grade based on score
    public static char calculateGrade(int score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
