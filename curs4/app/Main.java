package ro.itschool.curs4;
import ro.itschool.curs4.BMI;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
	BMI bmiFunction= new BMI();

		System.out.println("Introduceti inaltimea in cm: ");
		Scanner scan = new Scanner(System.in);
		int height = scan.nextInt();

		System.out.println("Introduceti greutatea: ");
		int weight = scan.nextInt();

		System.out.println("Aveti BMI-ul de "+bmiFunction.calculateBMI(height,weight));
	}
}