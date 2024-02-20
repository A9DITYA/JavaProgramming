import java.util.Scanner;
class factorial {
    public static void main(String a[]){
    int n;
    System.out.println("Enter any value ");
    Scanner sc=new Scanner(System.in);
    
    n=sc.nextInt();
    sc.close();
    factorial obj = new factorial();
    int result =obj.fact(n);
    System.out.println("Factorial of "+n+" is: "+result);
    }
    int fact(int n){
        if(n==1 || n==0){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    

    
}
