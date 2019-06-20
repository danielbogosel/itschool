package ro.itschool.curs5;
import java.util.Scanner;

public class ArrayNumberApplication {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduceti numarul de elemente ");
        int elementNumber = sc.nextInt();
        System.out.println("Introduceti divizorul");
        int divisor =sc.nextInt();
        ArrayNumber getArray = new ArrayNumber();
        System.out.print(getArray.arrayNumbers(elementNumber,divisor));
    }
}
