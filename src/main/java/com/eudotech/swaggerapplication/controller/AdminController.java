package com.eudotech.swaggerapplication.controller;

import com.eudotech.swaggerapplication.entity.User;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @ApiOperation(value = "Get a user by id", notes = "Returns a user as per the id")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved"),
            @ApiResponse(code = 401, message = "Unauthorised"),
            @ApiResponse(code = 404, message = "Not found - The user was not found"),
            @ApiResponse(code = 500, message = "Internal Server Error")
    })
    @GetMapping(value = "user/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public User getUserDetails(@PathVariable("id") @ApiParam(name = "id", value = "user id", example = "1") int id) {
        if (String.valueOf(id) != null) {
            return new User(1,"Shankar");
        } else {
            return null;
        }
    }
}
