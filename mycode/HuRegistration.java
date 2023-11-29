/*welcome to every body to my program that can register the students  info and it can retrieve that you write on it and
i try to do my best based on that i learned in java
by Asdesach Asfaw id 2193/14 i am stundet in haramaya university software engineering

* */

import java.util.InputMismatchException;
import java.util.Scanner;

    public class HuRegistration{
        private final String[] studentIds;
        private final String[] studentfullNames;
        private final String[] studentmotherNames;
        private final String[] studentdepartments;
        private final String[] studentdepartsex;
        private final String[] studentdepartSpecialTalent;
        private int size;
        public HuRegistration(int capacity) {
            studentIds = new String[capacity];
            studentfullNames= new String[capacity];
            studentmotherNames = new String[capacity];
            studentdepartments = new String[capacity];
            studentdepartsex = new String[capacity];
            studentdepartSpecialTalent = new String[capacity];
            size = 0;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the capacity of students that you want register (must be integer number): ");

            try{

            int capacity = scanner.nextInt();
            HuRegistration registration = new HuRegistration(capacity);

            while (true) {
                System.out.println("1. Add Student\n2. Retrieve Student\n3. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                if (choice == 1) {
                    System.out.print("Enter student ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter student fullname: ");
                    String fullname = scanner.nextLine();
                    System.out.print("Enter student mother name: ");
                    String mothername = scanner.nextLine();
                    System.out.println("Enter the department of the student");
                    String department = scanner.nextLine();
                    System.out.println("sex(male/female)");
                    String sex = scanner.nextLine();
                    System.out.println("special talent that you want to participate");
                    String SpecialTalent = scanner.nextLine();
                    registration.addStudent(id, fullname, mothername, department, sex, SpecialTalent);
                } else if (choice == 2) {
                    System.out.print("Enter student ID to retrieve: ");
                    String id = scanner.nextLine();
                    registration.retrieveStudent(id);
                } else if (choice == 3) {
                    break;
                } else {
                    System.out.println("Invalid choice. Please try again.");
                }
            }}
            catch(InputMismatchException ex){
                System.out.println("our customer u are entered wrong valevue please enter based of wright selection " + ex);
            }
            scanner.close();
        }

        // Method to add a new student to the registration system
        public void addStudent(String studentId, String studentfullName, String studentmotherName, String studentdepartment, String sex, String SpecialTalent) {
            if (size < studentIds.length) {
                studentIds[size] = studentId;
                studentfullNames[size] = studentfullName;
                studentmotherNames[size] = studentmotherName;
                studentdepartments[size] = studentdepartment;
                studentdepartsex[size] = sex;
                studentdepartSpecialTalent[size] = SpecialTalent;
                size++;
                System.out.println("Student fullname " + studentfullName + "\n mother name"+" " + studentmotherName + "\n with ID " + studentId + "\ndepartment: " + studentdepartments + "\nsex: " + sex + "\nSpecialTalent: " + SpecialTalent + "\n cogra!!!... has been registered successfully.");
            } else {
                System.out.println("Student registration is full. Cannot add more students.");
            }
        }

        //methods to retrieve a students info using their id
        public void retrieveStudent(String studentId) {
            for (int i = 0; i < size; i++) {
                if (studentIds[i].equals(studentId)) {
                    System.out.println("Student ID: " + studentId + "\n Name: " + studentfullNames[i] +"\nmother name"+ " " + studentmotherNames[i] + " " + "\n departmet: " + studentdepartments[i] + "\nsex: " + studentdepartsex[i]);
                    return;
                }
            }
            System.out.println("Student with ID " + studentId + " is not found.");
        }
    }
/** hey programmer u can use it and update us u want because this is my little contribution about programming world*/


