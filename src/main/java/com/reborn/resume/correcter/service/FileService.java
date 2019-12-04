package com.reborn.resume.correcter.service;

import org.springframework.util.ResourceUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * <p>
 * 类说明：文件操作相关服务接口
 * <p>
 * 类名称: FileService.java
 *
 * @author wu.yue
 * @version v1.0.0
 * @date 2019/10/28 22:12
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 */
public interface FileService {

    File save(MultipartFile file);

    String asString(File file);

    default String asString(MultipartFile file) {
        File localFile = save(file);
        if (localFile != null) {
            return asString(localFile);
        } else {
            throw new RuntimeException("Failed to save file");
        }
    }

    default String asString(String path) {
        File file;
        try {
            file = ResourceUtils.getFile(path);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("file not found");
        }
        return asString(file);
    }
}