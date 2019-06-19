import java.util.Scanner;
class Impt{
	public static void main(String[] args) {
		System.out.println("Introduceti numele: ");
		Scanner scan= new Scanner(System.in);
		String nume = scan.nextLine();

		System.out.println("Introduceti varsta: ");
		int varsta=scan.nextInt();

		System.out.println(nume+" are "+varsta+" ani");
		
	}
}