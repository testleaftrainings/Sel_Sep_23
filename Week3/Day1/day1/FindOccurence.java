package week3.day1;

public class FindOccurence {

	public static void main(String[] args) {

		String name = "Testleaf";
		
		char expectedCharacter = 'e';
		int count = 0;

		for (int i = 0; i <= name.length() - 1; i++) {
			if (name.charAt(i) == expectedCharacter) {
				count++;
			}
		}

		System.out.println("The occurence of " + expectedCharacter + " is :" + count);

		String sentence = "Learning Java in week3";

		// week3 in Java Learning

		// to find the count of words

		int length = sentence.length();
		System.out.println(length);

		// to break the sentence as words String[] split = sentence.split(" ");
		String[] split2 = sentence.split("e");// "e" -->delimiter
		System.out.println("Broken sentence");
		for (int s = 0; s < split2.length; s++) {
			System.out.println(split2[s]);
		}

		String s = "Rs.1234"; // 12344

		// remove the RS.
		// convert into int
		String replace = s.replace("4", "#");
		System.out.println(replace);

		System.out.println(s.replaceAll("\\d", "")); // to get the non-numbers
		System.out.println(s.replaceAll("\\D", "")); // to get the numbers
		System.out.println(s.replaceAll("[.]", "")); // other than .replace all characters with null value

		String numbers = s.replaceAll("\\D", "");
		System.out.println(numbers + 4);
		int parseInt = Integer.parseInt(numbers);
		System.out.println(parseInt + 4);
	}

}
