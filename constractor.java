public class constractor {
    String name,gender, phone;

    constractor(String n, String g, String p){
        name=n;
        gender=g;
        phone=p;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Phone: "+phone);
    }
    public static void main(String[] args) {
        constractor bio1=new constractor("Jubayer","male","01305113004\n");
        bio1.display();
        
        constractor bio2=new constractor("Abdullah","male", "01814228053\n");
        bio2.display();
        
        constractor bio3=new constractor("Fahim","male", "01743169762");
        bio3.display();
    }
}
