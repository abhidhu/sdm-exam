import java.util.Scanner;

public class Fabbo{

    static int fabbo(int n){
        if(n==0 || n==1) return 1;

        return fabbo(n-1)+fabbo(n-2);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int n=scanner.nextInt();
        int n=20;
        for(int i=0; i<n; i++)
         System.out.println(fabbo(i));
        

    }
}