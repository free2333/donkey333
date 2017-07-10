package mapper;

import domain.TestUser;
import org.apache.ibatis.annotations.Select;


/**
 * Created by Administrator on 2017/7/8.
 */
public interface UserMapper {
    @Select("select * from users where id=#{param1} and password=#{param2}")
    TestUser checkUser(int id, String password);
}
