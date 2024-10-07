import java.util.Scanner;

public class Blackjack
{
    public static void main(String[] args)
    {
        ///////////////////////////////////////////////////////////////////////////////////////// just some starting code
        int playertotal = 0;
        int dealertotal = 0;
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
        /////////////////////////////////////////////////////////////////////////////////////////// necessary
        boolean gameover = false;
        //////////////////////////////////////////////////////////////////////////////////if hit user draws
        while(answer.equals("draw")){
            x = (int)(Math.random() * 13);
            pcard = cards[x];
            playertotal += (int) pcard;
            System.out.println("player total is " + playertotal);
            if(playertotal < 22 && playertotal > 20){
            System.out.println("YOU WIN!");
            gameover = true;
            break;
        }
            else if(playertotal > 21){
            System.out.println("YOU LOSE!");
            gameover = true;
            break;
        }
            else{
                System.out.println("Do you want to draw a card, or stay?");
                answer = myObj.next();
        }
        }
        ///////////////////////////////////////////////////////////////////////////// if stay dealer draws
        while(dealertotal < 17 && gameover == false){
            y = (int)(Math.random() * 13);
            dcard = cards[y];
            dealertotal += (int) dcard;
            System.out.println("dealer total is " + dealertotal);
            if(dealertotal < 22 && dealertotal > 20){
            System.out.println("DEALER WINS!");
            break;
            }
            else if(dealertotal > 21){
            System.out.println("DEALER LOSES!");
            break;
            }
            else{
            System.out.println("DRAW!");
            }
            }   
            if(dealertotal > playertotal){
                System.out.println("DEALER WINS!");
            }
            else if(dealertotal < playertotal){
                System.out.println("PLAYER WINS!");
                
            }
    




    }
}