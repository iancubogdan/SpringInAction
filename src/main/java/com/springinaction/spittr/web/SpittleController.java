package com.springinaction.spittr.web;

import com.springinaction.spittr.Spittle;
import com.springinaction.spittr.data.SpittleRepository;
import com.springinaction.spittr.exceptions.DuplicateSpittleException;
import com.springinaction.spittr.exceptions.SpittleNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * Created by Bogdan on 12/28/2015.
 */
@Controller
@RequestMapping("/spittles")
public class SpittleController {

    public static final String MAX_LONG_AS_STRING = "9223372036854775807";
    private SpittleRepository spittleRepository;

//    public SpittleController() {
//    }

    @Autowired
    public SpittleController(SpittleRepository spittleRepository) {
        this.spittleRepository = spittleRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String spittles(@RequestParam(value = "max", defaultValue = MAX_LONG_AS_STRING) long max,
                           @RequestParam(value = "count", defaultValue = "20") int count, Model model){
        model.addAttribute(spittleRepository.findSpittles(max, count));
        return "spittles";
    }

    @RequestMapping(value = "/{spittleId}", method = RequestMethod.GET)
    public String spittle(@PathVariable("spittleId") long spittleId, Model model){
        Spittle spittle = spittleRepository.findOne(spittleId);
        if(spittle == null){
            throw new SpittleNotFoundException();
        }
        model.addAttribute(spittle);
        return "spittle";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String saveSpittle(Spittle form, Model model){
        spittleRepository.save(new Spittle(form.getMessage(), new Date(), form.getLongitude(),form.getLatitude()));
        return "redirect:/spittles";
    }


}
