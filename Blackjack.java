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
        System.out.println("Do you want to draw a card, or stay?"); //////////// type d or s
        String answer = myObj.next();
        /////////////////////////////////////////////////////////////////////////////////////////// necessary
        boolean gameover = false;
        boolean blackjack = false;
        ////////////////////////////////////////////////////////////////////////////////// if hit user draws
        while(answer.equals("d")){ ///////////////// type d
            x = (int)(Math.random() * 13);
            pcard = cards[x];
            playertotal += (int) pcard;
            System.out.println("player total is " + playertotal);
            if(playertotal < 22 && playertotal > 20){ /////////////////////////////////////////// player blackjack
            System.out.println("YOU WIN!");
            gameover = true;
            break;
        }
            else if(playertotal > 21){ ////////////////////////////// player bust
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
        if(dealertotal > playertotal){
            System.out.println("DEALER WINS!");
            gameover = true;
        }
        
        while(dealertotal < 17 && gameover == false){
            y = (int)(Math.random() * 13);
            dcard = cards[y];
            dealertotal += (int) dcard;
            System.out.println("dealer total is " + dealertotal);
            if(dealertotal < 22 && dealertotal > 20){ ////////////////////////// dealer blackjack
            System.out.println("DEALER WINS!");
            blackjack = true;
            break;
            }
            else if(dealertotal > 21){ /////////////////////////////// dealer bust
            System.out.println("DEALER LOSES!");
            break;
            }
            else if(dealertotal == playertotal){ /////////////////////////// draw
                System.out.println("DRAW");
                break;
            }   
            
            }
            if(dealertotal > playertotal && dealertotal < 22 && gameover == false && blackjack == false){ ////////////// dealer win
                System.out.println("DEALER WINS!");
            }
            else if(dealertotal < playertotal && playertotal < 22 && gameover == false){ /////////////// player win
                System.out.println("PLAYER WINS!");
                
            }
    }
}