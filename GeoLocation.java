
public class GeoLocation {
	
	private final double EARTH_RADIUS_MILES = 3963.1676;
	private double latitude;
	private double longitude;
	
	//constructor 1
	public GeoLocation(){
		latitude = 0;
		longitude = 0;
	}
	
	//constructor 2
	public GeoLocation(double lat, double lon){
		latitude = lat;
		longitude = lon;
	}
	
	public void setLatitude(double lat){
		latitude = lat;
	}
	
	public void setLongitude(double lon){
		longitude = lon;
	}
	
	public double getLongitude(){
		return longitude;
	}
	
	public double getLatitude(){
		return latitude;
	}
	
	
	public double distanceFrom(GeoLocation x){
		
		double lat1 = Math.toRadians(this.getLatitude());
		double long1 = Math.toRadians(this.getLongitude());
		double lat2 = Math.toRadians(x.getLatitude());
		double long2 = Math.toRadians(x.getLongitude());
		
		double theCos = Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(long1 - long2);
	    double arcLength = Math.acos(theCos);
	    
	    return arcLength * EARTH_RADIUS_MILES;
	}
	

}
