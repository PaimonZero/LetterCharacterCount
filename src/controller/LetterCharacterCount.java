
package controller;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import model.Content;

public class LetterCharacterCount{
    
    public static int countAndDisplayNumberOfWords(Content newContent) {  //sửa thành String str cũng đc
        Map<String, Integer> wordCountMap = new LinkedHashMap<>();
        StringTokenizer word = new StringTokenizer(newContent.getData(), " ");
        String substr;
        String myRegex = "[a-zA-Z]+";       //condition
        int count = 0;
        
        while (word.hasMoreElements()) {
            substr = word.nextToken();
            if(Pattern.matches(myRegex, substr) == true ) {         //skip if subStr don't match the regex
                if( wordCountMap.containsKey(substr) ) {    //check if substr in map
                    wordCountMap.put(substr, wordCountMap.get(substr) + 1);
                } else {                                       //substr not in map
                    wordCountMap.put(substr, 1);
                }
                count++;
            } 
        }
        
        System.out.println(wordCountMap);   //display
        return count;
    }
    
    public static void countAndDisplayNumberOfCharater(Content newContent) {   //sửa thành String str cũng đc
        Map<Character, Integer> alphabetCharCountMap = new LinkedHashMap<>();
        Map<Character, Integer> specialCharCountMap = new LinkedHashMap<>();
        String data = newContent.getData();
        String myRegex = "[a-zA-Z]+";       //condition
        int countSpecialChar = 0;
        int countAlphabetChar = 0;
        
        for (int i = 0; i < data.length(); i++) {
            Character currentChar = data.charAt(i);
            String temp = Character.toString(currentChar);    //variable to use to test the regex
            
            if(temp.isBlank()) { continue; }                    //skip /s+
            if( Pattern.matches(myRegex, temp) ) {    //check alphabet
                if ( alphabetCharCountMap.containsKey(currentChar) ) {
                    alphabetCharCountMap.put(currentChar, alphabetCharCountMap.get(currentChar) + 1);
                    countAlphabetChar++;
                } else {
                    alphabetCharCountMap.put(currentChar, 1);
                    countAlphabetChar++;
                }
            } else {        //check special character        
                if ( specialCharCountMap.containsKey(currentChar) ) {
                    specialCharCountMap.put(currentChar, specialCharCountMap.get(currentChar) + 1);
                    countSpecialChar++;
                } else {
                    specialCharCountMap.put(currentChar, 1);
                    countSpecialChar++;
                }
            }
        }
        
        System.out.println(">>Has "+countAlphabetChar+" Alpabet character: "+alphabetCharCountMap);
        System.out.println(">>Has "+countSpecialChar+" Special character and digit: "+specialCharCountMap);
    }
}
