import java.util.*;
import java.time.*;
import java.time.temporal.*;

public class CakeCLM {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void CmdLoaderModule(){
        System.out.println(ANSI_RED + "CoNsole Command Loader Module\nCakeCLM (c) 2022 Cake Co.\n" + ANSI_WHITE + "Please enter a command." + ANSI_CYAN + " \"help\"" + ANSI_WHITE + " for a list of commands.");
        CLM();
    }
    public static void CLM(){
        String v_CoNsole = "v0.1.2.5c";
        String v_CommandLoaderModule = "v1.400";
        LocalDate compiledDate = LocalDate.of(2022, 10, 18);
        LocalDate today = LocalDate.now();
        long compiledAgoNum = ChronoUnit.DAYS.between(compiledDate, today);
        String compiledAgo = compiledAgoNum + " days ago";
        if(compiledAgoNum < 0){
            compiledAgo = "in the future (Your system time is probably incorrect!)";
        } else if (compiledAgoNum < 1) {
            compiledAgo = "today";
        } else if (compiledAgoNum < 2) {
            compiledAgo = "yesterday";
        }
        Scanner cmdReader = new Scanner(System.in);
        System.out.print(ANSI_YELLOW + "@> " + ANSI_RESET);
        String currentCommand = cmdReader.next();
        // System.out.println("The command you inputted was " + currentCommand);
        if(currentCommand.equals("ver")){
            System.out.println("CakeCLM " + v_CommandLoaderModule);
            CLM();
        } else if (currentCommand.equals("help") || currentCommand.equals("?")) {
            System.out.println("List of commands:");
            System.out.println("  help     - Displays this information.");
            System.out.println("  brief    - Displays advanced usage and description of commands.");
            System.out.println("  ver      - Displays current CLM version.");
            System.out.println("  version  - Displays extended CoNsole and CLM version.");
            System.out.println("  maze     - Creates a maze out of blocks.");
            System.out.println("  diagonal - Creates a maze out of diagonals.");
            System.out.println("  exit     - Exits CoNsole.");
            System.out.println("  matrix   - Act like you're hacking the mainframe or something.");
            CLM();
        } else if (currentCommand.equals("version")) {
            System.out.println("Cake Co. CoNsole " + v_CoNsole);
            System.out.println("Running CakeCLM " + v_CommandLoaderModule);
            System.out.println("Last Compilation: " + compiledDate + " (" + compiledAgo + ")");
            System.out.println("https://cakeco.cakesstuff.xyz/CoNsole");
            CLM();
        } else if (currentCommand.equals("exit") || currentCommand.equals("stop") || currentCommand.equals(".") || currentCommand.equals("-")) {
            System.out.println("Thank you for using CoNsole. Have a nice day");
        } else if (currentCommand.equals("maze")) {
            CMaze cmaze_ini=new CMaze();
            cmaze_ini.cmaze_main();
        } else if (currentCommand.equals("dmaze") || currentCommand.equals("diagonal")) {
            CDiagonal cdiagonal_ini=new CDiagonal();
            cdiagonal_ini.cdiagonal_main();
        } else if (currentCommand.equals("brief") || currentCommand.equals("man")) {
            brief();
        } else if (currentCommand.equals("reset")) {
            System.out.println("Resetting CoNsole..");
            CoNsole resetcon = new CoNsole();
            resetcon.loadCLM();
        } else if (currentCommand.equals("cakemars")){
            CakeMars cmars_play = new CakeMars();
            cmars_play.CakeMarsInit();
        } else if (currentCommand.equals("matrix") || currentCommand.equals("caketrix")) {
            CakeTrix caketrix_ini=new CakeTrix();
            caketrix_ini.caketrix_main();
        } else if (currentCommand.equals("multi")) {
            Multi multi = new Multi();
            multi.multiply();
        } else {
            System.out.println("Command syntax not recognized. Please try again.");
            CLM();
        }
    }
    static void brief(){
        Scanner briefReader = new Scanner(System.in);
        System.out.print("BRIEF:");
        String currentBrief = briefReader.next();
        if(currentBrief.equals("brief")) {
            System.out.println("BRIEF    - CLM Built-In Command");
            System.out.println("Usage: brief");
            System.out.println("Allows you to display advanced information, usage and aliases of CLM commands. Enter \"brief\" into CLM and then input a command you'd like to learn about.");
            System.out.println("Aliases: 'brief' 'man'");
            CLM();
        } else if(currentBrief.equals("ver")) {
            System.out.println("VER      - CLM Built-In Command");
            System.out.println("Usage: ver");
            System.out.println("Displays very basic Command Loader Module version. Also see: VERSION");
            System.out.println("Aliases: 'ver'");
            CLM();
        } else if(currentBrief.equals("version")) {
            System.out.println("VERSION  - CLM Built-In Command");
            System.out.println("Usage: version");
            System.out.println("Displays advanced version information about CLM and CoNsole.");
            System.out.println("Aliases: 'version'");
            CLM();
        } else if(currentBrief.equals("help")) {
            System.out.println("HELP     - CLM Built-In Command");
            System.out.println("Usage: help");
            System.out.println("Lists all system commands and their purpose.");
            System.out.println("Aliases: 'help' '?'");
            CLM();
        } else if(currentBrief.equals("maze")) {
            System.out.println("MAZE     - Add-On Command");
            System.out.println("Usage: maze");
            System.out.println("Draws a random maze out of 10,000 Unicode box characters. This command will flood your screen and might lag on lower-end devices.");
            System.out.println("Aliases: 'maze'");
            CLM();
        } else if(currentBrief.equals("diagonal")) {
            System.out.println("DIAGONAL - Add-On Command");
            System.out.println("Usage: diagonal");
            System.out.println("Draws a random maze out of 10,000 Unicode diagonal characters. This command takes considerably longer to run than 'maze' and likewise will flood your command line and lag on lower-end devices.");
            System.out.println("Aliases: 'diagonal' 'dmaze'");
            CLM();
        } else if(currentBrief.equals("exit")) {
            System.out.println("EXIT     - CLM Built-In Command");
            System.out.println("Usage: exit");
            System.out.println("Exits from Command Loader Module and thus CoNsole to your command line.");
            System.out.println("Aliases: 'exit' 'stop' 'end' '.' '-'");
            CLM();
        } else if(currentBrief.equals("matrix")) {
            System.out.println("MATRIX   - Add-On Command");
            System.out.println("Usage: matrix");
            System.out.println("Spams your screen with green 0s and 1s. *Will not stop*. Crash it manually using Ctrl+C.");
            System.out.println("Aliases: 'matrix' 'caketrix'");
            CLM();
        } else if(currentBrief.equals("multi")) {
            System.out.println("MULTI    - Add-On Command");
            System.out.println("Usage: multi");
            System.out.println("Multiplies a number by an inputted range until it reaches the double limit, and as you might imagine this reaches a very high value quickly. Like, 300-numbers-long-very high.");
            System.out.println("Aliases: 'multi'");
            CLM();
        } else {
          System.out.println("Could not find your command. Please try again");
          brief();
        };
    }
}