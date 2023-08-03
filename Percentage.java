import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks for 5 subjects:");

        System.out.print("Subject 1 marks: ");
        int subject1Marks = scanner.nextInt();

        System.out.print("Subject 2 marks: ");
        int subject2Marks = scanner.nextInt();

        System.out.print("Subject 3 marks: ");
        int subject3Marks = scanner.nextInt();

        System.out.print("Subject 4 marks: ");
        int subject4Marks = scanner.nextInt();

        System.out.print("Subject 5 marks: ");
        int subject5Marks = scanner.nextInt();

        int totalMarks = subject1Marks + subject2Marks + subject3Marks + subject4Marks + subject5Marks;

        int totalSubjects = 5;
        double percentage = (double) totalMarks / (totalSubjects * 100) * 100;

        System.out.println("Total marks obtained: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        if (totalMarks>400)
    System.out.println(" student will be  is pass in thise class:");
else
    System.out.println("student will be fail in thise class");



    }
}
