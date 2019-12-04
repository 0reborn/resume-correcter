package com.reborn.resume.correcter.bean.context;

import com.reborn.resume.correcter.bean.AbstractHandlerContext;
import com.reborn.resume.correcter.bean.reader.filecontent.FileContentReader;
import com.reborn.resume.correcter.domain.stereotype.Context;

import java.util.Map;

/**
 * Copyright: Copyright(c) 2019 iwhalecloud
 * <p>
 * 类说明：TODO
 * <p>
 * 类名称: FileHandlerContext.java
 *
 * @author wu.yue
 * @version v1.0.0
 * @date 2019/11/14 15:27
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 */
@Context(handler = FileContentReader.class)
public class FileContentReaderContext extends AbstractHandlerContext<FileContentReader> {

    public FileContentReaderContext(Map<String, Class<FileContentReader>> componentMap) {
        super(componentMap);
    }
}
