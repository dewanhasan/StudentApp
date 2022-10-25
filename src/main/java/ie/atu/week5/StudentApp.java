package ie.atu.week5;

import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {
        //First Student Details
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter Student Name: ");
        String name1 = input.nextLine();
        StudentClass stuClass = new StudentClass();
        stuClass.setName(name1);

        System.out.println("Please enter Student Email: ");
        String email1 = input.nextLine();
        stuClass.setEmail(email1);

        System.out.println("Please enter Student Course: ");
        String course1 = input.nextLine();
        stuClass.setCourse(course1);

        //Second Student Details
        System.out.println("Please enter Second Student Name: ");
        String name2 = input.nextLine();
        StudentClass stuClass2 = new StudentClass(name2);

        System.out.println("Please enter Second Student Email: ");
        String email2 = input.nextLine();
        stuClass2.setEmail(email2);

        System.out.println("Please enter Second Student Course: ");
        String course2 = input.nextLine();
        stuClass2.setCourse(course2);

        //Third Student Details
        System.out.println("Please enter Third Student Name: ");
        String name3 = input.nextLine();

        System.out.println("Please enter Third Student Email: ");
        String email3 = input.nextLine();

        System.out.println("Please enter Third Student Course: ");
        String course3 = input.nextLine();

        StudentClass stuClass3 = new StudentClass(name3,email3,course3);


        System.out.println("\n\nFirst Student Details");
        System.out.println("name: " + stuClass.getName());
        System.out.println("email: " + stuClass.getEmail());
        System.out.println("course: " + stuClass.getCourse());

        System.out.println("\n\nSecond Student Details");
        System.out.println("name: " + stuClass2.getName());
        System.out.println("email: " + stuClass2.getEmail());
        System.out.println("course: " + stuClass2.getCourse());

        System.out.println("\n\nThird Student Details");
        System.out.println("name: " + stuClass3.getName());
        System.out.println("email: " + stuClass3.getEmail());
        System.out.println("course: " + stuClass3.getCourse());
    }
}
