import java.util.*;
class CalculateAmount{
    double amount;

    CalculateAmount(int a ) {
        amount = a;
    }

    public void withdrawalAmount(int withdraw){
       if(withdraw > amount){
        System.out.println("Balance insufficient");
        
       }
       else{
        amount -= withdraw;
        System.out.println("Withdraw Successfully");
       }
    }

    public void DepositAmount(int deposit){
        amount += deposit;
    }
    
    public void displayRemainingAmount(){
        System.out.println("Remaining amount " +amount);
    }

}

public class Bank{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            //Deposit your amount 
            System.out.print("Amount you want to deposit ");
            int amount = sc.nextInt();

            // initializing a object
            CalculateAmount ca = new CalculateAmount(amount);

            // Withdrawing amount 
            System.out.print("Amount you want to withdraw ");
            int withdraw = sc.nextInt();
            ca.withdrawalAmount(withdraw);

            //Displaing remaining amount
            ca.displayRemainingAmount();

            System.out.print("Amount you want to deposit ");
            int deposit = sc.nextInt();
            ca.DepositAmount(deposit);

            ca.displayRemainingAmount();
    }
}

