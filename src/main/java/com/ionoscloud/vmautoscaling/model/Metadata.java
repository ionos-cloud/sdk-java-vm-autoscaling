/*
 * VM Auto Scaling API
 * The VM Auto Scaling Service enables IONOS clients to horizontally scale the number of VM replicas based on configured rules. You can use VM Auto Scaling to ensure that you have a sufficient number of replicas to handle your application loads at all times.  For this purpose, create a VM Auto Scaling Group that contains the server replicas. The VM Auto Scaling Service ensures that the number of replicas in the group is always within the defined limits.   When scaling policies are set, VM Auto Scaling creates or deletes replicas according to the requirements of your applications. For each policy, specified 'scale-in' and 'scale-out' actions are performed when the corresponding thresholds are reached.
 *
 * The version of the OpenAPI document: 1-SDK.1
 * Contact: support@cloud.ionos.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ionoscloud.vmautoscaling.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ionoscloud.vmautoscaling.model.MetadataState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * The resource metadata.
 */
@ApiModel(description = "The resource metadata.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-25T09:34:22.361740Z[Etc/UTC]")

public class Metadata {
  
  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;


  public static final String SERIALIZED_NAME_CREATED_BY_USER_ID = "createdByUserId";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_USER_ID)
  private String createdByUserId;


  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;


  public static final String SERIALIZED_NAME_ETAG = "etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;


  public static final String SERIALIZED_NAME_LAST_MODIFIED_BY = "lastModifiedBy";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_BY)
  private String lastModifiedBy;


  public static final String SERIALIZED_NAME_LAST_MODIFIED_BY_USER_ID = "lastModifiedByUserId";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_BY_USER_ID)
  private String lastModifiedByUserId;


  public static final String SERIALIZED_NAME_LAST_MODIFIED_DATE = "lastModifiedDate";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_DATE)
  private OffsetDateTime lastModifiedDate;


  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private MetadataState state;

  

  public Metadata createdBy(String createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * The user who created the resource.
   * @return createdBy
  **/
  @ApiModelProperty(example = "user@mail.local", required = true, value = "The user who created the resource.")

  public String getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }



  public Metadata createdByUserId(String createdByUserId) {
    
    this.createdByUserId = createdByUserId;
    return this;
  }

   /**
   * The ID of the user who created the resource.
   * @return createdByUserId
  **/
  @ApiModelProperty(example = "919e4752-e700-40b1-9507-5ac545bb6355", required = true, value = "The ID of the user who created the resource.")

  public String getCreatedByUserId() {
    return createdByUserId;
  }


  public void setCreatedByUserId(String createdByUserId) {
    this.createdByUserId = createdByUserId;
  }



  public Metadata createdDate(OffsetDateTime createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * The date the resource was created.
   * @return createdDate
  **/
  @ApiModelProperty(example = "2021-06-21T08:46:01.249829Z", required = true, value = "The date the resource was created.")

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }



  public Metadata etag(String etag) {
    
    this.etag = etag;
    return this;
  }

   /**
   * The resource etag.
   * @return etag
  **/
  @ApiModelProperty(required = true, value = "The resource etag.")

  public String getEtag() {
    return etag;
  }


  public void setEtag(String etag) {
    this.etag = etag;
  }



  public Metadata lastModifiedBy(String lastModifiedBy) {
    
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

   /**
   * The last user who modified the resource.
   * @return lastModifiedBy
  **/
  @ApiModelProperty(example = "user@mail.local", required = true, value = "The last user who modified the resource.")

  public String getLastModifiedBy() {
    return lastModifiedBy;
  }


  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }



  public Metadata lastModifiedByUserId(String lastModifiedByUserId) {
    
    this.lastModifiedByUserId = lastModifiedByUserId;
    return this;
  }

   /**
   * The ID of the last user who modified the resource.
   * @return lastModifiedByUserId
  **/
  @ApiModelProperty(example = "919e4752-e700-40b1-9507-5ac545bb6355", required = true, value = "The ID of the last user who modified the resource.")

  public String getLastModifiedByUserId() {
    return lastModifiedByUserId;
  }


  public void setLastModifiedByUserId(String lastModifiedByUserId) {
    this.lastModifiedByUserId = lastModifiedByUserId;
  }



  public Metadata lastModifiedDate(OffsetDateTime lastModifiedDate) {
    
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

   /**
   * The date the resource was last modified.
   * @return lastModifiedDate
  **/
  @ApiModelProperty(example = "2021-07-26T09:30:39.562006Z", required = true, value = "The date the resource was last modified.")

  public OffsetDateTime getLastModifiedDate() {
    return lastModifiedDate;
  }


  public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }



  public Metadata state(MetadataState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(required = true, value = "")

  public MetadataState getState() {
    return state;
  }


  public void setState(MetadataState state) {
    this.state = state;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Metadata metadata = (Metadata) o;
    return Objects.equals(this.createdBy, metadata.createdBy) && Objects.equals(this.createdByUserId, metadata.createdByUserId) && Objects.equals(this.createdDate, metadata.createdDate) && Objects.equals(this.etag, metadata.etag) && Objects.equals(this.lastModifiedBy, metadata.lastModifiedBy) && Objects.equals(this.lastModifiedByUserId, metadata.lastModifiedByUserId) && Objects.equals(this.lastModifiedDate, metadata.lastModifiedDate) && Objects.equals(this.state, metadata.state);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Metadata {\n");
    
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");

    sb.append("    createdByUserId: ").append(toIndentedString(createdByUserId)).append("\n");

    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");

    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");

    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");

    sb.append("    lastModifiedByUserId: ").append(toIndentedString(lastModifiedByUserId)).append("\n");

    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");

    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

