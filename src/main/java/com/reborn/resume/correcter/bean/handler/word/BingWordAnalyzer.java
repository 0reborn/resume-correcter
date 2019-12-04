package com.reborn.resume.correcter.bean.handler.word;

import com.github.kevinsawicki.http.HttpRequest;
import com.reborn.resume.correcter.domain.model.AnalysisResult;
import com.reborn.resume.correcter.domain.stereotype.Handler;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.net.URLEncoder;
import java.nio.charset.Charset;

/**
 * Copyright: Copyright(c) 2019 iwhalecloud
 * <p>
 * 类说明：TODO
 * <p>
 * 类名称: BingWordAnalyzer.java
 *
 * @author wu.yue
 * @version v1.0.0
 * @date 2019/11/14 21:40
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 */
@Handler(type = "bing")
public class BingWordAnalyzer implements WordAnalyzer {

    private static final String REQUEST_URL = "https://cn.bing.com/search?q=%s&ensearch=1";

    @Override
    public AnalysisResult analyze(String word) {
        String html = HttpRequest.get(urlEncode(word)).body();
        Document document = Jsoup.parse(html);
        Elements titleTags = document.select("ol#b_results>li.b_algo>h2");
        titleTags.forEach(tag -> System.out.println(tag.text()));
        return null;
    }

    private String urlEncode(String keyword) {
        String q = URLEncoder.encode(keyword, Charset.defaultCharset());
//        return String.format(REQUEST_URL, q);
        return "https://cn.bing.com/search?q=springboot&ensearch=1";
    }
}
