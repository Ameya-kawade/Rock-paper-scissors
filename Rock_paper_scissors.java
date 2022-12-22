import java.util.Scanner;

public class Rock_paper_scissors {


        public static void main(String []args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Welcome!! to the Rock-Paper-Scissor game.");
            System.out.println("1.For rock enter 'r'.");
            System.out.println("2.For paper enter 'p'.");
            System.out.println("3.For scissors enter 's'.");
            int win_count=0;
            int comp_win_count=0;
            int count=0;
            do {
                int num = (int) (1+Math.random() * 3 );//Creates a random number.
                                                        

                char input;
                char comp_choice = 0;

                if (num == 1) {
                    comp_choice = 'r';
                } else if (num == 2) {
                    comp_choice = 'p';

                } else if (num == 3) {
                    comp_choice = 's';

                }


                System.out.print("Enter your choice: ");
                input = sc.next().charAt(0);

                if (input=='r'||input=='R')
                {
                    if (comp_choice=='p'){
                        System.out.println("You lose!!");
                        comp_win_count++;
                    }
                    else if (comp_choice=='s') {
                        System.out.println("You win!!");
                        win_count++;
                    }
                    else if (comp_choice=='r'){
                        System.out.println("It's a draw");
                    }
                }


                if (input=='p'||input=='P')
                {
                    if (comp_choice=='s'){
                        System.out.println("You lose!!");
                        comp_win_count++;
                    }
                    else if (comp_choice=='r'){
                        System.out.println("You win!!");
                        win_count++;
                    }
                    else if (comp_choice=='p'){
                        System.out.println("It's a draw");
                    }
                }
                if (input=='s'||input=='S')
                {
                    if (comp_choice=='r'){
                        System.out.println("You lose!!");
                        comp_win_count++;
                    }
                    else if (comp_choice=='p'){
                        System.out.println("You win!!");
                        win_count++;
                    }
                    else if (comp_choice=='s'){
                        System.out.println("It's a draw");
                    }
                }

                count++;
            }
            while(count<3);
            if (win_count>comp_win_count){
                System.out.println("Final result: You won");
            }
            if (win_count==comp_win_count){
                System.out.println("Final result: It's a draw");
            }
            if (win_count<comp_win_count){
                System.out.println("Final result: You lose");
            }


        }
    }

