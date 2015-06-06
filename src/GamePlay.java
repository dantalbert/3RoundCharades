import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

public class GamePlay {
	
public static void main(String[] args) {
		
		//define variables and array
		int number;
		String names[];
		
		//accepts the number of celebrities
		System.out.println("How many celebrities would you like to use?");
		Scanner rounds = new Scanner(System.in);
		number = rounds.nextInt();
		
		//creates an array of the celebrity names as they are entered
		names = new String[number];
		rounds.nextLine();
		for (int i = 0; i < names.length; i++){
			System.out.println("type a name ");
			names[i] = rounds.nextLine();
		    }
			
			//calls random celebrity generator
			randomceleb(names, number);		
		}
	
		private static void randomceleb(String[] name, int number) {

			boolean start;
			Collections.shuffle(Arrays.asList(name));
			int n = 0;
			int i = 0;
			//for(int i=0;i<names.length;i++){
			while(i<=name.length){
				if(n==0){
				System.out.println("When you are ready type true.");
				Scanner go = new Scanner(System.in);
				start = go.nextBoolean();
					if(start==true){
						System.out.println(name[n]);
						n++;
						i++;
					}
					else
						System.out.println("alright, we will wait for you");
	
				}
				else{
					System.out.println("When you would like the next name type true.");
					Scanner go = new Scanner(System.in);
					start = go.nextBoolean();
						if(start==true){
							System.out.println(name[n]);
							n++;
							i++;
						}
						else
							System.out.println("We are all waiting on you");
							i++;
				}
				
				/**while(i=name.length+1){
					System.out.println("Game over");
				**/
			}
			}

}
