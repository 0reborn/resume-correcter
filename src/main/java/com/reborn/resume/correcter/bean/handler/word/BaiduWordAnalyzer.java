package com.reborn.resume.correcter.bean.handler.word;

import com.reborn.resume.correcter.domain.model.AnalysisResult;
import com.reborn.resume.correcter.domain.stereotype.Handler;

/**
 * Copyright: Copyright(c) 2019 iwhalecloud
 * <p>
 * 类说明：TODO
 * <p>
 * 类名称: BaiduWordAnalyzer.java
 *
 * @author wu.yue
 * @version v1.0.0
 * @date 2019/11/14 21:27
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 */
@Handler(type = "baidu")
public class BaiduWordAnalyzer implements WordAnalyzer {
    @Override
    public AnalysisResult analyze(String word) {
        return null;
    }
}
