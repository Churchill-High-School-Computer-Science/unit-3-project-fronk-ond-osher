import java.util.Scanner;

public class Blackjack
{
    public static void main(String[] args)
    {
        ///////////////////////////////////////////////////////////////////////////////////////// just some starting code
        int playertotal = 0;
        int dealertotal = 0;

        //boolean dealerturn = false;
        //boolean playerturn = false;
        ///////////////////////////////////////////////////////////////////////////////////////// defining the deck of cards
        int[] cards = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
        ///////////////////////////////////////////////////////////////////////////////// giving the player and dealer each a random card
        int x = (int)(Math.random() * 13);
        int pcard = cards[x];
        playertotal += (int) pcard;
        System.out.println("player total is " + playertotal);

        int y = (int)(Math.random() * 13);
        int dcard = cards[y];
        dealertotal += (int) dcard;
        System.out.println("dealer total is " + dealertotal);
        ///////////////////////////////////////////////////////////////////////////////////// ask user to hit or stay
        Scanner myObj = new Scanner(System.in);
        System.out.println("Do you want to draw a card, or stay?");
        String answer = myObj.next();

        if(answer.equals("draw")){
            int x = (int)(Math.random() * 13);
            int pcard = cards[x];
            playertotal += (int) pcard;
            System.out.println("player total is " + playertotal); //fix make random number different
        }
    }
}