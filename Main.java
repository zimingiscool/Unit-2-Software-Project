//Imports

import java.util.Scanner;
//Create Class
public class Main 
{
    public static void main(String[] args)
    {
        //Variables
        int progression = 0;
        boolean running = true;

        Scanner scanner = new Scanner(System.in);        
        //While loop ensure the story continues until the user finishes the game.
        while(running == true)
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
                                    running = false;
                                break;

                                case 2:
                                    System.out.println("False Ending 1: Despite your thorough search, you find nothing but pebbles and mud at the pond's bottom. Frustrated and disheartened, you leave the pond behind and continue your quest deeper into the forest, hoping to find other clues.");
                                break;
                                
                                case 3:
                                    System.out.println("False Ending 2: While searching the pond, you accidentally awaken a guardian spirit of the forest. The spirit challenges you and you die.");
                                break;
                                
                                case 4:
                                    System.out.println("False Ending 3: Instead of the artifact, you find a mysterious message written in an ancient script at the pond's bottom, you have wasted your time.");
                                break;
                            }
                        break;

                        case 2:
                            System.out.println("2) Fishing: You decide to fish in the pond, hoping to catch something useful.");
                            System.out.println("Choices: \n1) Cast Your Line Into The Pond\n2) Encounter Someone\n3) Suprise Catch\n4) Rest and Reflect");
                            int a2 = scanner.nextInt();
                            switch (a2)
                            {
                                case 1:
                                    System.out.println("Real Ending 2: You decide to explore deeper into the forest, eventually discovering a hidden chest. The key fits perfectly, revealing the ancient artifact inside.");
                                break;

                                case 2:
                                    System.out.println("Fake Ending 4: As you fish, the water ripples, and a mysterious being emerges from the depths of the pond. It introduces itself as a guardian spirit of the forest and offers you a pointless advice.");
                                break;
                                
                                case 3:
                                    System.out.println("Fake Ending 5: You decide to investigate further, discovering that the fish is indeed connected to the artifact. Its scales, when properly prepared, reveal hidden inscriptions leading you to the artifact's location, but the location doesn't exist.");
                                break;

                                case 4:
                                    System.out.println("Fake Ending 6:  You make the wise decision to leave the forest and find fulfillment in a different path, leaving the artifact behind but gaining a sense of contentment.");
                                break;
                            }
                        break;

                        case 3:
                            System.out.println("3) Meditate: You sit by the pond and meditate, seeking inner guidance.");
                            System.out.println("Choices: \n1) See a Vision\n2) Recieve a Revelation\n3) The Enchanted Pond\n4) Enter a Tranquil Respite");
                            int a3 = scanner.nextInt();
                            switch (a3)
                            {
                                case 1:
                                    System.out.println("Real Ending 3: As you meditate, you enter a deep state of trance. In your mind's eye, you see a vision of an ancient guardian spirit. The spirit imparts wisdom and guidance, revealing the location of the hidden artifact. You follow the spirit's instructions and successfully retrieve the artifact, becoming a legendary hero.");

                                break;
                                case 2:
                                    System.out.println("Fake Ending 7: During your meditation, you experience a profound sense of inner peace and clarity. Although you don't receive specific guidance about the artifact's location, you feel reinvigorated and determined. With newfound confidence, you continue your journey deeper into the forest, believing that you are on the right path to discover the artifact.");
                                break;

                                case 3:
                                    System.out.println("Fake Ending 8: As you meditate, your presence at the pond attracts the attention of a mischievous water nymph. She emerges from the water and offers you a magical charm. The charm, while not directly revealing the artifact's location, provides you with protection and guidance throughout your quest. You thank the nymph and venture deeper into the forest, guided by the charm's mystical aura.");
                                break;

                                case 4:
                                    System.out.println("Fake Ending 9: Your meditation by the pond brings you a deep sense of inner peace and tranquility. While you don't receive explicit guidance on the artifact's location, you decide to take a more patient and deliberate approach to your quest. You continue your journey at a leisurely pace, taking time to appreciate the beauty of the forest and the lessons it offers. Along the way, you encounter unexpected allies and slowly uncover the secrets of the Forest of Eternia, eventually leading you to the hidden artifact.");
                                break;
                            }
                        break;

                        case 4:
                            System.out.println("4) Rest: You take a peaceful rest by the pond.");
                            System.out.println("Choices: \n1) Unexpected Discovery \n2) Find Serenity \n3) Ambushed\n4) Theives");
                            int a4 = scanner.nextInt();
                            switch (a4)
                            {
                                case 1:
                                    System.out.println("Real Ending 1: While resting, you notice a glimmer beneath the pond's surface. Curiosity piqued, you reach into the water and retrieve an ancient amulet. This amulet is rumored to be a key to finding the hidden artifact. With this newfound treasure, you decide to continue your quest with renewed determination.");
                                break;

                                case 2:
                                    System.out.println("False Ending 10: During your peaceful rest by the pond, you connect with the tranquil surroundings. The gentle rustling of leaves, the chirping of birds, and the soothing sound of the flowing water help you find inner peace. You realize that the true treasure was the serenity of nature itself. You decide to leave the quest for the artifact behind and dedicate your life to preserving the forest's beauty.");
                                break;
                                
                                case 3:
                                    System.out.println("False Ending 11: During your rest, you let your guard down. Unbeknownst to you, the forest is not as peaceful as it seems. Suddenly, a group of bandits ambushes you, demanding your valuables. In the ensuing struggle, you manage to escape but lose some of your supplies and face injuries. You decide to give up on the quest.");
                                break;

                                case 4:
                                    System.out.println("False Ending 12: While you rest, a group of forest creatures becomes curious about your presence. They are friendly at first, but as you sleep, they playfully snatch some of your belongings, including your map and supplies. You decide to give up on your quest.");
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
                                    System.out.println("Real Ending 5: You follow the glowing light, as you approach the light you find the artifact you have been searching for at long last.");
                                break;

                                case 2:
                                    System.out.println("False Ending 13: You decide to investigate the strange sound, as you approach the sound you find yourself lost inside the cave putting an end to your adventure.");
                                break;
                                
                                case 3:
                                    System.out.println("False Ending 14: You use the torch to investigate the cave to no avail. You decide to put an end to your adventure.");
                                break;

                                case 4:
                                    System.out.println("False Ending 15: You decide to retreat out of the cave, putting an end to your adventure.");
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
                                    System.out.println("Real Ending 6: You decide to turn back and explore a different path. As you return to the forest entrance, you hear a faint whisper in the wind, calling you to revisit your choices.\nAs you continue to the sound of the whisper, you discover the artifact.");
                                break;

                                case 2:
                                    System.out.println("False Ending 16: You rest at the cave entrance, you eventually fall asleep and wake up. You decide you are too fatigued and head home abandoning your adventure.");
                                break;
                                
                                case 3:
                                    System.out.println("False Ending 17: You decide to gather supplies in the cave, as time passes you realize you are lost. You give up your search of the artifact in search of the cave exit.");
                                break;

                                case 4:
                                    System.out.println("False Ending 18: As you peer into the cave, the sheer darkness of the cave overwhelms you and you decide to put an end to your adventure.");
                                break;
                            }
                        break;

                        case 3:
                            System.out.println("3) Gather Firewood: You search for firewood to light a torch and navigate the cave.");
                            System.out.println("Choices: \n1) Light the Torch\n2) Throw away the torch\n3) Rest by the Fire\n4) Extinguish the Torch");
                            int b3 = scanner.nextInt();
                            switch (b3)
                            {
                                case 1:
                                    System.out.println("Real Ending 7: You gather firewood to create light within the cave, as you search deeper within the cave witht he help of your torch you find skeletal remainds of what seems to be a knight, as you look through his belongings you find the artifact.");
                                break;

                                case 2:
                                    System.out.println("False Ending 19: You throw away the torch, putting an end to your adventure.");
                                break;
                                
                                case 3:
                                    System.out.println("False Ending 20: You rest by the fire, the warmth puts you to sleep putting an end to your adventure.");
                                break;

                                case 4:
                                    System.out.println("False Ending 21: You extinguis the torch, putting an end to your adventure.");
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
                                    System.out.println("Real Ending 6: You decide to take a quick nap, in your dream you see a vision that gives you a clue telling you the artifact is behind the tree you're sleeping against. You collect the artifact putting a end to your adventure.");
                                break;
                            
                                case 2:
                                    System.out.println("False Ending 22: You wake up rejuvinated but you realize you had lost track of time, and decide to head home.");
                                break;
                                
                                case 3:
                                    System.out.println("False Ending 23: You daydream in deep thought for what seems like a few hours, when you wake up you realize you had lost track of time and decide to head home.");
                                break;

                                case 4:
                                    System.out.println("False Ending 24: You examine your equipment realizing you forgot to pack important rations, you head home to fetch your items putting an end to your adventure.");
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
                                    System.out.println("Real Ending 7: ");
                                break;

                                case 2:
                                    System.out.println("False Ending 25: ");
                                break;
                                
                                case 3:
                                    System.out.println("False Ending 26: ");
                                break;

                                case 4:
                                    System.out.println("False Ending 27: ");
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