package org.example;

public class Math {
    static String mainMathText;
    static float[] operationTable;
    static float finalNumber;
    public static String getText(String mainText)
    {
        mainMathText=mainText;
        return mainText;
    }
    private static void checkifTextIsANumber()
    {

        try{
            float number = Float.valueOf(mainMathText);
            finalNumber = number;
            System.out.println(number);
        }
        catch (Exception ex){
            System.out.println("Thats not the number");
            operationTable[0]=finalNumber;
        }
    }
    public static void returnResult()
    {
        checkifTextIsANumber();
    }
}
