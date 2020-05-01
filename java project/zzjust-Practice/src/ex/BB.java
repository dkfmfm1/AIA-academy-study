package ex;

public class BB {
	


	public static void addOneDArr(int[][] arr, int add) {

		  for (int i = 0; i < arr.length; i++)
		   for (int j = 0; j < arr[i].length; j++) {
		    arr[i][j] += add;
		    System.out.print(arr[i][j]+"\t");
		   }
		 System.out.println();
	}
}

		