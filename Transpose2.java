
public class Transpose2 {
	
	private Integer[][] myArray;
	private int numRows;
	private int numCols;
	
	
	//constructer
	public Transpose2(int rows, int cols){
		numRows = rows;
		numCols = cols;
		myArray = createPatterned2DArray(numRows, numCols);
	}
	
	
	private Integer[][] createPatterned2DArray(int numRows, int numCols){
		
		Integer[][] myArray = new Integer[numRows][numCols];
		
		for(int col = 0; col<numCols; col++){
			
			for(int row = 0; row<numRows; row++){
				myArray[row][col] = 10+numRows*(col+1)+row;
			}
			
			
		}
		return myArray;
				
	}
	
	public void print2DArray(Integer[][] array){
		
		System.out.printf("%-4.4s", array[0][0]);   
		
		
		
	}
	
	public void print2DArrayTransposed(){
		
		
	}
	
	public int getRows(){
		return numRows;
	}
	
	public int getCols(){
		return numCols;
	}
	
	public void print2DArray() {
	    this.print2DArray(myArray);
	}
			

}
