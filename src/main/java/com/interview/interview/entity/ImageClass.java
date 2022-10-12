package com.interview.interview.entity;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.io.File;

@Data
@Entity
public class ImageClass {

    @Id
    @GeneratedValue
    private int id;

    private String stringName;

    @Lob
    private byte[] file;

}
