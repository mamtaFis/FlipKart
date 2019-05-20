package rough;

public class stringChecker {
	public static void main(String[] args) {
		String text = "aabbbacdddefg";
		String result = "";
		int len = text.length();
		result= checkNum(text);
		System.out.println(result);
		String latest = checkNum(result);
		System.out.println(latest);
	}
	
	public static String checkNum(String word)
	{
		int len = word.length();
		String result = "";
		for (int i = 0; i <= len - 3; i++) {
			if ((word.charAt(i) == word.charAt(i + 1) && (word.charAt(i + 1) == word.charAt(i + 2)))) {

				i = i + 2;

			} else {
				result = result + word.charAt(i);
			}
			if (i >= len - 3) {
				for (int j = i + 1; j < len; j++) {
					result = result + word.charAt(j);
				}
			}
		}
		return result;
	}

}
