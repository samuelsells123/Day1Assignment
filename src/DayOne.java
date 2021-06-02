import java.util.Scanner;

public class DayOne {
	public static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int select = 0;
		
		while(select != 13) {
			System.out.println("Day 1 - Assignment:\r\n"
					+ "-----------------------------------------------------\r\n"
					+ "1. WAP to accept a isbn,name, author,price, no of copies printed from user and print them using method?\r\n"
					+ "2. Compute Quotient and Remainder for provided number.\r\n"
					+ "3. Swap two numbers using temporary variable\r\n"
					+ "4.  Swap two numbers without using temporary variable\r\n"
					+ "5. Check whether an alphabet is vowel or consonant using if..else statement\r\n"
					+ "6. Check whether an alphabet is vowel or consonant using switch statement\r\n"
					+ "7. Java Program to Check a Leap Year\r\n"
					+ "8. Check if a Number is Positive or Negative using if else\r\n"
					+ "9. Prime Numbers Between Two Integers\r\n"
					+ "10.  Program to calculate power using recursion\r\n"
					+ "11. Program to count vowels, consonants, digits, and spaces\r\n"
					+ "12. Write a constructor in the Car class given below that initializes the brand class field with the string “Ford”." + "\n");
			
			System.out.print("Choose a problem from 1-12, or 13 to exit: ");
			
			select = scan.nextInt();
			
			switch(select) {
				case 1:
					DayOne.problem1();
					break;
				case 2:
					DayOne.problem2();
					break;
				case 3:
					DayOne.problem3();
					break;
				case 4:
					DayOne.problem4();
					break;
				case 5:
					DayOne.problem5();
					break;
				case 6:
					DayOne.problem6();
					break;
				case 7:
					DayOne.problem7();
					break;
				case 8:
					DayOne.problem8();
					break;
				case 9:
					DayOne.problem9();
					break;
				case 10:
					DayOne.problem10();
					break;
				case 11:
					DayOne.problem11();
					break;
				case 12:
					DayOne.problem12();
					break;
				case 13:
					System.out.println("\n" + "Exiting...");
					break;
				default:
					System.out.println("\n" + "None Chosen");
			}
		}
		
		scan.close();
	}
	
	public static void problem1() {
		System.out.println("\n" + "Book Entry" + "\n");
		scan.nextLine();
		
		System.out.print("enter isbn: ");
		String isbn = scan.nextLine();
		System.out.print("enter book name: ");
		String name = scan.nextLine();
		System.out.print("enter author name: ");
		String author = scan.nextLine();
		System.out.print("enter # copies: ");
		int numCopies = scan.nextInt();
		
		System.out.println("\n" + "isbn: " + isbn + "\n"
								+ "name: " + name + "\n"
								+ "author: " + author + "\n"
								+ "# copies: " + numCopies + "\n");
	}
	
	public static void problem2() {
		System.out.println("\n" + "Quotient & Remainder" + "\n");
		
		System.out.print("Input Dividend: ");
		int d1 = scan.nextInt();
		System.out.print("Input Divisor: ");
		int d2 = scan.nextInt();
		
		System.out.println("\n" + "Quotient: " + (d1 / d2) + "\n"
								+ "Remainder: " + (d1 % d2) + "\n");
	}
	
	public static void problem3() {
		System.out.println("\n" + "Number Swap w/ Temporary Variable" + "\n");
		
		System.out.print("Input Integer #1: ");
		int num1 = scan.nextInt();
		System.out.print("Input Integer #2: ");
		int num2 = scan.nextInt();
		
		System.out.println("\n" + "Before Swap:" + "\n"
								+ "Number 1: " + num1 + "\n"
								+ "Number 2: " + num2 + "\n");
		
		int swap = num1;
		num1 = num2;
		num2 = swap;
		
		System.out.println("\n" + "Before Swap:" + "\n"
								+ "Number 1: " + num1 + "\n"
								+ "Number 2: " + num2 + "\n");
	}
	
	public static void problem4() {
		System.out.println("\n" + "Swap w/ No Temporary Variable" + "\n");
		
		System.out.print("Input Integer #1: ");
		int num1 = scan.nextInt();
		System.out.print("Input Integer #2: ");
		int num2 = scan.nextInt();
		
		System.out.println("\n" + "Before Swap:" + "\n"
								+ "Number 1: " + num1 + "\n"
								+ "Number 2: " + num2 + "\n");
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1- num2;
		
		System.out.println("\n" + "Before Swap:" + "\n"
								+ "Number 1: " + num1 + "\n"
								+ "Number 2: " + num2 + "\n");
	}
	
	public static void problem5() {
		System.out.println("\n" + "Check Vowel w/ if-else" + "\n");
		
		System.out.print("Input Letter: ");
		char c = scan.next().toLowerCase().charAt(0);
		
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
			System.out.println("\n" + "Letter is a Vowel" + "\n");
		else
			System.out.println("\n" + "Letter is a Consonant" + "\n");
	}
	
	public static void problem6() {
		System.out.println("\n" + "Check Vowel w/ switch" + "\n");
		
		System.out.print("Input Letter: ");
		char c = scan.next().toLowerCase().charAt(0);
		
		switch(c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("\n" + "Letter is a Vowel" + "\n");
				break;
			default:
				System.out.println("\n" + "Letter is a Consonant" + "\n");
		}
	}
	
	public static void problem7() {
		System.out.println("\n" + "Check If Leap Year" + "\n");
		
		System.out.print("Input Year: ");
		int year = scan.nextInt();
		
		// Leap year if divisible by 4
		// End-of-century years only leap year if divisible by 400
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("\n" + "Year is a Leap Year" + "\n");
		}
		else {
			System.out.println("\n" + "Year is Not a Leap Year" + "\n");
		}
	}
	
	public static void problem8() {
		System.out.println("\n" + "Check + or - w/ if-else" + "\n");
		
		System.out.print("Input Integer: ");
		int num = scan.nextInt();
		
		if(num > 0)
			System.out.println("\n" + "Number is Positive" + "\n");
		else if (num < 0)
			System.out.println("\n" + "Number is Negative" + "\n");
		else
			System.out.println("\n" + "Number is Zero" + "\n");
	}
	
	public static void problem9() {
		System.out.println("\n" + "Print Primes Between Two Ints" + "\n");
		
		System.out.print("Input Positive #1: ");
		int num1 = scan.nextInt();
		System.out.print("Input Positive #2: ");
		int num2 = scan.nextInt();
		
		if(num1 >= 0 && num2 >= 0) {
			if(num1 > num2) {
				num1 = num1 + num2;
				num2 = num1 - num2;
				num1 = num1- num2;
			}
			
			System.out.println();
			for(int i = 2; i <= num2; i++) {
				if(isPrime(i)) {
					System.out.print(i + " ");
				}
			}
			System.out.println("\n");
		}
		else
			System.out.println("\n" + "Both numbers need to be positive or zero" + "\n");
	}
	
	public static boolean isPrime(int num) {
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void problem10() {
		System.out.println("\n" + "Calculate Power Using Recursion" + "\n");
		
		System.out.print("Input Base: ");
		int num1 = scan.nextInt();
		System.out.print("Input Exponent: ");
		int num2 = scan.nextInt();
		
		System.out.println("\n" + "Power: " + DayOne.Power(num1, num2) + "\n");
	}
	
	public static int Power(int base, int exponent) {
		if(exponent > 0)
			return base * Power(base, exponent-1);
		else
			return 1;
	}
	
	public static void problem11() {
		System.out.println("\n" + "Count Vowels, Consonants, Digits, and Spaces " + "\n");
		
		int vCount = 0;
		int cCount = 0;
		int dCount = 0;
		int sCount = 0;
		
		System.out.print("Input String: ");
		scan.nextLine();
		String s = scan.nextLine();
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if(Character.isLetter(c)) {
				if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
				   c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
					vCount++;
				else
					cCount++;
			}
			else if(Character.isDigit(c)) {
				dCount++;
			}
			else if(c == ' ') {
				sCount++;
			}
		}
		
		System.out.println("\n" + "Vowel Count: " + vCount + "\n"
								+ "Consonant Count: " + cCount + "\n"
								+ "Digit Count: " + dCount + "\n"
								+ "Space Count: " + sCount + "\n");
	}
	
	public static void problem12() {
		Car testCar = new Car();
		
		System.out.println("\n" + "Car Name: " + testCar.getName() + "\n");
	}
}