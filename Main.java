//Imports

import java.util.Scanner;
//Create Class
public class Main 
{
    public static void main(String[] args)
    {
        //Variables
        int progression = 0;
        boolean balls = true;

        Scanner scanner = new Scanner(System.in);        
        //Create Story Switch Statement
        while(balls = true)
        {
            System.out.println("You are in a forest on an adventure. Make a move");
            System.out.println("Choices: \n1) You enter a straight path\n2) You enter left path.\n3) You enter right path\n4) Path behind you");
            int choice = scanner.nextInt();
            switch (choice)
            {
                case 1:
                //Real Ending 1
                    System.out.println("You opt for the straight path, which leads you to a serene glade with a tranquil pond"); 
                    System.out.println("Choices: \n1) Search The Pond\n2) Fish In the Pond\n3) Meditate By The Pond\n4) Rest");
                    int a = scanner.nextInt();
                    switch (a)
                    {
                        case 1:
                            System.out.println("1) Search the Pond: You search the pond's bottom for any signs of the artifact.");
                            System.out.println("Choices: \n1) Keep Searching \n2) Look Around\n3) Encounter With Guardian\n4) Mysterious Message");
                            int a1 = scanner.nextInt();
                            switch (a1)
                            {
                                case 1:
                                    System.out.println("Real Ending 1: \nAs you carefully search the pond's bottom, your fingers brush against something hard and metallic. You pull it out, and to your astonishment, it's the artifact you've been seeking all along! With the powerful artifact in hand, you feel a surge of confidence and set off on your journey to unlock its secrets.");
                                    balls = false;
                                break;

                                case 2:
                                    System.out.println("");
                                break;
                                
                                case 3:
                                    System.out.println("");
                                break;
                                
                                case 4:
                                    System.out.println("");
                                break;
                            }
                        break;

                        case 2:
                            System.out.println("2) Fishing: You decide to fish in the pond, hoping to catch something useful.");
                            System.out.println("Choices: \n1)\n2)\n3)\n4)");
                            int a2 = scanner.nextInt();
                            switch (a2)
                            {
                                case 1:
                                    System.out.println("");
                                break;

                                case 2:
                                    System.out.println("");
                                break;
                                
                                case 3:
                                    System.out.println("");
                                break;

                                case 4:
                                    System.out.println("");
                                break;
                            }
                        break;

                        case 3:
                            System.out.println("3) Meditate: You sit by the pond and meditate, seeking inner guidance.");
                            System.out.println("Choices: \n1)\n2)\n3)\n4)");
                            int a3 = scanner.nextInt();
                            switch (a3)
                            {
                                case 1:
                                    System.out.println("");

                                break;
                                case 2:
                                    System.out.println("");
                                break;

                                case 3:
                                    System.out.println("");
                                break;

                                case 4:
                                    System.out.println("");
                                break;
                            }
                        break;

                        case 4:
                            System.out.println("4) Rest: You take a peaceful rest by the pond.");
                            System.out.println("Choices: \n1)\n2)\n3)\n4)");
                            int a4 = scanner.nextInt();
                            switch (a4)
                            {
                                case 1:
                                    System.out.println("");
                                break;

                                case 2:
                                    System.out.println("");
                                break;
                                
                                case 3:
                                    System.out.println("");
                                break;

                                case 4:
                                    System.out.println("");
                                break;
                            }
                        break;
                    }
                break;
                case 2:
                    //Real Ending 2
                    System.out.println("You choose the left path, which leads you to a dark and ominous cave.");
                    System.out.println("Choices: \n1) Explore the Cave\n2) Retreat From The Cave\n3) Gather FIrewood\n4) Rest");
                    int b = scanner.nextInt();
                    switch (b)
                    {
                        case 1:
                            System.out.println("1) Explore the Cave: You decide to explore deeper into the cave, hoping to find clues about the artifact.");
                            System.out.println("Choices: \n1) Follow the Faint Light\n2) Investigate the Strange Sound\n3) Use the Torch\n4) Retreat");
                            int b1 = scanner.nextInt();
                            switch (b1)
                            {
                                case 1:
                                    System.out.println("");
                                break;

                                case 2:
                                    System.out.println("");
                                break;
                                
                                case 3:
                                    System.out.println("");
                                break;

                                case 4:
                                    System.out.println("");
                                break;
                            }
                        break;

                        case 2:
                            System.out.println("2) Retreat: Feeling uneasy, you decide to retreat from the cave.");
                            System.out.println("Choices: \n1) Return to the Entrance\n2) Rest at the Entrance\n3) Gather Supplies\n4) Peer into the Cave");
                            int b2 = scanner.nextInt();
                            switch (b2)
                            {
                                case 1:
                                    System.out.println("");
                                break;

                                case 2:
                                    System.out.println("");
                                break;
                                
                                case 3:
                                    System.out.println("");
                                break;

                                case 4:
                                    System.out.println("");
                                break;
                            }
                        break;

                        case 3:
                            System.out.println("3) Gather Firewood: You search for firewood to light a torch and navigate the cave.");
                            System.out.println("Choices: \n1) Light the Torch\n2) Explore with the Torch\n3) Rest by the Fire\n4) Extinguish the Torch");
                            int b3 = scanner.nextInt();
                            switch (b3)
                            {
                                case 1:
                                    System.out.println("");
                                break;

                                case 2:
                                    System.out.println("");
                                break;
                                
                                case 3:
                                    System.out.println("");
                                break;

                                case 4:
                                    System.out.println("");
                                break;
                            }
                        break;

                        case 4:
                            System.out.println("Rest: You take a break to regain your strength.");
                            System.out.println("Choices: \n1) Dream of Clues\n2) Wake Up Rejuvenated\n3) Daydream in Thought\n4) Examine Your Equipment");
                            int b4 = scanner.nextInt();
                            switch (b4)
                            {
                                case 1:
                                    System.out.println("");
                                break;

                                case 2:
                                    System.out.println("");
                                break;
                                
                                case 3:
                                    System.out.println("");
                                break;

                                case 4:
                                    System.out.println("");
                                break;
                            }
                        break;
                    }
                break;
                case 3:
                //Fake ending 1
                    System.out.println("You decide to take the right path, leading you deeper into the dense woods.");
                    System.out.println("Choices: \n1) Continue Deeper\n2) Return to the Entrance\n3) Climb A Tree\n4) Rest");
                    int c = scanner.nextInt();
                    switch (c)
                    {
                        case 1:
                            System.out.println("1) Continue Deeper: You continue deeper into the woods, determined to find the artifact.");
                            System.out.println("Choices: \n1) Encounter a Hermit \n2) Discover a Hidden Path\n3) Fight Off a Wild Beast\n4) Press Forward");
                            int c1 = scanner.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    System.out.println("");
                                break;

                                case 2:
                                    System.out.println("");
                                break;
                                
                                case 3:
                                    System.out.println("");
                                break;

                                case 4:
                                    System.out.println("");
                                break;
                            }
                        break;

                        case 2:
                            System.out.println("2) Return to the Entrance: You decide to turn back and explore a different path.");
                            System.out.println("Choices: \n1) Rest at the Entrance\n2) Consult Your Map\n3) Explore a Different Path\n4) Set Up Camp");
                            int c2 = scanner.nextInt();
                            switch (c2) 
                            {
                                case 1:
                                    System.out.println("");
                                break;

                                case 2:
                                    System.out.println("");
                                break;
                                
                                case 3:
                                    System.out.println("");
                                break;

                                case 4:
                                    System.out.println("");
                                break;
                            }
                        break;

                        case 3:
                            System.out.println("3) Climb a Tree: You climb a tree to get a better view of your surroundings.");
                            System.out.println("Choices: \n1) Gain a Bird's Eye View\n2) Spot an Unusual Plant\n3) Treehouse Discovery\n4) Descend Safely");
                            int c3 = scanner.nextInt();
                            switch (c3)
                            {
                                case 1:
                                    System.out.println("");
                                break;

                                case 2:
                                    System.out.println("");
                                break;
                                
                                case 3:
                                    System.out.println("");
                                break;

                                case 4:
                                    System.out.println("");
                                break;
                            }
                        break;

                        case 4:
                            System.out.println("4) Rest: You take a moment to rest and catch your breath.");
                            System.out.println("Choices: \n1) Reflect on Your Journey\n2) Inspect Your Gear\n3) Uncover a Hidden Message\n4) Meditation");
                            int c4 = scanner.nextInt();
                            switch (c4)
                            {
                                case 1:
                                    System.out.println("");
                                break;

                                case 2:
                                    System.out.println("");
                                break;
                                
                                case 3:
                                    System.out.println("");
                                break;

                                case 4:
                                    System.out.println("");
                                break;
                            }
                        break;

                    }
                break;
                case 4:
                //Fake Ending 2
                    System.out.println("You back to a large field of farms");
                    System.out.println("Choices: \n1) Walk towards the cornfield\n2) Walk towards the wheat field\n3) Walk towards the rice field\n4) Walk towards a blueberry field");
                    int d = scanner.nextInt();
                    switch (d)
                    {
                        case 1:
                            System.out.println("1) Walk towards the cornfield.");
                            System.out.println("Choices: \n1) Inspect the Cornfield\n2) Lost in the Corn Maze\n3) Cornfield Encounter\n4) Rest in the Cornfield");
                            int d1 = scanner.nextInt();
                            switch (d1)
                            {
                                case 1:
                                    System.out.println("");
                                break;

                                case 2:
                                    System.out.println("");
                                break;
                                
                                case 3:
                                    System.out.println("");
                                break;

                                case 4:
                                    System.out.println("");
                                break;
                            }
                        break;

                        case 2:
                            System.out.println("2) Walk towards the wheat field.");
                            System.out.println("Choices: \n1) Harvest the Wheat\n2) Wheat Field Labyrinth\n3) Encounter a Scarecrow:\n4) Rest in the Wheat Field");
                            int d2 = scanner.nextInt();
                            switch (d2)
                            {
                                case 1:
                                    System.out.println("");
                                break;

                                case 2:
                                    System.out.println("");
                                break;
                                
                                case 3:
                                    System.out.println("");
                                break;

                                case 4:
                                    System.out.println("");
                                break;
                            }
                        break;

                        case 3:
                            System.out.println("3) Walk towards the rice field.");
                            System.out.println("Choices: \n1) Puzzle in the Rice Field\n2) Rice Field River\n3) Rice Field Encounter\n4) Rest By Rice Field");
                            int d3 = scanner.nextInt();
                            switch (d3)
                            {
                                case 1:
                                    System.out.println("");
                                break;

                                case 2:
                                    System.out.println("");
                                break;
                                
                                case 3:
                                    System.out.println("");
                                break;

                                case 4:
                                    System.out.println("");
                                break;
                            }
                        break;

                        case 4:
                            System.out.println("4) Walk towards a blueberry field.");
                            System.out.println("Choices: \n1) Collect Blueberries\n2)Meet Blueberry Field Faeries\n3) Blueberry Field Meditation\n4) Rest in the Blueberry Field");
                            int d4 = scanner.nextInt();
                            switch (d4)
                            {
                                case 1:
                                    System.out.println("");
                                break;

                                case 2:
                                    System.out.println("");
                                break;
                                
                                case 3:
                                    System.out.println("");
                                break;

                                case 4:
                                    System.out.println("");
                                break;
                            }
                        break;
                    }
                break;
                //Catches User misnput or invalid input and reprints the story.
                default:
                    System.out.println("Invalid choice.");
            }
        }
        
    }
}
