package com.reborn.resume.correcter.controller;

import com.alibaba.fastjson.JSONObject;
import com.reborn.resume.correcter.domain.model.AnalysisResult;
import com.reborn.resume.correcter.domain.vo.RespVO;
import com.reborn.resume.correcter.service.FileService;
import com.reborn.resume.correcter.service.TextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * <p>
 * 类说明：处理文件上传的Controller
 * <p>
 * 类名称: FileUploadController.java
 *
 * @author wu.yue
 * @version v1.0.0
 * @date 2019/10/28 21:25
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 */
@RestController
@RequestMapping("/upload")
public class UploadController {

    private final FileService fileService;

    private final TextService textService;

    @Autowired
    public UploadController(FileService fileService, TextService textService) {
        this.fileService = fileService;
        this.textService = textService;
    }

    /**
     * 处理文件上传
     * @param file 文件
     * @return com.reborn.resume.correcter.domain.vo.RespVO
     * @author wu.yue
     * @date 2019/11/8 9:41
     */
    @RequestMapping(value = "/file", method = RequestMethod.POST)
    public RespVO handleFileUpload(@RequestParam("file") MultipartFile file) {
        String fileContent = fileService.asString(file);
        List<AnalysisResult> analysisResultList = textService.resolve(fileContent);
        return RespVO.success("", analysisResultList);
    }

    /**
     * 处理普通文本上传
     * @param req 请求JSON参数 => { text: "text content here" }
     * @return com.reborn.resume.correcter.domain.vo.RespVO
     * @author wu.yue
     * @date 2019/11/8 9:45
     */
    @RequestMapping(value = "/text", method = RequestMethod.POST)
    public RespVO handleTextUpload(@RequestBody JSONObject req) {
        String text = req.getString("text");
        List<AnalysisResult> analysisResultList = textService.resolve(text);
        return RespVO.success("", analysisResultList);
    }
}