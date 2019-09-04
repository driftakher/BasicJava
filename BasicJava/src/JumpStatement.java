
public class JumpStatement {

	public static void main(String[] args) {
		// Jump statement is used to exit from any loop at a defined point (set by me) before finishing the loop if the condition of 'break' meet.
		//Similierly 'continue' is used in loop to skip 1 round (when condition meet) and continue run the loop
//=======================Break==================================
		for (int i=1; i<=10; i++) {
			if (i==5) {
				break;  //so here though for loop suppose to go for 10 round. but due to this break that i==5 the loop stopped here.
			}
			System.out.println(i);
		}
//=======================Continue======================================
		for (int j=1; j<=10; j++) {
			if (j==5||j==8) {
				continue;  //so here though for loop suppose to go for 10 round. but due to this continue that i==5||8 the loop skipped 5 & 8 and still continue the loop and print from 6.
			}
			System.out.println(j);
		}
	}

}
