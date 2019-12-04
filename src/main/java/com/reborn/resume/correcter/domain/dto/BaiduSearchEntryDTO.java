package com.reborn.resume.correcter.domain.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 类说明：TODO
 * <p>
 * 类名称: BaiduSearchDTO.java
 *
 * @author wu.yue
 * @version v1.0.0
 * @date 2019/11/11 21:37
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 */
@Data
public class BaiduSearchEntryDTO implements Serializable {
    private String title;
    private String url;
    private String urlEnc;

}
