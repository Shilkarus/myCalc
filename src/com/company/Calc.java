package com.company;

public class Calc   {
    public int result;
    private int a,b;
    public int  math(String aa,String bb,String simbol) {   //математические действия с любыми
            a= Integer.parseInt(aa);
            b= Integer.parseInt(bb);
        switch (simbol) {
            case ("+"):
                result=a+b;
                break;
            case ("-"):
                result=a-b;
                break;
            case ("*"):
                result=a*b;
                break;
            case ("/"):
                result=a/b;
                break;
        }
        return result;
    }


}





