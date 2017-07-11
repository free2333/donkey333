package controller;

import domain.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
    public List<Article> showMonthRank(int userID){
        System.out.println("userID="+userID);
        return monthRankService.getArticle();
    }
}
