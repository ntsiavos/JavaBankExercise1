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
public class Person {
    
    private String name;
    private int age;
    private Account ac;
    
    //constructors
    public Person(){
    }
    
    public Person(String name, int age){
    this.name = name;
    this.age = age;
    }
    
    public Person(String name, int age, Account ac){
    this(name, age);
    this.ac = ac;
    }
    
    //getters
    public String getName(){
    return name;
    }
    
    public int getAge(){
    return age;
    }
    
    public Account getAccount(){
    return ac;
    }
    
    //only age and account setters, name should be stable
    public void setAge(int age){
    this.age = age;
    }
    
    public void setAccount(Account ac){
    this.ac = ac;
    }
    
    //create a method to get a person's account balance
    
    public void balance(){
    ac = getAccount();
    double balance = ac.getAmount();
    name = getName();
    System.out.println(name+ " has " +balance+ " euros in the account.");
        
    }
}

