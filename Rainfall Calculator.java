import java.util.Scanner;

public class RainfallCalculator {
    public static void main(String args[]) {
    
	double totalAverageInches = 0, yearlyAverageInches = 0;
    int totalInches = 0, totalMonthAbove10 = 0, totalMonthBelow3 = 0;
    int yearlyInches = 0,  yearlyMonthAbove10 = 0, yearlyMonthBelow3 = 0;
    int totalMonths = 0;
	
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Welcome to the rainfall calculator");
    System.out.println("Please enter the amount of years you will be calculating");
    int numYears = keyboard.nextInt();
    
    for (int year = 1; year <= numYears; year++){
        yearlyMonthAbove10 = 0; yearlyMonthBelow3 = 0; yearlyInches = 0;
        
        for(int month = 1; month <= 12; month++){
            
            System.out.println("\nhow much rainfall (inches) did you get in year #" + year + ", month #" + month);
            int inchPerMonth = keyboard.nextInt();
            
            yearlyInches += inchPerMonth;
            totalInches += inchPerMonth;
            totalMonths++;
            
            if (inchPerMonth > 10){
                yearlyMonthAbove10++;
                totalMonthAbove10++;
            } else if (inchPerMonth < 3){
                yearlyMonthBelow3++;
                totalMonthBelow3++;
            }
            
        }
			yearlyAverageInches = (yearlyInches / 12);
            
			System.out.println("\nRainfall Report for year #" + year);
			System.out.println("You had a total of " + yearlyInches + " inches of rain this year");
			System.out.println("Your average rainfall this year was " + yearlyAverageInches + " inches a month");
			System.out.println("you had " + yearlyMonthAbove10 + " months with more than 10 inches of rainfall");
			System.out.println("you had " + yearlyMonthBelow3 + " months with less than 3 inches of rainfall");
    }
        totalAverageInches = (totalInches / totalMonths);		
		
        System.out.println("\nOverall Rainfall Report");
        System.out.println("You had a total of " + totalInches + " inches of rain this year");
        System.out.println("Your average rainfall this year was " + totalAverageInches + " inches a month");
        System.out.println("you had a total of " + totalMonthAbove10 + " months with more than 10 inches of rainfall");
        System.out.println("you had a total of " + totalMonthBelow3 + " months with less than 3 inches of rainfall");
        
    }
}