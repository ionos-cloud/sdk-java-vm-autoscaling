

# ReplicaNic

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **lan** | **Integer** | The LAN ID of this replica NIC. |  |
| **name** | **String** | The replica NIC name. |  |
| **dhcp** | **Boolean** | DHCP for this replica NIC. This is an optional attribute with the default value &#39;TRUE&#39; if not specified in the request payload or as null. |  [optional] |
| **firewallActive** | **Boolean** | Activate or deactivate the firewall. By default, an active firewall without any defined rules will block all incoming network traffic except for the firewall rules that explicitly allows certain protocols, IP addresses and ports. |  [optional] |
| **firewallType** | [**FirewallTypeEnum**](#FirewallTypeEnum) | The type of firewall rules that will be allowed on the NIC. If not specified, the default INGRESS value is used. |  [optional] |
| **flowLogs** | [**List&lt;NicFlowLog&gt;**](NicFlowLog.md) | List of all flow logs for the specified NIC. |  [optional] |
| **firewallRules** | [**List&lt;NicFirewallRule&gt;**](NicFirewallRule.md) | List of all firewall rules for the specified NIC. |  [optional] |
| **targetGroup** | [**TargetGroup**](TargetGroup.md) |  |  [optional] |



## Enum: FirewallTypeEnum

| Name | Value |
| ---- | -----
| INGRESS | &quot;INGRESS&quot; |
| EGRESS | &quot;EGRESS&quot; |
| BIDIRECTIONAL | &quot;BIDIRECTIONAL&quot; |


