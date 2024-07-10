import java.util.Scanner;

public class FibonacciSeries {

    public void PrintFibonacci(int a){
        int x = 0;
        int y = 1;
        int z;
        System.out.print(x+" ");
        System.out.print(y+" ");
        for(int i=2; i<a; i++){
            z = x+y;
            x = y;
            y = z;
            System.out.print(z+ " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print fibonacci series");
        FibonacciSeries fs = new FibonacciSeries();
        System.out.println("Print Fibonacci of number ");
        int a = sc.nextInt();
        fs.PrintFibonacci(a);
    }
}
