package org.example;

import java.lang.Math;

public class Mathematic {
    static float[] liczby=new float[2];
    static char znak;
    public static void getMathOperation(String mathOperation)
    {

        String character="+-/%x=";
        for(int i=0;i<mathOperation.length();i++)
        {
            char c = mathOperation.charAt(i);
            if(character.indexOf(c)!=-1) {

                    liczby[0] = Float.valueOf(mathOperation.substring(0, i));
                    znak = mathOperation.charAt(i);
                    int j=i+1;
                    liczby[1]=Float.valueOf(mathOperation.substring(j));
            }
            else
            {
                liczby[0]= Float.valueOf(mathOperation);
            }
        }
    }
    public static String oblicznia()
    {
        switch(znak){
            case '+':{
                float wynik=liczby[0]+liczby[1];
                return String.valueOf(wynik);
            }
            case '-':{
                float wynik=liczby[0]-liczby[1];
                return String.valueOf(wynik);
            }
            case 'x':{
                float wynik=liczby[0]*liczby[1];
                return String.valueOf(wynik);
            }
            case '/':{
                float wynik=liczby[0]/liczby[1];
                return String.valueOf(wynik);
            }
        }
        return String.valueOf(liczby[0]);
    }
    public static String getSqrtOf(String text)
    {
        float wynik= (float) Math.sqrt(Float.valueOf(text));
        return String.valueOf(wynik);
    }
}
