class computer
{

  public void mymusic()
  {
     System.out.println("music is playing");
  }
  public  String getmepen(int cost)
  {
    if(cost>=10)
       return "pen";
    else
       return "nothing";
  }
}


public class back
{
public static void main(String[] args)
{
  computer comp=new computer();
  comp.mymusic();
  String str=comp.getmepen(2 );
  System.out.println(str);
}
}