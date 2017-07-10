package controller;

import domain.TestUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.UserService;

/**
 * Created by Administrator on 2017/7/8.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/checkuser")
    public String checkUser(TestUser user){
        System.out.println(user.getId()+","+user.getPassword());
        if(userService.checkUser(user)!=null){
            return "index";
        }
        return "login";
    }

}
