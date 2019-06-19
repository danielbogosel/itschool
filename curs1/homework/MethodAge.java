class MethodAge{
	public static void main(String[] args) {
		String namePerson="Paul";
		int agePerson=3;
		
		System.out.println(identity(namePerson,agePerson));
		varCallName(namePerson,agePerson);
	}
	public static String identity(String unNume, int unAge){
		return unNume +" has "+unAge+" years";
	}

	public static void varCallName(String unNume, int unAge){
		System.out.println(unNume+" has "+unAge+"years");
	}
}