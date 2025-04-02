//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int integer_var = sc.nextInt();

        System.out.print("Enter a float: ");
        float float_var = sc.nextFloat();

        sc.nextLine();

        System.out.print("Enter a string: ");
        String string_var = sc.nextLine();

        System.out.print("Enter a Boolean (true/false): ");
        boolean boolean_var = sc.nextBoolean();


        System.out.println("Integer: " + integer_var);
        System.out.println("Float: " + float_var);
        System.out.println("String: " + string_var);
        System.out.println("Boolean: " + boolean_var);

        sc.close();

    }
}








