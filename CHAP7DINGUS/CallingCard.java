
public class CallingCard extends Card
{
    private String cardNumber;
    private String pinNumber;
    public CallingCard(String n, String pin, String cardNum)
    {
        super(n);
        cardNumber = cardNum;
        pinNumber = pin;
    }
    public String format()
    {
        String str = super.format() + "\nCard Number: " + this.cardNumber + "\nPIN: " + this.pinNumber;
        return str;
    }
    public boolean equals(Object otherObject)
    {
        if (getClass() == otherObject.getClass())
        {
            CallingCard other = (CallingCard) otherObject;
            return getName().equals(other.getName())
            && cardNumber.equals(other.cardNumber) && pinNumber == other.pinNumber;
        }
        return false;
    }
}
