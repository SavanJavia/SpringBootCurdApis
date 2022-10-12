package com.interview.interview.controller;

import com.interview.interview.entity.ImageClass;
import com.interview.interview.service.ImageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@RestController
@Slf4j
@RequestMapping("/image")
public class ImageController {

    @Autowired
    ImageService imageService;


    @GetMapping("/testApi")
    public String testing(){
        return "ImageController Test Done !! ";
    }





    @PostMapping("/imageUpload")
    public String imageUpload(@RequestParam("file") MultipartFile file){

        try{


            ImageClass imgObject = imageService.imageUpload(file);
            log.info("Image uploaded sucessfully"+imgObject.getId());
            return "Image uploaded sucessfully";
        }
        catch(Exception e){
            log.error("Error throw while uploading image: "+e.getMessage());
            return "Image upload failed";
        }

    }

    @GetMapping("/getImage/{id}")
    @ResponseBody
    public ResponseEntity getImage(@PathVariable int id){

        byte[] image = imageService.getUpload(id);

        return ResponseEntity.status(HttpStatus.OK)
                .contentType(MediaType.valueOf("image/png"))
                .body(image);

    }

    @GetMapping("/foos/{id}")
    @ResponseBody
    public String getFooById(@PathVariable String id) {
        return "ID: " + id;
    }

}
