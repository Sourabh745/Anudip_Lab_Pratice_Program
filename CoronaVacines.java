//3.Create abstract class vaccine. Create two variables age(int),nationality(String).create 2 concrete methods firstDose() and secondDose(). Scenario 1:user can take the first dose if the user is Indian and age is 18.After vaccination the user has to pay 250rs(which will be displayed on the console). Scenario 2: Users are eligible to take the second dose only after completing the first dose. Scenario 3: create abstract method boosterDose() in abstract class Vaccine. Create one implementation class vaccinationSuccessful, where implement boosterDose() method. Create main class vaccination and invoke all methods accordingly. [Hint: Create constructor to initialize variables age and nationality,Use flow control(Ifelse) to check condition]

import java.util.*;
abstract class vaccine {
    public int age;
    public String nationality;
    public  int count=0;

    vaccine(int age, String nationality){
        this.age = age;
        this.nationality = nationality;
    }

    public void firstDose(){
        System.out.println(nationality);
        System.out.println("First Dose of Vaccine ");
        if(age >= 18 && nationality.equalsIgnoreCase("Indian")){
            System.out.println("Paid Rs. 250 for First Dose of Vaccine");
            count++;
        }
        System.out.println("===--------------------------------------------------===");

    }
    public void secondDose(){
        System.out.println("Second Dose of Vaccine ");
        if (count!=0){
            System.out.println("You are eligible for second dose");
        }
        else{
            System.out.println("You are not eligible for second dose");
        }
        System.out.println("===--------------------------------------------------===");
    }

    abstract void boosterDose();
}
class vaccinationSuccessful extends vaccine{
    vaccinationSuccessful(int age, String nationality){
        super(age, nationality);
    }

    @Override
    void boosterDose() {
        // TODO Auto-generated method stub
        System.out.println("Booster dose given");
    }
}

public class CoronaVacines{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        System.out.print("Enter your nationality : ");
        String nationality = sc.next();
        vaccine v = new vaccinationSuccessful(age, nationality);
        v.firstDose();
        v.secondDose();
        v.boosterDose();
    }
}