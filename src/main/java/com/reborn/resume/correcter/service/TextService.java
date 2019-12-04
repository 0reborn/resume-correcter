package com.reborn.resume.correcter.service;

import com.reborn.resume.correcter.domain.model.AnalysisResult;

import java.util.List;

/**
 * <p>
 * 类说明：文本操作相关服务接口
 * <p>
 * 类名称: FileService.java
 *
 * @author wu.yue
 * @version v1.0.0
 * @date 2019/10/28 22:12
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 */
public interface TextService {

    /**
     * 从一段文本中过滤出专业术语词汇
     * @param text 文本
     * @return java.util.List<java.lang.String>
     * @author wu.yue
     * @date 2019/11/8 9:46
     */
    List<String> filter(String text);

    /**
     * 分析一组专业术语词汇的拼写正确与否，返回分析结果列表
     * @param words 专业术语词汇List
     * @return java.util.List<com.reborn.resume.correcter.domain.model.AnalysisResult>
     * @author wu.yue
     * @date 2019/11/8 9:46
     */
    List<AnalysisResult> analyze(List<String> words);

    default List<AnalysisResult> resolve(String text) {
        return analyze(filter(text));
    }
}