import java.util.Scanner;
public class ShipCostCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double InputPrice = 0;
        double InputTax = 0.02;
        double OutputPrice = 0;
        String Trash = "";
        System.out.println("Enter the item's price: ");

        if(in.hasNextDouble())
        {
            InputPrice = in.nextDouble();
            in.nextLine();
        }
        else
        {
            Trash = in.nextLine();
            System.out.println("You entered " + Trash + " which is invalid.");
        }

        if(InputPrice >= 100)
        {
            System.out.println("You qualify for free shipping!");

        }
        else
        {

        }
    }
}