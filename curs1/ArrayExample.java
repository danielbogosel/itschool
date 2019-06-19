class ArrayExample{
	public static void main(String[] args) {
		//definitie+size initialization+element initialization
		int[]array=new int[]{1,2,3,4,5,6,9};
		array[3]=10;
		System.out.println(array[3]);

		//definitie+size initialization
		int[]newArrey=new int[10];
		//definitie+size initialization+change something
		int[]anotherArrey=new int[5];
		anotherArrey[0]=1;
		anotherArrey[1]=7;
		anotherArrey[2]=3;
		anotherArrey[3]=2;
		System.out.println(anotherArrey[4]);
		anotherArrey[4]=5;
		System.out.println(anotherArrey[1]);
		System.out.println(anotherArrey[3]);
		System.out.println(anotherArrey[2]);
		System.out.println(anotherArrey[4]);

	}

}