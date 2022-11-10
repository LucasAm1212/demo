package com.example.demo.data;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.extern.slf4j.Slf4j;

@Generated("jsonschema2pojo")
@Slf4j
public class PreOccurrence {

    @SerializedName("ChannelType")
    @Expose
    public String channelType;
    @SerializedName("CreationDate")
    @Expose
    public Integer creationDate;
    @SerializedName("EmailAccount")
    @Expose
    public EmailAccount emailAccount;
    @SerializedName("EmailSubject")
    @Expose
    public String emailSubject;
    @SerializedName("From")
    @Expose
    public String from;
    @SerializedName("Id")
    @Expose
    public Integer id;
    @SerializedName("MessageGuid")
    @Expose
    public String messageGuid;
    @SerializedName("Status")
    @Expose
    public String status;
    @SerializedName("To")
    @Expose
    public String to;

}