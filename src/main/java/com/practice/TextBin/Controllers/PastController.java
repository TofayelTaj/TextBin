package com.practice.TextBin.Controllers;

import com.practice.TextBin.Entitys.Past;
import com.practice.TextBin.Repositories.PastRepository;
import com.practice.TextBin.Services.DeletePastTask;
import com.practice.TextBin.Services.ILinkGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Timer;


@Controller
@RequestMapping("/")
public class PastController {


    private ILinkGenerator linkGenerator;
    @Autowired
    private PastRepository pastRepository;

    PastController(ILinkGenerator linkGenerator){
        this.linkGenerator = linkGenerator;
    }

    @PostMapping("past")
    public ModelAndView pastText(@ModelAttribute Past past, ModelAndView mv){
        past.setLink(linkGenerator.generateLink());

        Timer timer = new Timer();
        DeletePastTask task = new DeletePastTask();
      
        timer.schedule( task , past.getTimeOutInMin() * 6000);

        pastRepository.save(past);

        mv.addObject("link", past.getLink());
        mv.setViewName("index");
        return  mv;
    }

    @GetMapping("past/{link}")
    public ModelAndView getPastedText(@PathVariable String link, ModelAndView mv){

        Past p = pastRepository.getByLink("/past/"+link);

        mv.addObject("content", p.getText());
        mv.setViewName("index");
        return mv;
    }



}
