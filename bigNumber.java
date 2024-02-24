import java.util.Scanner;

public class bigNumber {
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        System.out.print("Enter The First Number: ");
        int a=number.nextInt();
        
        System.out.print("Enter The Second Number: ");
        int b=number.nextInt();
        
        System.out.print("Enter The Third Number: ");
        int c=number.nextInt();

        if (a>b && a>c) {
            System.out.println("A is a BIg Number...");
        }
        else if (b>a && b>c) {
            System.out.println("B is a Big Number...");
        }
        else{
            System.out.println("C is a Big Number...");
        }
        number.close();
    }
}
