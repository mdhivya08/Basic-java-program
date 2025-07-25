/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();           
        int arr[] = new int[n];
        
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();         
        }

        int a = sc.nextInt();             
        int b = sc.nextInt();   
        Main obj=new Main();
        System.out.print(obj.singledigitsum(arr,n,a,b));
    }
         
        public int singledigitsum(int []arr,int n,int a,int b){
        int sum = arr[a] + arr[b];
        while(sum >= 9) {
            int temp = 0;
            while(sum > 0) {
                temp += sum % 10;
                sum /= 10;
            }
            sum = temp;
        }
        return sum;
    }
}

