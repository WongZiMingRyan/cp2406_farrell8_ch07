package Qn2;

import java.util.Scanner;

public class BabyNameComparison {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[3];
        String firstName = "";

        // Ask the user to provide three (3) names.
        System.out.print("Enter name #1 >>");
        names[0] = scanner.nextLine();
        System.out.print("Enter name #2 >>");
        names[1] = scanner.nextLine();
        System.out.print("Enter name #3 >>");
        names[2] = scanner.nextLine();

        System.out.println("Possible Combinations:");
        for (int i = 0; i < 3; ++i)
        {
            firstName = names[i];
            for (int j = 0; j < 3; ++j)
            {
                // Don't include the same name twice!
                if (!firstName.equals(names[j])) {
                    System.out.println(firstName + " " + names[j]);
                }
            }
        }
    }
}
