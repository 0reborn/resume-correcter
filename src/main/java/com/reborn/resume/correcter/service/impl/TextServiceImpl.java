package com.reborn.resume.correcter.service.impl;

import com.reborn.resume.correcter.domain.model.AnalysisResult;
import com.reborn.resume.correcter.service.TextService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * <p>
 * 类说明：文本操作相关服务实现
 * <p>
 * 类名称: TextServiceImpl.java
 *
 * @author wu.yue
 * @version v1.0.0
 * @date 2019/10/29 14:10
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 */
@Service
public class TextServiceImpl implements TextService {

    /**
     * A pattern to express string that without terminology character
     */
    private static final Pattern NON_TERMINOLOGY_PATTERN = Pattern.compile("[^a-zA-Z+# ]");

    @Override
    public List<String> filter(String text) {
        return Arrays.stream(NON_TERMINOLOGY_PATTERN.split(text))
                .filter(word -> word.length() > 1)
                .collect(Collectors.toList());
    }

    @Override
    public List<AnalysisResult> analyze(List<String> words) {
        return null;
    }
}