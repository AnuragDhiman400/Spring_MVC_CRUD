package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Beans.Products;
import com.Dao.productDao;


@Controller
public class productController {
	
	@Autowired
	productDao dao;
	
	@RequestMapping("/show")
	public String show(Model m){  
        List<Products> list=dao.getEmployees();  
    
        m.addAttribute("list",list);
        return "show";  
    } 
}
