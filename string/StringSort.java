import java.util.Arrays;
public class StringSort {
	public static void main(String[] args) {
		String[] strArr = new String[8];
		for (int k = 0; k < strArr.length ; k++) {
			char[] ch = new char[5];
			for (int i = 0; i < ch.length; i++) {
				while (true) {
					char j = (char)(Math.random() * ('z' + 1));
					if (Character.isLetter(j) || Character.isDigit(j)) {
						ch[i] = j;
						break;
					}
				}
			}
			strArr[k] = new String(ch);
		}
		System.out.println(Arrays.toString(strArr));
		// Arrays.sort(strArr);
		// System.out.println(Arrays.toString(strArr));
		for (int i = 0; i < strArr.length - 1; i++) {
			for (int j = 0; j < strArr.length - i - 1 ; j++ ) {
				char firstChar1 = strArr[j].charAt(0);
				char firstChar2 = strArr[j + 1].charAt(0);
				firstChar1 = Character.toLowerCase(firstChar1);
				firstChar2 = Character.toLowerCase(firstChar2);
				if (firstChar1 > firstChar2) {
					String temp = strArr[j];
					strArr[j] = strArr[j + 1];
					strArr[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(strArr));
	}
}