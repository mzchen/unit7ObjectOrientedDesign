public class IDCard extends Card
{
    private String idNumber;
    public IDCard(String n, String id)
    {
        super(n);
        idNumber = id;
    }
    public String format()
    {
        String str = super.format() + "\nID number: " + this.idNumber;
        return str;
        
    }
    public boolean equals(Object otherObject)
    {
        if (getClass() == otherObject.getClass())
        {
            IDCard other = (IDCard) otherObject;
            return getName().equals(other.getName())
            && idNumber.equals(other.idNumber);
        }
        return false;
    }
}
