package com.cognizant.countrycoderestservice.service;


import com.cognizant.countrycoderestservice.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;


@Service
public class CountryService {


    public Country getCountry(String code) {


        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");


        List<Country> countries = Arrays.asList(

                context.getBean("countryIndia", Country.class),
                context.getBean("countryUSA", Country.class),
                context.getBean("countryGermany", Country.class),
                context.getBean("countryJapan", Country.class)

        );


        for(Country country : countries){

            if(country.getCode()
                    .equalsIgnoreCase(code)){

                return country;

            }

        }


        return null;

    }

}
