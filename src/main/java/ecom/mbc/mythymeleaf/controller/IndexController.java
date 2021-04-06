package ecom.mbc.mythymeleaf.controller;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ecom.mbc.mythymeleaf.pojo.User;

@Controller
public class IndexController {
    private SimpleDateFormat sdf;
    private File file;

    public IndexController() throws IOException {
        sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        file = new File("");
        System.out.println(file.getCanonicalPath());
        System.out.println("Date format: " + sdf.toPattern());
    }

    @RequestMapping(value = "/index")
    public String index(Model model) throws ParseException {
        User user = new User();
        user.setName("abc");
        user.setAge(11);
        user.setBirthday(sdf.parse("1987-02-19 11:11:11"));

        model.addAttribute("user", user);
        return "indexsh";
    }
}
