import java.util.*;
public class CDiagonal {
    public void cdiagonal_main(){
        String[] maze_build = {"\uD83E\uDFA0", "\uD83E\uDFA1", "\uD83E\uDFA2", "\uD83E\uDFA3", "\uD83E\uDFA4", "\uD83E\uDFA5", "\uD83E\uDFA6", "\uD83E\uDFA7", "\uD83E\uDFA8", "\uD83E\uDFA9", "\uD83E\uDFAA", "\uD83E\uDFAB", "\uD83E\uDFAC", "\uD83E\uDFAD", "\uD83E\uDFAE", };
        java.util.Random random = new java.util.Random();

        for (int mazeWallsGenerated = 0; mazeWallsGenerated <= 10000; mazeWallsGenerated++) {
            int random_maze = random.nextInt(maze_build.length);
            System.out.print(maze_build[random_maze]);
        }
        System.out.println("\nYour diagonal maze has been created!");
        CakeCLM CLM=new CakeCLM();
        CLM.CLM();
    }
}