package com.reborn.resume.correcter.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Copyright: Copyright(c) 2019 iwhalecloud
 * <p>
 * 类说明：日期工具类
 * <p>
 * 类名称: DateUtil.java
 *
 * @author wu.yue
 * @version v1.0.0
 * @date 2019/10/19 17:30
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 */
public class DateUtil {

    private static final String DATE_FORMAT_STRING = "yyyyMMddHHmmss";

    /**
     * 生成固定位数的时间戳字符串
     * @param numberOfDigits 位数
     * @return java.lang.String
     * @author wu.yue
     * @date 2019/10/19 17:35
     */
    public static String currentTimestamp(int numberOfDigits) {
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_STRING.substring(0, numberOfDigits));
        return sdf.format(new Date());
    }

    /**
     * 生成完整的时间戳字符串
     * @return java.lang.String
     * @author wu.yue
     * @date 2019/10/19 17:38
     */
    public static String currentTimestamp() {
        return currentTimestamp(DATE_FORMAT_STRING.length());
    }
}