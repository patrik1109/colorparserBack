package colorparser.controllers;

import colorparser.entities.Glue;


import colorparser.entities.Manufacturer;
import colorparser.entities.Miks;
import colorparser.entities.Plate;
import colorparser.service.GlueService;
import colorparser.service.ManufacturerService;
import colorparser.service.MiksService;
import colorparser.service.PlateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController

public class ColorPareserController {

    @Autowired
    GlueService glueRepository;

    @Autowired
    PlateService plateRepository;

    @Autowired
    ManufacturerService manufacturerRepository;

    @Autowired
    MiksService miksRepository;


    //rest for testing
    @CrossOrigin
    @GetMapping(value = { "/", "/index" } )
    public String index (Map<String, Object> model){
        //Glue glue = new Glue(2,"R46", "YellowPlate_3", "yellow", "picture",2,null );
        //Plate plate = new Plate(2,"3344","StonePlate","Black_1",1200,2500,20,11);
        //Manufacturer manufacturer = new Manufacturer(1, "1122","CeysarStone", "0542434567", "Ceysar Israel, Ben Gurion 23", "0967782345", "Ceysarstone@gmail.com",null,null);
        //manufacturerRepository.addManufacturer(manufacturer);
        Miks miks = new Miks(1,"6789","Miks1",null,null);
        miksRepository.addMiks(miks);
        return miks.toString();
    }

}
