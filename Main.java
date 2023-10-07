//Imports

import java.util.Scanner;
//Create Class
public class Main 
{
    public static void main(String[] args)
    {
        //Variables
        double progression = 0;
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
                    progression++;
                    switch (a)
                    {
                        case 1:
                            System.out.println("1) Search the Pond: You search the pond's bottom for any signs of the artifact.");
                            System.out.println("Choices: \n1) Keep Searching \n2) Look Around\n3) Encounter With Guardian\n4) Mysterious Message");
                            int a1 = scanner.nextInt();
                            progression++;
                            switch (a1)
                            {
                                case 1:
                                    System.out.println("Real Ending 1: As you carefully search the pond's bottom, your fingers brush against something hard and metallic. You pull it out, and to your astonishment, it's the artifact you've been seeking all along! With the powerful artifact in hand, you feel a surge of confidence and set off on your journey to unlock its secrets.");
                                    progression++;
                                    running = false;
                                break;

                                case 2:
                                    System.out.println("False Ending 1: Despite your thorough search, you find nothing but pebbles and mud at the pond's bottom. Frustrated and disheartened, you leave the pond behind and continue your quest deeper into the forest, hoping to find other clues.");
                                    running = false;
                                break;
                                
                                case 3:
                                    System.out.println("False Ending 2: While searching the pond, you accidentally awaken a guardian spirit of the forest. The spirit challenges you and you die.");
                                    running = false;
                                break;
                                
                                case 4:
                                    System.out.println("False Ending 3: Instead of the artifact, you find a mysterious message written in an ancient script at the pond's bottom, you have wasted your time.");
                                    running = false;
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
                                    progression++;
                                    running = false;
                                break;

                                case 2:
                                    System.out.println("Fake Ending 4: As you fish, the water ripples, and a mysterious being emerges from the depths of the pond. It introduces itself as a guardian spirit of the forest and offers you a pointless advice.");
                                    running = false;
                                break;
                                
                                case 3:
                                    System.out.println("Fake Ending 5: You decide to investigate further, discovering that the fish is indeed connected to the artifact. Its scales, when properly prepared, reveal hidden inscriptions leading you to the artifact's location, but the location doesn't exist.");
                                    running = false;
                                break;

                                case 4:
                                    System.out.println("Fake Ending 6:  You make the wise decision to leave the forest and find fulfillment in a different path, leaving the artifact behind but gaining a sense of contentment.");
                                    running = false;
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
                                    progression++;
                                    running = false;

                                break;
                                case 2:
                                    System.out.println("Fake Ending 7: During your meditation, you experience a profound sense of inner peace and clarity. Although you don't receive specific guidance about the artifact's location, you feel reinvigorated and determined. With newfound confidence, you continue your journey deeper into the forest, believing that you are on the right path to discover the artifact.");
                                    running = false;
                                break;

                                case 3:
                                    System.out.println("Fake Ending 8: As you meditate, your presence at the pond attracts the attention of a mischievous water nymph. She emerges from the water and offers you a magical charm. The charm, while not directly revealing the artifact's location, provides you with protection and guidance throughout your quest. You thank the nymph and venture deeper into the forest, guided by the charm's mystical aura.");
                                    running = false;
                                break;

                                case 4:
                                    System.out.println("Fake Ending 9: Your meditation by the pond brings you a deep sense of inner peace and tranquility. While you don't receive explicit guidance on the artifact's location, you decide to take a more patient and deliberate approach to your quest. You continue your journey at a leisurely pace, taking time to appreciate the beauty of the forest and the lessons it offers. Along the way, you encounter unexpected allies and slowly uncover the secrets of the Forest of Eternia, eventually leading you to the hidden artifact.");
                                    running = false;
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
                                    System.out.println("Real Ending 4: While resting, you notice a glimmer beneath the pond's surface. Curiosity piqued, you reach into the water and retrieve an ancient amulet. This amulet is rumored to be a key to finding the hidden artifact. With this newfound treasure, you decide to continue your quest with renewed determination.");
                                    progression++;
                                    running = false;
                                break;

                                case 2:
                                    System.out.println("False Ending 10: During your peaceful rest by the pond, you connect with the tranquil surroundings. The gentle rustling of leaves, the chirping of birds, and the soothing sound of the flowing water help you find inner peace. You realize that the true treasure was the serenity of nature itself. You decide to leave the quest for the artifact behind and dedicate your life to preserving the forest's beauty.");
                                    running = false;
                                break;
                                
                                case 3:
                                    System.out.println("False Ending 11: During your rest, you let your guard down. Unbeknownst to you, the forest is not as peaceful as it seems. Suddenly, a group of bandits ambushes you, demanding your valuables. In the ensuing struggle, you manage to escape but lose some of your supplies and face injuries. You decide to give up on the quest.");
                                    running = false;
                                break;

                                case 4:
                                    System.out.println("False Ending 12: While you rest, a group of forest creatures becomes curious about your presence. They are friendly at first, but as you sleep, they playfully snatch some of your belongings, including your map and supplies. You decide to give up on your quest.");
                                    running = false;
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
                    progression++;
                    switch (b)
                    {
                        case 1:
                            System.out.println("1) Explore the Cave: You decide to explore deeper into the cave, hoping to find clues about the artifact.");
                            System.out.println("Choices: \n1) Follow the Faint Light\n2) Investigate the Strange Sound\n3) Use the Torch\n4) Retreat");
                            int b1 = scanner.nextInt();
                            progression++;
                            switch (b1)
                            {
                                case 1:
                                    System.out.println("Real Ending 5: You follow the glowing light, as you approach the light you find the artifact you have been searching for at long last.");
                                    progression++;
                                    running = false;
                                break;

                                case 2:
                                    System.out.println("False Ending 13: You decide to investigate the strange sound, as you approach the sound you find yourself lost inside the cave putting an end to your adventure.");
                                    running = false;
                                break;
                                
                                case 3:
                                    System.out.println("False Ending 14: You use the torch to investigate the cave to no avail. You decide to put an end to your adventure.");
                                    running = false;
                                break;

                                case 4:
                                    System.out.println("False Ending 15: You decide to retreat out of the cave, putting an end to your adventure.");
                                    running = false;
                                break;
                            }
                        break;

                        case 2:
                            System.out.println("2) Retreat: Feeling uneasy, you decide to retreat from the cave.");
                            System.out.println("Choices: \n1) Return to the Entrance\n2) Rest at the Entrance\n3) Gather Supplies\n4) Peer into the Cave");
                            int b2 = scanner.nextInt();
                            progression++;
                            switch (b2)
                            {
                                case 1:
                                    System.out.println("Real Ending 6: You decide to turn back and explore a different path. As you return to the forest entrance, you hear a faint whisper in the wind, calling you to revisit your choices.\nAs you continue to the sound of the whisper, you discover the artifact.");
                                    progression++;
                                    running = false;
                                break;

                                case 2:
                                    System.out.println("False Ending 16: You rest at the cave entrance, you eventually fall asleep and wake up. You decide you are too fatigued and head home abandoning your adventure.");
                                    running = false;
                                break;
                                
                                case 3:
                                    System.out.println("False Ending 17: You decide to gather supplies in the cave, as time passes you realize you are lost. You give up your search of the artifact in search of the cave exit.");
                                    running = false;
                                break;

                                case 4:
                                    System.out.println("False Ending 18: As you peer into the cave, the sheer darkness of the cave overwhelms you and you decide to put an end to your adventure.");
                                    running = false;
                                break;
                            }
                        break;

                        case 3:
                            System.out.println("3) Gather Firewood: You search for firewood to light a torch and navigate the cave.");
                            System.out.println("Choices: \n1) Light the Torch\n2) Throw away the torch\n3) Rest by the Fire\n4) Extinguish the Torch");
                            int b3 = scanner.nextInt();
                            progression++;
                            switch (b3)
                            {
                                case 1:
                                    System.out.println("Real Ending 7: You gather firewood to create light within the cave, as you search deeper within the cave witht he help of your torch you find skeletal remainds of what seems to be a knight, as you look through his belongings you find the artifact.");
                                    progression++;
                                    running = false;
                                break;

                                case 2:
                                    System.out.println("False Ending 19: You throw away the torch, putting an end to your adventure.");
                                    running = false;
                                break;
                                
                                case 3:
                                    System.out.println("False Ending 20: You rest by the fire, the warmth puts you to sleep putting an end to your adventure.");
                                    running = false;
                                break;

                                case 4:
                                    System.out.println("False Ending 21: You extinguis the torch, putting an end to your adventure.");
                                    running = false;
                                break;
                            }
                        break;

                        case 4:
                            System.out.println("Rest: You take a break to regain your strength.");
                            System.out.println("Choices: \n1) Dream of Clues\n2) Wake Up Rejuvenated\n3) Daydream in Thought\n4) Examine Your Equipment");
                            int b4 = scanner.nextInt();
                            progression++;
                            switch (b4)
                            {
                                case 1:
                                    System.out.println("Real Ending 8: You decide to take a quick nap, in your dream you see a vision that gives you a clue telling you the artifact is behind the tree you're sleeping against. You collect the artifact putting a end to your adventure.");
                                    progression++;
                                    running = false;
                                break;
                            
                                case 2:
                                    System.out.println("False Ending 22: You wake up rejuvinated but you realize you had lost track of time, and decide to head home.");
                                    running = false;
                                break;
                                
                                case 3:
                                    System.out.println("False Ending 23: You daydream in deep thought for what seems like a few hours, when you wake up you realize you had lost track of time and decide to head home.");
                                    running = false;
                                break;

                                case 4:
                                    System.out.println("False Ending 24: You examine your equipment realizing you forgot to pack important rations, you head home to fetch your items putting an end to your adventure.");
                                    running = false;
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
                    progression++;
                    switch (c)
                    {
                        case 1:
                            System.out.println("1) Continue Deeper: You continue deeper into the woods, determined to find the artifact.");
                            System.out.println("Choices: \n1) Encounter a Hermit \n2) Discover a Hidden Path\n3) Fight Off a Wild Beast\n4) Press Forward");
                            int c1 = scanner.nextInt();
                            progression++;
                            switch (c1)
                            {
                                case 1:
                                    System.out.println("Real Ending 9: You encounter a kind hermit that decides to tell you the location of the artifact as he saw that you had a pure heart. You find the artifact and thank the hermit, putting an end to your adventure.");
                                    progression++;
                                    running = false;
                                break;

                                case 2:
                                    System.out.println("False Ending 25: You discover a hidden path in the woods, you decide to head down leading you to a even darker forest leaving you lost. You decide to abandon the search of the artifact in order to escape.");
                                    running = false;
                                break;
                                
                                case 3:
                                    System.out.println("False Ending 26: You encounter a hostile wild beast. You decide to fight the beast leaving you injured with a scar, you decide to abandon your adventure seeking vengance against the beast in the future.");
                                    running = false;
                                break;

                                case 4:
                                    System.out.println("False Ending 27: You press forward deeper into the forest, as you continue walking you seem to loose track of time and find yourself lost in the forst. You decide to abandon the search in order to escape.");
                                    running = false;
                                break;
                            }
                        break;

                        case 2:
                            System.out.println("2) Return to the Entrance: You decide to turn back and explore a different path.");
                            System.out.println("Choices: \n1) Retrace Path\n2) Wander Deeper\n3) Explore a Different Path\n4) Set Up Camp");
                            int c2 = scanner.nextInt();
                            progression++;
                            switch (c2) 
                            {
                                case 1:
                                    System.out.println("Real Ending 10: As you retrace your steps and return to the entrance of the forest, you notice something glittering beneath the roots of a massive oak tree. You dig with your hands and unearth the long-lost artifact! With the artifact in your possession, you return home as a hero, having accomplished what so many others failed to do.");
                                    progression++;
                                    running = false;
                                break;

                                case 2:
                                    System.out.println("False Ending 28: Upon returning to the entrance, you realize that the forest has shifted its paths, and you're hopelessly lost. No matter which direction you choose, you can't seem to find your way out. Days turn into weeks, and you become a lost soul, wandering the endless maze of the Forest of Eternia.");
                                    running = false;
                                break;
                                
                                case 3:
                                    System.out.println("False Ending 29: As you head back to the entrance exploring a different path, you are suddenly surrounded by ethereal forest spirits. They accuse you of disturbing the balance of the forest by seeking the artifact and decide to punish you. You're imprisoned in a magical cage and become a guardian of the forest for eternity.");
                                    running = false;
                                break;

                                case 4:
                                    System.out.println("False Ending 30: As you set up camp you experience a strange sensation, and suddenly, you find yourself back at the entrance once again. It seems you're trapped in a time loop, reliving the same moment over and over. No matter how many times you try to change your path, you always end up right back here.");
                                    running = false;
                                break;
                            }
                        break;

                        case 3:
                            System.out.println("3) Climb a Tree: You climb a tree to get a better view of your surroundings.");
                            System.out.println("Choices: \n1) Gain a Bird's Eye View\n2) Look Around\n3) Look On Branches\n4) Descend Safely");
                            int c3 = scanner.nextInt();
                            progression++;
                            switch (c3)
                            {
                                case 1:
                                    System.out.println("Real Ending 11: As you climb the tree, you spot a glimmering object high up in the branches. You reach for it and discover the long-lost artifact you were searching for! With the artifact in your possession, you become a legendary hero known throughout the land for your bravery and intelligence.");
                                    progression++;
                                    running = false;
                                break;

                                case 2:
                                    System.out.println("False Ending 31: While looking around on the tree, you lose your footing and fall to the ground. Fortunately, you escape with only a few scratches, but you didn't find the artifact. You abandon your quest due to this life threatening experience.");
                                    running = false;
                                break;
                                
                                case 3:
                                    System.out.println("False Ending 32: You reach a high branch and notice a small, shiny object wedged between two branches. Excitedly, you grab it, only to realize it's just a piece of discarded jewelry, not the artifact you seek. Disheartened, you climb down and abandon your journey.");
                                    running = false;                                    
                                break;

                                case 4:
                                    System.out.println("False Ending 33: While climbing down the tree, you spot a group of bandits approaching your location. You quickly descend and hide in the bushes. The bandits pass by, unaware of your presence. You realize that this forest is extremely dangerous and decide to abandon your journey.");
                                    running = false;
                                break;
                            }
                        break;

                        case 4:
                            System.out.println("4) Rest: You take a moment to rest and catch your breath.");
                            System.out.println("Choices: \n1) Relax Your Breathing\n2) Inspect Your Gear\n3) Uncover a Hidden Message\n4) Meditation");
                            int c4 = scanner.nextInt();
                            progression++;
                            switch (c4)
                            {
                                case 1:
                                    System.out.println("Real Ending 12: You decide to take a moment to rest and catch your breath. As you sit down, you notice a glimmer in the grass nearby. You reach down and discover a small, ancient medallion—the very artifact you were seeking! It seems that fate has rewarded your patience and determination. With the artifact in hand, you return from the forest victorious, your quest fulfilled. You are hailed as a hero and become a legend in your own right.");
                                    progression++;
                                    running = false;
                                break;

                                case 2:
                                    System.out.println("False Ending 34: While inspecting your gear, you accidentally drop your map into a nearby river, rendering it unreadable. Without the map, you wander aimlessly in the forest and never find the artifact.");
                                    running = false;
                                break;
                                
                                case 3:
                                    System.out.println("False Ending 35: You stumble upon a message that seems promising, but it turns out to be a cleverly disguised trap set by forest creatures. You fall into their snare and become their prisoner, never to complete your quest.");
                                    running = false;
                                break;

                                case 4:
                                    System.out.println("False Ending 36: As you meditate for 5 hours, you realize you have stupidly wasted your time and decide to go home.");
                                    running = false;
                                break;
                            }
                        break;

                    }
                break;
                case 4:
                    System.out.println("You go back to a large field of farms");
                    System.out.println("Choices: \n1) Walk towards the cornfield\n2) Walk towards the wheat field\n3) Walk towards the rice field\n4) Walk towards a blueberry field");
                    int d = scanner.nextInt();
                    progression++;
                    switch (d)
                    {
                        case 1:
                            System.out.println("1) Walk towards the cornfield.");
                            System.out.println("Choices: \n1) Inspect the Cornfield\n2) Lost in the Corn Maze\n3) Cornfield Encounter\n4) Rest in the Cornfield");
                            int d1 = scanner.nextInt();
                            progression++;
                            switch (d1)
                            {
                                case 1:
                                    System.out.println("Real Ending 13: As you cautiously inspect the cornfield, you notice something unusual buried beneath the cornstalks. You start to dig, and to your amazement, you uncover a hidden chest. With trembling hands, you open it to reveal the legendary artifact—the source of untold power. Your quest is a success, and you emerge from the cornfield victorious, clutching the artifact tightly in your grasp. You have become a legendary figure in the realm.");
                                    progression++;
                                    running = false;
                                break;

                                case 2:
                                    System.out.println("False Ending 37: As you venture into the corn maze, you quickly become disoriented and lost. Hours turn into days as you wander aimlessly through the twisting passages, unable to find your way out. Exhausted and hungry, you eventually collapse, and your quest ends in failure. Your fate remains unknown to the world.");
                                    running = false;
                                break;
                                
                                case 3:
                                    System.out.println("False Ending 38: While exploring the cornfield, you encounter a friendly scarecrow who offers you some cryptic advice about the artifact's location. You follow the scarecrow's guidance but soon realize it was a wild goose chase. The scarecrow's intentions were unclear, and you end up empty-handed, wondering if it was all a prank.");
                                    running = false;
                                break;

                                case 4:
                                    System.out.println("False Ending 39: You decide to take a break and rest in the cornfield. As you lay down, the rustling of the cornstalks lulls you to sleep. When you wake up, you find yourself surrounded by an army of mischievous cornfield creatures who have stolen your supplies. They lead you out of the cornfield, leaving you empty-handed and bewildered, with no sign of the artifact.");
                                    running = false;
                                break;
                            }
                        break;

                        case 2:
                            System.out.println("2) Walk towards the wheat field.");
                            System.out.println("Choices: \n1) Harvest the Wheat\n2) Wheat Field Labyrinth\n3) Encounter a Scarecrow:\n4) Rest in the Wheat Field");
                            int d2 = scanner.nextInt();
                            progression++;
                            switch (d2)
                            {
                                case 1: 
                                    System.out.println("Real Ending 14: You decide to harvest the ripe wheat in the field. As you gather the golden stalks, you notice a glint of metal buried beneath the crops. You unearth a beautifully crafted amulet, radiating with a faint, mystical energy. This must be the lost artifact you were seeking! Your quest is a success, and you leave the Wheat Field with the artifact in your possession, feeling triumphant and fulfilled. You've achieved your goal and can return as a hero.");
                                    progression++;
                                    running = false;
                                break;

                                case 2:
                                    System.out.println("False Ending 40: You venture into the wheat field, hoping to find a shortcut or hidden path. However, the dense wheat soon becomes a labyrinth, and you lose your way. Hours turn into days as you wander aimlessly, unable to find an exit. Exhausted and hungry, you eventually collapse in the maze, never to be seen again.");
                                    running = false;
                                break;
                                
                                case 3:
                                    System.out.println("False Ending 41: As you approach the scarecrow, it suddenly springs to life, revealing itself as a guardian of the field. It warns you that the artifact is not meant for outsiders and attacks. Despite your best efforts, you're overpowered by the animated scarecrow and are forced to retreat from the field, your quest ending in failure.");
                                    running = false;
                                break;

                                case 4:
                                    System.out.println("False Ending 42: You decide to rest in the wheat field, lulled by the gentle rustling of the crops. However, your nap is interrupted by a group of bandits who had been hiding in the field. They steal your belongings and leave you stranded in the middle of the field, defeated and humiliated. Your quest for the artifact ends in disappointment.");
                                    running = false;
                                break;
                            }
                        break;

                        case 3:
                            System.out.println("3) Walk towards the rice field.");
                            System.out.println("Choices: \n1) Puzzle in the Rice Field\n2) Rice Field River\n3) Rice Field Encounter\n4) Rest By Rice Field");
                            int d3 = scanner.nextInt();
                            progression++;
                            switch (d3)
                            {
                                case 1:
                                    System.out.println("Real Ending 15: You choose to investigate the puzzle in the rice field. As you approach, you discover an ancient, ornate chest half-buried in the mud. It's covered in strange markings. After hours of deciphering the symbols, you unlock the chest to reveal the Lost Artifact, a magnificent gem that radiates with immense power. You've successfully completed your quest and secured the artifact. With it, you become a legendary hero, known throughout the land for your courage and wit.");
                                    progression++;
                                    running = false;
                                break;

                                case 2:
                                    System.out.println("False Ending 43: You decide to follow the path to the Rice Field River. As you reach the riverbank, you notice a beautiful, shimmering object in the water. You reach for it and find a simple, polished stone. It's a charming souvenir from your journey, but it's not the Lost Artifact. You continue your adventure, knowing that your true quest is still ahead.");
                                    running = false;
                                break;
                                
                                case 3:
                                    System.out.println("False Ending 44: You choose the path leading to the Rice Field Encounter. As you explore, you come across a group of friendly villagers who invite you to join their harvest celebration. While you enjoy their company and partake in the festivities, you realize that the Lost Artifact is not among them. Your quest remains unfulfilled, but you've made new friends along the way.");
                                    running = false;
                                break;

                                case 4:
                                    System.out.println("False Ending 45: Feeling tired and weary, you decide to rest by the rice field. As you lie down to rest, you close your eyes and drift into a deep sleep. When you wake up, the day has passed, and you've missed your chance to continue your quest. You return home, your dreams of finding the Lost Artifact unfulfilled.");
                                    running = false;
                                break;
                            }
                        break;

                        case 4:
                            System.out.println("4) Walk towards a blueberry field.");
                            System.out.println("Choices: \n1) Collect Blueberries\n2)Meet Blueberry Field Faeries\n3) Blueberry Field Meditation\n4) Rest in the Blueberry Field");
                            int d4 = scanner.nextInt();
                            progression++;
                            switch (d4)
                            {
                                case 1:
                                    System.out.println("Real Ending 16: You decide to collect blueberries, carefully picking the ripest ones from the bushes. As you gather them in your basket, you notice a soft humming sound around you. The Blueberry Field Faeries, enchanted creatures who protect the field, reveal themselves. They are delighted with your respect for their home and offer you a gift—a small vial of magical blueberry essence that grants enhanced vitality and strength. You thank the faeries and continue your quest deep into the forest, carrying the essence that will prove invaluable in your search for the Lost Artifact.");
                                    progression++;
                                    running = false;
                                break;

                                case 2:
                                    System.out.println("False Ending 46: You choose to rest in the Blueberry Field, lying down among the bushes. The scent of ripe blueberries lulls you into a deep, peaceful slumber. When you wake up, you discover that you've slept for days, and the sun is setting. You've lost precious time, and the artifact remains elusive. You continue your journey, but with a sense of urgency, realizing that time is not on your side.");
                                    running = false;
                                break;
                                
                                case 3:
                                    System.out.println("False Ending 47: Opting for an imaginative journey, you decide to meet the Blueberry Field Faeries by pretending they're there. You have a whimsical conversation with your imaginary faeries, but it doesn't lead to any tangible outcomes. After a while, you leave the Blueberry Field with fond memories of your imaginary encounter, though it doesn't bring you any closer to finding the Lost Artifact.");
                                    running = false;
                                break;

                                case 4:
                                    System.out.println("False Ending 48: You choose to meditate in the Blueberry Field, hoping to find inner peace and guidance. While the meditation is calming and rejuvenating, it doesn't yield any insights or progress in your quest for the Lost Artifact. As you open your eyes, you realize that the sun has moved across the sky, and you've spent a considerable amount of time in contemplation. You continue your journey, hoping that the answers will reveal themselves in due time.");
                                    running = false;
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
    
        System.out.println("\n\nYour Progression: " + (progression/3)* 100 + "%" );

    }
}