
import java.util.Scanner;

public class Tuition {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("What's your initial tuition?");
		double initial = input.nextDouble();
		
		double[] rates = new double[3];
		for (int i =2;i<5;i++){
			System.out.println("What's you percentage increase for each year?");
			double increase = input.nextDouble();
			rates[i-2]=increase;
			
		}input.close();
			String the_tution = String.format("%.2f", total(initial, rates));
			System.out.println(the_tution);
		}
		


			public static double total(double initial, double[] RateList){
			
			double year_cost = initial;
			double total_cost = initial;
			
			for (int i1 = 0;i1<3;i1++){
				year_cost = year_cost*(1+(RateList[i1]/100));
				total_cost += year_cost;
				System.out.println(total_cost);
			}
			return total_cost;
			
			
	}

}
