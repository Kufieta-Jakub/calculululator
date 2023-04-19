package org.example;

public class Math {
    static String mainMathText;
    int value=0;
    static String[] twoNumbers= new String[2];
    static String[] twoSigns= new String[2];
    public static String getText(String mainText)
    {
        mainMathText=mainText;
        return mainText;
    }
    static float result;
    public static void getParameters(String number, String sign)
    {
        if(twoNumbers[0]==null)
        {
            twoNumbers[0]=number;
            twoSigns[0]=sign;
        }
        else if(twoNumbers[0]!=null && twoNumbers[1]==null)
        {
            twoNumbers[1]=number;
            twoSigns[1]=sign;
        }
        else
        {
            twoNumbers[0]=twoNumbers[1];
            twoNumbers[1]=number;
        }

    }
}
