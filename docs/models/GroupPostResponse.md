

# GroupPostResponse

A group of virtual servers where the number of replicas can be scaled automatically.
## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**UUID**](UUID.md) | The unique resource identifier. |  [readonly] |
| **type** | **String** | The resource type. |  [optional] [readonly] |
| **href** | [**URI**](URI.md) | The absolute URL to the resource&#39;s representation. |  [optional] [readonly] |
| **metadata** | [**Metadata**](Metadata.md) |  |  [optional] |
| **properties** | [**GroupProperties**](GroupProperties.md) |  |  |
| **entities** | [**GroupPostEntities**](GroupPostEntities.md) |  |  [optional] |
| **startedActions** | [**List&lt;ActionResource&gt;**](ActionResource.md) | Any background activity caused by this request. You can use this to track the progress of such activities. |  [optional] [readonly] |


