package ie.atu.week5;

import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter Student Name: ");
        String name1 = input.nextLine();
        StudentClass stuClass = new StudentClass();
        stuClass.setName(name1);
        System.out.println("Name: " + stuClass.getName());


        System.out.println("Please enter Student Email: ");
        String email1 = input.nextLine();
        stuClass.setEmail(email1);
        System.out.println("Email: " + stuClass.getEmail());


        System.out.println("Please enter Student Course: ");
        String course1 = input.nextLine();
        stuClass.setCourse(course1);
        System.out.println("course: " + stuClass.getCourse());


        StudentClass stuClass2 = new StudentClass();
        System.out.println("Please enter Second Student Name: ");
        String name2 = input.nextLine();
        stuClass2.setName(name2);
        System.out.println("Name: " + stuClass2.getName());


        System.out.println("Please enter Second Student Email: ");
        String email2 = input.nextLine();
        stuClass2.setEmail(email2);
        System.out.println("Email: " + stuClass2.getEmail());


        System.out.println("Please enter Second Student Course: ");
        String course2 = input.nextLine();
        stuClass2.setCourse(course2);
        System.out.println("course: " + stuClass2.getCourse());



    }

}
