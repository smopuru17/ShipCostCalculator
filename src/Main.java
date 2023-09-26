import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double shippingCost = 0;
        double fee = 0;
        double total = 0;
        System.out.print("Please enter the shipping cost: ");

        if(in.hasNextInt())
        {

            shippingCost = in.nextInt();

            if(shippingCost >= 100) {

             System.out.println("You have no shipping fee because your items are more that $100");
            }else{
                System.out.println("Your item is less then $100 so you have to pay a 2% shipping fee!");
                fee = shippingCost * 0.02;
                total = shippingCost + fee;
                System.out.println("You have a " + fee + " shipping fee on a " + shippingCost + " dollar item so your total comes out to " + total);
            }


        }else{

            System.out.println("Please execute the code correctly!");
        }




    }
}