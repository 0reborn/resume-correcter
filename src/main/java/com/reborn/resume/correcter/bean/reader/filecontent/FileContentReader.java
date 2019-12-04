package com.reborn.resume.correcter.bean.reader.filecontent;

import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * <p>
 * 类说明：描述一种从文件中读取文本内容的能力
 * 即，从{@code java.io.File}类型到{@code String}类型的转化
 * 文件类型包括但不限于doc、pdf、jpg、png
 * <p>
 * 类名称: FileContentReader.java
 *
 * @author wu.yue
 * @version v1.0.0
 * @date 2019/11/12 22:51
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 */
public interface FileContentReader {

    /**
     * obtain text from file which in type of doc, pdf, jpg, png...
     * @param file the file
     * @return text of file
     */
    String read(File file);

    default String read(String path) {
        File file;
        try {
            file = ResourceUtils.getFile(path);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("file not found in path: " + path);
        }
        return read(file);
    }
}
