package com.example.demo.Controller;
import com.example.demo.Server.emailreturnServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class emailConsoller {
    @Autowired
    emailreturnServer emailreturnServer;
    @Autowired
    com.example.demo.Server.e_mailServer e_mailServer;
    @CrossOrigin
    @PostMapping("/NBA_Email")
    public boolean emailretun(
            @RequestParam("u_Name") String name

    ){
        return emailreturnServer.eamilreturn(name);
    }

    @CrossOrigin
    @PostMapping("/NBA_indexEmail")
    public boolean emailindexretun(
            @RequestParam("u_Name") String name,
            @RequestParam("u_email") String email
    ){

        return e_mailServer.sendEmail(email,name);
    }
}
