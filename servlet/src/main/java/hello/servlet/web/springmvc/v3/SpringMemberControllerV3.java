package hello.servlet.web.springmvc.v3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/springmvc/v3/members")
public class SpringMemberControllerV3 {

    @RequestMapping("/new-form")
    public String newForm(){
        return "new-form";
    }

    @RequestMapping("/save")
    public String save(
            @RequestParam("username") String username,
            @RequestParam("age") int age
    ){
        return "new-form";
    }

    @RequestMapping
    public String members(){
        return "members";
    }
}
