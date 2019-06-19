import java.util.Scanner;
import java.util.Random;
class GuessingGame{
	public static void main(String[] args) {
		Random random  = new Random();
		Scanner sc = new Scanner(System.in);
		int randomNumber = random.nextInt(20);
		
		System.out.println("Incearca sa ghicesti numarul ");
		int guessingTry=sc.nextInt();

			if(guessingTry!=randomNumber){

		do{
			System.out.println("Numarul introdus nu e cel cautat, mai incearca cu un numar "+GreaterOrLowerNumber(guessingTry,randomNumber));
			guessingTry=sc.nextInt();
		}while(guessingTry!=randomNumber);
		System.out.println("Numarul cautat a fost: "+guessingTry);

			}else
		System.out.println("Numarul cautat a fost: "+guessingTry);
		
	}
	public static String GreaterOrLowerNumber(int compeNumber,int random){
		if(compeNumber<random)
			return "mai mare";
		
		else if(compeNumber>random)
			return "mai mare";
		
	}

}