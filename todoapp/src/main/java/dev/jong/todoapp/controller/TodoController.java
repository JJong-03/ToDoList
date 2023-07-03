package dev.jong.todoapp.controller;

import dev.jong.todoapp.domain.ToDo;
import dev.jong.todoapp.repository.ToDoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor //spring을 실행하면서 자동으로 실행시켜줌.
public class TodoController {
    private  final ToDoRepository toDoRepository;

    @GetMapping("/")
    public String index(Model model){  //값을 넘겨주기 위해 model을 사용한다.
        List<ToDo> todos = toDoRepository.findAll(); //DB에 저장되어있는 모든 파일을 가져온다
        model.addAttribute("todos", todos);
        return "todos";  // -->todos.html로 넘어간다.
    }

//    @GetMapping("/")
//    public String index(){  //값을 넘겨주기 위해 model을 사용한다.
//        return "todos";
//    }
//

    @PostMapping("/addTodo")
    public String addTodo(@RequestParam("todo") String todo){ //html의 todo데이터 받기
       //Database에 저장하면 된다.
        ToDo toDo = new ToDo();
        toDo.setTodo(todo);
        toDoRepository.save(toDo);
        return "redirect:/"; //todos.html로 다시 올라가라.
    }
}
