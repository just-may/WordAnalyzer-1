package com.example.WordAnalyzer.Controllers;

import com.example.WordAnalyzer.Services.LetterCounterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnalyzerController {
    @GetMapping("/wordanalyzer/analyze")
    public String analyzeWord(@RequestParam("word") String word)  {
        return LetterCounterService.parse(word).toString();
    }
}
