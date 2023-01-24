package ProductFile;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;

public class ProductGenerator {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        ArrayList<Product> people = new ArrayList<>();
        int index = 1;

        while (SafeInput.getYNConfirm(in, "Create new ProductFile.Product object?")) {
            System.out.println("Name: ");
            String firstName = in.nextLine();
            System.out.println("\nDescription: ");
            String lastName = in.nextLine();
            System.out.println("\nType: ");
            int YOB;
            YOB = in.nextInt();

            people.add(new Product(Integer.toString(index), firstName, lastName, YOB));

            index++;
        }

        System.out.println("\nEnter output file name: ");
        String outputFileName = in.nextLine();
        PrintWriter out = new PrintWriter(outputFileName);

        for (Product person : people) {
            out.println(person.toCSVDataRecord());
        }

        out.close();
    }
}