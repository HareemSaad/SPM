package com.converter;

public class converter {
    public static String toRoman(int number) {
        //throw error for numbers > 3999 or < 1
        if (number < 1 || number > 3999) {
            return "Invalid input";
        }
        
        // each character is its unit times the index
        // hundredCharacters[5] = 5 * 100 = D
        String[] thousandCharacters = {"", "M", "MM", "MMM"};
        String[] hundredCharacters = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tensCharacters = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] onesCharacters = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        
        // divide to see how many 1000s are there
        int thousands = number / 1000;
        // divide the leftover by 100 to get number of 100s
        int hundreds = (number - thousands * 1000) / 100;
        // divide the leftover by 100 to get number of 100s
        int tens = (number - thousands * 1000 - hundreds * 100) / 10;
        // divide the leftover by 100 to get number of 100s
        int ones = (number - thousands * 1000 - hundreds * 100 - tens * 10);

        System.out.println(thousands +  " " + hundreds +  " " + tens +  " " + ones);
        
        String romanNumeral = thousandCharacters[thousands] + hundredCharacters[hundreds] + tensCharacters[tens] + onesCharacters[ones];
        
        return romanNumeral;
    }
    
    public static void main(String[] args) {
        int number = 1234;
        System.out.println(toRoman(number));
    }
}
