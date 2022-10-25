package ie.atu.week5;

import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {
        System.out.println("Please enter Student Name: ");
        Scanner input = new Scanner(System.in);
        String n1 = input.nextLine();
        System.out.println("Name: " + n1);

        System.out.println("Please enter Student Email: ");
        String e1 = input.nextLine();
        System.out.println("Email: " + e1);

        String c1 = input.nextLine();
        System.out.println("Please enter Student Course: ");
        System.out.println("course: " + c1);


    }

}
