package com.example.WordAnalyzer.Services;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class LetterCounterService {

    public static JSONObject parse(String word) throws JSONException {
        int max =0;
        String res = null;
        HashMap<Character,Integer>map = new HashMap<>();
        String lowerCaseWord = word.toLowerCase();

        for (int i =lowerCaseWord.length()-1;i>=0;i--) {
            char ch = lowerCaseWord.charAt(i);
            map.compute(ch,(key,val) -> val == null ? 1 :val+1);
            int val = map.get(ch);
            if (val>max){
                res = String.valueOf(ch);
                max = val;
            }
        }
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("letter",res);
        jsonObject.put("count",max);

        return jsonObject;
    }
}