package com.netzwerk.ecommerce.controller;

import com.netzwerk.ecommerce.dto.EcommDTO;
import com.netzwerk.ecommerce.serv.EcommServImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class EcommController {

    @Autowired
    private EcommServImpl serv;

    @GetMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("devices",serv.getAllDevices());
        return "index";
    }

    @GetMapping("/addNew")
    public String addNewDevice(Model model){
        model.addAttribute("device", new EcommDTO());

        return "newDevice";
    }

    @PostMapping("/saveDevice")
    public String saveDevice( EcommDTO dto, Model model){
        model.addAttribute("device", dto);
        serv.save(dto);
        return "redirect:/";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String updateForm(@PathVariable(value = "id") Integer id, Model model) {
        EcommDTO dto = serv.findById(id);
        model.addAttribute("device", dto);
        return "updateDevice";
    }

    @GetMapping("/deleteDevice/{id}")
    public String deleteThroughId(@PathVariable(value = "id") Integer id) {
        serv.deleteViaId(id);
        return "redirect:/";

    }

    //Testing using postman
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@RequestBody EcommDTO dto){
        boolean save = serv.save(dto);
        if (save){
            System.out.println(dto.toString());
            return "DTO saved";
        }
        return "DTO not saved";
    }

    //To test using postman
    @RequestMapping(value = "/findByName",method = RequestMethod.GET)
    public List<EcommDTO> findByName(@RequestParam String model){

        return serv.findByModel(model);
    }

    //To test using postman
    @RequestMapping(value = "/allDevices", method = RequestMethod.GET)
    public List<EcommDTO> findAll(@RequestParam(defaultValue = "0") int pageMin,
                                  @RequestParam(defaultValue = "10") int pageMax,
                                  @RequestParam(defaultValue = "id") String sortBy,
                                  @RequestParam(defaultValue = "ASC") String sortDirection){
        Page<EcommDTO> page = serv.findAll(pageMin,pageMax,sortBy,sortDirection);
        return page.getContent();
    }



}
