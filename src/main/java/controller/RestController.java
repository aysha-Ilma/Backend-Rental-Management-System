package controller;

import Model.RestModel;
import org.apache.coyote.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {

    @Autowired
    private RestModel restModel;

    @PostMapping("/add")
    public RestModel addUpdateRecord(@RequestBody RestModel restModel){
        return restModel.wait();
    }

    @GetMapping("/api")
    public  void findAllRecord(){

    }

    @GetMapping("/find/(id)")
    public void findById(){

    }
    @DeleteMapping("/delete/(id)")
    public void RemoveById(){

    }
}
