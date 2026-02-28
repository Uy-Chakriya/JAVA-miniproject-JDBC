package ProductionManagementMVC;
import ProductionManagementMVC.View.ProductImpl;
import java.util.Scanner;

import static ProductionManagementMVC.Control.constant.*;
import static ProductionManagementMVC.View.Validation.table;

public class Main {
    public static void main(String[] args) {

        boolean isValid = false;
        table("Main");
        String option;
        Scanner sc = new Scanner(System.in);
        while (!isValid) {
            ProductImpl.showAllProducts();
            System.out.print(C_GREEN + "N." + C_RESET + " Next Page");
            System.out.print(C_GREEN + "\tP. " + C_RESET + "Previous Page");
            System.out.print(C_GREEN + "\tF. " + C_RESET + "First Page");
            System.out.print(C_GREEN + "\tL. " + C_RESET + "Last Page");
            System.out.print(C_GREEN + "\tG. " + C_RESET + "Goto");
            System.out.print("\n\n");
            System.out.print(C_GREEN + "W. " + C_RESET + "Write");
            System.out.print(C_GREEN + "\tR. " + C_RESET + "Read");
            System.out.print(C_GREEN + "\tU. " + C_RESET + "Update");
            System.out.print(C_GREEN + "\tD. " + C_RESET + "Delete");
            System.out.print(C_GREEN + "\tS. " + C_RESET + "Search (Name)");
            System.out.print(C_GREEN + "\tSe. " + C_RESET + "Set Row\n\n");
            System.out.print(C_GREEN + "Sa. " + C_RESET + "Save");
            System.out.print(C_GREEN + "\tUn. " + C_RESET + "Unsave");
            System.out.print(C_GREEN + "\tRe. " + C_RESET + "Restore");
            System.out.print(C_GREEN + "\tE. " + C_RESET + "Exit\n");

            System.out.print("Enter Your Choice : " );
            option = sc.nextLine().trim().toUpperCase();

            switch (option){
                case "N" -> System.out.println("Next Page");
                case "P" -> System.out.println("Previous Page");
                case "F" -> System.out.println("First Page");
                case "L" -> System.out.println("Last Page");
                case "G" -> System.out.println("Goto");

                case "W" -> System.out.println("Write");
                case "R" -> System.out.println("Read");
                case "U" -> System.out.println("Update");
                case "D" -> System.out.println("Restore");
                case "S" -> System.out.println("Search (Name)");
                case "Se" -> System.out.println("Set Row");
                case "Sa" -> System.out.println("Save");
                case "Un" -> System.out.println("Unsave");
                case "Re" -> System.out.println("Restore");
                case "E" -> System.out.println("Exit");
                default -> System.out.println(C_RED + "\nInvalid Input\n" + C_RESET);
            }
        }
    }
}