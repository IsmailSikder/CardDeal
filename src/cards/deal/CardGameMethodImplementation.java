package cards.deal;

public class CardGameMethodImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instanced card game object
		CardGame cards= new CardGame();
		
		//Initializing card array
		cards.initCardArray();
		
		//generateRandom number and populate card array
		cards.genarateRandomNumber();
		
		//Print that random card array
		cards.printArray();
		
		//Populate 4 hand with the card array value
	    cards.eachHand();
	    
	    //print each hand 
	    cards.printEachHnad();

	}

}
/******************Output for Card game project
 All the random number in card array from (1-52): 
8 14 9 35 22 24 27 52 49 5 42 48 44 
18 43 26 11 3 41 39 19 47 30 50 16 45 
10 28 13 38 32 15 51 31 1 7 20 17 4 
36 21 46 12 2 23 29 40 33 25 34 6 37 

Hand 1: 
Clubs 8 9 5 
Diamonds 1 9 J 
Spades 9 1 
Hearts K 10 3 9 5 

Hand 2: 
Clubs J 3 
Diamonds 5 K 6 3 
Spades K 4 
Hearts 4 2 8 J 6 

Hand 3: 
Clubs 10 K 1 7 4 
Diamonds 2 7 4 
Spades 2 Q 6 5 
Hearts Q 

Hand 4: 
Clubs Q 2 6 
Diamonds 8 10 Q 
Spades 10 3 7 8 J 
Hearts 7 1 

 */