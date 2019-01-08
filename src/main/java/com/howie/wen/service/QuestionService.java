package com.howie.wen.service;

import com.howie.wen.dao.QuestionDAO;
import com.howie.wen.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:HowieLee
 * @Date:1/7/2019
 * @Description:com.howie.wen.service
 * @version:1.0
 */
@Service
public class QuestionService {

    @Autowired(required=false)
    @Qualifier("questionDAO")
    QuestionDAO questionDAO;


    public int addQuestion(Question question){
//        questionDAO.addQuestion(question);
        //敏感词过滤
        return questionDAO.addQuestion(question) > 0 ? question.getId() : 0;
    }

    public List<Question> getLatestQuestions(int userId, int offset, int limit) {
        return questionDAO.selectLatestQuestions(userId, offset, limit);
    }
}

