package  controller;
import bean.ResponseBean;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/user")
public class UserController {
  @PostMapping("/create")
  public ResponseEntity<ResponseBean> createUser(){
    ResponseBean responseBean = new ResponseBean();
    //create user by calling service
    return new ResponseEntity<>(responseBean, HttpStatus.OK);
  }
  @PostMapping("/sign-in")
  public ResponseEntity<ResponseBean> signIn(){
    ResponseBean responseBean = new ResponseBean();
    //login user
    return new ResponseEntity<>(responseBean, HttpStatus.OK);
  }

}