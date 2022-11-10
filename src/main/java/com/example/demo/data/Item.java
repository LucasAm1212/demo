package com.example.demo.data;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.extern.slf4j.Slf4j;

@Generated("jsonschema2pojo")
@Slf4j
public class Item {

    @SerializedName("AccessKey")
    @Expose
    public String accessKey;
    @SerializedName("Comments")
    @Expose
    public String comments;
    @SerializedName("CreationDate")
    @Expose
    public String creationDate;
    @SerializedName("DocumentCode")
    @Expose
    public String documentCode;
    @SerializedName("DocumentGroup")
    @Expose
    public String documentGroup;
    @SerializedName("FileName")
    @Expose
    public String fileName;
    @SerializedName("ItemId")
    @Expose
    public Integer itemId;
    @SerializedName("MimeType")
    @Expose
    public String mimeType;
    @SerializedName("PreOccurrence")
    @Expose
    public PreOccurrence preOccurrence;
    @SerializedName("RelatedFiles")
    @Expose
    public List<Object> relatedFiles = null;
    @SerializedName("Status")
    @Expose
    public String status;
    @SerializedName("Workflow")
    @Expose
    public Workflow workflow;

}