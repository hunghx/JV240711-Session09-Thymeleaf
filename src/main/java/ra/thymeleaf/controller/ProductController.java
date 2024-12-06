package ra.thymeleaf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ra.thymeleaf.model.dto.ProductAddDto;
import ra.thymeleaf.service.IProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;
    @GetMapping
    public String showListProducts(Model model){ //ModelAndView
        model.addAttribute("list",productService.findAll());
        return "product/list";
    }
    @GetMapping("/add")
    public String showFormAdd(Model model){
        model.addAttribute("product",new ProductAddDto());
        return "product/add";
    }
    @PostMapping("/add")
    public String doAdd(@ModelAttribute("product") ProductAddDto request){
        boolean check = productService.add(request);
        if (check){
            return "redirect:/product";
        }else {
            return "redirect:/product?error=Khong_the_them_san_pham";
        }
    }
}
