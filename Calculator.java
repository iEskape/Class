import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int num1;
		int num2 = 0;
		char operator;
		double answer = 0.0;

		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 1st Number: ");
		num1 = in.nextInt();
		
		
		System.out.println("Please choose Function: +, -, *, /, !, ^, @, &, #,");
		operator = in.next().charAt(0);
		// != Sqr ^= Exp @= Abstract &= Ceiling #= floor
		switch (operator) {
		case '+': 
			System.out.println("Enter 2nd Number");
			num2= in.nextInt();
			answer =(num1 + num2);
			System.out.println(num1+" "+operator+" "+num2+"="+answer);
			
			System.exit(0);
		case '-':
			System.out.println("Enter 2nd Number");
			num2= in.nextInt();
			answer =(num1 - num2);
			System.out.println(num1+" "+operator+" "+num2+"="+answer);
			
			System.exit(0);
		case '*':
			System.out.println("Enter 2nd Number");
			num2= in.nextInt();
			answer =(num1 * num2);
			System.out.println(num1+" "+operator+" "+num2+"="+answer);
			
			System.exit(0);
		case '/':
			System.out.println("Enter 2nd Number");
			num2= in.nextInt();
			answer =(num1/num2);
			System.out.println(num1+" "+operator+" "+num2+"="+answer);
			
			System.exit(0);
		case '^':
			System.out.println("Enter 2nd Number");
			num2= in.nextInt();
			answer = Math.pow(num1,num2);
			System.out.println(num1+" "+operator+" "+num2+"="+answer);
			
			System.exit(0);
		case '#':
			System.out.println("Enter 2nd Number");
			num2= in.nextInt();
			System.out.println(num1+" "+operator+" "+num2+"="+answer);
			answer =Math.floorDiv(num1, num2);
			System.exit(0);
		case '!': answer =num1*num1;
			System.out.println(num1+" "+operator+" "+num1+"="+answer);
			
			System.exit(0);
		case '@': answer =Math.abs(num1);
			System.out.println(num1+" "+operator+" "+num1+"="+answer);
			
			System.exit(0);
		case '&': answer =Math.ceil(num1);
			System.out.println(num1+" "+operator+" "+num1+"="+answer);
			
			System.exit(0);
			
			
	}
		
		 
		
	}

}
