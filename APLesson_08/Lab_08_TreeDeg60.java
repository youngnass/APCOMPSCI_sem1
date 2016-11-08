import java.util.Scanner;
public class Lab_08_TreeDeg60 {
	public static void main(String[]args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Please input a word:");
		String word = kb.nextLine();
		int stop = word.length();
		tree(word, 0, stop);
	}
	public static void tree(String word, int start, int stop) {
		if (start <= stop) {
			System.out.printf("%20s \n", word.substring(0, start));
			start+=1;
			tree(word, start, stop);
		}
	}
}