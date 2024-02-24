import java.util.Scanner;

public class TraingleArea {
    public static void main(String[] args) {
        // int a,b,c;
        // a=12;
        // b=14;
        // c=16;

        Scanner luna=new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int a=luna.nextInt();

        System.out.print("Enter Your Second Number: ");
        int b=luna.nextInt();

        System.out.print("Enter Your third Number: ");
        int c=luna.nextInt();

        if (a+b>c && b+c>a && c+a>b) {
            int s=a+b+c/2;//15  s=15;
            double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("traingle area is: "+area);
        }
        else{
            System.out.println("Traingle is not possible");
        }

        luna.close();
    }
}
