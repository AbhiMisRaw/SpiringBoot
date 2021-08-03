package com.example.SpringBootFileUpload.controller;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class UplaodCOntroller {
    Map<String , Object> result = new HashMap<>();
    ///Receive message
    public Map<String , Object> upload(@RequestParam("attach")MultipartFile file) throws IOException{
        // File Info
        System.out.println("File name = " + file.getOriginalFilename());
        System.out.println("File type = " + file.getContentType());
        // Save to Disk
        //file path example 1
        String filePath = "~/Documents/";
        file.transferTo(new File(filePath + file.getOriginalFilename()));
        result.put("Success" , true);
        return result;
    }
}
