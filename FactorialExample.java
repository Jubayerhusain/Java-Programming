class FactorialUsingFor
{
    public static void main(String arg[])
    {
        // int factorial = 1;
        // int number = 0;
        
        // for(int i = 1; i <= number; i++)
        // {
        //     factorial *= i;
        // }
        
        // System.out.println("Factorial of number " + number + " is " + factorial);
        int factorial=1, number=5;
        for(int i=1; i<=number; i++){
            factorial=factorial*i;
        }
        System.out.println("Factorial of Number "+number+" is "+factorial);
    
    }
}
