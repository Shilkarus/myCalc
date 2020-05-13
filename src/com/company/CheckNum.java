package com.company;

public class CheckNum {
    int i = 0;
//проверяем  какое число ввели арабское или римское
    public boolean inNum(String c) throws NumberFormatException, NumExept {
        int q;
        String[] rome = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        while (true) {              //сравниваем входную строку с элементами массива и если есть совпадение
            if (c.equals(rome[i])) {
                i = 0;
                return true;    //если римское
            }
            else if (i==9){
                if  ((Integer.parseInt(c))==1){throw new NumberFormatException();}         //неверный ввод данных
                if  (Integer.parseInt(c)>10||Integer.parseInt(c)<1) throw new NumExept();  //если не входит в диопазон 1-10
                i=0;
            return false;  ///если арабское
                }
            i++;
        }

    }

}


