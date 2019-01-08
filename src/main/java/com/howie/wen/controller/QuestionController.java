package com.howie.wen.controller;

import com.howie.wen.model.HostHolder;
import com.howie.wen.model.Question;
import com.howie.wen.model.ViewObject;
import com.howie.wen.service.QuestionService;
import com.howie.wen.service.UserService;
import com.howie.wen.service.WendaService;
import com.howie.wen.util.WendaUtil;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.xml.stream.events.Comment;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author:HowieLee
 * @Date:1/8/2019
 * @Description:com.howie.wen.controller
 * @version:1.0
 */
@Controller
public class QuestionController {
    private static final Logger logger = LoggerFactory.getLogger(QuestionController.class);

    @Autowired(required=false)
    @Qualifier("questionService")
    QuestionService questionService;


    @Autowired(required=false)
    @Qualifier("hostHolder")
    HostHolder hostHolder;

    @Autowired(required=false)
    @Qualifier("userService")
    UserService userService;

    @RequestMapping(value = "/question/add",method = {RequestMethod.POST})
    @ResponseBody
    public String addQuestion(@RequestParam("title") String title,@RequestParam("content") String content){
        try {
            Question question = new Question();
            question.setTitle(title);
            question.setContent(content);
            question.setCreatedDate(new Date());
            question.setCommentCount(0);
            if(hostHolder.getUser() == null){
                //question.setUserId(WendaUtil.ANOYMOUS_USERID);
                return WendaUtil.getJSONString(999);
            }else{
                question.setUserId(hostHolder.getUser().getId());
            }
            if(questionService.addQuestion(question) > 0){
                return WendaUtil.getJSONString(0);
            }
        } catch(Exception e){
            //logger.error("增加题目失败"+e.getMessage());
        }

        return WendaUtil.getJSONString(1,"失败");
    }

    @RequestMapping(value = "/question/{qid}")
    public String questionDetail(Model model, @PathVariable("qid") int qid) {
        Question question = questionService.getById(qid);
        model.addAttribute("question", question);
        model.addAttribute("user",userService.getUser(question.getUserId()));
        return "detail";
    }
}
