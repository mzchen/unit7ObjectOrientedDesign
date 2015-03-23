public class ComboLock
{
    int currentNum = 0;
    int num1;
    int num2;
    int num3;
    int unlocked = 3;
    boolean tripleZero = false;
    boolean passSecond = false;
    boolean dontPass= true;
    
    public ComboLock( int secret1, int secret2, int secret3 ) 
    {
        num1 = secret1;
        num2 = secret2;
        num3 = secret3;
        
    }

    public void reset() 
    { 
        this.currentNum = 0;
        this.unlocked = 3;
    }

    public void turnLeft( int ticks ) 
    {
        if(this.currentNum + ticks < 39)
        {
             this.currentNum += ticks;
        } 
        else
        {
            ticks = ticks%40;
            this.currentNum = ticks;
        }
        if((this.currentNum == num2) && (this.unlocked == 2))
        {
            unlocked--;
        }
    }

    public void turnRight( int ticks ) 
    {
        if( ((this.currentNum - ticks)/(-40)) > 3)
        {
            tripleZero = true;
        }
        if(this.currentNum - ticks > 0)
        {
             this.currentNum -= ticks;
        } 
        else
        {
            ticks = ticks%40;
            this.currentNum = 39 - ticks;
        }
        if(this.currentNum == num1 && unlocked == 3 && tripleZero == true)
        {
            unlocked--;
        }
        else
        {
            tripleZero = false;
        }
    }

    public boolean open() 
    { 
        return true;
    }
}