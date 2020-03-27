/*
 * Armen Petrosyan
 * group c
 * 27/03/2020
 * G00343137
 * */
package ie.gmit.single;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class UserController {

    //Handles incoming JSON requests that work on User resource/entity

    private userValidation validation = new userValidation();
    private StoreUserCheck userCheck = new StoreUserCheck();

    //Create a new user
    public String createUser(String userJson) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        User user = mapper.readValue(userJson, User.class);

        boolean checkedUser = validation.checkUser(user);

        if (!checkedUser) {
            return "ERROR";
        }

        userCheck.saveUser(user);

        return "SUCCESS";
    }
}

