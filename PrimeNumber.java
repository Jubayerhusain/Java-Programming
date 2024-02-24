import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int number=input.nextInt();
        int count=0;
        for(int i=2; i<number; i++){
            if (number%i==0) {
                count++;
                break;
            }
        }
        if (count==0) {
            System.out.println("this is prime number...");
        }
        else{
            System.out.println("This is not prime number...");
        }
        input.close();
    }
}
