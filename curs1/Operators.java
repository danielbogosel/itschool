class Operators{
	public static void main(String[] args) {
		int result=add(1,2);
		System.out.println(result);
		
		int multiplyResult=multiply(5,10);
		System.out.println(multiplyResult);

		int substrResult=substract(10,2);
		System.out.println(substrResult);

		int  divisionResult=division(7,3);
		System.out.println(divisionResult);

		int remindResult=remind(5,10);
		System.out.println(remindResult);

		String divResult=div(7,3);
		System.out.println(divResult);
	}

	public static int add(int termen1, int termen2){
		return termen1+termen2;
	}

	public static int multiply(int factor1 ,int factor2){
		return factor1*factor2;

	}

	public static int substract(int term1,int term2){
		return term1-term2;
	}

	public static int division(int impartit, int deImpartit){
		return impartit/deImpartit;
	}

	public static int remind(int imp, int deImp){
		return imp%deImp;
	}
//resultat=cat*impartitor=rest
	public static String div(int term1, int term2){
		return term1+"="+division(7,3)+"*"+term2+"+"+remind(7,3);
	}

}	
