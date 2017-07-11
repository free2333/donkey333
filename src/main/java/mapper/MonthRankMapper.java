package mapper;

import domain.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2017/7/11.
 */
public interface MonthRankMapper {
    @Select("SELECT * FROM articles WHERE articleID in(" +
            "select articleID from articlevisitions" +
            "where date" +
            "BETWEEN str_to_date('2017-7-1','%Y-%m-%d') AND str_to_date('2017-7-31','%Y-%m-%d'))" +
            "ORDER BY upNum DESC")
    public List<Article> getArticleById();
}
