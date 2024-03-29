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
import com.ionoscloud.vmautoscaling.model.ServerResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * ServerCollection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-25T09:34:22.361740Z[Etc/UTC]")

public class ServerCollection {
  
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private URI href;


  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<ServerResource> items = null;

  

   /**
   * The unique resource identifier.
   * @return id
  **/
  @ApiModelProperty(example = "1d67ca27-d4c0-419d-9a64-9ea42dfdd036/servers", required = true, value = "The unique resource identifier.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }



   /**
   * The resource type.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "collection", value = "The resource type.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



   /**
   * The absolute URL to the resource&#39;s representation.
   * @return href
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://api.ionos.com/autoscaling/groups/1d67ca27-d4c0-419d-9a64-9ea42dfdd036/servers", value = "The absolute URL to the resource's representation.")

  public URI getHref() {
    return href;
  }


  public void setHref(URI href) {
    this.href = href;
  }



  public ServerCollection items(List<ServerResource> items) {
    
    this.items = items;
    return this;
  }

  public ServerCollection addItemsItem(ServerResource itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<ServerResource>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ServerResource> getItems() {
    return items;
  }


  public void setItems(List<ServerResource> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerCollection serverCollection = (ServerCollection) o;
    return Objects.equals(this.id, serverCollection.id) && Objects.equals(this.type, serverCollection.type) && Objects.equals(this.href, serverCollection.href) && Objects.equals(this.items, serverCollection.items);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerCollection {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");

    sb.append("    href: ").append(toIndentedString(href)).append("\n");

    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

