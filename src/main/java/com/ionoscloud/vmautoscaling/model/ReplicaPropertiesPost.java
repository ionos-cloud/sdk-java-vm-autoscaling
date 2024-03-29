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
import com.ionoscloud.vmautoscaling.model.AvailabilityZone;
import com.ionoscloud.vmautoscaling.model.CpuFamily;
import com.ionoscloud.vmautoscaling.model.ReplicaNic;
import com.ionoscloud.vmautoscaling.model.ReplicaVolumePost;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * ReplicaPropertiesPost
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-25T09:34:22.361740Z[Etc/UTC]")

public class ReplicaPropertiesPost {
  
  public static final String SERIALIZED_NAME_AVAILABILITY_ZONE = "availabilityZone";
  @SerializedName(SERIALIZED_NAME_AVAILABILITY_ZONE)
  private AvailabilityZone availabilityZone;


  public static final String SERIALIZED_NAME_CORES = "cores";
  @SerializedName(SERIALIZED_NAME_CORES)
  private Integer cores;


  public static final String SERIALIZED_NAME_CPU_FAMILY = "cpuFamily";
  @SerializedName(SERIALIZED_NAME_CPU_FAMILY)
  private CpuFamily cpuFamily;


  public static final String SERIALIZED_NAME_NICS = "nics";
  @SerializedName(SERIALIZED_NAME_NICS)
  private List<ReplicaNic> nics = null;


  public static final String SERIALIZED_NAME_RAM = "ram";
  @SerializedName(SERIALIZED_NAME_RAM)
  private Integer ram;


  public static final String SERIALIZED_NAME_VOLUMES = "volumes";
  @SerializedName(SERIALIZED_NAME_VOLUMES)
  private List<ReplicaVolumePost> volumes = null;

  

  public ReplicaPropertiesPost availabilityZone(AvailabilityZone availabilityZone) {
    
    this.availabilityZone = availabilityZone;
    return this;
  }

   /**
   * Get availabilityZone
   * @return availabilityZone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AvailabilityZone getAvailabilityZone() {
    return availabilityZone;
  }


  public void setAvailabilityZone(AvailabilityZone availabilityZone) {
    this.availabilityZone = availabilityZone;
  }



  public ReplicaPropertiesPost cores(Integer cores) {
    
    this.cores = cores;
    return this;
  }

   /**
   * The total number of cores for the VMs.
   * minimum: 1
   * @return cores
  **/
  @ApiModelProperty(example = "2", required = true, value = "The total number of cores for the VMs.")

  public Integer getCores() {
    return cores;
  }


  public void setCores(Integer cores) {
    this.cores = cores;
  }



  public ReplicaPropertiesPost cpuFamily(CpuFamily cpuFamily) {
    
    this.cpuFamily = cpuFamily;
    return this;
  }

   /**
   * Get cpuFamily
   * @return cpuFamily
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CpuFamily getCpuFamily() {
    return cpuFamily;
  }


  public void setCpuFamily(CpuFamily cpuFamily) {
    this.cpuFamily = cpuFamily;
  }



  public ReplicaPropertiesPost nics(List<ReplicaNic> nics) {
    
    this.nics = nics;
    return this;
  }

  public ReplicaPropertiesPost addNicsItem(ReplicaNic nicsItem) {
    if (this.nics == null) {
      this.nics = new ArrayList<ReplicaNic>();
    }
    this.nics.add(nicsItem);
    return this;
  }

   /**
   * The list of NICs associated with this replica.
   * @return nics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of NICs associated with this replica.")

  public List<ReplicaNic> getNics() {
    return nics;
  }


  public void setNics(List<ReplicaNic> nics) {
    this.nics = nics;
  }



  public ReplicaPropertiesPost ram(Integer ram) {
    
    this.ram = ram;
    return this;
  }

   /**
   * The size of the memory for the VMs in MB. The size must be in multiples of 256 MB, with a minimum of 256 MB; if you set &#39;ramHotPlug&#x3D;TRUE&#39;, you must use at least 1024 MB. If you set the RAM size to more than 240 GB, &#39;ramHotPlug&#x3D;FALSE&#39; is fixed.
   * @return ram
  **/
  @ApiModelProperty(example = "2048", required = true, value = "The size of the memory for the VMs in MB. The size must be in multiples of 256 MB, with a minimum of 256 MB; if you set 'ramHotPlug=TRUE', you must use at least 1024 MB. If you set the RAM size to more than 240 GB, 'ramHotPlug=FALSE' is fixed.")

  public Integer getRam() {
    return ram;
  }


  public void setRam(Integer ram) {
    this.ram = ram;
  }



  public ReplicaPropertiesPost volumes(List<ReplicaVolumePost> volumes) {
    
    this.volumes = volumes;
    return this;
  }

  public ReplicaPropertiesPost addVolumesItem(ReplicaVolumePost volumesItem) {
    if (this.volumes == null) {
      this.volumes = new ArrayList<ReplicaVolumePost>();
    }
    this.volumes.add(volumesItem);
    return this;
  }

   /**
   * List of volumes associated with this Replica.
   * @return volumes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of volumes associated with this Replica.")

  public List<ReplicaVolumePost> getVolumes() {
    return volumes;
  }


  public void setVolumes(List<ReplicaVolumePost> volumes) {
    this.volumes = volumes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplicaPropertiesPost replicaPropertiesPost = (ReplicaPropertiesPost) o;
    return Objects.equals(this.availabilityZone, replicaPropertiesPost.availabilityZone) && Objects.equals(this.cores, replicaPropertiesPost.cores) && Objects.equals(this.cpuFamily, replicaPropertiesPost.cpuFamily) && Objects.equals(this.nics, replicaPropertiesPost.nics) && Objects.equals(this.ram, replicaPropertiesPost.ram) && Objects.equals(this.volumes, replicaPropertiesPost.volumes);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplicaPropertiesPost {\n");
    
    sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");

    sb.append("    cores: ").append(toIndentedString(cores)).append("\n");

    sb.append("    cpuFamily: ").append(toIndentedString(cpuFamily)).append("\n");

    sb.append("    nics: ").append(toIndentedString(nics)).append("\n");

    sb.append("    ram: ").append(toIndentedString(ram)).append("\n");

    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
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

