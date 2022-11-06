package hello.servlet.web.springmvc.v2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/springmvc/v2/members")
public class SpringMemberControllerV2 {

    @RequestMapping("/new-form")
    public ModelAndView newForm(){
        System.out.println("SpringMemberControllerV2.newForm");
        return new ModelAndView("new-form");
    }

    @RequestMapping("/save")
    public ModelAndView save(){
        System.out.println("SpringMemberControllerV2.save");
        return new ModelAndView("save");
    }

    @RequestMapping
    public ModelAndView members(){
        System.out.println("SpringMemberControllerV2.members");
        return new ModelAndView("members");
    }
}
