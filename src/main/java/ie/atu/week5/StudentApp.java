package ie.atu.week5;

import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {
        System.out.println("Please enter Student Name: ");
        Scanner input = new Scanner(System.in);
        String name1 = input.nextLine();
        System.out.println("Name: " + name1);

        System.out.println("Please enter Student Email: ");
        String email1 = input.nextLine();
        System.out.println("Email: " + email1);

        String course1 = input.nextLine();
        System.out.println("Please enter Student Course: ");
        System.out.println("course: " + course1);


    }

}
