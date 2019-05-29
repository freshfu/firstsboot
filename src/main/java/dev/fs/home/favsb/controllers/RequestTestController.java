package dev.fs.home.favsb.controllers;

import dev.fs.home.favsb.services.IFavService;
import dev.fs.home.favsb.vo.Pig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestTestController {

    @Autowired
    private IFavService favService;

    @RequestMapping(value = "/test")
    public String testBoot(){
        return "test test";
    }

    @RequestMapping("/pig")
    public String queryPigInfo(String pigId){

        Pig pig = favService.getPigInfo(pigId);
        return pig.getName();
    }


}
