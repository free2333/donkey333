package service;

import domain.Article;
import domain.ArticleVisition;
import domain.ReadNum;
import mapper.MonthRankMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/7/11.
 */
@Service
public class MonthRankService {
    @Autowired
    private MonthRankMapper monthRankMapper;

//    public List<Integer> getArticle(Date date1, Date date2){
//        return monthRankMapper.getArticle(date1,date2);
//    }
    public List<Article> getArticle(Date date1, Date date2){
        List<Article> list1=monthRankMapper.getArticle(date1,date2);
        List<ArticleVisition> list2=monthRankMapper.getArticleID(date1,date2);
        List<Article> list3=new ArrayList<Article>();
        for(int i=0;i<list2.size();i++){
            for(int j=0;j<list1.size();j++){
                if(list2.get(i).getArticleID()==list1.get(j).getArticleID()){
                    list3.add(list1.get(j));
                    break;
                }
            }
        }
        return list3;
    }

    //取出每月阅读量排行榜的文章ID
//    public List<ArticleVisition> getArticleID(Date date1,Date date2){
//        return monthRankMapper.getArticleID(date1,date2);
//    }
}
