package learning.webservice.handle;

import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandle {

    public String handle(Exception e){
        return "xx";
    }
}
