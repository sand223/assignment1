package javaAssignment;

import java.util.Scanner; 

public class Finance
{
	static int cusId = 0;

public static void main(String[] args)
{
	
	Scanner input = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter your name: ");
    String name = input.nextLine();  // Read user input
    
    
    System.out.println("Enter your address: ");
    String address = input.nextLine();  // Read user input
    

    System.out.println("Enter age: ");
    int age = input.nextInt();  // Read user input
    
    System.out.println("Enter salary: ");
    double salary = input.nextDouble();  // Read user input
    cusId = cusId + 1;
    if (salary>=30000 && age >18)
    {
    System.out.println("You're Elegible for a Home Loan!");
    }
    else
    {
        System.out.println("You're Not Elegible for a Home Loan!");
    }  

    if (salary>=15000 && age >18)
    {
        System.out.println("You're Elegible for a Car Loan!");
    }
    else
    {
        System.out.println("You're Not Elegible for a Car Loan!");
    }  

    if (salary>=10000 && age >18)
    {
        System.out.println("You're Elegible for a Personal Loan!");
    }
    else
    {
    	System.out.println("You're Not Elegible for a Personal Loan!");
    }  

    
    System.out.println("");
    System.out.println("Name: " + name + ", Customer ID: "+ cusId+ ", Address: " + address + ", Age: " + age + ", Salary: " + salary);  // Output user input
}
}