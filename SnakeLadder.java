package snakeLadder;

public class SnakeLadder {

	public static void main(String[] args) {
		int i=0;
		int noPlay=0;
		int ladder=1;
		int snake=2;
		int value=0;
			while(i<=99)
			{
				int roll = (int) Math.floor((Math.random() * 10) % 3);
				value = (int) Math.floor((Math.random() * 10) % 6)+1;
				System.out.println("Dice Roll value =" + value);
				if(roll == noPlay) {
					System.out.println("No_Play =" + i);
				} 
				else if (roll == ladder) {	
					if(i <= 100) {
						i=i+value;
						System.out.println("Ladder =" +i);
					}
					else {
						System.out.println("Ladder More Chance=" + i);	
						i=i-value;
					}
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
