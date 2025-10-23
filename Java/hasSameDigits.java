class Solution
{
    public boolean hasSameDigits(String s)
    {
        int[] res=new int[s.length()];
        for(int i=0;i<res.length;i++)
            res[i]=s.charAt(i)-'0';
        
        for(int i=0;i<res.length-2;i++)
        {
            int prev=res[i];
            for(int j=i;j<res.length-1;j++)
            {
                int temp=res[j+1];
                res[j+1]=(res[j+1]+prev)%10;
                prev=temp;
            }
        }

        return res[res.length-1]==res[res.length-2];
    }
}
