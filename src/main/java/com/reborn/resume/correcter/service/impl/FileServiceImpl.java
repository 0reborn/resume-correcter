package com.reborn.resume.correcter.service.impl;

import com.reborn.resume.correcter.service.FileService;
import com.reborn.resume.correcter.util.DateUtil;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * <p>
 * 类说明：文件操作相关服务实现
 * <p>
 * 类名称: FileServiceImpl.java
 *
 * @author wu.yue
 * @version v1.0.0
 * @date 2019/10/28 22:14
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 */
@Service
public class FileServiceImpl implements FileService {

    /**
     * the local path to save uploaded file
     */
    @Value("${file.save.path}")
    private String fileSavePath;

    @Override
    public File save(MultipartFile file) {
        String originFileType = FilenameUtils.getExtension(file.getOriginalFilename());
        String originFileName = FilenameUtils.getBaseName(file.getOriginalFilename());

        String localFilePath = fileSavePath + "/" + originFileType;
        String localFileName = originFileName + "_" + DateUtil.currentTimestamp() + "." + originFileType;

        File localFile = new File(localFilePath + "/" + localFileName);

        try {
            file.transferTo(localFile);
        } catch (IOException e) {
            return null;
        }
        return localFile;
    }

    @Override
    public String asString(File file) {
        return null;
//        FileHandler fileHandler = handlerContext.getHandler(file);
//        if (fileHandler != null) {
//            return fileHandler.apply(file);
//        } else {
//            throw new RuntimeException("Unknown file handleType: " + FileUtil.typeof(file));
//        }
    }
}