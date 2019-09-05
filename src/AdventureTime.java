/*
PROMPT
Make a "Choose Your Own Adventure" game. It should feature at least 5  options after the first level prompts, at least
two options for each of the second-level prompts, at least two options for each of the third-level prompts, and add at
least two options for two of the fourth-level prompts for a total of a minimum of twenty two possible destinations.
If you finish please add more options to the first level and follow the same structure.

Once they reach the end of the decision tree, tell the user whether they survived or not. For example, in the first
sample output below,

You die of starvation... eventually
statement informs the user that they did not survive the game.
 */

import java.util.Scanner;

public class AdventureTime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = "";

        System.out.println("Welcome to \"How to fight a zombie!\" ");
        System.out.println("OMG! A Zombie is coming!");
        System.out.println("Quick! choose a weapon: (baseball bat (b), pistol (p), knife(k), hands(h), frying pan(f))");
        System.out.print("Please input based character. ");
        input = sc.next();

        System.out.println();
        switch (input) {
            case "baseball bat":
                System.out.println("Nice! You chose the Baseball bat! " +
                        "How do will you swing it? horizontal(h) or vertical(v)");
                input = sc.next();
                if(input.equals("h")){
                    System.out.println("You swung the bat in a horizontal motion knocking out the zombies legs!");
                    System.out.println("The Zombie is now crawling towards trying to bite you! " +
                            "Your bat is still usable...");
                    System.out.println("Will you bash it's head in (b) or run (r)?");
                    input = sc.next();
                    if(input.equals("b")){
                        System.out.println("You muster up all your strength to bash the zombies brains in");
                        System.out.println("You become exhausted after 5 minutes of bashing...");
                        System.out.println("You grow hungry. Will you eat the remains (y/n)?");
                        input = sc.next();
                        if(input.equals("y")) {
                            System.out.println("Wow... you really ate it. Congrats on becoming part of the horde. " +
                                    "I guess");
                            break;
                        }else if(input.equals("n")) {
                            System.out.println("Trick Question Bro. You passed. You die of starvation.");
                            break;
                        }
                    } else if(input.equals("r")){
                        System.out.println("Nice you ran. Good job on leaving your family. " +
                                "I'm sure they appreciated it");
                        break;
                    }
                } else if(input.equals("v")){
                    System.out.println("You swung the bat vertically! Right on that stupid zombies head! 10 points");
                    System.out.println("As you celebrated the victory, you see more coming your way...");
                    System.out.println("What do you do? Man up and score more points?(m) or " +
                            "smear the blood of your enemies all over yourself? (s)");
                    input = sc.next();
                    if(input.equals("m")){
                        System.out.println("NICE! You decided to grow some balls and fight.");
                        System.out.println("You run and yell at the top of your lungs! " +
                                "\"I'M GOING FOR THE TOP SCORE!!!\" ...");
                        System.out.println("As you approach a few feet away from them. " +
                                "You trip on your untied shoelace. And they eat you. Slowly and Painfully");
                        System.out.println("Remember folks: to check your shoes before you fight a zombie horde. :)");
                        break;
                    } else if(input.equals("s")) {
                        System.out.println("Ohhhhh. Someone watches \"The Walking Dead\" Look at you, using TV as " +
                                "a reference.");
                        System.out.println("You decided to use your zombie stained body to blend with the horde...");
                        System.out.println("It didn't work. These zombies from World War Z. Too bad.");
                        break;
                    }
                }
                break;
            case "pistol":
                System.out.println("Nice! you chose the pistol. Do you have bullets(y/n)?");
                input = sc.next();
                if(input.equals("y")){
                    System.out.println("Nice! Are you going to shoot yourself (y) are try to survive(s)?");
                    input = sc.next();
                    if(input.equals("y")){
                        System.out.println("Zombies are cray cray right? I feel you. Peace bro");
                        break;
                    } else if(input.equals("s")){
                        System.out.println("Alright :(. You have six bullets and you remember that you don't know " +
                                "how to gun.");
                        System.out.println("You miss. Obviously. Should've shot yourself. Can't miss point blank. " +
                                "Good bye");
                        break;
                    }
                }else if(input.equals("n")){
                    System.out.println("Aww. that sucks. Will you throw it away and look for another (t) or use" +
                            "it as a blunt weapon? (b)");
                    input = sc.next();
                    if(input.equals("t")){
                        System.out.println("You decided to throw away your only defense.");
                        System.out.println("You scavenge for like 5 minutes and you accidently cut yourself." +
                                "\nYou contract Ebola.");
                        break;
                    }else if(input.equals("b")){
                        System.out.println("Your so resourceful! Be Proud. Your SMART!");
                        System.out.println("...");
                        System.out.println("Your throw it away anyway because you don't do compliments. NICE DYING!");
                    }

                }
                break;
            case "knife":
                System.out.println("Nice! You chose the Kah-niff! What's the enchantment level on it?(1/5)");
                input = sc.next();
                if(input.equals("1")){
                    System.out.println("1?!?! That's not even enough to slit a helpless child throat.");
                    System.out.println("Want to try enchanting for the first time? (y/n)");
                    input = sc.next();
                    if(input.equals("y")){
                        System.out.println("Abra Kadabra! My Knife will go Cha-Cha-Cha! ...");
                        System.out.println("It fails miserably and the Kah-niff gets lodged in your knee. " +
                                "And that's how your no longer an adventurer.");
                        break;
                    } else if(input.equals("n")){
                        System.out.println("A Man... or Woman! of true intellect... A Zombie bites your face off.");
                        break;
                    }
                }else if(input.equals("5")){
                    System.out.println("ZOMG! LMAO! Time to PWN sum nubs. " +
                            "Killing Rampage or Peaceful Slaughter? (k/p)");

                }
        }

        System.out.println("Thanks for playing!");

    }
}
