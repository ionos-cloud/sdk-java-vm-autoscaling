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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * The resource metadata.
 */
@ApiModel(description = "The resource metadata.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-25T09:34:22.361740Z[Etc/UTC]")

public class MetadataBasic {
  
  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;


  public static final String SERIALIZED_NAME_ETAG = "etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;


  public static final String SERIALIZED_NAME_LAST_MODIFIED_DATE = "lastModifiedDate";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_DATE)
  private OffsetDateTime lastModifiedDate;


  /**
   * The resource state.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    AVAILABLE("AVAILABLE"),
    
    BUSY("BUSY"),
    
    INACTIVE("INACTIVE"),
    
    SUSPENDED("SUSPENDED");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {

      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  

  public MetadataBasic createdDate(OffsetDateTime createdDate) {
    
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



  public MetadataBasic etag(String etag) {
    
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



  public MetadataBasic lastModifiedDate(OffsetDateTime lastModifiedDate) {
    
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



  public MetadataBasic state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * The resource state.
   * @return state
  **/
  @ApiModelProperty(example = "AVAILABLE", required = true, value = "The resource state.")

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
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
    MetadataBasic metadataBasic = (MetadataBasic) o;
    return Objects.equals(this.createdDate, metadataBasic.createdDate) && Objects.equals(this.etag, metadataBasic.etag) && Objects.equals(this.lastModifiedDate, metadataBasic.lastModifiedDate) && Objects.equals(this.state, metadataBasic.state);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetadataBasic {\n");
    
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");

    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");

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
