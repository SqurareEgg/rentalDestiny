package com.square.rentalDestiny.controller;

import com.square.rentalDestiny.dto.MemberDTO;
import com.square.rentalDestiny.service.MemberService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @PostMapping("/login")
    public String login(@ModelAttribute MemberDTO memberDTO, HttpServletRequest httpServletRequest){
        MemberDTO loginResult = memberService.login(memberDTO);
        if(loginResult != null){
            httpServletRequest.getSession().invalidate();
            HttpSession session = httpServletRequest.getSession(true);
            session.setAttribute("loginId",loginResult.getMemberId());
            session.setAttribute("loginName",loginResult.getMemberName());
        }
        return "redirect:/";
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request){
        HttpSession session = request.getSession(false);
        if(session != null){
            session.invalidate();
            return "redirect:/";
        }
        return "redirect:/";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute MemberDTO memberDTO){
        memberService.register(memberDTO);
        return "redirect:/";
    }
}
