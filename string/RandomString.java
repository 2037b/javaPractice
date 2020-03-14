public class RandomString {
	public static void main(String[] args) {
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
		char char1 = 48 + 1;
		char char2 = '5';
		System.out.println(new String(ch));
		System.out.println(char1);
		System.out.println((int)char2 + "");
	}
}