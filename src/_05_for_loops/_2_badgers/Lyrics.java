package _05_for_loops._2_badgers;

public class Lyrics {
	public static void main(String[] args) {
		for(int wCount = 0; wCount < 2; wCount += 1) {
			for(int bCount = 0; bCount < 12; bCount += 1) {
				System.out.print("Badger");
			if(bCount <= 10) {
			System.out.print(", ");
			}
			}
			System.out.println();
			for(int mCount = 0; mCount < 2; mCount += 1) {
				System.out.print("Mushroom");
			if(mCount < 1) {
			System.out.print(", ");
			}
			}
			System.out.println();
		}
		System.out.print("A Snake!");
	}
}
