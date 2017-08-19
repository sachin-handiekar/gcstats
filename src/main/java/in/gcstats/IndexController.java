package in.gcstats;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(Model model) {
        System.out.println("Index page....");
        return "index";
    }


    @RequestMapping("/index")
    public String greeting(Model model) {
        return "index";
    }
}
