package srting;

public class StringMethod {

	public static void main(String[] args) {
		String s = "Rayhan";
		String s1 = "     Iftakher     ";
		System.out.println(s.length()); //to find length of a string.
		System.out.println(s.concat(s1)); //to join the strings
		System.out.println(s1.trim()); // to remove all extra space on both sides
		System.out.println(s.charAt(4)); //to find a character of index number given; Index start form 0, So in Rayhan -- R is 0, a is 1, y is 2.....
		System.out.println(s.contains("han")); //to search or find out this some character is part of string or not; it will show True/False. It is case sensative.
		System.out.println(s.contains("hAn"));//False
		System.out.println(s.equals("Rayhan"));	//To compare 2 string's character match or not. Case sensitive compare.
		System.out.println(s.equalsIgnoreCase("rAyHAn")); ////To compare 2 string's character match or not. Not Case sensitive compare.
		System.out.println(s.replace('a', 'A')); //to replace single character
		System.out.println(s.replace("Rayhan", "Ahmed")); //to replace whole word
		System.out.println(s.substring(2, 4)); //to find character from a starting index to ending index
		System.out.println(s.toLowerCase()); //to make everything lower case
		System.out.println(s.toUpperCase()); //to make everything upper case
		
	}

}
