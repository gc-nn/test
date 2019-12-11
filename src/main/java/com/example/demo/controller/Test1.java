package com.example.demo.controller;

import com.example.demo.pojo.Article;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/main")
public class Test1 {

    @ResponseBody
    @RequestMapping("hello")
    public String main(){

        return "helloword" ;
    }

    @RequestMapping("/hahalolo")
    public String getArticleList(Model model) {
        List<Article> list = new ArrayList();
        list.add(new Article(1,"first","摘要1","今天"));
        model.addAttribute("list", list);
        return "hello.html";
    }
}
