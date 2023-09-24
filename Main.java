//Imports

import java.util.Scanner;


//Create Class
public class Main 
{
    public static void main(String[] args)
    {
        //Variables
        int progression = 0;

        Scanner scanner = new Scanner(System.in);        
        //Create Story Switch Statement
        while(true)
        {
            System.out.println("You are in a forest on an adventure. Make a move");
            System.out.println("Choices: \n1) You enter a straight path\n2)You enter left path.\n3) You enter right path\n 4) Path behind you");
            int choice = scanner.nextInt();
            switch (choice)
            {
                case 1:
                //Real Ending 1
                    System.out.println("You opt for the straight path, which leads you to a serene glade with a tranquil pond");
                    int a = scanner.nextInt();
                    switch (a)
                    {
                        case 1:
                            System.out.println("1) Search the Pond: You search the pond's bottom for any signs of the artifact.");
                            int a1 = scanner.nextInt();
                            switch (a1)
                            {
                                case 1:
                                break;
                                case 2:
                                break;
                                case 3:
                                break;
                                case 4:
                                break;
                            }
                        break;

                        case 2:
                            System.out.println("2) Fishing: You decide to fish in the pond, hoping to catch something useful.");
                            int a2 = scanner.nextInt();
                            switch (a2)
                            {
                                case 1:
                                    System.out.println(null);
                                break;
                                case 2:
                                break;
                                case 3:
                                break;
                                case 4:
                                break;
                            }
                        break;

                        case 3:
                            System.out.println("3) Meditate: You sit by the pond and meditate, seeking inner guidance.");
                            int a3 = scanner.nextInt();
                            switch (a3)
                            {
                                case 1:
                                break;
                                case 2:
                                break;
                                case 3:
                                break;
                                case 4:
                                break;
                            }
                        break;

                        case 4:
                            System.out.println("4) Rest: You take a peaceful rest by the pond.");
                            int a4 = scanner.nextInt();
                            switch (a4)
                            {
                                case 1:
                                break;
                                case 2:
                                break;
                                case 3:
                                break;
                                case 4:
                                break;
                            }
                        break;
                    }
                break;
                case 2:
                    //Real Ending 2
                    System.out.println("You choose the left path, which leads you to a dark and ominous cave.");
                    int b = scanner.nextInt();
                    switch (b)
                    {
                        case 1:
                            System.out.println("1) Explore the Cave: You decide to explore deeper into the cave, hoping to find clues about the artifact.");
                            int b1 = scanner.nextInt();
                            switch (b1)
                            {
                                case 1:
                                break;
                                case 2:
                                break;
                                case 3:
                                break;
                                case 4:
                                break;
                            }
                        break;

                        case 2:
                            System.out.println("2) Retreat: Feeling uneasy, you decide to retreat from the cave.");
                            int b2 = scanner.nextInt();
                            switch (b2)
                            {
                                case 1:
                                break;
                                case 2:
                                break;
                                case 3:
                                break;
                                case 4:
                                break;
                            }
                        break;

                        case 3:
                            System.out.println("3) Gather Firewood: You search for firewood to light a torch and navigate the cave.");
                            int b3 = scanner.nextInt();
                            switch (b3)
                            {
                                case 1:
                                break;
                                case 2:
                                break;
                                case 3:
                                break;
                                case 4:
                                break;
                            }
                        break;

                        case 4:
                            System.out.println("Rest: You take a break to regain your strength.");
                            int b4 = scanner.nextInt();
                            switch (b4)
                            {
                                case 1:
                                break;
                                case 2:
                                break;
                                case 3:
                                break;
                                case 4:
                                break;
                            }
                        break;
                    }
                break;
                case 3:
                //Fake ending 1
                    System.out.println("You decide to take the right path, leading you deeper into the dense woods.");
                    int c = scanner.nextInt();
                    switch (c)
                    {
                        case 1:
                            System.out.println("1) Continue Deeper: You continue deeper into the woods, determined to find the artifact.");
                            int c1 = scanner.nextInt();
                            switch (c1)
                            {
                                case 1:
                                break;
                                case 2:
                                break;
                                case 3:
                                break;
                                case 4:
                                break;
                            }
                        break;

                        case 2:
                            System.out.println("2) Return to the Entrance: You decide to turn back and explore a different path.");
                            int c2 = scanner.nextInt();
                            switch (c2) 
                            {
                                case 1:
                                break;
                                case 2:
                                break;
                                case 3:
                                break;
                                case 4:
                                break;
                            }
                        break;

                        case 3:
                            System.out.println("3) Climb a Tree: You climb a tree to get a better view of your surroundings.");
                            int c3 = scanner.nextInt();
                            switch (c3)
                            {
                                case 1:
                                break;
                                case 2:
                                break;
                                case 3:
                                break;
                                case 4:
                                break;
                            }
                        break;

                        case 4:
                            System.out.println("4) Rest: You take a moment to rest and catch your breath.");
                            int c4 = scanner.nextInt();
                            switch (c4)
                            {
                                case 1:
                                break;
                                case 2:
                                break;
                                case 3:
                                break;
                                case 4:
                                break;
                            }
                        break;

                    }
                break;
                case 4:
                //Fake Ending 2
                    System.out.println("You back to a large field of farms");
                    int d = scanner.nextInt();
                    switch (d)
                    {
                        case 1:
                            System.out.println("1) Walk towards the cornfield.");
                            int d1 = scanner.nextInt();
                            switch (d1)
                            {
                                case 1:
                                break;
                                case 2:
                                break;
                                case 3:
                                break;
                                case 4:
                                break;
                            }
                        break;

                        case 2:
                            System.out.println("2) Walk towards the wheat field.");
                            int d2 = scanner.nextInt();
                            switch (d2)
                            {
                                case 1:
                                break;
                                case 2:
                                break;
                                case 3:
                                break;
                                case 4:
                                break;
                            }
                        break;

                        case 3:
                            System.out.println("3) Walk towards the rice field.");
                            int d3 = scanner.nextInt();
                            switch (d3)
                            {
                                case 1:
                                break;
                                case 2:
                                break;
                                case 3:
                                break;
                                case 4:
                                break;
                            }
                        break;

                        case 4:
                            System.out.println("4) Walk towards a blueberry field.");
                            int d4 = scanner.nextInt();
                            switch (d4)
                            {
                                case 1:
                                break;
                                case 2:
                                break;
                                case 3:
                                break;
                                case 4:
                                break;
                            }
                        break;
                    }
                break;
                default:
                            System.out.println("Invalid choice.");


            }
        }
        
    }
}
