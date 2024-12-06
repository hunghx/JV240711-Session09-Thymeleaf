package ra.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Random;

@Controller
public class HomeController {
    @RequestMapping
    public String home(Model model) {
        String[] days = {"MONDAY","TUESDAY","WEDNESDAY","",""};
        model.addAttribute("name", " Hồ Xuân Hung");
        model.addAttribute("list", Arrays.asList(1,2,4,5,7,8));
        model.addAttribute("age",new Random().nextInt(50));
        model.addAttribute("day",days[new Random().nextInt(4)]);
        model.addAttribute("now", LocalDateTime.now());
        return "index";
    }

//    Bài tập ưng dụng :Tạo mảng ngẫu nhiên 20 số không trùng lặp từ 2-100
    // sử dụng cú pháp thymleaf để hiển thị các số chia hết cho 3 ra màn hình
}
