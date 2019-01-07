package com.howie.wen.controller;

import com.howie.wen.dao.UserDAO;
import com.howie.wen.service.UserService;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @Author:HowieLee
 * @Date:1/7/2019
 * @Description:com.howie.wen.controller
 * @version:1.0
 */

@Controller
public class LoginController {
    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired(required=false)
    @Qualifier("userService")
    private UserService userService;

    @RequestMapping(path = {"/reg"}, method = {RequestMethod.POST})
    public String reg(Model model,
                      @RequestParam("password") String username,
                      @RequestParam("password") String password) {
        try {
            Map<String,String> map = userService.register(username,password);
            if(map.containsKey("msg")){
                model.addAttribute("msg",map.get("msg"));
                return "login";
            }
            return "redirect:/";
        }catch (Exception e) {
            //logger.error("注册异常" + e.getMessage());
            model.addAttribute("msg", "服务器错误");
            return "login";
        }
        //return "index";
    }

    @RequestMapping(path = {"/reglogin"}, method = {RequestMethod.GET})
    public String reg(Model model) {
        return "login";
    }
}
