package snakeLadder;

public class SnakeLadder {

	public static void main(String[] args) {
		int i=0;
		int noPlay=0;
		int ladder=1;
		int snake=2;
			while(i<=99)
			{
				int roll = (int) Math.floor((Math.random() * 10) % 3);
				int value = (int) Math.floor((Math.random() * 10) % 6)+1;
				System.out.println("Dice Roll value =" + value);
				if(roll == noPlay) {
					System.out.println("No_Play =" + i);
				} 
				else if (roll == ladder) {	
					i=i+value;
					System.out.println("Ladder =" + i);
				}
				else {
					i=i-value;
					if(i<=0) {
						i=0;
						System.out.println("snake =" + i);
					}
					else {
					System.out.println("snake =" + i);
					}
				}
		}
	}

}
