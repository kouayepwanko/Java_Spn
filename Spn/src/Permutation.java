public class Permutation {

    private
     String Text;
     char[] textArr = new char[16];
     char[] finale = new char[16];

    public void getText(String text)
    {
        //   System.out.println("String = :"+text);
        this.Text = text;
          for(int i=0;i<16;i++)
        {
            
            textArr[i] = Text.charAt(i);
        }
        //  System.out.print("Value of :\n");
        //   for(int i=0;i<16;i++)
        // {
            
        //   System.out.print(textArr[i]);
        // }
        // System.out.print("\n");  
    }

    public char[] permute(Table tab){

      
        // System.out.println("outside for loop");
        //  Table tab = new Table();
        //  tab.getText("0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15");
        //  System.out.println("after tab.get");
        //  tab.geth("0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15");

// System.out.print("Text1:\n");
//           for(int i=0;i<16;i++)
//         {
            
//           System.out.print(tab.text1[i]);
//         }
//         System.out.print("\n");


        // System.out.print("Text2:\n");
        //   for(int i=0;i<16;i++)
        // {
            
        //   System.out.print(tab.text2[i]);
        // }
        int p;
      for(int i=0;i<16;i++)
        {
            // for(int j=0;j<16;j++){
        //    System.out.println("Comparing"+ tab.text2[i]+" and"+tab.text1[j]);
                p = tab.wa[i];
                   finale[i] = textArr[p];
            //}
        }

        //  System.out.println("\nReturning Permutation:");
        //     for(int j = 0; j<16;j++)
        //        System.out.print(finale[j]);   
        //        System.out.println("\n");  

        return finale;
    
    }




}
