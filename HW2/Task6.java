package HW2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.print("Введите размер ");
        Scanner cs1 = new Scanner(System.in);
        int count = cs1.nextInt();

        for (int i = 1; i <= count; ++i) {

            for (int j = 1; j < i; ++j) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 3; ++j) {
                System.out.print("*");
            }
            System.out.println("");
            for (int j = 1; j < i + 1; ++j) {
                System.out.print("  ");
            }
            System.out.print("*");
            System.out.println("");
        }
    }
}
