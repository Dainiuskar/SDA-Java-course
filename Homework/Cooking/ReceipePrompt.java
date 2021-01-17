//package java.cooking;

import java.util.Scanner;

public class ReceipePrompt {

    float amount;
    String unit;


    public static void main(String[] args) {
      run();
    }
    public void run() {
        promptAmount();
        promptUnit();

    }

    public void promptAmount() {

        System.out.println("Enter the amount of unit");
        Scanner amount = new Scanner((System.in));
        if(amount.nextFloat()>0 || amount.nextFloat() != 0){
            this.amount = amount.nextFloat();
        } else{
            System.out.println("Wrong amount, please enter valid amount");
            promptAmount();
        }

    }

    public void promptUnit() {

        System.out.println("Enter a unit Name");
        Scanner unit = new Scanner(System.in);
        if(!unit.nextLine().isEmpty()){  // && Cooking.Units.isValid(unit.nextLine().toUpperCase())
            this.unit = unit.nextLine().toUpperCase();
        }else {
            System.out.println("Wrong amount, please enter valid amount");
            promptUnit();
        }

    }
}
