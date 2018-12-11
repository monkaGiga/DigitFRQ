public class digits {
    public digits(int num)
    {
        digitList = new arrayList<Integer>();
        if (num == 0)
        {
            digitList.add(new Integer(0));
        }
        while (num > 0)
        {
            digitList.add(0,new Integer(num % 10));
            num /=10;
        }
    }
    public boolean isStrictlyIncreasing()
    {
        for( int i = 0; i < digitList.size() - 1; i++)
        {
            if(digitList.get(i)<=digitList.get(i-1))
            {
                return false;
            }
        }
        return true;
    }
}
