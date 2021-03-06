package blog.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import blog.data.GreetingData;

@Controller
@RequestMapping("/greeting")
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public GreetingData sayHello(@RequestParam(value = "name", required = false, defaultValue = "MAN") String name) {
        return new GreetingData(counter.incrementAndGet(), String.format(template, name));
    }
}
