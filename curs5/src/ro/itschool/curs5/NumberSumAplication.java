package ro.itschool.curs5;
import java.util.Scanner;

public class NumberSumAplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduceti numarl");
        int number = sc.nextInt();
        NumberSum returnSum = new NumberSum();
        System.out.println("Suma cifrelor numarului este: "+returnSum.calaculate(number));

    }
}
