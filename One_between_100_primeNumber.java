/**
 * One_between_100_primeNumber
 */
public class One_between_100_primeNumber {

    public static void main(String[] args) {
        int num=100;
        for(int i=1; i<=num; i++){
            int count=0;

            for(int j=2; j<=i/2; j++){
                if (i%j==0) {
                    count++;
                    break;
                }
            }
            if (i==j) {
                System.out.println(i);
            }
        }
    }
}