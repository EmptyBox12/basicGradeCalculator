import java.util.ArrayList;

public class Scores {

    private ArrayList<Integer> list;

    public Scores() {
        this.list = new ArrayList<>();
    }

    public void add(int scores) {
        this.list.add(scores);
    }

    public ArrayList<Integer> gradeCalculator() {
        int grade5 = 0;
        int grade4 = 0;
        int grade3 = 0;
        int grade2 = 0;
        int grade1 = 0;
        int grade0 = 0;
        ArrayList<Integer> grades = new ArrayList<>();
        for (int i : this.list) {
            if (i < 50) {
                grade0++;
            } else if (i < 60) {
                grade1++;
            } else if (i < 70) {
                grade2++;
            } else if (i < 80) {
                grade3++;
            } else if (i < 90) {
                grade4++;
            } else if (i >= 90) {
                grade5++;
            }

        }
        grades.add(grade0);
        grades.add(grade1);
        grades.add(grade2);
        grades.add(grade3);
        grades.add(grade4);
        grades.add(grade5);
        return grades;
    }

    public void printStarts() {
        ArrayList<Integer> grades = gradeCalculator();
        System.out.print("5: ");
        for (int i = 0; i < grades.get(5); i++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("4: ");
        for (int i = 0; i < grades.get(4); i++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("3: ");
        for (int i = 0; i < grades.get(3); i++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("2: ");
        for (int i = 0; i < grades.get(2); i++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("1: ");
        for (int i = 0; i < grades.get(1); i++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("0: ");
        for (int i = 0; i < grades.get(0); i++) {
            System.out.print("*");
        }
    }

    public int allSumOfScores() {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum;

    }

    public double allScoreAverage() {
        return 1.0 * allSumOfScores() / list.size();
    }

    public double passingScoreAverage() {
        int sum = 0;
        int counter = 0;
        for (int i : this.list) {
            if (i >= 50) {
                sum += i;
                counter++;
            }
        }
        if (counter == 0 || sum == 0) {
            return -1;
        }
        return 1.0 * sum / counter;

    }

    public double passPercentage() {
        int counter = 0;
        for (int i : this.list) {
            if (i >= 50) {
                counter++;
            }
        }
        double passPercentage = 100.0 * counter / this.list.size();
        return passPercentage;
    }
}

