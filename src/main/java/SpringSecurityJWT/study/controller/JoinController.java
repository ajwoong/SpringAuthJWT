package SpringSecurityJWT.study.controller;

import SpringSecurityJWT.study.dto.JoinDTO;
import SpringSecurityJWT.study.service.JoinService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequiredArgsConstructor
public class JoinController {

    private final JoinService joinService;

    @PostMapping("/join")
    public String joinP(JoinDTO joinDTO){
        joinService.joinProcess(joinDTO);
        return "ok";
    }

}
