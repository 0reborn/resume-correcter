package com.reborn.resume.correcter.bean.handler.word;

import org.junit.jupiter.api.Test;

class BingWordAnalyzerTest {

    private BingWordAnalyzer wordAnalyzer = new BingWordAnalyzer();

    @Test
    void analyze() {
        wordAnalyzer.analyze("spring boot");
    }
}