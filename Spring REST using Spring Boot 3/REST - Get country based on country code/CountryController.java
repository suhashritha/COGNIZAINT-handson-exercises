package com.cognizant.countrycoderestservice.controller;


import com.cognizant.countrycoderestservice.Country;
import com.cognizant.countrycoderestservice.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class CountryController {


    @Autowired
    private CountryService countryService;



    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code){


        return countryService.getCountry(code);

    }

}
