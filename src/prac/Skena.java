package prac;

import java.util.Scanner;

public class Skena {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Ubani igama lakho?");
        String name =in.nextLine();
        System.out.println("Sawbona " +name);
        System.out.println("How old are u");
        int age=in.nextInt();

        String message = "Hello, %s. Next year, you'll be %d".formatted(name ,age +1);
        System.out.println(message);
    }
}
