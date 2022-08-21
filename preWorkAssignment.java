import java.util.Scanner;

public class Main {


//function to checkPalindrome
public void checkPalindrome() 
 	{
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter the number to be checked for palindrome: ");
	int i = scan.nextInt();
	
	int reversedNo = 0, rem;
    
    
    int originalNum = i;
    while (i != 0) {
      rem = i % 10;
      reversedNo = reversedNo * 10 + rem;
      i /= 10;
    }
    if (originalNum == reversedNo) {
      System.out.println(originalNum + " is Palindrome.");
    }
    else {
      System.out.println(originalNum + " is not Palindrome.");
    }
 	}

 
//function to printPattern
public void printPattern()
	{
	String s1 = "*";
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number of rows for pattern : ");
	int a = scan.nextInt();
	for (int j=a;j>=0;j--)
	{
		for(int i=j; i>0;i--) 
		{
			System.out.print(s1);
		}
		
		System.out.println();
	}

    }

//function to check no is prime or not
public void checkPrimeNumber() 
	{
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter the number to be checked for Prime : ");
	int n = scan.nextInt();
	int flag=0;
	//System.out.println("Number entered to be checked is: "+ n);
	if (n==0 ||n==1)
	{
		System.out.println(n+" is not a Prime number");
	}
	for (int i=2;i<=n;i++)
	{
		if(n%i==0) 
		{
			flag ++;
		}	
		
	}
	if (flag ==1) 
	{
		System.out.println(n+" is a Prime number");

	}
	else
	{
		System.out.println(n+" is not a Prime number");

	}

    }

 // function to print Fibonacci Series
public void printFibonacciSeries() 
	{

	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the size of the Fibonacci series: ");
	int length= scan.nextInt(); 
	
	//initialize the first and second value as 0,1 respectively.
	int x=0;
	int y= 1;
	int a;
	System.out.print("Fibonacci series of length "+ length+" is : "+x+","+y+",");
	for (int i=1;i<=length;i++) 
	{
		a=y;
		y=x+y;
		x=a;
		System.out.print(y+",");
	}

     }

 

//main method which contains switch and do while loop
 public static void main(String[] args) 
 {
	 Main obj = new Main();
	 int choice;
	 Scanner sc = new Scanner(System.in);

do {

System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println();

 

choice = sc.nextInt();

switch (choice) 
{
case 0:
choice = 0;
break;

 
case 1: {
obj.checkPalindrome();
}
break;

 
case 2: {
obj.printPattern();
}
break;

 

case 3: {
obj.checkPrimeNumber();
}
break;


case 4: {
obj.printFibonacciSeries();

}
break;

 

default:
System.out.println("Invalid choice. Enter a valid no.\n");
}

 

} 
while (choice != 0);

System.out.println("Exited Successfully!!!");

sc.close();

}

 

}
