public class RouteKey
{
   private
     String text;
     int key;
     char[] ArrKey = new char[16];

  public RouteKey()
  {}

  public char[] DoRoute(String text, int n)
  {
     this.text = text;
     this.key = n;
      int j=0;
      int p=0;
       for(int i=key; i<16;++i)
       {
           ArrKey[j] = text.charAt(i);
           j++;
           p=j;
       }

       for(int i =0;i<key;++i)
       {
            ArrKey[p] = text.charAt(i);
            p++;
       }
      //   System.out.println("\nReturning KeyRoute:");
      //       for(int m = 0; m<16;m++)
      //          System.out.print(ArrKey[m]);   
      //          System.out.println("\n");  

       return ArrKey;
  }


}