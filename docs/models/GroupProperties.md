

# GroupProperties

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **datacenter** | [**GroupPropertiesDatacenter**](GroupPropertiesDatacenter.md) |  |  [optional] |
| **location** | **String** | The data center location. |  [readonly] |
| **maxReplicaCount** | **Long** | The maximum value for the number of replicas. Must be &gt;&#x3D; 0 and &lt;&#x3D; 100. Will be enforced for both automatic and manual changes. |  [optional] |
| **minReplicaCount** | **Long** | The minimum value for the number of replicas. Must be &gt;&#x3D; 0 and &lt;&#x3D; 100. Will be enforced for both automatic and manual changes |  [optional] |
| **name** | **String** | The name of the VM Auto Scaling Group. This field must not be null or blank. |  [optional] |
| **policy** | [**GroupPolicy**](GroupPolicy.md) |  |  [optional] |
| **replicaConfiguration** | [**ReplicaPropertiesPost**](ReplicaPropertiesPost.md) |  |  [optional] |


