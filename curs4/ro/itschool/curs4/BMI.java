package ro.itschool.curs4;

import static java.lang.Math.pow;

public class BMI{
	public double calculateBMI(int height, int weight){
		return weight/pow(height,2);

	}
}