package Calculator;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);
		System.out.print("Entet the first number: ");
		int num1 = Keyboard.nextInt();
		System.out.print("Enter the second number: ");
		int num2 = Keyboard.nextInt();
		System.out.print("Choose an operation(+,-,*,/,%):");
		char operation = Keyboard.next().charAt(0);
		int result = 0;
		switch(operation) {
		case '+':
			result = num1 + num2;
			break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			case '%':
				result = num1 % num2;
				break;
				default:
					System.out.println("Invalid operation");
				
		}
			System.out.println("Result="+ result);


	}

}
