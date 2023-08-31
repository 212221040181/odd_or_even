public class Main {
    public static void main(String[] args){
        num(5);
        num(10);

    }
    static void num(int n)
    {
        if (n%2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
}
