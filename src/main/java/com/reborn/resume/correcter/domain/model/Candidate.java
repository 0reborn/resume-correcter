package com.reborn.resume.correcter.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * Copyright: Copyright(c) 2019 iwhalecloud
 * <p>
 * 类说明：TODO
 * <p>
 * 类名称: Candidate.java
 *
 * @author wu.yue
 * @version v1.0.0
 * @date 2019/10/31 13:53
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 */
@Data
@AllArgsConstructor
public class Candidate implements Serializable {

    private String object;

    private String proportion;
}