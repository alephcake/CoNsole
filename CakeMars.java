import java.util.*;
/* TODO:
 - Planets
 - Starships
 - Trading
 - Resources
 */
public class CakeMars {
    public static String player;
    public static int money, xp, level, fuel, ore, gold, steel, wood, oil, food, crystal, planetid = 0;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void CakeMarsInit(){
        System.out.print(ANSI_PURPLE);
        System.out.println("THIS IS UNFINISHED.\n\n");
        System.out.println(ANSI_RESET + " " + ANSI_GREEN);
        System.out.println("Years ago, Earth has succumbed to the effects of pollution and climate change and begun slowly turning into a blazing-hot wasteland. People from the whole world rushed to begin the colonization of the closest planets, asteroids and other rocks in the Solar system.\n\nThe Moon was the first target, with a space base already in the works, it quickly became an interplanetary hub for travellers and traders alike. With the power of modern hydroponics and terraformation, it developed a set of special plants that thrived on the cold, barren, hard Moon rocks.\n\nPeople used the knowledge they gained from the Moon to create life on countless asteroids and 2 other Solar System planets - Mercury and Mars. The first Mars base has been destroyed by a huge unexpected storm, however the second base has thrived and turned into an industrial megalopolis. Due to an abundance of iron, sulphur and lead it quickly turned into a planet filled with surface mines and pollution.\n" + ANSI_RESET + " " + ANSI_CYAN + "\nYou are a regular citizen of Omega District, the 3rd largest industrial district on Mars. You've recently been fired from your job as an assistant for a small import/export management business. With nothing holding you on Mars, you decide to grab your last bits of money to purchase a starship. After all, you know business very well and you have nothing to lose." + ANSI_RESET + "\n\n");
        input_plr_name();
    }
    static void input_plr_name(){
        Scanner plrName = new Scanner(System.in);
        System.out.print(ANSI_YELLOW + "Please input your player name: " + ANSI_RESET);
        player = plrName.next();
        cm_test();
    }
    static void cm_test(){
        System.out.println(ANSI_YELLOW + "Are you sure your name is " + ANSI_BLUE + player + ANSI_YELLOW + "?\nPlease write YES if you're sure." + ANSI_RED + " You can't change it later." + ANSI_BLUE);
        Scanner askTrue = new Scanner(System.in);
        String rusure = askTrue.nextLine();
        System.out.print(ANSI_RESET);
        if (rusure.equals("YES") || rusure.equals("Yes") || rusure.equals("yes")){

        } else{
            System.out.println("So this wasn't really your name? Well, then ");
            input_plr_name();
        }
    }
}
