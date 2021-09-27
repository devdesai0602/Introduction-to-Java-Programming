package Exercise03;
/**
 *
 * @author vraj nagarsheth(20cs039)
 *Write a program that simulates picking a card from a deck
 * of 52 cards. Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10,
 * Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the card.*/

public class Exercise03_24 {

    public static void main(String[] args) {
        String card="";//create string of card 
        String suit="";//create string of suit
        String[] cards= new String[]{"ace","1","2","3","4","5","6", "7", "8", "9", "10","jack","queen","king"};
        String[] suits =new String[]{"clubs", "diamonds", "hearts", "spades"};
       int withdrawncard,withdrawnsuit,withdrawnrank;// to store withdrawncard,withdrawnsuit,withdrawnrank
       withdrawncard= (int)(Math.random()*52);//stimulating to pick up a random card from a deck of 52 cards
       withdrawnsuit=withdrawncard/4;// determine the rank 0-12
       withdrawnrank=withdrawncard%4;// determine the suit
       System.out.println("The card you picked is " + cards[withdrawnsuit] + " of " + suits[withdrawnrank]);//printing of card picked

       
       
       
    }
    
}