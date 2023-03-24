



public class Substitution {
    private
    String text;
    int first=0,second=0,third=0,fouth=0;
    char[] one = new char[4];
    char[] two = new char[4];
    char[] three = new char[4];
    char[] four = new char[4];
    char[] textArr = new char[16];
   // char[] first = new char[4];


    public void setSub(String text)
    {
        this.text = text;

    }
    public void sub()
    {

        for (int i =0;i<text.length();i++)
             textArr[i] = text.charAt(i);
        for(int i=0;i<16;i++)
        {
            if(i<4)
            {
                one[i] = textArr[i];
            }
            else if(i < 8)
            {
                two[i-4] = textArr[i];
            }
            else if (i < 12)
            {
                three[i-8] = textArr[i];
            }
            else
            {
                four[i-12] = textArr[i];
            }
        }
        // System.out.println("\nFirst");
        // for(int i =0;i<4;i++)
        //     System.out.print(one[i]);
        // System.out.println("\nSecond");
        // for(int i =0;i<4;i++)
        //     System.out.print(two[i]);
        // System.out.println("\nThird");
        // for(int i =0;i<4;i++)
        //     System.out.print(three[i]);
        // System.out.println("\nfour");
        // for(int i =0;i<4;i++)
        //     System.out.print(four[i]);
        // System.out.println(" ");
    }
    public void found(Table tab)
    {
        for(int i=0;i<4;i++)
        {
            switch (i) {
                case 0: 
                    if (one[i] == '1') first += 8;
                    if (two[i] == '1') second += 8;
                    if (three[i] == '1') third += 8;
                    if (four[i] == '1') fouth += 8;
                      break;
                case 1:  {
                    if (one[i] == '1') first += 4;
                    if (two[i] == '1') second += 4;
                    if (three[i] == '1') third += 4;
                    if (four[i] == '1') fouth += 4;
                    break;
                }
                case 2 : {
                    if (one[i] == '1') first += 2;
                    if (two[i] == '1') second += 2;
                    if (three[i] == '1') third += 2;
                    if (four[i] == '1') fouth += 2;
                    break;
                }
                case 3: {
                    if (one[i] == '1') first += 1;
                    if (two[i] == '1') second += 1;
                    if (three[i] == '1') third += 1;
                    if (four[i] == '1') fouth += 1;
                    break;
                }
            }
        }
        // System.out.println(first+" "+second+" "+third+" "+fouth+" ");
        // for (int i=0;i < 16;i++)
        //     System.out.print(textArr[i]);
        // Table tab = new Table();
        // tab.getText("0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15");
        // // tab.verify();
        // System.out.print(first+" "+second+" "+third+" "+fouth+"\n");
// perform Substitution
        first = Integer.parseInt(tab.test[first]);
        second =Integer.parseInt(tab.test[second]);
        third = Integer.parseInt(tab.test[third]);
        fouth = Integer.parseInt(tab.test[fouth]);
        
        // System.out.println(first+" "+second+" "+third+" "+fouth);
    }


    public char[] convertTobinary()
    {
        switch (first)
        {
           case 1:{
               for(int i=0;i<4;i++)
               {
                   if(i<3)
                       one[i] = '0';
                   else
                       one[i] = '1';
               }
               break;
           }
           case 2 :
                   {
                       for(int i=0;i<4;i++)
                       {
                           if(i != 2)
                               one[i] = '0';
                           else
                               one[i] = '1';
                       }
                       break;
                   }
           case 3:
                   {
                       for(int i=0;i<4;i++)
                       {
                           if(i<2)
                               one[i] = '0';
                           else
                               one[i] = '1';
                       }
                       break;
                   }
           case 4:
                   {
                       for(int i=0;i<4;i++)
                       {
                           if(i!=1)
                               one[i] = '0';
                           else
                               one[i] = '1';
                       }
                       break;
                   }
            case 5 :
                    {
                        for(int i=0;i<4;i++)
                        {
                            if(i==1 || i == 3)
                                one[i] = '1';
                            else
                                one[i] = '0';
                        }
                        break;
                    }
           case 6 :
                   {
                       for(int i=0;i<4;i++)
                       {
                           if(i == 1 || i== 2)
                               one[i] = '1';
                           else
                               one[i] = '0';
                       }
                       break;
                   }
           case 7:
                   {
                       for(int i=0;i<4;i++)
                       {
                           if(i<1)
                               one[i] = '0';
                           else
                               one[i] = '1';
                       }
                       break;
                   }
           case 8 :
                   {
                       for(int i=0;i<4;i++)
                       {
                           if(i>0)
                               one[i] = '0';
                           else
                               one[i] = '1';
                       }
                       break;
                   }
           case 9:
                   {
                       for(int i=0;i<4;i++)
                       {
                           if(i == 0 || i== 3)
                               one[i] = '1';
                           else
                               one[i] = '0';
                       }
                       break;
                   }
           case 10:
                   {
                       for(int i=0;i<4;i++)
                       {
                           if(i== 0 || i == 2)
                               one[i] = '1';
                           else
                               one[i] = '0';
                       }
                       break;
                   }
           case 11:
                   {
                       for(int i=0;i<4;i++)
                       {
                           if(i == 1)
                               one[i] = '0';
                           else
                               one[i] = '1';
                       }
                       break;
                   }
           case 12:
                   {
                       for(int i=0;i<4;i++)
                       {
                           if(i>1)
                               one[i] = '0';
                           else
                               one[i] = '1';
                       }
                       break;
                   }
           case 13 :
                   {
                       for(int i=0;i<4;i++)
                       {
                           if(i == 2)
                               one[i] = '0';
                           else
                               one[i] = '1';
                       }
                       break;
                   }
           case 14:
                   {
                       for(int i=0;i<4;i++)
                       {
                           if(i==3)
                               one[i] = '0';
                           else
                               one[i] = '1';
                       }
                       break;
                   }
           case 15 :
                   {
                       for(int i=0;i<4;i++)
                       {
                               one[i] = '1';
                       }
                       break;
                   }
        }

        switch (second)
        {



            case 1 :{
                for(int i=0;i<4;i++)
                {
                    if(i<3)
                        two[i] = '0';
                    else
                        two[i] = '1';
                }
                break;
            }
            case 2:
                    {
                        for(int i=0;i<4;i++)
                        {
                            if(i != 2)
                                two[i] = '0';
                            else
                                two[i] = '1';
                        }
                        break;
                    }
            case 3:
                    {
                        for(int i=0;i<4;i++)
                        {
                            if(i<2)
                                two[i] = '0';
                            else
                                two[i] = '1';
                        }
                        break;
                    }
            case 4:
                    {
                        for(int i=0;i<4;i++)
                        {
                            if(i!=1)
                                two[i] = '0';
                            else
                                two[i] = '1';
                        }
                        break;
                    }
            case 5:
                    {
                        for(int i=0;i<4;i++)
                        {
                            if(i==1 || i == 3)
                                two[i] = '1';
                            else
                                two[i] = '0';
                        }
                        break;
                    }
            case 6:
                    {
                        for(int i=0;i<4;i++)
                        {
                            if(i == 1 || i== 2)
                                two[i] = '1';
                            else
                                two[i] = '0';
                        }
                        break;
                    }
            case 7 :
                    {
                        for(int i=0;i<4;i++)
                        {
                            if(i<1)
                                two[i] = '0';
                            else
                                two[i] = '1';
                        }
                        break;
                    }
            case 8:
                    {
                        for(int i=0;i<4;i++)
                        {
                            if(i>0)
                                two[i] = '0';
                            else
                                two[i] = '1';
                        }
                        break;
                    }
            case 9:
                    {
                        for(int i=0;i<4;i++)
                        {
                            if(i == 0 || i== 3)
                                two[i] = '1';
                            else
                                two[i] = '0';
                        }
                        break;
                    }
            case 10:
                    {
                        for(int i=0;i<4;i++)
                        {
                            if(i== 0 || i == 2)
                                two[i] = '1';
                            else
                                two[i] = '0';
                        }
                        break;
                    }
            case 11 :
                    {
                        for(int i=0;i<4;i++)
                        {
                            if(i == 1)
                                two[i] = '0';
                            else
                                two[i] = '1';
                        }
                        break;
                    }
            case 12 :
                    {
                        for(int i=0;i<4;i++)
                        {
                            if(i>1)
                                two[i] = '0';
                            else
                                two[i] = '1';
                        }
                        break;
                    }
            case 13:
                    {
                        for(int i=0;i<4;i++)
                        {
                            if(i == 2)
                                two[i] = '0';
                            else
                                two[i] = '1';
                        }
                        break;
                    }
            case 14:
                    {
                        for(int i=0;i<4;i++)
                        {
                            if(i==3)
                                two[i] = '0';
                            else
                                two[i] = '1';
                        }
                        break;
                    }
            case 15 :
                    {
                        for(int i=0;i<4;i++)
                        {
                            two[i] = '1';
                        }
                        break;
                    }
        }


        switch (third)

        {

            case 1:{
                for(int i=0;i<4;i++)
                {
                    if(i<3)
                        three[i] = '0';
                    else
                        three[i] = '1';
                }
                break;
            }
            case 2:
                    {
                        for(int i=0;i<4;i++)
                        {
                            if(i != 2)
                                three[i] = '0';
                            else
                                three[i] = '1';
                        }
                        break;
                    }
            case 3:
                    {
                        for(int i=0;i<4;i++)
                        {
                            if(i<2)
                                three[i] = '0';
                            else
                                three[i] = '1';
                        }
                        break;
                    }
            case 4:
                    {
                        for(int i=0;i<4;i++)
                        {
                            if(i!=1)
                                three[i] = '0';
                            else
                                three[i] = '1';
                        }
                        break;
                    }
            case 5 :
                    {
                        for(int i=0;i<4;i++)
                        {
                            if(i==1 || i == 3)
                                three[i] = '1';
                            else
                                three[i] = '0';
                        }
                        break;
                    }
            case 6:
                    {
                        for(int i=0;i<4;i++)
                        {
                            if(i == 1 || i== 2)
                                three[i] = '1';
                            else
                                three[i] = '0';
                        }
                        break;
                    }
            case 7:
                    {
                        for(int i=0;i<4;i++)
                        {
                            if(i<1)
                                three[i] = '0';
                            else
                                three[i] = '1';
                        }
                        break;
                    }
            case 8:
                    {
                        for(int i=0;i<4;i++)
                        {
                            if(i>0)
                                three[i] = '0';
                            else
                                three[i] = '1';
                        }
                        break;
                    }
            case 9 :
                    {
                        for(int i=0;i<4;i++)
                        {
                            if(i == 0 || i== 3)
                                three[i] = '1';
                            else
                                three[i] = '0';
                        }
                        break;
                    }
            case 10 :
                    {
                        for(int i=0;i<4;i++)
                        {
                            if( i == 0 || i == 2)
                                three[i] = '1';
                            else
                                three[i] = '0';
                        }
                        break;
                    }
            case 11 :
                    {
                        for(int i=0;i<4;i++)
                        {
                            if(i == 1)
                                three[i] = '0';
                            else
                                three[i] = '1';
                        }
                        break;
                    }
            case 12 :
                    {
                        for(int i=0;i<4;i++)
                        {
                            if(i>1)
                                three[i] = '0';
                            else
                                three[i] = '1';
                        }
                        break;
                    }
            case 13 :
                    {
                        for(int i=0;i<4;i++)
                        {
                            if(i == 2)
                                three[i] = '0';
                            else
                                three[i] = '1';
                        }
                        break;
                    }
            case 14 :
                    {
                        for(int i=0;i<4;i++)
                        {
                            if(i==3)
                                three[i] = '0';
                            else
                                three[i] = '1';
                        }
                        break;
                    }
            case 15 :
                    {
                        for(int i=0;i<4;i++)
                        {
                            three[i] = '1';
                        }
                        break;
                    }
        }
        switch (fouth){
            case 1 :{
                for(int i=0;i<4;i++)
                {
                    if(i<3)
                        four[i] = '0';
                    else
                        four[i] = '1';
                }
                break;
            }
            case 2:
                    {
                        for(int i=0;i<4;i++)
                        {
                            if(i != 2)
                                four[i] = '0';
                            else
                                four[i] = '1';
                        }
                        break;
                    }
            case 3:
                    {
                        for(int i=0;i<4;i++)
                        {
                            if(i<2)
                                four[i] = '0';
                            else
                                four[i] = '1';
                        }
                        break;
                    }
            case 4:
                    {
                        for(int i=0;i<4;i++)
                        {
                            if(i!=1)
                                four[i] = '0';
                            else
                                four[i] = '1';
                        }
                        break;
                    }
            case 5 :
                    {
                        for(int i=0;i<4;i++)
                        {
                            if(i==1 || i == 3)
                                four[i] = '1';
                            else
                                four[i] = '0';
                        }
                        break;
                    }
            case 6 :
                    {
                        for(int i=0;i<4;i++)
                        {
                            if(i == 1 || i== 2)
                                four[i] = '1';
                            else
                                four[i] = '0';
                        }
                        break;
                    }
            case 7:
                    {
                        for(int i=0;i<4;i++)
                        {
                            if(i<1)
                                four[i] = '0';
                            else
                                four[i] = '1';
                        }
                        break;
                    }
            case 8 :
                    {
                        for(int i=0;i<4;i++)
                        {
                            if(i>0)
                                four[i] = '0';
                            else
                                four[i] = '1';
                        }
                        break;
                    }
            case 9 :
                    {
                        for(int i=0;i<4;i++)
                        {
                            if(i == 0 || i== 3)
                                four[i] = '1';
                            else
                                four[i] = '0';
                        }
                        break;
                    }
            case 10 :
                    {
                        for(int i=0;i<4;i++)
                        {
                            if( i == 0 || i == 2)
                                four[i] = '1';
                            else
                                four[i] = '0';
                        }
                        break;
                    }
            case 11 :
                    {
                        for(int i=0;i<4;i++)
                        {
                            if(i == 1)
                                four[i] = '0';
                            else
                                four[i] = '1';
                        }
                        break;
                    }
            case 12 :
                    {
                        for(int i=0;i<4;i++)
                        {
                            if(i>1)
                                four[i] = '0';
                            else
                                four[i] = '1';
                        }
                        break;
                    }
            case 13 :
                    {
                        for(int i=0;i<4;i++)
                        {
                            if(i == 2)
                                four[i] = '0';
                            else
                                four[i] = '1';
                        }
                        break;
                    }
            case 14 :
                    {
                        for(int i=0;i<4;i++)
                        {
                            if(i>2)
                                four[i] = '0';
                            else
                                four[i] = '1';
                        }
                        break;
                    }
            case 15 :
                    {
                        for(int i=0;i<4;i++)
                        {
                            four[i] = '1';
                        }
                        break;
                    }


        }
        char[] finalArrSub = new char[16];
        //  System.out.println("first");
      for (int i=0;i<4;i++)
      {
        //    System.out.print(one[i]);
          finalArrSub[i] = one[i];
      }
        //  System.out.println("Second\n");
        for (int i=0;i<4;i++)
        {
            //  System.out.print(two[i]);
            finalArrSub[i+4] = two[i];
        }
        //  System.out.println("third\n");
        for (int i=0;i<4;i++)
        {
            //  System.out.print(three[i]);
            finalArrSub[i+8] = three[i];
        }
        //  System.out.println("fouth");
        for (int i=0;i<4;i++)
        {
            //  System.out.print(four[i]);
            finalArrSub[i+12] = four[i];
        }
        first=0;second=0;third=0;fouth=0;


//   System.out.println("\nReturning Sub");
//             for(int m = 0; m<16;m++)
//                System.out.print(finalArrSub[m]);   
//                System.out.println("\n");   


          return  finalArrSub;
        }


    }
