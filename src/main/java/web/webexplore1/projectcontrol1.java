package web.webexplore1;

import org.springframework.web.bind.annotation.*;

@RestController
public class projectcontrol1 {


    @RequestMapping(value = "/family")
    public project1 getdata(){

        return new project1("venkatesh", "brindha");

    }


    @GetMapping("{fathername}/ {mothername}")
    public project1 getdata1(@PathVariable("fathername") String fathername, @PathVariable("mothername") String mothername) {
        return new project1("Ramaswamy", "Prabhamani");
    }


    @GetMapping("/project1/solution")
    public project1 getdata2(@RequestParam(name= "fahtername") String fathername, @RequestParam(name= "mothername") String mothername){
        return new project1(fathername, mothername);
    }


}







