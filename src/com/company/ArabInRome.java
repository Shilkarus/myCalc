package com.company;

public class ArabInRome {
    private String resultRome;

    public String getResultRome(int numArab) {  //забираем  результат на вывод в виде римских цифр

        String[] romeOne = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] romeDec = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"};

        if (numArab / 10 >= 1) {   //выделяем десятки из результата полученого в виде арабских цифр
            int i = (numArab / 10) - 1;
            resultRome = romeDec[i];//формируем ответ в Римскиих цифрах(выделяем десятки сравниваем)
            int j = (numArab - ((numArab / 10) * 10));    //выделяем единицы
            resultRome = resultRome + romeOne[j]; //конкатитируем
        }
        if (numArab / 10 < 1) {
            int i = (numArab - ((numArab / 10) * 10));    //выделяем единицы
            resultRome = romeOne[i]; //конкатитируем
        }
        return resultRome;
    }
}
