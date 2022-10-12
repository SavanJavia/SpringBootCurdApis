package com.interview.interview.service;

import com.interview.interview.entity.ImageClass;
import com.interview.interview.repository.ImageRepository;
import com.interview.interview.utils.ImageUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;

@Service
@Slf4j
public class ImageService {

    @Autowired
    ImageRepository imageRepository;

    public ImageClass imageUpload( MultipartFile file) throws IOException {
        ImageClass i = new ImageClass();
        i.setStringName("Test image");
        i.setFile(ImageUtil.compressImage(file.getBytes()));

        return imageRepository.save(i);
    }


    public byte[] getUpload(int id) {

        Optional<ImageClass> dbImage = imageRepository.findById(id);

        if(dbImage.isPresent()) {
            log.info("Get Image Object" + dbImage);
            byte[] image = ImageUtil.decompressImage(dbImage.get().getFile());
            return image;
        }
        return null;
    }
}
