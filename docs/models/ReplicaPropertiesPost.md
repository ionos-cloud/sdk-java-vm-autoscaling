

# ReplicaPropertiesPost

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **availabilityZone** | [**AvailabilityZone**](AvailabilityZone.md) |  |  [optional] |
| **cores** | **Integer** | The total number of cores for the VMs. |  |
| **cpuFamily** | [**CpuFamily**](CpuFamily.md) |  |  [optional] |
| **nics** | [**List&lt;ReplicaNic&gt;**](ReplicaNic.md) | The list of NICs associated with this replica. |  [optional] |
| **ram** | **Integer** | The size of the memory for the VMs in MB. The size must be in multiples of 256 MB, with a minimum of 256 MB; if you set &#39;ramHotPlug&#x3D;TRUE&#39;, you must use at least 1024 MB. If you set the RAM size to more than 240 GB, &#39;ramHotPlug&#x3D;FALSE&#39; is fixed. |  |
| **volumes** | [**List&lt;ReplicaVolumePost&gt;**](ReplicaVolumePost.md) | List of volumes associated with this Replica. |  [optional] |


