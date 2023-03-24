public class Table
{
    private
    String te = "0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15";
    String[] h = te.split(" ");
    char[] text1 = new char[16];
    char[] text2 = new char[16];
   
   int[] wa = new int[100];
   
    
    String text;
    String tem;
    char[] textArr = new char[16];
    String[] test = null;
    String[] toto = null;

    public void getText(String te){
        // System.out.println("Enter getText");
    	this.text = te;
        this.test = text.split(" ");
        // System.out.println("Enter String is");
        for( int i =0;i<test.length;i++)
        {
           wa[i] = Integer.parseInt(test[i]);
        }
        int p=0;
       
        
        //text1[l] = text.charAt(l);

       
      // System.out.println("End getText");
    
    }
   public void geth(String g)
   {
       int i=0;
       text2[i++] = '0';
       text2[i++] = '1';
       text2[i++] = '2';
       text2[i++] = '3';
       text2[i++] = '4';
       text2[i++] = '5';
       text2[i++] = '6';
       text2[i++] = '7';
       text2[i++] = '8';
       text2[i++] = '9';
      
       text2[i++] = '1'+11;
       text2[i++] = '1'+12;
       text2[i++] = '1'+13;
       text2[i++] = '1'+14;
       text2[i++] = '1'+15;
       

    //    text2[2] = '1'+'5';
   
    //  for (int l=0;l<16;l++){
            
    //         text2[l] = (char)(l);
    //         //  text2[l] = g.charAt(l);
    //        }
   }

   public int verify()
   {
       int k=0;
       int y;
       try {
           for ( y = 0; y < test.length;++y){
            
                if(test.length > 16 || test.length < 15)
                {
                    System.out.println("Count Error");
                    return 0;
                }
               for (int j=0;j<16;j++){
                //  System.out.println(Integer.parseInt(test[y])+"compared with"+" "+j);
                   for (int h=0;h<y;h++)
                       if (Integer.parseInt(test[y]) == h)
                       {
                           System.out.println("Duplicate values");
                           return 0;
                       }
                   else if (Integer.parseInt(test[y]) > 15 || Integer.parseInt(test[y]) < 0)
                       {
                           System.out.println("invalid value "+Integer.parseInt(test[y]));
                           return 0;
                       }
                   if(Integer.parseInt(test[y]) == j)
                       k++;
               }

            }
               if(k!=16)
               {
                // System.out.println("Different "+k);
                   return 0;

               }
               else
                  return 1;
          




       }
       catch (Exception e)
       {
           System.out.println("Enter CAtch exception...");
           return 0;
       }
    
   }


}
