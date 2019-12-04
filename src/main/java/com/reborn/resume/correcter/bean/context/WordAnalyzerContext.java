package com.reborn.resume.correcter.bean.context;

import com.reborn.resume.correcter.bean.AbstractHandlerContext;
import com.reborn.resume.correcter.bean.handler.word.WordAnalyzer;
import com.reborn.resume.correcter.domain.stereotype.Context;

import java.util.Map;

/**
 * Copyright: Copyright(c) 2019 iwhalecloud
 * <p>
 * 类说明：TODO
 * <p>
 * 类名称: DemoContext.java
 *
 * @author wu.yue
 * @version v1.0.0
 * @date 2019/11/14 21:22
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 */
@Context(handler = WordAnalyzer.class)
public class WordAnalyzerContext extends AbstractHandlerContext<WordAnalyzer> {
    public WordAnalyzerContext(Map<String, Class<WordAnalyzer>> handlerMap) {
        super(handlerMap);
    }
}
