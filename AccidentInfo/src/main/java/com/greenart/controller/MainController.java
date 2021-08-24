package com.greenart.controller;

import java.util.List;

import com.greenart.service.AccidentInfoService;
import com.greenart.vo.AccidentBycInfoVO;
import com.greenart.vo.AccidentChdInfoVO;
import com.greenart.vo.AccidentOldInfoVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @Autowired
    AccidentInfoService service;
    @GetMapping("/")
    public String getMain(Model model) {
        AccidentOldInfoVO Ovo = service.selectAcdOldAllYearCnt();
        model.addAttribute("acdOldAllYearCnt", Ovo);
        AccidentChdInfoVO Cvo = service.selectAcdChdRyearCnt();
        model.addAttribute("acdChdAllYearCnt", Cvo);
        AccidentBycInfoVO Bvo = service.selectAcdBycRyearCnt();
        model.addAttribute("acdBycAllYearCnt", Bvo);

        AccidentOldInfoVO DOvo = service.selectAcdOldDthCnt();
        model.addAttribute("oldDthCnt", DOvo);

        return "/index";
    }
}
