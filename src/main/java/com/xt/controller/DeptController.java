package com.xt.controller;

import com.xt.pojo.Dept;
import com.xt.service.DeptServiceI;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import java.util.List;

@Controller
public class DeptController {

    @Resource
    private DeptServiceI deptService;

    @RequestMapping("/index")
    public String index(){
        System.out.print("hello index");
        return "redirect:getAll.action";
    }

    @RequestMapping("/getAll")
    public String getAll(){
        List<Dept> list = deptService.getAll();
        System.out.print(list);
        return "all";
    }
}
