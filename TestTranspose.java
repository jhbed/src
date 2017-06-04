
public class TestTranspose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Transpose test = new Transpose(3,5);
		
		Integer[][] testArray = test.createPatterned2DArray(3, 5);
		
		System.out.println(testArray[0][3]); //it works!!!
		
		//test.print2DArray(testArray);
		
		
		
		

	}

}
