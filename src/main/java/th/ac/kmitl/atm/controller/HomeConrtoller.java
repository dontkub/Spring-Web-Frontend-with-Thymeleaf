package th.ac.kmitl.atm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeConrtoller {
    @RequestMapping("/home")
    public String getHomePage(Model model){
        model.addAttribute("greeting","Sawaddee");
        return "home"; //home templates
    }
}
