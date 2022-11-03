import java.util.*;
public class CMaze {
    public void cmaze_main(){
        String[] maze_build = {"\u2580", "\u2584", "\u2588", "\u258C", "\u2590", "\u2596", "\u2597", "\u2598", "\u2599", "\u259A", "\u259B", "\u259C", "\u259D", "\u259E", "\u259F"};
        java.util.Random random = new java.util.Random();

        for (int mazeWallsGenerated = 0; mazeWallsGenerated <= 10000; mazeWallsGenerated++) {
            int random_maze = random.nextInt(maze_build.length);
            System.out.print(maze_build[random_maze]);
        }
        System.out.println("\nYour maze has been created!");
        CakeCLM CLM=new CakeCLM();
        CLM.CLM();
    }
}
