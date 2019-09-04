package srting;

public class ReverseString {

	public static void main(String[] args) {
		String Normal = "Rayhan";
		System.out.println("This is Normal "+Normal);

//======one way======
		String Reverse = new StringBuffer(Normal).reverse().toString();
		System.out.println("This is Reverse "+Reverse);

//======another way======
		int len =Normal.length();
		System.out.println(len);
		String rev ="";
		
		for(int i=len-1;i>=0;i--) {
			rev = rev + Normal.charAt(i);
		}
		System.out.println(rev);
	}

}
