package mapper;

import domain.Article;
import domain.ArticleVisition;
import domain.ReadNum;
import org.apache.ibatis.annotations.*;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/7/11.
 */
public interface MonthRankMapper {
//    @Select("select count(0) from articlevisitions " +
//            "where date " +
//            "BETWEEN #{param1} AND #{param2} " +
//            "GROUP BY articleID")
//    List<Integer> getArticle(Date date1, Date date2);
    @Select("SELECT * FROM articles WHERE articleID in( select DISTINCT articleID from articlevisitions where date BETWEEN #{param1} AND #{param2}) ORDER BY upNum DESC;")
//    @Results({
//            @Result(property = "articleid" ,column="articleID"),
//            @Result(property = "scannum",column = "scannum")}
//    )
    List<Article> getArticle(Date date1, Date date2);

    //取出每月阅读量的排行榜
    @Select("select DISTINCT articleID from articlevisitions where date BETWEEN #{param1} AND #{param2} GROUP BY articleID ORDER BY count(0) DESC")
    List<ArticleVisition> getArticleID(Date date1,Date date2);
}
