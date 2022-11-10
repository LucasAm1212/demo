package com.example.demo.data;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.extern.slf4j.Slf4j;

@Generated("jsonschema2pojo")
@Slf4j
public class Workflow {

    @SerializedName("CauseDescription")
    @Expose
    public String causeDescription;
    @SerializedName("CauseId")
    @Expose
    public Integer causeId;
    @SerializedName("Comments")
    @Expose
    public String comments;
    @SerializedName("OccurrenceId")
    @Expose
    public Integer occurrenceId;
    @SerializedName("RejectionDescription")
    @Expose
    public String rejectionDescription;
    @SerializedName("Status")
    @Expose
    public String status;

}
