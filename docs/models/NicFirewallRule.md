

# NicFirewallRule

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The name of the firewall rule. |  [optional] |
| **protocol** | [**ProtocolEnum**](#ProtocolEnum) | The protocol for the rule. The property cannot be modified after its creation (not allowed in update requests). |  |
| **sourceMac** | **String** | Only traffic originating from the respective MAC address is permitted. Valid format: &#39;aa:bb:cc:dd:ee:ff&#39;. The value &#39;null&#39; allows traffic from any MAC address. |  [optional] |
| **sourceIp** | **String** | Only traffic originating from the respective IPv4 address is permitted. The value &#39;null&#39; allows traffic from any IP address. |  [optional] |
| **targetIp** | **String** | If the target NIC has multiple IP addresses, only the traffic directed to the respective IP address of the NIC is allowed. The value &#39;null&#39; allows traffic to any target IP address. |  [optional] |
| **icmpCode** | **Integer** | Sets the allowed code (from 0 to 254) when ICMP protocol is selected. The value &#39;null&#39;&#39; allows all codes. |  [optional] |
| **icmpType** | **Integer** | Sets the allowed type (from 0 to 254) if the protocol ICMP is selected. The value &#39;null&#39; allows all types. |  [optional] |
| **portRangeStart** | **Integer** | Sets the initial range of the allowed port (from 1 to 65535) if the protocol TCP or UDP is selected. The value &#39;null&#39; for &#39;portRangeStart&#39; and &#39;portRangeEnd&#39; allows all ports. |  [optional] |
| **portRangeEnd** | **Integer** | Sets the end range of the allowed port (from 1 to 65535) if the protocol TCP or UDP is selected. The value &#39;null&#39; for &#39;portRangeStart&#39; and &#39;portRangeEnd&#39; allows all ports. |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum) | The firewall rule type. If not specified, the default value &#39;INGRESS&#39; is used. |  [optional] |



## Enum: ProtocolEnum

| Name | Value |
| ---- | -----
| TCP | &quot;TCP&quot; |
| UDP | &quot;UDP&quot; |
| ICMP | &quot;ICMP&quot; |
| ANY | &quot;ANY&quot; |



## Enum: TypeEnum

| Name | Value |
| ---- | -----
| INGRESS | &quot;INGRESS&quot; |
| EGRESS | &quot;EGRESS&quot; |


