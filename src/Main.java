//IS147 Attendence Project
// Group Project IS147
import java.util.Scanner;

/**
 * The main class for the attendance project.
 */
public class Main {
    /**
     * The main method where the program execution begins.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AttendenceSheet attendenceSheet = new AttendenceSheet();

        while (true){
            System.out.println("Please enter a command (add, addplus, here, abs, print, total, rand, or end to stop): ");
            String command = scanner.nextLine();

            switch (command){
                case "add":
                    System.out.println("Please enter the student's name: ");
                    String name = scanner.nextLine();

                    attendenceSheet.addStudent(name);
                    break;
                case "addplus":
                    System.out.println("Please enter multiple students' names, seperated by commas: ");
                    String names = scanner.nextLine();

                    attendenceSheet.addStudent(names.split(","));
                    break;
                case "here":
                    System.out.println("Which student is present?: ");
                    String present = scanner.nextLine();

                    attendenceSheet.markHere(present, true);
                    break;
                case "abs":
                    System.out.println("Which student is absent?: ");
                    String absent = scanner.nextLine();

                    System.out.println("Is the absence excused? (yes/no): ");
                    String excused = scanner.nextLine();
                    attendenceSheet.markAbs(absent, excused.equalsIgnoreCase("yes"));
                    break;
                case "print":
                    attendenceSheet.print();
                    break;
                case "total":
                    attendenceSheet.calculateTotal();
                    break;
                case "rand":
                    attendenceSheet.randomStudent();
                    break;
                case "end":
                    return;
                default:
                    System.out.println("Unknown command. Please try again.");
            }
        }
    }

}
