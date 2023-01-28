public class Main {
	public static void main(String[] args) {
		String[] array1 = {" I want ", " to learn ", " how to code! "};
		String[] array2 = new String[array1.length];

		for (int i = 0; i < array1.length; i++) {
			array2[i] = array1[i].replace("\s", "");
		}

		int statement1 = array2[0].compareTo("I want");
		int statement2 = array2[1].compareToIgnoreCase("To learn");
		System.out.println(!(statement1 > statement2));

	}
}