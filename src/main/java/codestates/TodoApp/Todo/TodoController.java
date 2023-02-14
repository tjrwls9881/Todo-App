package codestates.TodoApp.Todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @GetMapping
    public String helloWorld(){
        return "to-do Application !";
    }
}
