package com.christ.handle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
public class UploadControl {
    @RequestMapping(value = "/upload",produces ="text/html;charset=utf-8")
    public ModelAndView upload(String username, MultipartFile filename, HttpServletRequest request) throws IOException {
        System.out.println(username+"\n"+filename.getOriginalFilename()+"\n"+filename.getSize());
        String uuid= UUID.randomUUID().toString().replaceAll("-","");
        String type=filename.getOriginalFilename().substring(filename.getOriginalFilename().lastIndexOf("."));
        String path=new File(request.getServletContext().getRealPath("/")).getParent();
        String filepath=path.replaceAll("\\\\","/")+"/web/imgs/";
        filename.transferTo(new File(filepath+uuid+type));
        ModelAndView modelAndView=new ModelAndView("hello","img",uuid+type);
        return modelAndView;
    }
}
