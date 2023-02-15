package com.example.homeworkjasonapi.controller;

import com.example.homeworkjasonapi.logic.IMessage;
import com.example.homeworkjasonapi.logic.ISolver;
import com.example.homeworkjasonapi.message.ErrorMessage;
import com.example.homeworkjasonapi.message.InputMessage;
import com.example.homeworkjasonapi.message.Message;
import com.example.homeworkjasonapi.message.OutputMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/circle")
public class MainController {

    @Autowired
    private ISolver solver;


    // 1. ping
    @GetMapping("/ping")
    public @ResponseBody Message ping() {

        return new Message("pong");
    }

    // 2. статус сервера
    @GetMapping("/status")
    public @ResponseBody Message status() {
        return new Message("Server status OK at port 8080");
    }

    // 3. решение
    @PostMapping("/solve")
    public IMessage solve(@RequestBody InputMessage input) {
        System.out.println("Received data: " + input);
        OutputMessage out = solver.solve(input);    // вызов решения
        if (out == null) {
            return new ErrorMessage("error");
        }
        return solver.solve(input);
    }
}
