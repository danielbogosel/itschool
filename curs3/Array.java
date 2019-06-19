class Array{
	public static void main(String[] args) {
		int[]array=new int[]{7,0,22,43,2};

		Afisare(array);

		}
	public static void Afisare(int[]array){
		for(int i=0;i<array.length;i+=2){
			System.out.println(array[i]);
		}
	}
}