package com.rsakin;

import io.micronaut.http.annotation.*;

@Controller("/sample-micronaut-swagger")
public class SampleMicronautSwaggerController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}