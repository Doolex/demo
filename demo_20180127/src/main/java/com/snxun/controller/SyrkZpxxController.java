package com.snxun.controller;

import com.snxun.entity.SyrkZpxx;
import com.snxun.service.SyrkZpxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.nio.file.Files;
import java.util.List;

@Controller
@RequestMapping("/syrkZpxx")
public class SyrkZpxxController {

    @Autowired
    private SyrkZpxxService syrkZpxxService;

    @RequestMapping("/add")
    public void add(){
        SyrkZpxx syrkZpxx = new SyrkZpxx();
        syrkZpxx.setXlh("350521199401081234");
        syrkZpxx.setGmsfhm("35052119940181234");
        syrkZpxxService.add(syrkZpxx);
    }

    @RequestMapping("/del")
    public void del(SyrkZpxx syrkZpxx){
        syrkZpxxService.del(syrkZpxx);
    }

    @RequestMapping("/update")
    public void update(SyrkZpxx syrkZpxx){
        syrkZpxxService.update(syrkZpxx);
    }

    @ResponseBody
    @RequestMapping("/findList")
    public List<SyrkZpxx> findList(SyrkZpxx syrkZpxx){
        return syrkZpxxService.findList(syrkZpxx);
    }
}
