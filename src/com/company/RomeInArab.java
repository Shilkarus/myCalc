package com.company;

public class RomeInArab {
    private String a;
    private String b;
    int[] arabNum = new int[2];
    String[] outNUm = new String[2];

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }
//переводим Риские в Арабские
    public void inNum(String c, String c1) {
        outNUm[0] = c;
        outNUm[1] = c1;
        String[] rome = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < 10; i++) {  //сравниваем входную строку с элементами массива и если есть совпадение
                if (outNUm[j].equals(rome[i])) {
                    arabNum[j] = i + 1;                     //записываем индекс позиции в результат
                    break;
                }
            }
            a = ""+arabNum[0];
            b = ""+arabNum[1];
        }

    }
}
