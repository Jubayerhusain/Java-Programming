import java.util.Scanner;

/**
 * Add
 */
public class Add {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The First Number: ");
        int a=sc.nextInt();
        System.out.println("Enter The Second Number: ");
        int b=sc.nextInt();
        int add=a+b;
        System.out.println("The Ans Is="+add);
        sc.close();
    }
}