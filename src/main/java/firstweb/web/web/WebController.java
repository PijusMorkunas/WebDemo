package firstweb.web.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
    @RequestMapping("/")
    public String login(){
        return "login";
    }

    @RequestMapping("/home")
    public String homepage(){
        return "home";
    }
}
