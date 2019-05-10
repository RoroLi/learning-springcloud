package com.roro.msprovideruploadfile6020.controller;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

@Slf4j
@RestController
@RequestMapping("/file")
public class FileUploadController {

    @RequestMapping("/upload")
    public Object upload(@RequestParam("file") MultipartFile file) throws IOException {
        log.info("上传的文件名称:{}",file.getOriginalFilename());
        log.info("文件上传的大小:{}",file.getSize());

        String path = "C:" ;
        File dest = new File(path + "/" + file.getOriginalFilename());
        if(!dest.getParentFile().exists()){ //判断文件父目录是否存在
            dest.getParentFile().mkdir();
        }
        try {
            file.transferTo(dest); //保存文件
            return "true";
        } catch (IllegalStateException e) {
            e.printStackTrace();
            return "false";
        } catch (IOException e) {
            e.printStackTrace();
            return "false";
        }

    }
}
