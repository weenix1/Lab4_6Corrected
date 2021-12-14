
/**
 * Write a description of class Location here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Location 
{
    // instance variables - replace the example below with your own
    private String location;
    private double longitude;
    private double latitude;
    /**
     * Constructor for objects of class Location
     */
    public Location(String location, double latitude, double longitude) {
        this.location = location;
        this.latitude  = latitude;
        this.longitude = longitude;
    }

    public double distanceTo(Location that) {
        double STATUTE_MILES_PER_NAUTICAL_MILE = 1.15077945;
        double lat1 = Math.toRadians(this.latitude);
        double lon1 = Math.toRadians(this.longitude);
        double lat2 = Math.toRadians(that.latitude);
        double lon2 = Math.toRadians(that.longitude);
        // great circle distance in radians, using law of cosines formula
        double angle = Math.acos(Math.sin(lat1) * Math.sin(lat2)
                               + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));

        // each degree on a great circle of Earth is 60 nautical miles
        double nauticalMiles = 60 * Math.toDegrees(angle);
        double statuteMiles = STATUTE_MILES_PER_NAUTICAL_MILE * nauticalMiles;
        return statuteMiles;
    }
    
    // return string representation of this point
    //@Override
    public void update(Object location){
        this.setLocation((String) location);
        
    }
    
    public String toString() {
        return location + " (" + latitude + ", " + longitude + ")";
    }
    
    //@Override
    public void getLocation(){
         Location loc1 = new Location("LivingRoom",+ 40.366633, 74.640832);
        Location loc2 = new Location("Bedroom",  +  42.443087, 76.488707);  
        double distance = loc1.distanceTo(loc2);
        System.out.printf("%6.3f miles from", + distance);
        System.out.println(loc1 + " to " + loc2);
    }
    
     public void setLocation(String Location){
        this.location = location;
        
    }
    
}
