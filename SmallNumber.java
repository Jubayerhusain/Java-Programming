import java.util.Scanner;

public class SmallNumber {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int a=num.nextInt();
        System.out.print("Enter The Second Number: ");
        int b=num.nextInt();
        if (a>b) {
            System.out.print("A is Biggest Number...");
        }
        else{
            System.out.print("B is Biggest Number...");
        }
        num.close();
    }
}
