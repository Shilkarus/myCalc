package com.company;

public class StringExept extends Exception{
    public String toString(){
        return "Введен невереный формат записи! Образец a + b, a / b, V + VI";
    }
}
