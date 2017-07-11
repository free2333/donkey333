package controller;

import domain.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.MonthRankService;

import java.util.List;

/**
 * Created by Administrator on 2017/7/11.
 */
@Controller
public class MonthRankController {
    @Autowired
    private MonthRankService monthRankService;

    @RequestMapping
    @ResponseBody
    public List<Article> showMonthRank(){
//        System.out.println("userID="+userID);
        return monthRankService.getArticle();
    }
}
