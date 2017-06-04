
public class Transpose {
	
	Integer[][] myArray;
	
	public Transpose(int numRows, int numCols){
		Integer[][] myArray = new Integer[numRows][numCols];
	}
	
	public Integer[][] createPatterned2DArray(int numRows, int numCols){
		
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
	
	public Integer[][] getArray(){
		
		return myArray;
	}
			

}
