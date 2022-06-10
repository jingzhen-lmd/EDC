package com.ccdproduct.edc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Email {
    private String emailName;
    private String emailPassword;
    private MultipartFile myFile;
    private MultipartFile[] myFiles;
}
