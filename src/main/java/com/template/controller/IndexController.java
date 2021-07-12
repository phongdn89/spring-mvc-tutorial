package com.template.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * @author phongdn - 12 - July - 2021
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(HttpServletRequest request, ModelMap model) {

        return "index";
    }
}
