public class Xor {
    private
    String key;
    String text;
    String result;


    public void setKey(String ke)
    {
        this.key = ke;
    }
    public void setText(String text)
    {
        this.text = text;
    }


    public char[] getResult()
    {
        char[] textcon = new char[text.length()];
        char[] keycon = new char[key.length()];
        for(int i = 0; i<text.length();i++)
            textcon[i] = text.charAt(i);
        for(int j = 0; j<key.length();j++)
            keycon[j] = key.charAt(j);
          char[] result = new char[16];
          for(int i =0;i<text.length();i++)
              if(keycon[i] == textcon[i])
                  result[i] = '0';
              else
                  result[i] = '1';
        return result;
    }
}
