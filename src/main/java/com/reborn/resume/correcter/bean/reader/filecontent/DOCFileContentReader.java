package com.reborn.resume.correcter.bean.reader.filecontent;

import com.reborn.resume.correcter.domain.stereotype.Handler;

import java.io.File;

/**
 * <p>
 * 类说明：TODO
 * <p>
 * 类名称: FileHandler.java
 *
 * @author wu.yue
 * @version v1.0.0
 * @date 2019/11/10 20:23
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 */
@Handler(type = "doc")
public class DOCFileContentReader extends AbstractDocumentFileContentReader {
    @Override
    public String read(File file) {
        return null;
    }
}
