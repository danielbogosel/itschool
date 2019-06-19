class Compare{
	public static void main(String[] args) {
	int a=10;
		returnComparare(a);
	}

	public static void returnComparare(int varCompare){
		if(varCompare<10){
			System.out.println("Numarul este mai mic ca 10");

		} else if(varCompare>10) {
		System.out.println("Numarul este mai mare  ca 10");
		
			}else if(varCompare==10) {
		System.out.println("Numarul egal cu 10");
			}
	}
}