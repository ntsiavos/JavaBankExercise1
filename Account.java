/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.util.ArrayList;

/**
 *
 * @author ntsia
 */
public class Account {
    private ArrayList<String> name = new ArrayList();
    private int number;
    private double amount;
    private boolean active;
    private ArrayList<String> transactions = new ArrayList();
    private static int accountsOpened = 0;
    
    
    //Constructors.We try to link all three of them together. We set account number to be equal to the counter, so that we don't have duplicate account numbers.
    
    public Account(){
    accountsOpened++;
    number = accountsOpened;
    transactions.add("Bank account " +number+ " has been created.");
    }
    
    public Account(String onoma){
    this();
    name.add(onoma);
    }
    
    public Account(String onoma, double sum, boolean activation){
    this(onoma);
    amount = sum;
    active  = activation;
    }
    
    //Setters. I did not include ones for number, transactions or counter, as I don't want them to be accessible outside the class
    
    //setName adds the name of the person to the account. If there is already a name there, it adds it along with a space and comma string for better printing.
    public void setName(String onoma){
    if (0 < name.size()) {    
    name.add(", " +onoma);
    }
    else name.add(onoma);
    }
   
    
    public void setActive(boolean active){
    this.active = active;
    }
    
    //getters
    public String getName() {
    String onoma = "";
    for (String s:this.name)onoma = onoma + s;
    
    return onoma;
    }
    
    
    public int getNumber() {
    return number;
    }
    
    public double getAmount() {
    return amount;
    }
    
    public boolean getActive() {
    return active;
    }
    
    public ArrayList getTransactions() {
    return transactions;
    }
    
    //this has to be static, because the variable accountsOpened is static
    public static int getAccountsOpened() {
    return accountsOpened;
    }
    
    
    public void deposit(double deposit){
    amount += deposit;
    transactions.add(deposit+ " euros have been deposited in the account.");
    }
    
    public void withdraw(double withdraw) {
    while ((amount - withdraw) < 0) withdraw --;
    amount -= withdraw;
    transactions.add(withdraw+ " euros have been withdrawn from the account.");
    }
    //method for printing the transactionss list from an account
    public void printTransactions(){
    System.out.println("Transactions: " +getTransactions());
    }
}
