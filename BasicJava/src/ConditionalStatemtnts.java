
public class ConditionalStatemtnts {

	public static void main(String[] args) {
		int age=20;
		
		if(age>=18) { //if(condition)
			System.out.println("Eligible"); //if the condition is true then the command must be between {}
		}
		else {
			System.out.println("Not Eligible");
		}
		
//---------------------------------Odd/Even Number---------------------------------------		
		int num=10;
		if (num%2==0) {
			System.out.println("The Number is Even");					
		}
		else {
			System.out.println("The Number is Odd");
		}

		
//----------------------------------Nested if Statement----------------------------------
		int money=9000;
		if(money<500) {
			System.out.println("Poor");
			}
		else if(money>500&&money<1000) {
			System.out.println("Modetately");
		}
		else if (money>=1000) {
			System.out.println("Super");
		}
		else {
			System.out.println("WOOOW");
		}

		
//--------------------------------Switch Statement----------------------------------
		//if you have too many condition, to save time and to write less code we use switch statement.
		int day=7;
		switch (day) { //in switch we have to write the "Expression" within () and "Conditions" within {} with "Case" key & end with "Default"
		case 1: System.out.println("Saturday"); 
			break; //break is used to stop the system to go further if the condition is already match. If break not used then the system will still run all other conditions even if it already got the actual result.
		case 2: System.out.println("Sunday"); break;
		case 3: System.out.println("Monday"); break;
		case 4: System.out.println("Tuesday"); break;
		case 5: System.out.println("Wednesday"); break;
		case 6: System.out.println("Thrusday"); break;
		case 7: System.out.println("Friday"); break;
		default: System.out.println("Error");//no break required in default state because it is the last statement. 
		
		}

	}

}
