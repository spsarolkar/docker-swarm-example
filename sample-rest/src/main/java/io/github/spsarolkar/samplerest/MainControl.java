package io.github.spsarolkar.samplerest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@Controller
public class MainControl {

    @RequestMapping(value="/hello/{user}",method = RequestMethod.GET)
    public @ResponseBody String sayHello(@PathVariable(value = "user") String user, HttpServletResponse response) tt{


        return "Hello "+user;
    }
}
