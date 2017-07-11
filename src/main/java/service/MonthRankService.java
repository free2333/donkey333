package service;

import domain.Article;
import mapper.MonthRankMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/7/11.
 */
@Service
public class MonthRankService {
    @Autowired
    private MonthRankMapper monthRankMapper;

    public List<Article> getArticle(){
        return monthRankMapper.getArticle();
    }
}
