package DefiningClasses_lab;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<Integer, BankAccount>  bankAccounts = new HashMap<>();
        String line = scanner.nextLine();
        while (!line.equals("End")){
            String[] tokens = line.split("\\s+");
            String command = tokens[0];

            String output = null;
            if (command.equals("Create")){
                BankAccount bankAccount = new BankAccount();
                int id = bankAccount.getId();
                bankAccounts.put(id, bankAccount);
                output = "Account ID" +  id + " created";
                
            } else if (command.equals("Deposit")) {
                int id = Integer.parseInt(tokens[1]);
                int amount = Integer.parseInt(tokens[2]);
                BankAccount bankAccount = bankAccounts.get(id);
                if(bankAccount!=null) {
                    bankAccount.deposit(amount);
                    output = "Deposited " + amount + " to ID" + id;
                }else {
                    output = "Account does not exist";
                }

            } else if (command.equals("SetInterest")) {
                double interest = Double.parseDouble(tokens[1]);
                BankAccount.setInterestRate(interest);
                
            } else if (command.equals("GetInterest")) {
                int id = Integer.parseInt(tokens[1]);
                int years = Integer.parseInt(tokens[2]);
                BankAccount bankAccount = bankAccounts.get(id);
                if(bankAccount!=null) {
                    output = String.format("%.2f", bankAccount.getInterest(years));
                }else {
                    output = "Account does not exist";
                }

            }

            if(output!=null) {
                System.out.println(output);
            }
            line = scanner.nextLine();
        }
    }
}
