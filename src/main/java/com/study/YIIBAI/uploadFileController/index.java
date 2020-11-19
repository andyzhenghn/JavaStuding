package com.study.YIIBAI.uploadFileController;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class index {

    @RequestMapping(value = "/upload", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String fileUpload(@RequestParam("file") MultipartFile file) throws IOException {
        File convertFile = new File("/var/tmp" + file.getOriginalFilename());
        convertFile.createNewFile();
        try (FileOutputStream fout = new FileOutputStream(convertFile)) {
            fout.write(file.getBytes());
        }
        return "File is upload successfully";
    }

}
