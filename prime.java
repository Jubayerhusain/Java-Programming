import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i, n ,temp;
        boolean isPrime=true;

        System.out.println("Enter The Number : ");
        n=sc.nextInt();
        for(i=0; i<=n/2; i++){
            temp=n%i;
            if (temp==0) {
                isPrime=false;
                return;
            }
        }
        if (isPrime) {
            System.out.println(n+" is a prime number..");
        }
        else{
            System.out.println(n+" is not prime number..");
        }
    }
    
}
