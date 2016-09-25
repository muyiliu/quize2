
import java.util.Scanner;



public class Financial_cal {
	public static void main(String[] args) {
		
		double percentage_year2;
		double percentage_year3;
		double percentage_year4;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Your current tuition is $12,342, What's the increase percentage of it?");
		double tuition = input.nextDouble()/100;
		
		System.out.println("What's the percentage increase of year 2?");
		percentage_year2 = input.nextDouble()/100;
		
		System.out.println("What's the percentage increase of year 3?");
		percentage_year3 = input.nextDouble()/100;
		
		System.out.println("What's the percentage increase of year 4?");
		percentage_year4 = input.nextDouble()/100;
		
		double tuititon1 = tuition;
		double total_tuition = 0;
		double percentage = 0;
		
		
		for (int year = 0;year<4;year++){
			switch(year){
			case 0 : percentage = 0; break;
			case 1 : percentage = percentage_year2;break;
			case 2 : percentage = percentage_year3;break;
			case 3 : percentage = percentage_year4;break;
			}
			tuititon1 += tuititon1*percentage;
			total_tuition += tuititon1;
		}
		System.out.printf("Your total tuition will be ", total_tuition);
		
		input.close();
		}
	}
	
