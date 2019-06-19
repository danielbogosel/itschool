class matchPerson{
	public static void main(String[] args){
		String[] arrayName=new String[5];
		
		arrayName[0]="Tim";
		arrayName[1]="John";
		arrayName[2]="Damaris";
		arrayName[3]="Ana";
		arrayName[4]="Erik";

	int[] arrayAge=new int[5];

		arrayAge[0]=12;
		arrayAge[1]=54;
		arrayAge[2]=4;
		arrayAge[3]=22;
		arrayAge[4]=19;

	int Number=4;

			System.out.println(match(Number, arrayName[],arrayAge[]));
	}
	public static String match( int matnchNumber,String[] arrayName, int[] arrayAge){
		return arrayName[matnchNumber]+" has "+arrayAge[matnchNumber]+"years";
	}
}