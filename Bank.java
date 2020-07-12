/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author ntsia
 */
public class Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    //first account
    Account ac1 = new Account("Nikos", 100, true);
    
    //testing transactions
    ac1.printTransactions();
    ac1.withdraw(200);
    ac1.printTransactions();
    ac1.deposit(2);
    ac1.printTransactions();
    //second account, default constructor
    Account ac2 = new Account();
    ac2.printTransactions();
    //third account, testing accountsOpened
    Account ac3 = new Account("Viky", 220, true);
    System.out.println(Account.getAccountsOpened()); 
   
    //First person
    Person bary = new Person("Bary", 35, ac1);
    bary.balance();
    //second person, adding her name to Bary's account
    Person mary = new Person("Mary", 36);
    ac1.setName("Mary");
    //I tried doing mary.setAccount(ac1), but then ac1 only showed Mary's name. Setting Mary's account through Baru's getAccount resolved the issue.
    mary.setAccount(bary.getAccount());
    System.out.println(ac1.getName());
    mary.balance();
    //here, before resolving the issue as discribed above, bary.balance() printed "Mary has 2 euros in the account". Bary was not showing in ac1.
    bary.balance();
    ac1.deposit(350);
    mary.balance();
    bary.balance();
    System.out.println(ac1.getName());
    ac1.setName("Mpampis");
    System.out.println(ac1.getName());
    ac1.printTransactions();
    }
    
}
