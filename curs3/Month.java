class Month{
	public static void main(String[] args) {
		String[] month=new String[]{"January","February","March","Aplil","May","June","July","August","September","Octomber","November","Decembre"};
		int monthNumber=1;



		System.out.println(returnMonth(month,monthNumber));
	}

	public static String  returnMonth(String[] arrayMonth, int count ){
					switch(count){
						case 1 : return arrayMonth[0];
						case 2:
						case 3:
						return arrayMonth[count];
						default:
						return "not a  month";
					}
	}

	}