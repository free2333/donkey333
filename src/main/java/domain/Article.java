package domain;

import java.sql.Date;

/**
 * TODO()
 * Created by zqq on 2017/7/10 0010.
 */
public class Article {

    private Integer articleID;
    private String title;
    private String username;
    private Date writeTime;
    private String content;
    private Integer upNum;
    private Integer downNum;
    private Integer flowers;
    private Integer photoID;

    public Integer getPhotoID() {
        return photoID;
    }

    public void setPhotoID(Integer photoID) {
        this.photoID = photoID;
    }

    public Integer getArticleID() {
        return articleID;
    }

    public void setArticleID(Integer articleID) {
        this.articleID = articleID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getWriteTime() {
        return writeTime;
    }

    public void setWriteTime(Date writeTime) {
        this.writeTime = writeTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getUpNum() {
        return upNum;
    }

    public void setUpNum(Integer upNum) {
        this.upNum = upNum;
    }

    public Integer getDownNum() {
        return downNum;
    }

    public void setDownNum(Integer downNum) {
        this.downNum = downNum;
    }

    public Integer getFlowers() {
        return flowers;
    }

    public void setFlowers(Integer flowers) {
        this.flowers = flowers;
    }
}
