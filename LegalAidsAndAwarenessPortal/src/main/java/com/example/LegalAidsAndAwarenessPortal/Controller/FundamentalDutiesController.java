package com.example.LegalAidsAndAwarenessPortal.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/fundamental-duties")
public class FundamentalDutiesController {

    @GetMapping
    public String fundamentalDuties(){
        return "Fundamental_Duties";
    }
}
