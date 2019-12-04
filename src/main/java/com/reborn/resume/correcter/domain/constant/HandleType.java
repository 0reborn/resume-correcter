package com.reborn.resume.correcter.domain.constant;

import org.apache.commons.lang3.StringUtils;

/**
 * @author wu.yue
 */

public enum HandleType {
    /** TODO */
    DOC("doc"),

    /** TODO */
    PDF("pdf"),

    /** TODO */
    PIC("pic"),
// ================================================
// Word Handler Type
    /** TODO */
    GOOGLE("google"),

    /** TODO */
    BAIDU("baidu"),

    /** TODO */
    BING("bing");

    public static HandleType getByName(String name) {
        for (HandleType handleType : values()) {
            if (StringUtils.equals(handleType.getName(), name)) {
                return handleType;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    private String name;

    HandleType(String name) {
        this.name = name;
    }
}