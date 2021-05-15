
import java.util.*;
import java.util.Scanner;

public class SecondAttempt {

	public static void main(String[] args) {
		
		
		String studentScore = "Yes";
		Scanner sc = new Scanner(System.in);
		Scanner Option = new Scanner(System.in);
		
		List<Integer> Lists = new ArrayList<Integer>();
		
		
		
		while (!studentScore.equals("no")){
			
			System.out.println("Hello! Please enter a grade:" );
		  Lists.add(sc.nextInt());
			
			System.out.println("Do you like to enter another grade Yes/No: ");
			studentScore = Option.next().toLowerCase();
			
			

	}
   System.out.println(Lists);
   Collections.sort(Lists);
   System.out.println("Lowest Score : " +Lists.get(0));
   
   int lastItem = Lists.get(Lists.size()-1);
   System.out.println("Highest score : " +lastItem );
   
    double sum=0;
    int aGrade = 0;
    int bGrade = 0;
    int cGrade = 0;
    int fGrade = 0;
    
    for (int i=0; i<Lists.size();i++) {
    	sum = sum+Lists.get(i);
    	
    	if((Lists.get(i)>=90))
    	aGrade++;
    	else if (Lists.get(i)>=80)
    	bGrade++;
    	else if (Lists.get(i)>=70)
    		cGrade++;
    	else
    		fGrade++;
    	
    }
    
       
   System.out.println("Average is : " +sum/Lists.size());
   System.out.println("A Students: " +aGrade);
   System.out.println("B Students: " +bGrade);
   System .out.println("C Students: " + cGrade);
   System.out.println("F Students: " + fGrade);
   
}
}
