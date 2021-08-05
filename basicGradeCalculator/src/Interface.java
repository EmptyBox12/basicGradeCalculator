import java.util.Scanner;

public class Interface {
    private Scanner scanner;
    private Scores scores;

    public Interface(Scanner scanner, Scores scores) {
        this.scanner = scanner;
        this.scores = scores;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            if (input <= 100 && input >= 0) {
                scores.add(input);
            }
        }
        this.printAverages();
        this.gradeTable();

    }

    public void printAverages() {
        System.out.println("Point average (all): " + scores.allScoreAverage());
        if (scores.passingScoreAverage() == -1) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + scores.passingScoreAverage());
        }
        System.out.println("Pass percentage: " + scores.passPercentage());
    }

    public void gradeTable() {
        System.out.println("Grade distribution:");
        scores.printStarts();
    }

}

