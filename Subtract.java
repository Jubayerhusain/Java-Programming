import java.util.Scanner;

public class Subtract {
    public static void main(String[] args) {
        Scanner ab=new Scanner(System.in);
        System.out.print("Enter The First Number: ");
        int a=ab.nextInt();
        System.out.print("Enter The Seond Number : ");;
        int b=ab.nextInt();
        int subtract=a-b;
        System.out.println("The Ans is:"+subtract);
        ab.close();
    }
}
