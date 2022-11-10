package com.example.demo.data;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.extern.slf4j.Slf4j;

@Generated("jsonschema2pojo")
@Slf4j
public class EmailAccount {

    @SerializedName("Email")
    @Expose
    public String email;
    @SerializedName("Username")
    @Expose
    public String username;

}