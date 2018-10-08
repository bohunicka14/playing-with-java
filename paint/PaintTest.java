import org.junit.Assert;
import org.junit.Test;

public class PaintTest {

	@Test
	public void test() {
		
		Paint testInstance = new Paint();
		
		//************************************TEST1************************************
		
		int[][] screen1 = {
				{0,4,0,0,0,2,0,0,0,0,0,0,1},
				{0,4,0,0,0,2,0,0,0,0,0,0,1},
				{0,4,0,0,0,2,7,7,7,7,7,7,1},
				{0,4,0,0,0,2,0,0,0,0,0,0,1},
				{0,4,0,0,0,3,0,0,0,0,0,0,1},
				{0,4,3,3,3,0,0,0,0,0,0,0,1},
				{0,0,0,0,8,0,0,0,0,0,0,0,1}
		};
		
		int[][] expectedResult1 = {
				{0,4,5,5,5,2,0,0,0,0,0,0,1},
				{0,4,5,5,5,2,0,0,0,0,0,0,1},
				{0,4,5,5,5,2,7,7,7,7,7,7,1},
				{0,4,5,5,5,2,0,0,0,0,0,0,1},
				{0,4,5,5,5,3,0,0,0,0,0,0,1},
				{0,4,3,3,3,0,0,0,0,0,0,0,1},
				{0,0,0,0,8,0,0,0,0,0,0,0,1}
		};
		
		
		int[][] result1 = testInstance.fill(screen1, 1, 2, 5);
		Assert.assertArrayEquals( expectedResult1, result1);
		
		//************************************TEST2************************************
		
		int[][] screen2 = {
				{0,4,0,0,0,2,0,0,0,0,0,0,1},
				{0,4,0,0,0,2,0,0,0,0,0,0,1},
				{0,4,0,0,0,2,7,7,7,7,7,7,1},
				{0,4,0,0,0,2,0,0,0,0,0,0,1},
				{0,4,0,0,0,3,0,0,0,0,0,0,1},
				{0,4,3,3,3,0,0,0,0,0,0,0,1},
				{0,0,0,0,8,0,0,0,0,0,0,0,1}
		};
		
		int[][] expectedResult2 = {
				{0,5,0,0,0,2,0,0,0,0,0,0,1},
				{0,5,0,0,0,2,0,0,0,0,0,0,1},
				{0,5,0,0,0,2,7,7,7,7,7,7,1},
				{0,5,0,0,0,2,0,0,0,0,0,0,1},
				{0,5,0,0,0,3,0,0,0,0,0,0,1},
				{0,5,3,3,3,0,0,0,0,0,0,0,1},
				{0,0,0,0,8,0,0,0,0,0,0,0,1}
		};
		
		int[][] result2 = testInstance.fill(screen2, 1, 1, 5);
		Assert.assertArrayEquals( expectedResult2, result2);
		
		//************************************TEST3************************************
		
				int[][] screen3 = {
						{0,4,0,0,0,2,0,0,0,0,0,0,1},
						{0,4,0,0,0,2,0,0,0,0,0,0,1},
						{0,4,0,0,0,2,7,7,7,7,7,7,1},
						{0,4,0,0,0,2,0,0,0,0,0,0,1},
						{0,4,0,0,0,3,0,0,0,0,0,0,1},
						{0,4,3,3,3,0,0,0,0,0,0,0,1},
						{0,0,0,0,8,0,0,0,0,0,0,0,1}
				};
				
				int[][] expectedResult3 = {
						{0,4,0,0,0,5,0,0,0,0,0,0,1},
						{0,4,0,0,0,5,0,0,0,0,0,0,1},
						{0,4,0,0,0,5,7,7,7,7,7,7,1},
						{0,4,0,0,0,5,0,0,0,0,0,0,1},
						{0,4,0,0,0,3,0,0,0,0,0,0,1},
						{0,4,3,3,3,0,0,0,0,0,0,0,1},
						{0,0,0,0,8,0,0,0,0,0,0,0,1}
				};
				
				int[][] result3 = testInstance.fill(screen3, 2, 5, 5);
				Assert.assertArrayEquals( expectedResult3, result3);
		
	}

}
