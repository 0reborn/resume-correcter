package com.reborn.resume.correcter.bean.reader.filecontent;

import com.reborn.resume.correcter.domain.stereotype.Handler;
import com.snowtide.PDF;
import com.snowtide.pdf.Document;
import com.snowtide.pdf.OutputTarget;

import java.io.File;
import java.io.IOException;

/**
 * <p>
 * 类说明：TODO
 * <p>
 * 类名称: PdfFileHandler.java
 *
 * @author wu.yue
 * @version v1.0.0
 * @date 2019/11/3 21:26
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 */
@Handler(type = "pdf")
public class PDFFileContentReader extends AbstractDocumentFileContentReader {

    private static final int BUFFER_SIZE = 1024;

    @Override
    public String read(File file) {
        Document pdf = PDF.open(file);
        StringBuilder text = new StringBuilder(BUFFER_SIZE);
        pdf.pipe(new OutputTarget(text));
        try {
            pdf.close();
        } catch (IOException e) {
            throw new RuntimeException("Document stream close failed");
        }
        return text.toString();
    }
}
