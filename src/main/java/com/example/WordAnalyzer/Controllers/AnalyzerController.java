package com.example.WordAnalyzer.Controllers;

import com.example.WordAnalyzer.Data.LettersCountResponse;
import com.example.WordAnalyzer.Services.LetterCounterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnalyzerController {
    @GetMapping("/wordanalyzer/analyze")
    @ResponseBody
    public LettersCountResponse analyzeWord(@RequestParam("word") String word)  {
        return LetterCounterService.parse(word);
    }
}
