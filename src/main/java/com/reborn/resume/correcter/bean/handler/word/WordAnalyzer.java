package com.reborn.resume.correcter.bean.handler.word;

import com.reborn.resume.correcter.domain.model.AnalysisResult;

public interface WordAnalyzer {
    AnalysisResult analyze(String word);
}
