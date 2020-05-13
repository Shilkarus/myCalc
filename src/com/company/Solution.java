package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public  class Solution {
    static String resultRome;
    public static void main(String[] args) throws Exception {
            BufferedReader readNum = new BufferedReader(new InputStreamReader(System.in));
            int check=0;
            String[] str=new  String[3];
            Calc toCount = new Calc();
            CheckNum checkNum =new CheckNum();
            RomeInArab romeInArab = new RomeInArab();
            ArabInRome arabInRome = new ArabInRome();
            String strIn ;
            while (true) {
                strIn=readNum.readLine();                             //считываем строку
                str = strIn.split(" ");                         //разделяем пробелами ,складываем в массив
                if (str[0].isEmpty()||(str[1].isEmpty()||
                        (str[2].isEmpty())))throw new StringExept(); //неверный формат ввода
                if (checkNum.inNum(str[0])) check++;                 //проверяем на разные ошибки и Римские цифры
                if (checkNum.inNum(str[2])) check++;                 //проверяем на разные ошибки и Римские цифры
                if (check==2) {                                      //если оба римские
                    romeInArab.inNum(str[0], str[2]);
                    System.out.println(resultRome = arabInRome.getResultRome(toCount.math(romeInArab.getA(), romeInArab.getB(), str[1])));
                }else if(check==1) throw new StringExept();                         //неверный формат ввода пример 5 + VI
                else {
                    System.out.println(toCount.math(str[0],str[2],str[1]));
                }
                check=0;
            }
    }
}
