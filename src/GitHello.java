/**
 * 
 */
import java.util.Random;
/**
 * @author dwight
 *
 */
public class GitHello {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello...");
		System.out.println("another");
		System.out.println("A third line");
		int[] cards = new int[10];
		Random rn = new Random();
		for (int i = 0; i < cards.length; i++) cards[i] = i+1;
		System.out.println("before: " + printArray(cards));

		for (int i = 0; i < cards.length; i++) {
			int iCard = rn.nextInt(cards.length - i) + i;
			int temp = cards[i];
			cards[i] = cards[iCard];
			cards[iCard] = temp;
			System.out.println("i = " + i + ", iCard = " + iCard + ": " + printArray(cards));
		}
		System.out.println("");


	}

	static String printArray(int[] cards) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < cards.length; i++) {
			sb.append(cards[i]).append(", ");
		}
		return sb.toString();
	}


}

