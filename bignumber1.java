import java.util.Scanner;

public class bignumber1 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("Enter Your 1st NUmber: ");
        int a=input.nextInt();

        System.out.print("Enter Your 2nd Number: ");
        int b=input.nextInt();

        System.out.print("Enter Your 3rd Number: ");
        int c=input.nextInt();
        // int a=15;
        // int b=20;
        // int c=25;

        if (a>b && a>c) {
            System.out.println("A is big..");
        }

        else if(b>a && b>c){
            System.out.println("B is Big");
        }

        else{
            System.out.println("C is big...");
        }
        input.close();
    }
}
