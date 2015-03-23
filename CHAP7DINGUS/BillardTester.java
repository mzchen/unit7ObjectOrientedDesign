public class BillardTester
{
    public static void main(String[] args)
    {
        DrivingLicense card1 = new DrivingLicense("Jonny Depp", "July 19, 1999");
        CallingCard card2 = new CallingCard("Fat Guy Alfredo Pepperoni", "8473", "66666");
        Billard testingCard = new Billard(card1, card2);
        System.out.println(testingCard.formatCards());
    }
}
