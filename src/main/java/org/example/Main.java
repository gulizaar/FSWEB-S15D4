package org.example;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean checkForPalindrome(String input){
        input = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        List<Character> karakterler = new ArrayList<>();
        for(char c: input.toCharArray()){
            karakterler.add(c);
        }
        int left=0;
        int right =karakterler.size()-1;
        while (left < right) {
            if (!karakterler.get(left).equals(karakterler.get(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static String convertDecimalToBinary(int number) {
        if (number == 0) {
            return "0";
        }

        List<Integer> basamaklar = new ArrayList<>();

        // Sayıyı 2'ye bölerek kalanları listenin başına ekle
        while (number > 0) {
            int remainder = number % 2;
            basamaklar.add(0, remainder); // hep index 0'a ekliyoruz
            number = number / 2;
        }

        // Listeyi baştan sona gezip String'e çevir
        StringBuilder result = new StringBuilder();
        for (int digit : basamaklar) {
            result.append(digit);
        }

        return result.toString();
    }

}