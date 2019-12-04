package com.reborn.resume.correcter.bean.reader.filecontent;

import java.io.File;

/**
 * <p>
 * 类说明：从图片类型(抽象)的文件中读取文本内容的能力
 * <p>
 * 类名称: Handler.java
 *
 * @author wu.yue
 * @version v1.0.0
 * @date 2019/11/10 20:23
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 */
public abstract class AbstractImageFileContentReader implements FileContentReader {
    @Override
    public String read(File file) {
        return null;
    }
}
