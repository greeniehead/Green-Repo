public class ArrayUtil
{
	public static void reverseArray(int[] arr)
	{
		int j = 0;
		int[] newArr = new int[arr.length()];
		for(int i = arr.length()-1; i >= 0; i--)
		{
			newArr[j] = arr[i];
			j++;
		}
		int k = 0;
		for(int element : newArr)
		{
			arr[k] = element;
			k++;
		}
	}
	
	
}

public class Matrix
{
	private int[][] mat;
	
	public Matrix(int[][] m)
	{
		mat = m;
	}
	
	public void reverseAllRows()
	{
		for(int[] tempArr : mat)
		{
			reverseArray(tempArr);
		}
	}
	
	public void reverseMatrix()
	{
		reverseAllRows(mat);
		
		int temp = 0;
		int temp2 = 0;
		for(int[] tempArr : mat)
		{
			temp = 0;
			for(int element : tempArr)
			{
				temp++;
			}
			temp2++;
		}
		int row2 = 0;
		int col2 = 0;
		int[][] temp2DArr = new int[temp][temp2];
		for(int row = temp; row >= 0; row--)
		{
			for(int col = 0; col < temp2; col++)
			{
				temp2DArr[row][col] = mat[row2][col2];
				col2++;
			}
			col2 = 0;
			row2++;
		}
		for(int i = 0; i < temp; i++)
		{
			for(int j = 0; j < temp2; j++)
			{
				mat[i][j] = temp2DArr[i][j];
			}
		}
	}
	
}