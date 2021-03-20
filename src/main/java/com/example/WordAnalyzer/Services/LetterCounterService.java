package com.example.WordAnalyzer.Services;

import com.example.WordAnalyzer.Data.LettersCountResponse;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class LetterCounterService {

    public static LettersCountResponse parse(String word) {
        int max =0;
        var res = '\0';
        HashMap<Character,Integer>map = new HashMap<>();
        String lowerCaseWord = word.toLowerCase();

        for (int i =lowerCaseWord.length()-1;i>=0;i--) {
            char ch = lowerCaseWord.charAt(i);
            map.compute(ch,(key,val) -> val == null ? 1 :val+1);
            int val = map.get(ch);
            if (val>max){
                res = ch;
                max = val;
            }
        }
        return new LettersCountResponse(res, max);
    }
}