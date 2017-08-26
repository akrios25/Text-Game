package nyc.c4q.kevintoro;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        final int END = 0;
        final int SCENE_ONE = 1;
        final int SCENE_TWO = 2;
        final int SCENE_THREE = 3;
        final int SCENE_FOUR = 4;
        final int SCENE_FIVE = 5;
        final int SCENE_SIX = 6;
        final int SCENE_SEVEN = 7;
        final int CONCLUSION = 8;
        System.out.println("WELCOME TO. . .\n");
        System.out.println("   ▄████████    ▄███████▄  ▄██████▄      ███        ▄█    █▄       ▄████████  ▄██████▄     ▄████████  ▄█     ▄████████ \n" +
                "  ███    ███   ███    ███ ███    ███ ▀█████████▄   ███    ███     ███    ███ ███    ███   ███    ███ ███    ███    ███ \n" +
                "  ███    ███   ███    ███ ███    ███    ▀███▀▀██   ███    ███     ███    █▀  ███    ███   ███    █▀  ███▌   ███    █▀  \n" +
                "  ███    ███   ███    ███ ███    ███     ███   ▀  ▄███▄▄▄▄███▄▄  ▄███▄▄▄     ███    ███   ███        ███▌   ███        \n" +
                "▀███████████ ▀█████████▀  ███    ███     ███     ▀▀███▀▀▀▀███▀  ▀▀███▀▀▀     ███    ███ ▀███████████ ███▌ ▀███████████ \n" +
                "  ███    ███   ███        ███    ███     ███       ███    ███     ███    █▄  ███    ███          ███ ███           ███ \n" +
                "  ███    ███   ███        ███    ███     ███       ███    ███     ███    ███ ███    ███    ▄█    ███ ███     ▄█    ███ \n" +
                "  ███    █▀   ▄████▀       ▀██████▀     ▄████▀     ███    █▀      ██████████  ▀██████▀   ▄████████▀  █▀    ▄████████▀  \n" +
                "                                                                                                                       \n");
        Scanner scanner = new Scanner(System.in);
        String userInput;
        int scene = SCENE_ONE;
        while (scene != END) {
            switch (scene) {

                // Scene One

                case SCENE_ONE:
                    System.out.print("The salt breeze brushes you gently, You hear the call of sea birds");
                    System.out.println("not too far off. \nUnsure of where or when you are,");
                    System.out.println("you get up and assess your surroundings...");
                    System.out.println("Use: North /South /East /West");
                    userInput = scanner.nextLine();

                    if (userInput.toLowerCase().equals("north")) {
                        scene = SCENE_TWO;
                    } else if (userInput.toLowerCase().equals("south")) {
                        System.out.println("you look behind you. Howling darkness beckons you deeper. You stare ");
                        System.out.println("into the abyss. You are lost in it.\n");
                        System.out.println("    ███        ▄████████ ▄██   ▄           ▄████████    ▄██████▄     ▄████████  ▄█  ███▄▄▄▄   \n" +
                                "▀█████████▄   ███    ███ ███   ██▄        ███    ███   ███    ███   ███    ███ ███  ███▀▀▀██▄ \n" +
                                "   ▀███▀▀██   ███    ███ ███▄▄▄███        ███    ███   ███    █▀    ███    ███ ███▌ ███   ███ \n" +
                                "    ███   ▀  ▄███▄▄▄▄██▀ ▀▀▀▀▀▀███        ███    ███  ▄███          ███    ███ ███▌ ███   ███ \n" +
                                "    ███     ▀▀███▀▀▀▀▀   ▄██   ███      ▀███████████ ▀▀███ ████▄  ▀███████████ ███▌ ███   ███ \n" +
                                "    ███     ▀███████████ ███   ███        ███    ███   ███    ███   ███    ███ ███  ███   ███ \n" +
                                "    ███       ███    ███ ███   ███        ███    ███   ███    ███   ███    ███ ███  ███   ███ \n" +
                                "   ▄████▀     ███    ███  ▀█████▀         ███    █▀    ████████▀    ███    █▀  █▀    ▀█   █▀  \n" +
                                "              ███    ███                                                                      ");
                        scene = SCENE_ONE;
                    } else if (userInput.toLowerCase().equals("east")) {
                        System.out.print("There’s grooves on the cave wall here. You do not know what they mean.");
                        System.out.println("The tips of your fingers are met with some static, energy coursing through ");
                        System.out.println("them. \nThese are not for you...\n");
                        scene = SCENE_ONE;
                    } else if (userInput.toLowerCase().equals("west")) {
                        System.out.println("Cavernous wall, moist to the touch and cold. Unless you could dig ");
                        System.out.println("through, there isn’t much to do.\n");
                        scene = SCENE_ONE;
                    }
                    break;

                // Scene Two

                case SCENE_TWO:
                    System.out.println("You look ahead. There is a small opening; Approach?");
                    System.out.println("Use: No /Yes");
                    userInput = scanner.nextLine();

                    if (userInput.toLowerCase().equals("no")) {
                        System.out.println("You don't move forward. Idle and patient, you allow the cave to ");
                        System.out.println("cradle you in it’s darkness. You feel your energy draining as if this cave ");
                        System.out.println("could draw from you your very life force...\n");
                        System.out.println("    ███        ▄████████ ▄██   ▄           ▄████████    ▄██████▄     ▄████████  ▄█  ███▄▄▄▄   \n" +
                                "▀█████████▄   ███    ███ ███   ██▄        ███    ███   ███    ███   ███    ███ ███  ███▀▀▀██▄ \n" +
                                "   ▀███▀▀██   ███    ███ ███▄▄▄███        ███    ███   ███    █▀    ███    ███ ███▌ ███   ███ \n" +
                                "    ███   ▀  ▄███▄▄▄▄██▀ ▀▀▀▀▀▀███        ███    ███  ▄███          ███    ███ ███▌ ███   ███ \n" +
                                "    ███     ▀▀███▀▀▀▀▀   ▄██   ███      ▀███████████ ▀▀███ ████▄  ▀███████████ ███▌ ███   ███ \n" +
                                "    ███     ▀███████████ ███   ███        ███    ███   ███    ███   ███    ███ ███  ███   ███ \n" +
                                "    ███       ███    ███ ███   ███        ███    ███   ███    ███   ███    ███ ███  ███   ███ \n" +
                                "   ▄████▀     ███    ███  ▀█████▀         ███    █▀    ████████▀    ███    █▀  █▀    ▀█   █▀  \n" +
                                "              ███    ███                                                                      ");
                        scene = SCENE_ONE;
                    } else if (userInput.toLowerCase().equals("yes")) {
                        scene = SCENE_THREE;
                    }
                    break;
                //Scene three
                case SCENE_THREE:
                    System.out.println("The scent of salt, sea and sun gently waft up to you, as if beckoning ");
                    System.out.println("you every step forward.\n\nAs you approach the opening,");
                    System.out.println("the light ahead begins to grow.");
                    System.out.println("The cacophony of sound drowns your senses,");
                    System.out.println("light envelops you and you’re now ");
                    System.out.println("standing in a vast library. It feels ancient.");
                    System.out.println("You’re met by empty shelves, save for one tome. Will you read it?");
                    System.out.println("Use: Read it /Don't read it");
                    userInput = scanner.nextLine();

                    if (userInput.toLowerCase().equals("read it")) {
                        System.out.println("You skim through the pages made of brittle papyrus. You manage ");
                        System.out.println("to take in a few words \n“The Terminal… multitude of lives… kasha records of… ");
                        System.out.println("..cave.. ”\nYou can’t make much of it, placing it down. You search for an exit.");
                        scene = SCENE_FOUR;
                    } else if (userInput.toLowerCase().equals("don't read it")) {
                        System.out.println("You overlook the book and search for an exit. ");
                        System.out.println("There doesn’t seem ");
                        System.out.println("to be a way in or out of the ");
                        System.out.println("abandoned library. The book is no longer there, ");
                        System.out.println("but placed precariously on a ");
                        System.out.println("singular shelf. It seems to emit a form of heat. Will you open or ignore it?");
                        scene = SCENE_SIX;
                    }
                    break;
                //scene four
                case SCENE_FOUR:
                    System.out.print("A voice emanates from behind you.");
                    System.out.println(" You stand still and listen.");
                    System.out.println("\"Are you beginning to understand where you are?\"");
                    System.out.println("Use: Who are you? /Where am I? /No.");
                    userInput = scanner.nextLine();

                    if (userInput.toLowerCase().equals("who are you?")) {
                        System.out.println("\"I am all things. I am time. As are you...\"\n");
                        scene = SCENE_FOUR;
                    } else if (userInput.toLowerCase().equals("where am i?")) {
                        System.out.println("\"In between what was and what will be…\"\n");
                        System.out.println("\nA ghastly hand ensures you’ve not moved. It slides to the back of your head, ");
                        System.out.println("abruptly pushing you into the pages that stand before you. A rushing smell of ");
                        System.out.println("decaying papyrus and atramentum flood your ");
                        System.out.println("nostrils as you pass through the tome. \n");
                        scene = SCENE_FIVE;

                    } else if (userInput.toLowerCase().equals("no")) {
                        System.out.println("\"You can deny as much as you’d like. Know that you will stay here,");
                        System.out.println(" withering with your thoughts. It is your choice to accept it");
                        System.out.println(" or deny it...\"\n");
                        scene = SCENE_FOUR;
                    }
                    break;
                //scene 5
                case SCENE_FIVE:
                    System.out.println("\"What was and will be?\"");
                    System.out.println("The words resonate in your mind. You are at a loss.\n");
                    System.out.println("You awaken atop a mountain. Unsure of how you arrived here, you recall the ");
                    System.out.println("hand and the book.\n");
                    System.out.println("It seems a lifetime away.");
                    System.out.println("Use: Look up /Sit Down /Jump");
                    userInput = scanner.nextLine();

                    if (userInput.toLowerCase().equals("look up")) {
                        System.out.println("A sea of celestial bodies swim through a vast space; stars ");
                        System.out.println("shining brilliant colors, the hues in the atmosphere in a seemingly");
                        System.out.println("direct competition with the stars. You are mesmerized and left ");
                        System.out.println("feeling… almost timeless.\n");
                        scene = SCENE_FIVE;
                    } else if (userInput.toLowerCase().equals("sit down")) {
                        System.out.println("You begin to contemplate your being here. You think of the ");
                        System.out.println("ancient library, the call of seabirds, the cosmic energy of this");
                        System.out.println("mountain. You begin to remember the cave...\n");
                        scene = SCENE_SEVEN;
                    } else if (userInput.toLowerCase().equals("jump")) {
                        System.out.println("You decide you’ve had enough of this cosmic riddle. You gracefully ");
                        System.out.println("leap from the peak into the endless frigid sky below.");
                        System.out.println("The gales of wind caress you one last time. Your heart is warmed ");
                        System.out.println("in your ");
                        System.out.println("free fall by the affections given to you by the wind.");
                        System.out.println("The familiarity settles you; soothed, your mind and memory fade ");
                        System.out.println("to nothingness.\n");
                        System.out.println("    ███        ▄████████ ▄██   ▄           ▄████████    ▄██████▄     ▄████████  ▄█  ███▄▄▄▄   \n" +
                                "▀█████████▄   ███    ███ ███   ██▄        ███    ███   ███    ███   ███    ███ ███  ███▀▀▀██▄ \n" +
                                "   ▀███▀▀██   ███    ███ ███▄▄▄███        ███    ███   ███    █▀    ███    ███ ███▌ ███   ███ \n" +
                                "    ███   ▀  ▄███▄▄▄▄██▀ ▀▀▀▀▀▀███        ███    ███  ▄███          ███    ███ ███▌ ███   ███ \n" +
                                "    ███     ▀▀███▀▀▀▀▀   ▄██   ███      ▀███████████ ▀▀███ ████▄  ▀███████████ ███▌ ███   ███ \n" +
                                "    ███     ▀███████████ ███   ███        ███    ███   ███    ███   ███    ███ ███  ███   ███ \n" +
                                "    ███       ███    ███ ███   ███        ███    ███   ███    ███   ███    ███ ███  ███   ███ \n" +
                                "   ▄████▀     ███    ███  ▀█████▀         ███    █▀    ████████▀    ███    █▀  █▀    ▀█   █▀  \n" +
                                "              ███    ███                                                                      ");
                        scene = SCENE_ONE;
                    }
                    break;
                //scene six
                case SCENE_SIX:

                    System.out.println("Use: Open /Ignore");
                    userInput = scanner.nextLine();

                    if (userInput.toLowerCase().equals("open")) {
                      System.out.println("\"A … lost to time….rebirth of …many lifetimes….. lie within the Aka..” ");
                      System.out.println("You are feeling strained all of the sudden. A hand is placed on your shoulder.");
                      scene = SCENE_FOUR;
                    } else if (userInput.toLowerCase().equals("ignore")) {
                      System.out.println("The book is overlooked. The shelves begin to turn to dust, ");
                      System.out.println("as if consumed by the layers and layers");
                      System.out.println("they’ve been gathering through the ages. It is getting harder to ");
                      System.out.println("breathe. You claw at your throat. The grayness of this");
                      System.out.println("library devours you. Your existence ceases here.\n");
                      System.out.println("    ███        ▄████████ ▄██   ▄           ▄████████    ▄██████▄     ▄████████  ▄█  ███▄▄▄▄   \n" +
                              "▀█████████▄   ███    ███ ███   ██▄        ███    ███   ███    ███   ███    ███ ███  ███▀▀▀██▄ \n" +
                              "   ▀███▀▀██   ███    ███ ███▄▄▄███        ███    ███   ███    █▀    ███    ███ ███▌ ███   ███ \n" +
                              "    ███   ▀  ▄███▄▄▄▄██▀ ▀▀▀▀▀▀███        ███    ███  ▄███          ███    ███ ███▌ ███   ███ \n" +
                              "    ███     ▀▀███▀▀▀▀▀   ▄██   ███      ▀███████████ ▀▀███ ████▄  ▀███████████ ███▌ ███   ███ \n" +
                              "    ███     ▀███████████ ███   ███        ███    ███   ███    ███   ███    ███ ███  ███   ███ \n" +
                              "    ███       ███    ███ ███   ███        ███    ███   ███    ███   ███    ███ ███  ███   ███ \n" +
                              "   ▄████▀     ███    ███  ▀█████▀         ███    █▀    ████████▀    ███    █▀  █▀    ▀█   █▀  \n" +
                              "              ███    ███                                                                      ");
                      scene = SCENE_ONE;
                      }
                    break;
                //scene seven
                case SCENE_SEVEN:
                    System.out.println("The cave is clear in your mind. You feel the presence of someone. ");
                    System.out.println("You try and see through the haze of your mind. Impatient, you open your eyes.\n ");
                    System.out.println("You are inside the cave.");
                    System.out.println("Stay Still? \nUse: Yes /No");
                    userInput = scanner.nextLine();

                    if (userInput.toLowerCase().equals("yes")) {
                        System.out.println("You wait for what feels like an eternity. A child comes through the ");
                        System.out.println("haze of darkness. They seem to look directly into you. You reach out, but in doing");
                        System.out.println("so, the child falters. The color begins to fade from their body. You feel ");
                        System.out.println("responsible. Saddened, you wish the child to live. You beg to the darkness ");
                        System.out.println("and the birds in the distance. You beg the sun to save this child…\n");
                        scene = CONCLUSION;
                    } else if (userInput.toLowerCase().equals("no")) {
                        System.out.println("You move forward. There is a young child feeling the walls to his right.");
                        System.out.println("Approaching the child, you notice they do not react. ");
                        System.out.println("They cannot see you. You see the child is unsettled and confused.");
                        System.out.println("As if pulled forward, ");
                        System.out.println("the child makes their way to a small opening in the cave…\n");
                        System.out.println("their silhouette slowly dispersing in the radiance of the beyond\n");
                    System.out.println(" ▄▄▄       ██▓     ███▄ ▄███▓ ▒█████    ██████ ▄▄▄█████▓               \n" +
                            "▒████▄    ▓██▒    ▓██▒▀█▀ ██▒▒██▒  ██▒▒██    ▒ ▓  ██▒ ▓▒               \n" +
                            "▒██  ▀█▄  ▒██░    ▓██    ▓██░▒██░  ██▒░ ▓██▄   ▒ ▓██░ ▒░               \n" +
                            "░██▄▄▄▄██ ▒██░    ▒██    ▒██ ▒██   ██░  ▒   ██▒░ ▓██▓ ░                \n" +
                            " ▓█   ▓██▒░██████▒▒██▒   ░██▒░ ████▓▒░▒██████▒▒  ▒██▒ ░  ██▓  ██▓  ██▓ \n" +
                            " ▒▒   ▓▒█░░ ▒░▓  ░░ ▒░   ░  ░░ ▒░▒░▒░ ▒ ▒▓▒ ▒ ░  ▒ ░░    ▒▓▒  ▒▓▒  ▒▓▒ \n" +
                            "  ▒   ▒▒ ░░ ░ ▒  ░░  ░      ░  ░ ▒ ▒░ ░ ░▒  ░ ░    ░     ░▒   ░▒   ░▒  \n" +
                            "  ░   ▒     ░ ░   ░      ░   ░ ░ ░ ▒  ░  ░  ░    ░       ░    ░    ░   \n" +
                            "      ░  ░    ░  ░       ░       ░ ░        ░             ░    ░    ░  \n" +
                            "                                                          ░    ░    ░  ");
                        scene = END;
                    }
                    break;
                    //Conclusion
                case CONCLUSION:
                    System.out.println("...A gentle sea breeze flows through. The child seems to react ");
                    System.out.println("as if called.\n");
                    System.out.println("They stand and walk towards the direction of the wind, using the ");
                    System.out.println("cave wall as support. \nYou are left in immeasurable darkness. ");
                    System.out.println("The symbols on the cave walls begin to glow, only now they seem legible.\n");
                    System.out.println("One in particular catches your eye. \nIt reads “Akasha”...  \n");
                    System.out.println("  █████▒    ██▓    ███▄    █    \n" +
                            "▓██   ▒    ▓██▒    ██ ▀█   █    \n" +
                            "▒████ ░    ▒██▒   ▓██  ▀█ ██▒   \n" +
                            "░▓█▒  ░    ░██░   ▓██▒  ▐▌██▒   \n" +
                            "░▒█░       ░██░   ▒██░   ▓██░   \n" +
                            " ▒ ░       ░▓     ░ ▒░   ▒ ▒    \n" +
                            " ░          ▒ ░   ░ ░░   ░ ▒░   \n" +
                            " ░ ░        ▒ ░      ░   ░ ░    \n" +
                            "            ░              ░    \n" +
                            "                                ");
                    scene = END;
                    break;
            }



        }

    }

}