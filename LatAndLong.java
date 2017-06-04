import java.util.Arrays;

public class LatAndLong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Double[] latitude = {48.858093, -3.070000, 27.173891, 51.501476, -22.9519};
		Double[] longitude = {2.294694, 37.349998, 78.042068, -0.140634, -43.2104};
		
		printArrays(latitude, longitude);
		
		
		double x = distanceFrom(latitude[1],longitude[1], latitude[3], longitude[3]);
		System.out.println();
		System.out.println("Distance in kilometers: " + x);
		System.out.println();
		
		Arrays.sort(latitude);
		
		printArrays(latitude, longitude);
		
		

	}
	
	
	
	
	public static String getIdentificationString(){
		
		
		return "Program 2, Carter Watson";
	}
	
	public static void  printArrays(Double[] array1, Double[] array2){
		
		for(int i=0; i<5; i++){
			System.out.format("%10.6f\t%10.6f\n", array1[i], array2[i]);
		}
		
		
	}
	
	 //Using The Law Of Cosines To Determine Distance

    /**
     * Returns the distance in miles between this geo location and the given
     * other geo location
     */
    public static double distanceFrom(double x1, double y1, double x2, double y2) {
    	final double EARTH_RADIUS_KM = 6371;
        double lat1 = Math.toRadians(x1);
        double long1 = Math.toRadians(y1);
        double lat2 = Math.toRadians(x2);
        double long2 = Math.toRadians(y2);
        // apply the spherical law of cosines with a triangle composed of the
        // two locations and the north pole
        double theCos = Math.sin(lat1) * Math.sin(lat2) +
            Math.cos(lat1) * Math.cos(lat2) * Math.cos(long1 - long2);
        double arcLength = Math.acos(theCos);
        return arcLength * EARTH_RADIUS_KM;
    }


    //where class member variable `public static final double EARTH_RADIUS_KM = 6371;`

}


