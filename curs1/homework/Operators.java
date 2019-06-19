class Operators{
	public static void main(String[] args) {
		System.out.println(addOperation(3.7,8));
		System.out.println(difOperation(-3,5));
		System.out.println(divOperation(100,33));
		System.out.println(powOperation(33,2));
		System.out.println(div(7,3));
		
	}
	public static double addOperation(double termen1, double termen2){
		return termen1+termen2;
	}

	public static double difOperation(double deScazut, double scazator){
		return deScazut-scazator;
	}

	public static int divOperation(int deImpartit, int impartitor){
		return deImpartit/impartitor;
	}
	public static int powOperation(int factor1, int factor2){
		return factor1*factor2;
	}
	public static int moduloOperation(int impartit, int modular ){
		return impartit%modular;

	}

	public static String div(int divide1, int divide2){
		return divide1+"="+divOperation(divide1,divide2)+"*"+divide2+"+"+moduloOperation(divide1,divide2);
	}
}