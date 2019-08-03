package com.kakrot.gotools.controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kakrot-16
 * @create 2019-08-03 17:22
 **/
@RestController
@RequestMapping("index")
public class IndexController {

    @PostMapping("index")
    @ResponseBody
    public void index(){
        System.out.println("ok...");
    }
}
