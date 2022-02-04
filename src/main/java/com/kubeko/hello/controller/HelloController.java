package com.kubeko.hello.controller;

import com.kubeko.hello.service.HelloService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/myapp")
public class HelloController {

    String var;

    @GetMapping
    @RequestMapping("/hello")
    public String sayHello(@RequestParam("input") String input) {

        return "hello" + input;
    }

    @GetMapping
    @RequestMapping("/goodBye")
    public String sayBye() {
        return "Good Bye" + var;
    }

    @PostMapping
    @RequestMapping("/save")
    public String save(@RequestBody String data) {

        HelloService service = new HelloService();
        String response=service.save(data);

        return response;

    }


}
