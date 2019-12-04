package com.reborn.resume.correcter.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 类说明：用于封装专业术语词汇的分析结果
 * <p>
 * 类名称: AnalysisResult.java
 *
 * @author wu.yue
 * @version v1.0.0
 * @date 2019/10/30 09:53
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 */
@Data
@AllArgsConstructor
public class AnalysisResult implements Serializable {

    /**
     * the word
     */
    private String source;

    /**
     * the correct spelling of the word
     */
    private String correctSpelling;

    /**
     * TODO
     */
    private List<Candidate> candidates;
}
