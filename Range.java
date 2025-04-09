public class Range implements NumberGroup
{
    private int lowNum = 0;
    private int highNum = 0;

    public Range(int int1, int int2)
    {
        lowNum = int1;
        highNum = int2;
    }

    public void populate()
    {
        int eachVal = 0;

        for(int i = lowNum; i <= highNum; i++)
        {
            eachVal = i;
        }
    }


}
