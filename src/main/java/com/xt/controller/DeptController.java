package com.xt.controller;

import com.xt.pojo.Dept;
import com.xt.service.DeptServiceI;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import java.util.List;

/**
 * controller控制器
 * @author  xz
 */
@Controller
public class DeptController {

    @Resource
    private DeptServiceI deptService;

    /**
     * 请求index 跳转到 getAll的url
     * @return
     */
    @RequestMapping("/index")
    public String index(){
        return "redirect:getAll.action";
    }

    /**
     * 获取所有的部门信息 并返回到页面 打印数据
     * @param model
     * @return
     */
    @RequestMapping("/getAll")
    public String getAll(Model model){
        List<Dept> list = deptService.getAll();
        System.out.print(list);
        model.addAttribute("ll",list);
        return "all";
    }
}
