package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public void hello(Model model) {
        model.addAttribute("name", "한글되냐?");
    }

    @RequestMapping("/json")
    @ResponseBody
    public Map<String, String> json() {
        Map<String, String> data = new HashMap<>();
        data.put("1", "1");
        data.put("2", "2");
        return data;
    }

}
