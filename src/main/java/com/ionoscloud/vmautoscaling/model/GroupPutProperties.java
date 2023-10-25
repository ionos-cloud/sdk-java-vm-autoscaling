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
import com.ionoscloud.vmautoscaling.model.GroupPolicy;
import com.ionoscloud.vmautoscaling.model.GroupPutPropertiesDatacenter;
import com.ionoscloud.vmautoscaling.model.ReplicaPropertiesPost;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GroupPutProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-25T09:34:22.361740Z[Etc/UTC]")

public class GroupPutProperties {
  
  public static final String SERIALIZED_NAME_DATACENTER = "datacenter";
  @SerializedName(SERIALIZED_NAME_DATACENTER)
  private GroupPutPropertiesDatacenter datacenter;


  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;


  public static final String SERIALIZED_NAME_MAX_REPLICA_COUNT = "maxReplicaCount";
  @SerializedName(SERIALIZED_NAME_MAX_REPLICA_COUNT)
  private Long maxReplicaCount;


  public static final String SERIALIZED_NAME_MIN_REPLICA_COUNT = "minReplicaCount";
  @SerializedName(SERIALIZED_NAME_MIN_REPLICA_COUNT)
  private Long minReplicaCount;


  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public static final String SERIALIZED_NAME_POLICY = "policy";
  @SerializedName(SERIALIZED_NAME_POLICY)
  private GroupPolicy policy;


  public static final String SERIALIZED_NAME_REPLICA_CONFIGURATION = "replicaConfiguration";
  @SerializedName(SERIALIZED_NAME_REPLICA_CONFIGURATION)
  private ReplicaPropertiesPost replicaConfiguration;

  

  public GroupPutProperties datacenter(GroupPutPropertiesDatacenter datacenter) {
    
    this.datacenter = datacenter;
    return this;
  }

   /**
   * Get datacenter
   * @return datacenter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GroupPutPropertiesDatacenter getDatacenter() {
    return datacenter;
  }


  public void setDatacenter(GroupPutPropertiesDatacenter datacenter) {
    this.datacenter = datacenter;
  }



   /**
   * The data center location.
   * @return location
  **/
  @ApiModelProperty(example = "de/txl", required = true, value = "The data center location.")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }



  public GroupPutProperties maxReplicaCount(Long maxReplicaCount) {
    
    this.maxReplicaCount = maxReplicaCount;
    return this;
  }

   /**
   * The maximum value for the number of replicas on a VM Auto Scaling Group. Must be &gt;&#x3D; 0 and &lt;&#x3D; 200. Will be enforced for both automatic and manual changes.
   * minimum: 0
   * maximum: 200
   * @return maxReplicaCount
  **/
  @ApiModelProperty(example = "10", required = true, value = "The maximum value for the number of replicas on a VM Auto Scaling Group. Must be >= 0 and <= 200. Will be enforced for both automatic and manual changes.")

  public Long getMaxReplicaCount() {
    return maxReplicaCount;
  }


  public void setMaxReplicaCount(Long maxReplicaCount) {
    this.maxReplicaCount = maxReplicaCount;
  }



  public GroupPutProperties minReplicaCount(Long minReplicaCount) {
    
    this.minReplicaCount = minReplicaCount;
    return this;
  }

   /**
   * The minimum value for the number of replicas on a VM Auto Scaling Group. Must be &gt;&#x3D; 0 and &lt;&#x3D; 200. Will be enforced for both automatic and manual changes
   * minimum: 0
   * maximum: 200
   * @return minReplicaCount
  **/
  @ApiModelProperty(example = "1", required = true, value = "The minimum value for the number of replicas on a VM Auto Scaling Group. Must be >= 0 and <= 200. Will be enforced for both automatic and manual changes")

  public Long getMinReplicaCount() {
    return minReplicaCount;
  }


  public void setMinReplicaCount(Long minReplicaCount) {
    this.minReplicaCount = minReplicaCount;
  }



  public GroupPutProperties name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the VM Auto Scaling Group. This field must not be null or blank.
   * @return name
  **/
  @ApiModelProperty(example = "VM Auto Scaling Group 1", required = true, value = "The name of the VM Auto Scaling Group. This field must not be null or blank.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  public GroupPutProperties policy(GroupPolicy policy) {
    
    this.policy = policy;
    return this;
  }

   /**
   * Get policy
   * @return policy
  **/
  @ApiModelProperty(required = true, value = "")

  public GroupPolicy getPolicy() {
    return policy;
  }


  public void setPolicy(GroupPolicy policy) {
    this.policy = policy;
  }



  public GroupPutProperties replicaConfiguration(ReplicaPropertiesPost replicaConfiguration) {
    
    this.replicaConfiguration = replicaConfiguration;
    return this;
  }

   /**
   * Get replicaConfiguration
   * @return replicaConfiguration
  **/
  @ApiModelProperty(required = true, value = "")

  public ReplicaPropertiesPost getReplicaConfiguration() {
    return replicaConfiguration;
  }


  public void setReplicaConfiguration(ReplicaPropertiesPost replicaConfiguration) {
    this.replicaConfiguration = replicaConfiguration;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupPutProperties groupPutProperties = (GroupPutProperties) o;
    return Objects.equals(this.datacenter, groupPutProperties.datacenter) && Objects.equals(this.location, groupPutProperties.location) && Objects.equals(this.maxReplicaCount, groupPutProperties.maxReplicaCount) && Objects.equals(this.minReplicaCount, groupPutProperties.minReplicaCount) && Objects.equals(this.name, groupPutProperties.name) && Objects.equals(this.policy, groupPutProperties.policy) && Objects.equals(this.replicaConfiguration, groupPutProperties.replicaConfiguration);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupPutProperties {\n");
    
    sb.append("    datacenter: ").append(toIndentedString(datacenter)).append("\n");

    sb.append("    location: ").append(toIndentedString(location)).append("\n");

    sb.append("    maxReplicaCount: ").append(toIndentedString(maxReplicaCount)).append("\n");

    sb.append("    minReplicaCount: ").append(toIndentedString(minReplicaCount)).append("\n");

    sb.append("    name: ").append(toIndentedString(name)).append("\n");

    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");

    sb.append("    replicaConfiguration: ").append(toIndentedString(replicaConfiguration)).append("\n");
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
