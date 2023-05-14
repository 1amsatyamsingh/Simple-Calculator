import java.util.Scanner;

public class CalculatorSatyamSingh {
public static void main(String[] args) {
 double operator, n1, n2;

Scanner sc = new Scanner(System.in);
System.out.println("****** Name: Satyam Singh ******\n****** Univ.No: 2200270140052  ******\n ");
System.out.println("******Enter Any Two Numbers ******\n ");
System.out.print("Enter First Number: ");
        n1 = sc.nextDouble();
System.out.print("Enter Second Number: ");
        n2 = sc.nextDouble();
System.out.println("1- Add '+' \n2- Subtract '-' \n3- Multiplication '*' \n4- Divide '/'\n ");
System.out.print("Enter the Operation Symbol: ");

char operation = sc.next().charAt(0);

double result=0;
switch(operation) {
case '+':
result= n1 + n2;
break;
case '-':
result= n1 - n2;
break;
case '*':
result= n1 * n2;
break;
case '/':
result= n1 / n2;
break;

default:
System.out.println("Entered Operation is not valid");
}
System.out.println("****** Your Solution is ******");
System.out.println(n1 + " " + operation + " " + n2 + " = " + result);
}
}