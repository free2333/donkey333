package mapper;

import domain.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2017/7/11.
 */
public interface MonthRankMapper {
    @Select("SELECT * FROM articles")
    List<Article> getArticle();
}
