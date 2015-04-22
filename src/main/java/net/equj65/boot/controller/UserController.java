package net.equj65.boot.controller;

import net.equj65.boot.domain.User;
import net.equj65.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * {@link net.equj65.boot.domain.User}情報に関するWeb機能を提供するControllerクラスです。
 */
@Controller
@RequestMapping("users")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    String list() {
        return "users/list";
    }

}
