import java.util.Arrays;

/*
  This short program performs flood fill function on simple array
 */

public class Paint {

	public static void main(String[] args) {
		int[][] screen = {
				{0,4,0,0,0,2,0,0,0,0,0,0,1},
				{0,4,0,0,0,2,0,0,0,0,0,0,1},
				{0,4,0,0,0,2,7,7,7,7,7,7,1},
				{0,4,0,0,0,2,0,0,0,0,0,0,1},
				{0,4,0,0,0,3,0,0,0,0,0,0,1},
				{0,4,3,3,3,0,0,0,0,0,0,0,1},
				{0,0,0,0,8,0,0,0,0,0,0,0,1}};
		
		fill(screen, 1, 2, 5);
		for (int i = 0; i < screen.length; i++){
			System.out.println(Arrays.toString(screen[i]));
		}
		
		

	}
	
public static void fillRecursive(int[][] screen, int row, int col, int color, int originColor){
		// Change color at this point of screen
		screen[row][col] = color;
	
		//move up
		if (row - 1 >= 0){
			// check conditions: we don't want to move out of screen 
			if (screen[row - 1][col] == originColor){
				fill(screen, row - 1, col, color);
			}
		}
		//move down
		if (row + 1 < screen.length){
			if (screen[row + 1][col] == originColor){
				fill(screen, row + 1, col, color);
			}
		}
		
		//move left
		if (col - 1 >= 0){
			if (screen[row][col - 1] == originColor){
				fill(screen, row, col - 1, color);
			}
		}
		
		//move right
		if (col + 1 < screen[row].length){
			if (screen[row][col + 1] == originColor){
				fill(screen, row, col + 1, color);
			}
		}
	}
	
	public static int[][] fill(int[][] screen, int row, int col, int color){
		
		// First I need to know the original color that will be replaced with the new one
		int originColor = screen[row][col];
		
		// And then recursively changing the color in 4 directions
		fillRecursive(screen, row, col, color, originColor);
		
		// Finally return changed array - screen
		return screen;
	}

}
