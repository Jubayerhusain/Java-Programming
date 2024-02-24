public class one_from_100primenumber {
    public static void main(String[] args) {
        int i=0,num=0,counter=0;
        String primeNumbers=" ";
        for(i=0; i<=100; i++){
            counter=0;
            for(num=i; num>=1;num--){
                if (i%num==0) {
                    counter=counter+1;
                }
            }
            if (counter==2) {
                primeNumbers+=i+" ";
            }
        }
        System.out.println("The prime number is: ");
        System.out.println(primeNumbers);
    }
}
