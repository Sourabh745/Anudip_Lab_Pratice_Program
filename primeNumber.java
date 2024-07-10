import java.util.Scanner;

public class primeNumber {
    public static boolean checkPrime(int a){
        if(a == 0 && a == 1 &&  a == 2){
            return true;
        }
        int count =  0;
        for(int i=2; i<=a; i++){
            if(a%i==0){
                count++;
            }
            continue;
        }
        if(count == 1){
            return true;            
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check whether it is prime: ");
        int a = sc.nextInt();
        primeNumber pn = new primeNumber();
        boolean primeOrNot = pn.checkPrime(a);
        System.out.println(primeOrNot);
    }
}
