class Format{
	public static void main(String[] args) {
		String endText="alabala";
		int putSpaces=5;
		formatString(endText,putSpaces);
		

	}
		public static void formatString(String sapceString, int spaces){
			for (int i=0;i<spaces;i++){
				System.out.print(" ");
			}
			 System.out.print(sapceString);
			
		}
}