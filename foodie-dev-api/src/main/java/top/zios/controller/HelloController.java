package top.zios.controller;

        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class HelloController {
    @GetMapping("/hello")
    public Object hello(){
        return "hello world123";
    }
}
