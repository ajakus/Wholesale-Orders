package edu.wctc.wholesale;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MVCController {

    @Autowired
    private ModelMapper modelMapper;

}
