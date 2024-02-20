import java.util.Scanner;
class Fibonacci{
    public static int Fib(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return Fib(n-1)+Fib(n-2);
        }
    }
    public static void main(String [] a){
        int limit;
        System.out.print("Enter the limit of the Fibonacci series : ");
        Scanner sc = new Scanner(System.in);
        limit =sc.nextInt();
        System.out.println("Fibonacci series up to "+limit+"");
sc.close();
        for(int i =0;i<limit;i++){
            System.out.println(Fib(i)+ " ");
        }
        
    }
}