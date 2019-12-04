package com.reborn.resume.correcter.util;

import org.apache.commons.io.FilenameUtils;

import java.io.File;

/**
 * <p>
 * 类说明：自定义文件工具类
 * <p>
 * 类名称: FileUtil.java
 *
 * @author wu.yue
 * @version v1.0.0
 * @date 2019/10/28 21:45
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 */
public class FileUtil {

    /**
     * 判断文件是否属于图片类型（jpg、png）
     * @param file 文件对象
     * @return boolean
     * @author wu.yue
     * @date 2019/10/28 21:46
     */
    public static boolean isPictureFile(File file) {
        return false;
    }

    /**
     * 判断文件是否属于文档类型（doc、docx、pdf...）
     * @param file 文件对象
     * @return boolean
     * @author wu.yue
     * @date 2019/10/28 21:48
     */
    public static boolean isDocumentFile(File file) {
        return false;
    }

    /**
     * 返回文件的类型，即后缀名
     * @param file 文件对象
     * @return java.lang.String
     * @author wu.yue
     * @date 2019/10/28 22:10
     */
    public static String typeof(File file) {
        return FilenameUtils.getExtension(file.getName()).toLowerCase();
    }
}