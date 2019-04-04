package com.service.jszlb.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-04-04T05:15:18.223Z")

@RestSchema(schemaId = "jszlb")
@RequestMapping(path = "/jszlb", produces = MediaType.APPLICATION_JSON)
public class JszlbImpl {

    @Autowired
    private JszlbDelegate userJszlbDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userJszlbDelegate.helloworld(name);
    }

}
