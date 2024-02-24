import java.util.Scanner;

public class TrangleArea {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter Your First Number: ");
        a=sc.nextInt();

        System.out.print("Enter Your Second Number: ");
        b=sc.nextInt();

        System.out.print("Enter Your Third Number: ");
        c=sc.nextInt();

        if ((a+b)>c && (b+c)>a && (c+a)>b) {
            int s=(a+b+c)/2;
            double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("Area Of Traingle is ="+area);
        }
        else{
            System.out.println("Traingle is not possible..");
        }
        sc.close();
    }
}
