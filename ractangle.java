import java.util.Scanner;

public class ractangle {
    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);

        System.out.println("Enter Your Length Number: ");
        int a=sc.nextInt();

        
        System.out.println("Enter Your Width Number: ");
        int b=sc.nextInt();

        int area=a*b;
        System.out.println("Traingle Area Is "+area);
    }
}
