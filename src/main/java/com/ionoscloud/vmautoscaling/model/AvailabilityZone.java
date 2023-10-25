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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The zone where the VMs are created. The availability zone is always automatically set to &#39;AUTO&#39; for performance reasons. Even if you set another value, e.g. &#39;null&#39;, or leave it empty.
 */
@JsonAdapter(AvailabilityZone.Adapter.class)
public enum AvailabilityZone {
  
  AUTO("AUTO");

  private String value;

  AvailabilityZone(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AvailabilityZone fromValue(String value) {
    for (AvailabilityZone b : AvailabilityZone.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AvailabilityZone> {
    @Override
    public void write(final JsonWriter jsonWriter, final AvailabilityZone enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AvailabilityZone read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AvailabilityZone.fromValue(value);
    }
  }
}
