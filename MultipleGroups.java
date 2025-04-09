public class MultipleGroups implements NumberGroup
{
    private List<NumberGroup> groupList;

    private static boolean contains(int otherInt)
    {
        for(NumberGroup kevin :groupList)
        {
            if(otherInt >= int1 && otherInt <= int2)
                return true;
            return false;
        }
    }
}
