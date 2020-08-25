package com.imooc.controller;

        import org.slf4j.Logger;
        import org.slf4j.LoggerFactory;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RestController;
        import springfox.documentation.annotations.ApiIgnore;

        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpSession;

//@Controller
@ApiIgnore//不让该接口在swagger里面显示
@RestController
public class HelloController {

    final static Logger logger= LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    public Object hello(){

        logger.info("info: hello~");
        logger.debug("debug: hello~");
        logger.warn("warn: hello~");
        logger.error("error: hello~");

        return "hello world123";
    }

    @GetMapping("/setSession")
    public Object setSession(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.setAttribute("userInfo","new user");
        session.setMaxInactiveInterval(3600);
        session.getAttribute("userInfo");
   //     session.removeAttribute("userInfo");
        return "ok";

    }
}
