package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@RestController
public class FileUploadController {

    @PostMapping("/upload")
    public String upload(String nickname, MultipartFile photo, HttpServletRequest request) throws IOException {
        System.out.println(nickname);
        System.out.println(photo.getOriginalFilename());
        System.out.println(photo.getContentType());
        System.out.println(photo.getSize());

        String path = request.getServletContext().getRealPath("/upload");
        System.out.println(path);
        saveFile(photo, path);
        return "upload file";
    }

    /**
     * 存储图片
     *
     * @param photo 图片
     * @param path  存储路径
     */
    private void saveFile(MultipartFile photo, String path) throws IOException {
        File dir = new File(path);
        if (!dir.exists()) {
            System.out.println("no exist,mkdir ing");
            dir.mkdir();
        }

        File file = new File(path + "\\" + photo.getOriginalFilename());
        System.out.println("save url--------------");
        System.out.println(path + "\\" +photo.getOriginalFilename());
        photo.transferTo(file);

    }
}
