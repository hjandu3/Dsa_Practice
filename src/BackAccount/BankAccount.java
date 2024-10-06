package BackAccount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankAccount {

    //        Bank Account Service
//
//        Create service / function to support bank account operations
//
//        Create Bank Account
//        Add Money
//        Withdraw Money
//        Send Money
//        Block Money
//        Release Money
//
//        System should be built keeping in mind not interacting with any third party services like database | cache etc.
//        Code should be in a workable condition at the end and following best practices.

    Map<String,Integer> accounts = new HashMap<>();
    Integer accountNumberCounter =0;
    Map<Integer,Float> accountAmount = new HashMap<>();

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        System.out.println(bankAccount.createBankAccount("Ayush"));
        System.out.println(bankAccount.createBankAccount("Harpreet"));
        System.out.println(bankAccount.addMoney(1, 100F));
       // System.out.println(bankAccount.withDrawn(1, 100F));
        //System.out.println(bankAccount.sendMoney(1,2,100F));
        System.out.println(bankAccount.sendMoney(1,1,100F));
        System.out.println(bankAccount.accountAmount);
    }


    private Integer accountNumber;

    private String accountHolderName;

    private String amount;




    public Map<String,Integer> createBankAccount(String name){
        if(!accounts.containsKey(name)){
            accounts.put(name,++accountNumberCounter);
            accountAmount.put(accountNumberCounter,0F);
            return accounts;
        }
        throw new RuntimeException("Account already exists !!");
    }

    public String addMoney(Integer accountNumber,Float amount){
        accountAmount.put(accountNumber,accountAmount.get(accountNumber)+amount);
        return "Money added successfully !";
    }

    public String withDrawn(Integer accountNumber,Float withdrawAmount){
        Float amountPresent = accountAmount.get(accountNumber);
        Float remainingAmount = amountPresent-withdrawAmount;
        if(remainingAmount >=0){
            accountAmount.put(accountNumber,remainingAmount);
            return withdrawAmount.toString() + " has been debited and the remaing amount : " + remainingAmount;
        }else{
            throw new RuntimeException("Insufficient balance");
        }
    }

    public String sendMoney(Integer sourceAccountNumber, Integer receiverAccountNum, Float transferAmount){
        if((!accountAmount.containsKey(sourceAccountNumber) || !accountAmount.containsKey(receiverAccountNum)) && receiverAccountNum!=sourceAccountNumber) {
            throw new RuntimeException("Either account not present or you are trying to send money to your own account");
        }
        Float amountPresentInSenderAcc = accountAmount.get(sourceAccountNumber);
        Float amountPresentInReceiverAcc = accountAmount.get(receiverAccountNum);
        if(amountPresentInSenderAcc>=transferAmount){
            accountAmount.put(sourceAccountNumber,amountPresentInSenderAcc-transferAmount);
            accountAmount.put(receiverAccountNum,amountPresentInReceiverAcc+transferAmount);
            return transferAmount + " amount has been succcessfully sent to " + receiverAccountNum;
        } else{
            throw new RuntimeException("Insufficent balance prenset in sender's account !!");
        }

    }



}
