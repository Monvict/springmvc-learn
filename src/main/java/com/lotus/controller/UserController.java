package com.lotus.controller;

import com.lotus.modle.User;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/19.
 */
public class UserController extends AbstractController{

    protected ModelAndView handleRequestInternal(
            HttpServletRequest request, HttpServletResponse response) throws Exception {

        List<User> userList = new ArrayList<User>();

        User A = new User();
        A.setUserName("Jack");
        A.setAge(23);

        User B = new User();
        B.setUserName("Rose");
        B.setAge(21);

        userList.add(A);
        userList.add(B);

        return new ModelAndView("userList", "users", userList);
    }
}
