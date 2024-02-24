import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int number=sc.nextInt();
        if (number/12==2) {
            System.out.println("This is true number");            
        }
        else{
            System.out.println("This is False Number");
        }
        sc.close();
    }
}
