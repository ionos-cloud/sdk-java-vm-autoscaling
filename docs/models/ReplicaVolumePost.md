

# ReplicaVolumePost

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **image** | [**UUID**](UUID.md) | The image installed on the disk. Currently, only the UUID of the image is supported.  &gt;Note that either &#39;image&#39; or &#39;imageAlias&#39; must be specified, but not both. |  [optional] |
| **imageAlias** | **String** | The image installed on the volume. Must be an &#39;imageAlias&#39; as specified via the images API. Note that one of &#39;image&#39; or &#39;imageAlias&#39; must be set, but not both. |  [optional] |
| **name** | **String** | The replica volume name. |  |
| **size** | **Integer** | The size of this replica volume in GB. |  |
| **sshKeys** | **List&lt;String&gt;** | The SSH keys of this volume. |  [optional] |
| **type** | [**VolumeHwType**](VolumeHwType.md) |  |  |
| **userData** | **String** | The user data (Cloud Init) for this replica volume. |  [optional] |
| **bus** | [**BusType**](BusType.md) |  |  [optional] |
| **backupunitId** | **String** | The ID of the backup unit that the user has access to. The property is immutable and is only allowed to be set on creation of a new a volume. It is mandatory to provide either &#39;public image&#39; or &#39;imageAlias&#39; in conjunction with this property. |  [optional] |
| **bootOrder** | [**BootOrderEnum**](#BootOrderEnum) | Determines whether the volume will be used as a boot volume. Set to NONE, the volume will not be used as boot volume. Set to PRIMARY, the volume will be used as boot volume and set to AUTO will delegate the decision to the provisioning engine to decide whether to use the voluem as boot volume. Notice that exactly one volume can be set to PRIMARY or all of them set to AUTO. |  |
| **imagePassword** | **String** | The image password for this replica volume. |  [optional] |



## Enum: BootOrderEnum

| Name | Value |
| ---- | -----
| AUTO | &quot;AUTO&quot; |
| NONE | &quot;NONE&quot; |
| PRIMARY | &quot;PRIMARY&quot; |


