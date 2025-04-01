import java.util.*;
class Solution {
    public String intToRoman(int num) {
         LinkedHashMap<String, Integer> romanMap = new LinkedHashMap<>();
        romanMap.put("M", 1000);
        romanMap.put("CM", 900);
        romanMap.put("D", 500);
        romanMap.put("CD", 400);
        romanMap.put("C", 100);
        romanMap.put("XC", 90);
        romanMap.put("L", 50);
        romanMap.put("XL", 40);
        romanMap.put("X", 10);
        romanMap.put("IX", 9);
        romanMap.put("V", 5);
        romanMap.put("IV", 4);
        romanMap.put("I", 1);
        
        StringBuilder roman = new StringBuilder();
        
        for (Map.Entry<String, Integer> entry : romanMap.entrySet()) {
            while (num >= entry.getValue()) {
                num -= entry.getValue();
                roman.append(entry.getKey());
            }
        }
        
        return roman.toString();
    }
}