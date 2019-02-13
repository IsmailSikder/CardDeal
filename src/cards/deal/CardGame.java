/*
 * Name: Mohammed Ismail Sikder
 * Project: shuffle cards in four hands and print what
 * 			Kind and value of card each hand have *
 */

package cards.deal;

import java.util.Random;

public class CardGame {

	//Declare all the variable so that it can be used in all the functions
	final int SIZE = 52;
	int card[] = new int[SIZE];
	
	int firstHand[] = new int[SIZE/4];
	int secondHand[] = new int[SIZE/4];
	int thirdHand[] = new int[SIZE/4];
	int fourthHand[] = new int[SIZE/4];
	
	
	//Initialize the card array to 0 for each value
	public void initCardArray(){
		for(int i=0; i<card.length;i++){
			card[i]=0;
			
		}
	}
	//printing array values in 4 separate line equally divided
	public void printArray(){
		int count = 0;
		System.out.println("All the random number in card array from (1-52): ");
		for(int i=0;i<4;i++){
			for(int j =0; j<13;j++)
				System.out.print(card[count++]+" ");
			System.out.println();
				
		}
		
	}
	
	//Generating random number
	public void genarateRandomNumber(){
		initCardArray();
		Random rand = new Random();
		int randomNumber;
		for(int i =0;i<SIZE;i++){
			randomNumber = rand.nextInt(SIZE)+1;
			while(checkArray(randomNumber)){
				randomNumber=rand.nextInt(SIZE)+1;
			}
			card[i] = randomNumber;
		}
	
	}
	//Check if random generated value exists in the array
	public boolean checkArray(int r){
	
		for(int i =0; i<SIZE;i++){
			if(card[i]==r)
				return true;	
		}
		return false;
	}
	
	
	//Separate each hand of the cards in four separate array 
	public void eachHand(){
		
		int count = 0;
		for(int i=0;i<4;i++){
			if(i==0){
			for(int j =0; j<13;j++)
				firstHand[j]=card[count++];
			}
			else if(i==1){
				for(int j =0; j<13;j++)
					secondHand[j]=card[count++];
			}
			else if(i==2){
				for(int j =0; j<13;j++)
					thirdHand[j]=card[count++];
			}
			else
				for(int j =0; j<13;j++)
					fourthHand[j]=card[count++];
			//System.out.println();		
		}
		
			
	}
	
	//print each hand separately
	public void printEachHnad(){
		
		//Printing first hand with faces of each card and their kind
		System.out.println("\nHand 1: ");
		isClubs(firstHand);
		isDiamonds(firstHand);
		isSpades(firstHand);
		isHearts(firstHand);
		
		//Printing hand 2 with faces of each card and their kind
		System.out.println("\nHand 2: ");
		isClubs(secondHand);
		isDiamonds(secondHand);
		isSpades(secondHand);
		isHearts(secondHand);
		
		//Printing hand 3 with faces of each card and their kind
		System.out.println("\nHand 3: ");
		isClubs(thirdHand);
		isDiamonds(thirdHand);
		isSpades(thirdHand);
		isHearts(thirdHand);
		
		//Printing hand 4 with faces of each card and their kind
		System.out.println("\nHand 4: ");
		isClubs(fourthHand);
		isDiamonds(fourthHand);
		isSpades(fourthHand);
		isHearts(fourthHand);
	}
	
	
	//Check if it is clubs(1-13)
	public void isClubs(int[] cardInHand){
		System.out.print("Clubs ");
		for(int i= 0; i<SIZE/4;i++){
			if(cardInHand[i]>=1&&cardInHand[i]<=13)
				kindOfCard(cardInHand[i]);
		}
		System.out.println();
		
	}
	//Check if it is Diamonds(14-26)
	public void isDiamonds(int[] cardInHand){
		System.out.print("Diamonds ");
		for(int i= 0; i<SIZE/4;i++){
			if(cardInHand[i]>=14&&cardInHand[i]<=26)
				kindOfCard(cardInHand[i]);
		
		}
		System.out.println();
	
	}
	//Check if it is Spades(27-39)
	public void isSpades(int[] cardInHand){
		System.out.print("Spades ");
		for(int i= 0; i<SIZE/4;i++){
			if(cardInHand[i]>=27&&cardInHand[i]<=39)
				kindOfCard(cardInHand[i]);
		}
		System.out.println();
	}

	//Check if it is Hearts(40-52)
	public void isHearts(int[] cardInHand){
		System.out.print("Hearts ");
		for(int i= 0; i<SIZE/4;i++){
			if(cardInHand[i]>=40&&cardInHand[i]<=52)
				kindOfCard(cardInHand[i]);
		}
		System.out.println();
	
	}
	
	//Determine what kind of cards are they
	//Or Faces of cards and printing them
	public void kindOfCard(int cardNumber){
		
			  int  reminder = cardNumber%13;
				if(reminder==11)
					System.out.print("J ");
				else if(reminder==12)
					System.out.print("Q ");
				else if(reminder==0)
					System.out.print("K ");
				else 
					System.out.print(reminder+" ");
				
				
	}
	
	}
