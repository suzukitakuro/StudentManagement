package raisetech.student.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    private String name = "suzuki";
    private String age = "29";

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }

    @GetMapping("/studentinfo")
    public String getstudentinfo() {
        return name+""+age+"歳";
    }


    @PostMapping("/studentinfo")
    public void setName(String name,String age) {
        this.name = name;
        this.age = age;

    }
    @PostMapping("/studentName")
    public  void UpdatestudentName(String name){
        this.name = name;
    }
}
