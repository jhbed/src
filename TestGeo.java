
public class TestGeo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GeoLocation loc1 = new GeoLocation();
		GeoLocation loc2 = new GeoLocation(200,500);
		
		loc1.setLatitude(700);
		loc1.setLongitude(1000);
		
		System.out.println(loc1.distanceFrom(loc2));
		System.out.println(loc2.distanceFrom(loc1));
		
		
		

	}

}
