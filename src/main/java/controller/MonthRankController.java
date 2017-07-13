package controller;

import domain.Article;
import domain.ArticleVisition;
import domain.ReadNum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.MonthRankService;
import util.MonthTool;

import java.util.Date;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Administrator on 2017/7/11.
 */
@Controller
public class MonthRankController {
    @Autowired
    private MonthRankService monthRankService;

    @RequestMapping("/showMonthRank")
    @ResponseBody
    public List<Article> showMonthRank(){
//        System.out.println("userID=");
//        Calendar calendar1=Calendar.getInstance();
//        Calendar calendar2=Calendar.getInstance();
//
//        calendar1.set(2017,6,1,0,0,0);
//        calendar2.set(2017,6,31,23,59,59);
        Date date1= MonthTool.getMonthFirstDay();
        Date date2=MonthTool.getMonthLastDay();
        List<Article> list=monthRankService.getArticle(date1,date2);
        return list;
    }

    @RequestMapping("/showMonthRankByMonth")
    @ResponseBody
    public List<Article> showMonthRankByMonth(String time){
        System.out.println(time.substring(0,1));
        Date date1=MonthTool.getMontnFirstDayByNum(Integer.parseInt(time.substring(0,1)));
        Date date2=MonthTool.getMontnLastDayByNum(Integer.parseInt(time.substring(0,1)));
        List<Article> list=monthRankService.getArticle(date1,date2);
        System.out.println(list.size());
        return list;
    }
}
