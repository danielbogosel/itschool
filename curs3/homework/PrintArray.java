class PrintArray{
	public static void main(String[] args) {
		String[] myStringArray=new String[]{"moon","son","cat","dog","frog","egg","sun"};
		for(int i=0;i<myStringArray.length;i+=2){
			System.out.print(myStringArray[i]+" ");
		}
	}
}