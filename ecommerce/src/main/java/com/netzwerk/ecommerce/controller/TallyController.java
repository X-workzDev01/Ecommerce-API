package com.netzwerk.ecommerce.controller;

import com.netzwerk.ecommerce.serv.TallyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tally")
public class TallyController {
    @Autowired
    private TallyService tallyService;

    @GetMapping("/ledgers")
    public String getLedgers() {
        return tallyService.getLedgers();
    }

}
