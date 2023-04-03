package com.converter;

public class converter {
    public static String toRoman(int number) {
        if (number < 1 || number > 3999) {
            return "Invalid input";
        }
        
        String[] romanThousands = {"", "M", "MM", "MMM"};
        String[] romanHundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] romanTens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] romanOnes = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        
        int thousands = number / 1000;
        int hundreds = (number % 1000) / 100;
        int tens = (number % 100) / 10;
        int ones = number % 10;
        
        String romanNumeral = romanThousands[thousands] + romanHundreds[hundreds] + romanTens[tens] + romanOnes[ones];
        
        return romanNumeral;
    }
    
    public static void main(String[] args) {
        int number = 1234;
        System.out.println(toRoman(number));
    }
}
