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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * NicFirewallRule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-25T09:34:22.361740Z[Etc/UTC]")

public class NicFirewallRule {
  
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  /**
   * The protocol for the rule. The property cannot be modified after its creation (not allowed in update requests).
   */
  @JsonAdapter(ProtocolEnum.Adapter.class)
  public enum ProtocolEnum {
    TCP("TCP"),
    
    UDP("UDP"),
    
    ICMP("ICMP"),
    
    ANY("ANY");

    private String value;

    ProtocolEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProtocolEnum fromValue(String value) {

      for (ProtocolEnum b : ProtocolEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ProtocolEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProtocolEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProtocolEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ProtocolEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private ProtocolEnum protocol;


  public static final String SERIALIZED_NAME_SOURCE_MAC = "sourceMac";
  @SerializedName(SERIALIZED_NAME_SOURCE_MAC)
  private String sourceMac;


  public static final String SERIALIZED_NAME_SOURCE_IP = "sourceIp";
  @SerializedName(SERIALIZED_NAME_SOURCE_IP)
  private String sourceIp;


  public static final String SERIALIZED_NAME_TARGET_IP = "targetIp";
  @SerializedName(SERIALIZED_NAME_TARGET_IP)
  private String targetIp;


  public static final String SERIALIZED_NAME_ICMP_CODE = "icmpCode";
  @SerializedName(SERIALIZED_NAME_ICMP_CODE)
  private Integer icmpCode;


  public static final String SERIALIZED_NAME_ICMP_TYPE = "icmpType";
  @SerializedName(SERIALIZED_NAME_ICMP_TYPE)
  private Integer icmpType;


  public static final String SERIALIZED_NAME_PORT_RANGE_START = "portRangeStart";
  @SerializedName(SERIALIZED_NAME_PORT_RANGE_START)
  private Integer portRangeStart;


  public static final String SERIALIZED_NAME_PORT_RANGE_END = "portRangeEnd";
  @SerializedName(SERIALIZED_NAME_PORT_RANGE_END)
  private Integer portRangeEnd;


  /**
   * The firewall rule type. If not specified, the default value &#39;INGRESS&#39; is used.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    INGRESS("INGRESS"),
    
    EGRESS("EGRESS");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {

      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  

  public NicFirewallRule name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the firewall rule.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My resource", value = "The name of the firewall rule.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  public NicFirewallRule protocol(ProtocolEnum protocol) {
    
    this.protocol = protocol;
    return this;
  }

   /**
   * The protocol for the rule. The property cannot be modified after its creation (not allowed in update requests).
   * @return protocol
  **/
  @ApiModelProperty(example = "TCP", required = true, value = "The protocol for the rule. The property cannot be modified after its creation (not allowed in update requests).")

  public ProtocolEnum getProtocol() {
    return protocol;
  }


  public void setProtocol(ProtocolEnum protocol) {
    this.protocol = protocol;
  }



  public NicFirewallRule sourceMac(String sourceMac) {
    
    this.sourceMac = sourceMac;
    return this;
  }

   /**
   * Only traffic originating from the respective MAC address is permitted. Valid format: &#39;aa:bb:cc:dd:ee:ff&#39;. The value &#39;null&#39; allows traffic from any MAC address.
   * @return sourceMac
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00:0a:95:9d:68:16", value = "Only traffic originating from the respective MAC address is permitted. Valid format: 'aa:bb:cc:dd:ee:ff'. The value 'null' allows traffic from any MAC address.")

  public String getSourceMac() {
    return sourceMac;
  }


  public void setSourceMac(String sourceMac) {
    this.sourceMac = sourceMac;
  }



  public NicFirewallRule sourceIp(String sourceIp) {
    
    this.sourceIp = sourceIp;
    return this;
  }

   /**
   * Only traffic originating from the respective IPv4 address is permitted. The value &#39;null&#39; allows traffic from any IP address.
   * @return sourceIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "22.231.113.64", value = "Only traffic originating from the respective IPv4 address is permitted. The value 'null' allows traffic from any IP address.")

  public String getSourceIp() {
    return sourceIp;
  }


  public void setSourceIp(String sourceIp) {
    this.sourceIp = sourceIp;
  }



  public NicFirewallRule targetIp(String targetIp) {
    
    this.targetIp = targetIp;
    return this;
  }

   /**
   * If the target NIC has multiple IP addresses, only the traffic directed to the respective IP address of the NIC is allowed. The value &#39;null&#39; allows traffic to any target IP address.
   * @return targetIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "22.231.113.64", value = "If the target NIC has multiple IP addresses, only the traffic directed to the respective IP address of the NIC is allowed. The value 'null' allows traffic to any target IP address.")

  public String getTargetIp() {
    return targetIp;
  }


  public void setTargetIp(String targetIp) {
    this.targetIp = targetIp;
  }



  public NicFirewallRule icmpCode(Integer icmpCode) {
    
    this.icmpCode = icmpCode;
    return this;
  }

   /**
   * Sets the allowed code (from 0 to 254) when ICMP protocol is selected. The value &#39;null&#39;&#39; allows all codes.
   * minimum: 0
   * maximum: 254
   * @return icmpCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "Sets the allowed code (from 0 to 254) when ICMP protocol is selected. The value 'null'' allows all codes.")

  public Integer getIcmpCode() {
    return icmpCode;
  }


  public void setIcmpCode(Integer icmpCode) {
    this.icmpCode = icmpCode;
  }



  public NicFirewallRule icmpType(Integer icmpType) {
    
    this.icmpType = icmpType;
    return this;
  }

   /**
   * Sets the allowed type (from 0 to 254) if the protocol ICMP is selected. The value &#39;null&#39; allows all types.
   * minimum: 0
   * maximum: 254
   * @return icmpType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8", value = "Sets the allowed type (from 0 to 254) if the protocol ICMP is selected. The value 'null' allows all types.")

  public Integer getIcmpType() {
    return icmpType;
  }


  public void setIcmpType(Integer icmpType) {
    this.icmpType = icmpType;
  }



  public NicFirewallRule portRangeStart(Integer portRangeStart) {
    
    this.portRangeStart = portRangeStart;
    return this;
  }

   /**
   * Sets the initial range of the allowed port (from 1 to 65535) if the protocol TCP or UDP is selected. The value &#39;null&#39; for &#39;portRangeStart&#39; and &#39;portRangeEnd&#39; allows all ports.
   * minimum: 1
   * maximum: 65535
   * @return portRangeStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8", value = "Sets the initial range of the allowed port (from 1 to 65535) if the protocol TCP or UDP is selected. The value 'null' for 'portRangeStart' and 'portRangeEnd' allows all ports.")

  public Integer getPortRangeStart() {
    return portRangeStart;
  }


  public void setPortRangeStart(Integer portRangeStart) {
    this.portRangeStart = portRangeStart;
  }



  public NicFirewallRule portRangeEnd(Integer portRangeEnd) {
    
    this.portRangeEnd = portRangeEnd;
    return this;
  }

   /**
   * Sets the end range of the allowed port (from 1 to 65535) if the protocol TCP or UDP is selected. The value &#39;null&#39; for &#39;portRangeStart&#39; and &#39;portRangeEnd&#39; allows all ports.
   * minimum: 1
   * maximum: 65535
   * @return portRangeEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8", value = "Sets the end range of the allowed port (from 1 to 65535) if the protocol TCP or UDP is selected. The value 'null' for 'portRangeStart' and 'portRangeEnd' allows all ports.")

  public Integer getPortRangeEnd() {
    return portRangeEnd;
  }


  public void setPortRangeEnd(Integer portRangeEnd) {
    this.portRangeEnd = portRangeEnd;
  }



  public NicFirewallRule type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The firewall rule type. If not specified, the default value &#39;INGRESS&#39; is used.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "INGRESS", value = "The firewall rule type. If not specified, the default value 'INGRESS' is used.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NicFirewallRule nicFirewallRule = (NicFirewallRule) o;
    return Objects.equals(this.name, nicFirewallRule.name) && Objects.equals(this.protocol, nicFirewallRule.protocol) && Objects.equals(this.sourceMac, nicFirewallRule.sourceMac) && Objects.equals(this.sourceIp, nicFirewallRule.sourceIp) && Objects.equals(this.targetIp, nicFirewallRule.targetIp) && Objects.equals(this.icmpCode, nicFirewallRule.icmpCode) && Objects.equals(this.icmpType, nicFirewallRule.icmpType) && Objects.equals(this.portRangeStart, nicFirewallRule.portRangeStart) && Objects.equals(this.portRangeEnd, nicFirewallRule.portRangeEnd) && Objects.equals(this.type, nicFirewallRule.type);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NicFirewallRule {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");

    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");

    sb.append("    sourceMac: ").append(toIndentedString(sourceMac)).append("\n");

    sb.append("    sourceIp: ").append(toIndentedString(sourceIp)).append("\n");

    sb.append("    targetIp: ").append(toIndentedString(targetIp)).append("\n");

    sb.append("    icmpCode: ").append(toIndentedString(icmpCode)).append("\n");

    sb.append("    icmpType: ").append(toIndentedString(icmpType)).append("\n");

    sb.append("    portRangeStart: ").append(toIndentedString(portRangeStart)).append("\n");

    sb.append("    portRangeEnd: ").append(toIndentedString(portRangeEnd)).append("\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

