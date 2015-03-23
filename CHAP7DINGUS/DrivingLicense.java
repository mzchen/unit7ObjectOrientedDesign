
/**
 * Write a description of class DrivingLicense here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrivingLicense extends Card
{
    private String expiring;
    public DrivingLicense(String n, String expiDate)
    {
        super(n);
        expiring = expiDate;
    }
    public String format()
    {
        String str = super.format() + "\nExpiration date: " + this.expiring;
        return str;
    }
    public boolean equals(Object otherObject)
    {
        if (getClass() == otherObject.getClass())
        {
            DrivingLicense other = (DrivingLicense) otherObject;
            return getName().equals(other.getName())
            && expiring.equals(other.expiring);
        }
        return false;
    }
}
