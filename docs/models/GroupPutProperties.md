

# GroupPutProperties

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **datacenter** | [**GroupPutPropertiesDatacenter**](GroupPutPropertiesDatacenter.md) |  |  [optional] |
| **location** | **String** | The data center location. |  [readonly] |
| **maxReplicaCount** | **Long** | The maximum value for the number of replicas on a VM Auto Scaling Group. Must be &gt;&#x3D; 0 and &lt;&#x3D; 200. Will be enforced for both automatic and manual changes. |  |
| **minReplicaCount** | **Long** | The minimum value for the number of replicas on a VM Auto Scaling Group. Must be &gt;&#x3D; 0 and &lt;&#x3D; 200. Will be enforced for both automatic and manual changes |  |
| **name** | **String** | The name of the VM Auto Scaling Group. This field must not be null or blank. |  |
| **policy** | [**GroupPolicy**](GroupPolicy.md) |  |  |
| **replicaConfiguration** | [**ReplicaPropertiesPost**](ReplicaPropertiesPost.md) |  |  |


