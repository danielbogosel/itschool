class PerLine{
public static void main(String[] args) {
	int[] myArray=new int[]{7,6,3,2,22,-1,4};
	int contor=0;
		for(int i=0;i<myArray.length;i++){
			
			if(contor!=1){
				System.out.print(myArray[i]+" ");
				contor++;

			} else if(contor==1){
				System.out.println(myArray[i]);
				contor=0;
			}

		}
	
	}
}