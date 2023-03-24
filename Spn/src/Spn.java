// import javax.lang.model.util.ElementScanner6;

import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Spn extends JFrame implements ActionListener {
  String text1;
    JLabel l1,l2,l3,l4,l5;
    JTextField t1,t2,t3,t4,t5;
    JButton b1;
    public Spn()
    {
        super("Spn");
        setBounds(350, 50, 500,600);
        l1 = new JLabel("PlainText");
        l2 = new JLabel("Key");
       
        l3 = new JLabel("SupTab");
        l4 = new JLabel("Value of N");
        l5 = new JLabel("Key-Routes");
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        t3 = new JTextField(20);
        t4 = new JTextField(20);
        t5 = new JTextField(20);
        JButton b1 ;
        b1 = new JButton("Encrypt");
        setLayout(new FlowLayout(FlowLayout.CENTER, 150, 10));
      //  b1.setBackground(Color.blue);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(l5);
        add(t5);

        add(b1);
        b1.addActionListener(this);
        setVisible(true);

    }
  public int ver(String one)
  {
      if(one.length() != 16){
       return 0;}
      else
      {
        char PlainArr[] = new char[16];
        for(int i=0;i<one.length();i++)
        {
            PlainArr[i] = one.charAt(i);
        }
        for(int l=0;l<16;l++)
        {
             if(PlainArr[l] != '1' )
                {
                // System.out.println(PlainArr[l]+" is different from one");
                   if(PlainArr[l] != '0')
                   {
                    // System.out.println(PlainArr[l]+" is different from 0");
                    return 0;
                   }
                    
                }       
        }

      }
    return 1;
  }
    @Override
    public void actionPerformed(ActionEvent e) {
    //    JOptionPane.showMessageDialog(this, "clicked...");
    String plain = t1.getText();
    String keyRoute = t5.getText();
    int indexFinalKeyRoute=0;
    String ArrSup = t3.getText();
    char[] keyRouteArr = new char[20];
    for(int i=0;i<keyRoute.length();i++)
         keyRouteArr[i] = keyRoute.charAt(i);
     int countKey=0;
     for(int i=0;i<keyRoute.length();i++)
          if(keyRouteArr[i] != ' ')
               countKey++;
            
    char[] finalKeyRoute = new char[countKey];
    for(int i=0;i<keyRouteArr.length;i++){
           if(indexFinalKeyRoute < countKey){
           
            if(keyRouteArr[i] != ' '){
         
                  finalKeyRoute[indexFinalKeyRoute] = keyRouteArr[i];
                  indexFinalKeyRoute++;
                      
                }
           }
    
}
     for(int i=0;i<indexFinalKeyRoute;i++)
         if(Character.isLetter(finalKeyRoute[i]))
         JOptionPane.showMessageDialog(this,"Letter are forniden in key-Route");


    int indexPlain = ver(plain);
    int key=0;
    int indexKey = ver(t2.getText());
    int n=0;
    char[] KeyWorking = new char[16];
    try{
     n = Integer.parseInt(t4.getText());
    }
    catch(Exception ex){
        JOptionPane.showMessageDialog(this,"The value of N "+n+" is not valid"); 
        return;
    }
   
    if(indexPlain == 0)
    JOptionPane.showMessageDialog(this, plain+"  is not a valid input");
    else if(indexKey == 0)
    {
        JOptionPane.showMessageDialog(this, t2.getText()+"  the Key is not a valid input");
    }
    else if(n <= 0)
    {
        JOptionPane.showMessageDialog(this,"The value of N "+n+" is not valid");
        System.out.println(n);
    }
    else if(indexFinalKeyRoute != n)
    {
         JOptionPane.showMessageDialog(this,"Key-Route Does not Match the value of N");
        // System.out.println(keyRoute.length());
    }
    else
    { // 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
        Table tab = new Table();
        // System.out.println("Enter else");
        String text = t3.getText();
        // System.out.println(text);
        tab.getText(text);
        // System.out.println("After atsub");
        int verTab =  tab.verify();
        tab.geth("0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15");
        // System.out.println("Enter ver");
        // System.out.println("Out getText");
        if(verTab == 0)
        {
            JOptionPane.showMessageDialog(this,"Fiels SupTab is invalid");
            return;
        }
        else
        {
            int count = 0;
            String keyString = t2.getText();

             // start the Encryption
           indexFinalKeyRoute=0;
           int num =0;
           key = Character.getNumericValue(finalKeyRoute[indexFinalKeyRoute++]);
           RouteKey rK = new RouteKey();

           KeyWorking = rK.DoRoute(t2.getText(),key);

//  System.out.println("\n Key route"+key+":");
//               for(int g=0;g<16;++g)
//               System.out.print(KeyWorking[g]);
//               System.out.println("\n");


           Xore xor = new Xore();
           xor.setKey(String.valueOf(KeyWorking));
           xor.setText(t1.getText());
           char[] finalXor = new char[16];
           char[] ArrSub = new char[16];
            // ArrPer is array os final permutation 
           char[] ArrPer = new char[16];
           finalXor = xor.getResult();
           Substitution sub = new Substitution();
           sub.setSub(String.valueOf(finalXor));
           sub.sub();
           sub.found(tab);
           // Arrsub is array os final substitution 
           ArrSub = sub.convertTobinary();

            System.out.println("\n V"+ ++num +":");
              for(int g=0;g<16;g++)
              System.out.print(ArrSub[g]);
              System.out.println("\n");

           
// System.out.println("\n Arrsub");
//               for(int g=0;g<16;g++)
//               System.out.print(ArrSub[g]);
//               System.out.println("\n");

           Permutation per = new Permutation();
           while (count < n-2)
           {
               per.getText(String.valueOf(ArrSub));
              ArrPer = per.permute(tab);
               key = Character.getNumericValue(finalKeyRoute[indexFinalKeyRoute++]);
                KeyWorking = rK.DoRoute(String.valueOf(keyString),key);
                xor.setKey(String.valueOf(KeyWorking));
                xor.setText(String.valueOf(ArrPer));
                finalXor = xor.getResult();
                sub.setSub(String.valueOf(finalXor));
                sub.sub();
                sub.found(tab); 
               ArrSub = sub.convertTobinary();
              count++;
              System.out.println("\n V"+ ++num +":");
              for(int g=0;g<16;++g)
              System.out.print(ArrSub[g]);
              System.out.println("\n");
           }

            
                   xor.setKey(String.valueOf(KeyWorking));
                xor.setText(String.valueOf(ArrSub));
                finalXor = xor.getResult(); 

 System.out.println("\n Final Y"+":");
              for(int g=0;g<16;++g)
              System.out.print(finalXor[g]);
              System.out.println("\n");

        }
    }
    

System.out.println("Final: 4  4  4  4");

    }

    public static void main(String[] args)
     {
           new Spn();
           

      
    }


}
