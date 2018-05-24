package com.restful.webservices.restfulwebservices.HelloWorld;


import com.restful.webservices.restfulwebservices.HelloWorld.HelloWorldBean;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

//@RequestMapping(method = RequestMethod.GET, path="/hello-world")
    @GetMapping(path="/hello-world")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping(path="/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }

    @GetMapping(path="/hello-world-bean/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable  String name){
        return new HelloWorldBean(String.format("Hello World,%s",name));
    }
}
