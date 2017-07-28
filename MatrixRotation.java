import java.util.*;
class MatrixRotation {
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=0;
		System.out.println("enter n");
		if(s.hasNextInt()) {
			n= s.nextInt();
		}
		
		System.out.println("Enter matrix values");
		int matrix[][]= new int[5][5];
		for(int i=0;i<n;i++){
			
			for(int j=0;j<n;j++){
				if(s.hasNextInt()){
					matrix[i][j]=s.nextInt();
				}
				
				
			}
		}
		rotateMatrix(matrix);
		
	}
	
		
		public static void rotateMatrix(int[][] matrix) {
		      int n = matrix.length;
		      int half = n / 2;

		      for (int layer = 0; layer < half; layer++) {
		          int first = layer;
		          int last = n - 1 - layer;

		          for (int i = first; i < last; i++) {
		              int offset = i - first;
		              int j = last - offset;
		              int top = matrix[first][i]; // save top

		              // left -> top
		              matrix[first][i] = matrix[j][first];          

		              // bottom -> left
		              matrix[j][first] = matrix[last][j]; 

		              // right -> bottom
		              matrix[last][j] = matrix[i][last]; 

		              // top -> right
		              matrix[i][last] = top; // right <- saved top
		          }
		      }
			  for(int[] i:matrix){
				  System.out.println(Arrays.toString(i));
			  	
			  }
			
			} 
}