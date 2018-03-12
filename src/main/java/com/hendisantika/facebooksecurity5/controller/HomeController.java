package com.hendisantika.facebooksecurity5.controller;

import com.hendisantika.facebooksecurity5.api.facebook.Facebook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by IntelliJ IDEA.
 * Project : facebook-security5
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/03/18
 * Time: 20.45
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class HomeController {

    private Facebook facebook;

    @Autowired
    public HomeController(Facebook facebook) {
        this.facebook = facebook;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("profile", facebook.getProfile());
        model.addAttribute("feed", facebook.getFeed());
        return "home";
    }

}
