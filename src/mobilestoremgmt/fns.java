package mobilestoremgmt;
public class fns 
{
    public String get_YYYYMMDD(String d,String m, String y)
    {
        if(Integer.parseInt(d)<10)
        {
            d="0"+d;
        }
        if(Integer.parseInt(m)<10)
        {
            m="0"+m;
        }
        if(Integer.parseInt(y)<1000)
        {
            y="0"+y;
        }
        else if(Integer.parseInt(y)<100)
        {
            y="00"+y;
        }
        else if(Integer.parseInt(y)<10)
        {
            y="000"+y;
        }
        return y+"-"+m+"-"+d;
    }
    
}
