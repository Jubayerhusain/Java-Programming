public class oparent {
    public static void main(String[] args) {
        // int a=12;
        // int b=15;
        // int total=a+b;
        // System.out.println(total);

        // System.out.println(12+15);

        // int a,b,total;
        // a=15;
        // b=10;
        // total=a+b;
        // System.out.println(total);

        int a,b,c;
        a=10;
        b=15;
        c=20;
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);

        float d = (float)b / (float)a;
        System.out.println("Division: b/a = "+d);

        int result1 = b % a;
        System.out.println("Modolus: b%a = "+result1);

        int result2 = a*b+c;
        System.out.println("EXpression: a*b+c = "+result2);

        int result3 = a+b*c;
        System.err.println("Expression: a+b*c = "+result3);
    }
}
