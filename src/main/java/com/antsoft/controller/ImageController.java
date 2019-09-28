package com.antsoft.controller;

import net.sf.jasperreports.j2ee.servlets.ImageServlet;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Controller
@RequestMapping("/jasper")
public class ImageController {

    @RequestMapping(value = "/image")
    public void html(HttpServletRequest request,
                     HttpServletResponse response) {

        ImageServlet imageServlet = new ImageServlet();
        try {
            imageServlet.service(request, response);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        }

    }
}
