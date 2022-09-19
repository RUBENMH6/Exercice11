import java.util.Scanner;

public class Exercice11 {

    public static void main(String[] args) {
        int x, y;

        Scanner input= new Scanner(System.in);
        System.out.println("Write one number:");
        x = input.nextInt();
        System.out.println("Write other number:");
        y = input.nextInt();

        if (x>=y) {
            System.out.println("Order is: "+ x + " and " + y);
        } else {
            System.out.println("Order is: " + y + " and " + x);
        }
    }
}

