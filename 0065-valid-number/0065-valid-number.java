class Solution {
    public boolean isNumber(String s)
    {
        boolean num=false, sign=false, dot=false, exp=false;
        int i;
        for(i=0;i<=s.length()-1;i++)
        {
            if(s.charAt(i)>='0' && s.charAt(i)<='9')
            {
                num=true;
            }
            else if(s.charAt(i)=='+' || s.charAt(i)=='-')
            {
                if(dot==true || num==true || sign==true)
                {
                    return false;
                }
                else
                {
                    sign=true;
                }
            }
            else if(s.charAt(i)=='.')
            {
                if(dot==true || exp==true)
                {
                    return false;
                }
                else
                {
                    dot= true;
                }
            }
            else if(s.charAt(i)=='e' || s.charAt(i)=='E')
            {
                if(num==false || i==s.length()-1 || exp==true)
                {
                    return false;
                }
                else
                {
                    num=false;
                    exp=true;
                    dot=false;
                    sign=false;
                }
            }
            else
            {
                return false;
            }
            
        }return num;
        }
}