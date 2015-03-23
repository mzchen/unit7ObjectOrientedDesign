public class Billard
{   
    Card cardUno = new Card("a");
    Card cardDos = new Card("b");
    public Billard(Card card1, Card card2)
    {
        cardUno = card1;
        cardDos = card2;
    }
    public void addCard(Card replacement)
    {
        if(cardUno==null)
        {
            cardUno = replacement;
        }
        else
        {
            if(cardDos==null)
            {
                cardDos = replacement;
            }
        }
    }
    public String formatCards()
    {
        String str = cardUno.format() + "\n" + cardDos.format();
        return str;
    }

}
