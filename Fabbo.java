import java.util.Scanner;

public class Fabbo{

    static int fabbo(int n){
        if(n==0 || n==1) return 1;

        return fabbo(n-1)+fabbo(n-2);
    }
    static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)  return false;
        }
        return true;
    }  
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int n=scanner.nextInt();
        int n=20;
        // for(int i=0; i<n; i++)
        //  System.out.println(fabbo(i));
        
        for(int i=1; i<=n;i++){
            if(isPrime(i)) System.out.println(i);
        }

    }
}