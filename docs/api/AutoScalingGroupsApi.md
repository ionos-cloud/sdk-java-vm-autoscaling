# AutoScalingGroupsApi

All URIs are relative to *https://api.ionos.com/autoscaling*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**groupsActionsFindById**](AutoScalingGroupsApi.md#groupsactionsfindbyid) | **GET** /groups/{groupId}/actions/{actionId} | Get Scaling Action Details by ID |
| [**groupsActionsGet**](AutoScalingGroupsApi.md#groupsactionsget) | **GET** /groups/{groupId}/actions | Get Scaling Actions |
| [**groupsDelete**](AutoScalingGroupsApi.md#groupsdelete) | **DELETE** /groups/{groupId} | Delete a VM Auto Scaling Group by ID |
| [**groupsFindById**](AutoScalingGroupsApi.md#groupsfindbyid) | **GET** /groups/{groupId} | Get an Auto Scaling by ID |
| [**groupsGet**](AutoScalingGroupsApi.md#groupsget) | **GET** /groups | Get VM Auto Scaling Groups |
| [**groupsPost**](AutoScalingGroupsApi.md#groupspost) | **POST** /groups | Create a VM Auto Scaling Group |
| [**groupsPut**](AutoScalingGroupsApi.md#groupsput) | **PUT** /groups/{groupId} | Update a VM Auto Scaling Group by ID |
| [**groupsServersFindById**](AutoScalingGroupsApi.md#groupsserversfindbyid) | **GET** /groups/{groupId}/servers/{serverId} | Get VM Auto Scaling Group Server by ID |
| [**groupsServersGet**](AutoScalingGroupsApi.md#groupsserversget) | **GET** /groups/{groupId}/servers | Get VM Auto Scaling Group Servers |


<a name="groupsActionsFindById"></a>
# **groupsActionsFindById**
> Action groupsActionsFindById(actionId, groupId, depth)

Get Scaling Action Details by ID

Retrieves the details of a scaling action specified by its ID. This operation returns metadata, properties, and the current status, for the specified scaling action

### Example
```java
// Import classes:
import com.ionoscloud.vmautoscaling.ApiClient;
import com.ionoscloud.vmautoscaling.ApiException;
import com.ionoscloud.vmautoscaling.ApiResponse;
import com.ionoscloud.vmautoscaling.Configuration;
import com.ionoscloud.vmautoscaling.auth.*;
import com.ionoscloud.vmautoscaling.model.*;
import com.ionoscloud.vmautoscaling.api.AutoScalingGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure Api Key authorization: tokenAuth
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");
    AutoScalingGroupsApi apiInstance = new AutoScalingGroupsApi(defaultClient);
    UUID actionId = new UUID(); // UUID | 
    String groupId = "groupId_example"; // String | 
    BigDecimal depth = new BigDecimal(78); // BigDecimal | With this parameter, you control the level of detail of the response objects:    - ``0``: Only direct properties are included; children (such as executions or transitions) are not considered.    - ``1``: Direct properties and children references are included.    - ``2``: Direct properties and children properties are included.    - ``3``: Direct properties and children properties and children's children are included.    - etc.  
    String orderBy = "orderBy_example"; // String | Order by field
    Integer maxResults = "maxResults_example"; // Integer | Maximum number of results to return
    try {
      ApiResponse<Action> result = apiInstance.groupsActionsFindByIdWithHttpInfo(actionId, groupId, depth, orderBy, maxResults, filters);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoScalingGroupsApi#groupsActionsFindById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```
⚠️ **Note**: for the example above, you need to provide all parameters to the method call. Null values will resolve to the API defaults.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionId** |  [**UUID**](../models/.md)|  |
| **groupId** | **String**|  |
| **depth** | **BigDecimal**| With this parameter, you control the level of detail of the response objects:    - &#x60;&#x60;0&#x60;&#x60;: Only direct properties are included; children (such as executions or transitions) are not considered.    - &#x60;&#x60;1&#x60;&#x60;: Direct properties and children references are included.    - &#x60;&#x60;2&#x60;&#x60;: Direct properties and children properties are included.    - &#x60;&#x60;3&#x60;&#x60;: Direct properties and children properties and children&#39;s children are included.    - etc.   | [optional]

### Return type

[**Action**](../models/Action.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="groupsActionsGet"></a>
# **groupsActionsGet**
> ActionCollection groupsActionsGet(groupId, depth, orderBy)

Get Scaling Actions

Retrieves the list of the last Auto Scaling actions or jobs performed by the VM Auto Scaling.The actions are specified by its ID. Only the last 10 actions are available

### Example
```java
// Import classes:
import com.ionoscloud.vmautoscaling.ApiClient;
import com.ionoscloud.vmautoscaling.ApiException;
import com.ionoscloud.vmautoscaling.ApiResponse;
import com.ionoscloud.vmautoscaling.Configuration;
import com.ionoscloud.vmautoscaling.auth.*;
import com.ionoscloud.vmautoscaling.model.*;
import com.ionoscloud.vmautoscaling.api.AutoScalingGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure Api Key authorization: tokenAuth
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");
    AutoScalingGroupsApi apiInstance = new AutoScalingGroupsApi(defaultClient);
    String groupId = "groupId_example"; // String | 
    BigDecimal depth = new BigDecimal(78); // BigDecimal | With this parameter, you control the level of detail of the response objects:    - ``0``: Only direct properties are included; children (such as executions or transitions) are not considered.    - ``1``: Direct properties and children references are included.    - ``2``: Direct properties and children properties are included.    - ``3``: Direct properties and children properties and children's children are included.    - etc.  
    String orderBy = "createdDate"; // String | Use this parameter to specify by which the returned list should be sorted. Valid values are: ``createdDate`` and ``lastModifiedDate``.
    String orderBy = "orderBy_example"; // String | Order by field
    Integer maxResults = "maxResults_example"; // Integer | Maximum number of results to return
    try {
      ApiResponse<ActionCollection> result = apiInstance.groupsActionsGetWithHttpInfo(groupId, depth, orderBy, orderBy, maxResults, filters);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoScalingGroupsApi#groupsActionsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```
⚠️ **Note**: for the example above, you need to provide all parameters to the method call. Null values will resolve to the API defaults.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupId** | **String**|  |
| **depth** | **BigDecimal**| With this parameter, you control the level of detail of the response objects:    - &#x60;&#x60;0&#x60;&#x60;: Only direct properties are included; children (such as executions or transitions) are not considered.    - &#x60;&#x60;1&#x60;&#x60;: Direct properties and children references are included.    - &#x60;&#x60;2&#x60;&#x60;: Direct properties and children properties are included.    - &#x60;&#x60;3&#x60;&#x60;: Direct properties and children properties and children&#39;s children are included.    - etc.   | [optional]
| **orderBy** | **String**| Use this parameter to specify by which the returned list should be sorted. Valid values are: &#x60;&#x60;createdDate&#x60;&#x60; and &#x60;&#x60;lastModifiedDate&#x60;&#x60;. | [optional] [default to createdDate]

### Return type

[**ActionCollection**](../models/ActionCollection.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="groupsDelete"></a>
# **groupsDelete**
> groupsDelete(groupId)

Delete a VM Auto Scaling Group by ID

Deletes the VM Auto Scaling Group specified by its ID.  &gt;Deleting the associated servers and disks is currently not implemented.

### Example
```java
// Import classes:
import com.ionoscloud.vmautoscaling.ApiClient;
import com.ionoscloud.vmautoscaling.ApiException;
import com.ionoscloud.vmautoscaling.ApiResponse;
import com.ionoscloud.vmautoscaling.Configuration;
import com.ionoscloud.vmautoscaling.auth.*;
import com.ionoscloud.vmautoscaling.model.*;
import com.ionoscloud.vmautoscaling.api.AutoScalingGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure Api Key authorization: tokenAuth
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");
    AutoScalingGroupsApi apiInstance = new AutoScalingGroupsApi(defaultClient);
    UUID groupId = new UUID(); // UUID | 
    try {
      apiInstance.groupsDeleteWithHttpInfo(groupId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoScalingGroupsApi#groupsDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```
⚠️ **Note**: for the example above, you need to provide all parameters to the method call. Null values will resolve to the API defaults.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupId** |  [**UUID**](../models/.md)|  |

### Return type

null (empty response body)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="groupsFindById"></a>
# **groupsFindById**
> Group groupsFindById(groupId, depth)

Get an Auto Scaling by ID

Retrieves the VM Auto Scaling Group specified by its ID including the details.

### Example
```java
// Import classes:
import com.ionoscloud.vmautoscaling.ApiClient;
import com.ionoscloud.vmautoscaling.ApiException;
import com.ionoscloud.vmautoscaling.ApiResponse;
import com.ionoscloud.vmautoscaling.Configuration;
import com.ionoscloud.vmautoscaling.auth.*;
import com.ionoscloud.vmautoscaling.model.*;
import com.ionoscloud.vmautoscaling.api.AutoScalingGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure Api Key authorization: tokenAuth
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");
    AutoScalingGroupsApi apiInstance = new AutoScalingGroupsApi(defaultClient);
    String groupId = "groupId_example"; // String | 
    BigDecimal depth = new BigDecimal(78); // BigDecimal | With this parameter, you control the level of detail of the response objects:    - ``0``: Only direct properties are included; children (such as executions or transitions) are not considered.    - ``1``: Direct properties and children references are included.    - ``2``: Direct properties and children properties are included.    - ``3``: Direct properties and children properties and children's children are included.    - etc.  
    try {
      ApiResponse<Group> result = apiInstance.groupsFindByIdWithHttpInfo(groupId, depth);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoScalingGroupsApi#groupsFindById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```
⚠️ **Note**: for the example above, you need to provide all parameters to the method call. Null values will resolve to the API defaults.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupId** | **String**|  |
| **depth** | **BigDecimal**| With this parameter, you control the level of detail of the response objects:    - &#x60;&#x60;0&#x60;&#x60;: Only direct properties are included; children (such as executions or transitions) are not considered.    - &#x60;&#x60;1&#x60;&#x60;: Direct properties and children references are included.    - &#x60;&#x60;2&#x60;&#x60;: Direct properties and children properties are included.    - &#x60;&#x60;3&#x60;&#x60;: Direct properties and children properties and children&#39;s children are included.    - etc.   | [optional]

### Return type

[**Group**](../models/Group.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="groupsGet"></a>
# **groupsGet**
> GroupCollection groupsGet(depth, orderBy)

Get VM Auto Scaling Groups

Lists all VM Auto Scaling Groups of your account.

### Example
```java
// Import classes:
import com.ionoscloud.vmautoscaling.ApiClient;
import com.ionoscloud.vmautoscaling.ApiException;
import com.ionoscloud.vmautoscaling.ApiResponse;
import com.ionoscloud.vmautoscaling.Configuration;
import com.ionoscloud.vmautoscaling.auth.*;
import com.ionoscloud.vmautoscaling.model.*;
import com.ionoscloud.vmautoscaling.api.AutoScalingGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure Api Key authorization: tokenAuth
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");
    AutoScalingGroupsApi apiInstance = new AutoScalingGroupsApi(defaultClient);
    BigDecimal depth = new BigDecimal(78); // BigDecimal | With this parameter, you control the level of detail of the response objects:    - ``0``: Only direct properties are included; children (such as executions or transitions) are not considered.    - ``1``: Direct properties and children references are included.    - ``2``: Direct properties and children properties are included.    - ``3``: Direct properties and children properties and children's children are included.    - etc.  
    String orderBy = "createdDate"; // String | Use this parameter to specify by which the returned list should be sorted. Valid values are: ``createdDate`` and ``lastModifiedDate``.
    String orderBy = "orderBy_example"; // String | Order by field
    Integer maxResults = "maxResults_example"; // Integer | Maximum number of results to return
    try {
      ApiResponse<GroupCollection> result = apiInstance.groupsGetWithHttpInfo(depth, orderBy, orderBy, maxResults, filters);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoScalingGroupsApi#groupsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```
⚠️ **Note**: for the example above, you need to provide all parameters to the method call. Null values will resolve to the API defaults.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **depth** | **BigDecimal**| With this parameter, you control the level of detail of the response objects:    - &#x60;&#x60;0&#x60;&#x60;: Only direct properties are included; children (such as executions or transitions) are not considered.    - &#x60;&#x60;1&#x60;&#x60;: Direct properties and children references are included.    - &#x60;&#x60;2&#x60;&#x60;: Direct properties and children properties are included.    - &#x60;&#x60;3&#x60;&#x60;: Direct properties and children properties and children&#39;s children are included.    - etc.   | [optional]
| **orderBy** | **String**| Use this parameter to specify by which the returned list should be sorted. Valid values are: &#x60;&#x60;createdDate&#x60;&#x60; and &#x60;&#x60;lastModifiedDate&#x60;&#x60;. | [optional] [default to createdDate]

### Return type

[**GroupCollection**](../models/GroupCollection.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="groupsPost"></a>
# **groupsPost**
> GroupPostResponse groupsPost(groupPost)

Create a VM Auto Scaling Group

Creates a VM Auto Scaling Group.   &gt; Note that creating a group triggers the creation of two monitoring alarms for &#39;Scale-In&#39; and &#39;Scale-Out&#39; operations according to the &#39;Policy&#39; settings.

### Example
```java
// Import classes:
import com.ionoscloud.vmautoscaling.ApiClient;
import com.ionoscloud.vmautoscaling.ApiException;
import com.ionoscloud.vmautoscaling.ApiResponse;
import com.ionoscloud.vmautoscaling.Configuration;
import com.ionoscloud.vmautoscaling.auth.*;
import com.ionoscloud.vmautoscaling.model.*;
import com.ionoscloud.vmautoscaling.api.AutoScalingGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure Api Key authorization: tokenAuth
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");
    AutoScalingGroupsApi apiInstance = new AutoScalingGroupsApi(defaultClient);
    GroupPost groupPost = new GroupPost(); // GroupPost | 
    try {
      ApiResponse<GroupPostResponse> result = apiInstance.groupsPostWithHttpInfo(groupPost);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoScalingGroupsApi#groupsPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```
⚠️ **Note**: for the example above, you need to provide all parameters to the method call. Null values will resolve to the API defaults.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupPost** |  [**GroupPost**](../models/GroupPost.md)|  |

### Return type

[**GroupPostResponse**](../models/GroupPostResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="groupsPut"></a>
# **groupsPut**
> Group groupsPut(groupId, groupPut)

Update a VM Auto Scaling Group by ID

Updates the VM Auto Scaling Group specified by its ID. The IDs assigned by the system when the resource is created, such as &#39;properties.datacenter.id&#39; and &#39;backupunitId&#39;, are immutable and cannot be updated.

### Example
```java
// Import classes:
import com.ionoscloud.vmautoscaling.ApiClient;
import com.ionoscloud.vmautoscaling.ApiException;
import com.ionoscloud.vmautoscaling.ApiResponse;
import com.ionoscloud.vmautoscaling.Configuration;
import com.ionoscloud.vmautoscaling.auth.*;
import com.ionoscloud.vmautoscaling.model.*;
import com.ionoscloud.vmautoscaling.api.AutoScalingGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure Api Key authorization: tokenAuth
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");
    AutoScalingGroupsApi apiInstance = new AutoScalingGroupsApi(defaultClient);
    UUID groupId = new UUID(); // UUID | 
    GroupPut groupPut = new GroupPut(); // GroupPut | 
    try {
      ApiResponse<Group> result = apiInstance.groupsPutWithHttpInfo(groupId, groupPut);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoScalingGroupsApi#groupsPut");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```
⚠️ **Note**: for the example above, you need to provide all parameters to the method call. Null values will resolve to the API defaults.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupId** |  [**UUID**](../models/.md)|  |
| **groupPut** |  [**GroupPut**](../models/GroupPut.md)|  |

### Return type

[**Group**](../models/Group.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="groupsServersFindById"></a>
# **groupsServersFindById**
> Server groupsServersFindById(groupId, serverId, depth)

Get VM Auto Scaling Group Server by ID

Retrieves the properties of the server specified by its ID.  &gt;Note that the server IDs of the VM Auto Scaling Groups are different from and do not match the VM server IDs in the data center.

### Example
```java
// Import classes:
import com.ionoscloud.vmautoscaling.ApiClient;
import com.ionoscloud.vmautoscaling.ApiException;
import com.ionoscloud.vmautoscaling.ApiResponse;
import com.ionoscloud.vmautoscaling.Configuration;
import com.ionoscloud.vmautoscaling.auth.*;
import com.ionoscloud.vmautoscaling.model.*;
import com.ionoscloud.vmautoscaling.api.AutoScalingGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure Api Key authorization: tokenAuth
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");
    AutoScalingGroupsApi apiInstance = new AutoScalingGroupsApi(defaultClient);
    String groupId = "groupId_example"; // String | 
    UUID serverId = new UUID(); // UUID | 
    BigDecimal depth = new BigDecimal(78); // BigDecimal | With this parameter, you control the level of detail of the response objects:    - ``0``: Only direct properties are included; children (such as executions or transitions) are not considered.    - ``1``: Direct properties and children references are included.    - ``2``: Direct properties and children properties are included.    - ``3``: Direct properties and children properties and children's children are included.    - etc.  
    try {
      ApiResponse<Server> result = apiInstance.groupsServersFindByIdWithHttpInfo(groupId, serverId, depth);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoScalingGroupsApi#groupsServersFindById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```
⚠️ **Note**: for the example above, you need to provide all parameters to the method call. Null values will resolve to the API defaults.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupId** | **String**|  |
| **serverId** |  [**UUID**](../models/.md)|  |
| **depth** | **BigDecimal**| With this parameter, you control the level of detail of the response objects:    - &#x60;&#x60;0&#x60;&#x60;: Only direct properties are included; children (such as executions or transitions) are not considered.    - &#x60;&#x60;1&#x60;&#x60;: Direct properties and children references are included.    - &#x60;&#x60;2&#x60;&#x60;: Direct properties and children properties are included.    - &#x60;&#x60;3&#x60;&#x60;: Direct properties and children properties and children&#39;s children are included.    - etc.   | [optional]

### Return type

[**Server**](../models/Server.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="groupsServersGet"></a>
# **groupsServersGet**
> ServerCollection groupsServersGet(groupId, depth, orderBy)

Get VM Auto Scaling Group Servers

Retrieves all servers associated with the VM Auto Scaling Group specified by its ID.   &gt;Note that the server IDs of the VM Auto Scaling Groups are different from and do not match the VM server IDs in the data center.

### Example
```java
// Import classes:
import com.ionoscloud.vmautoscaling.ApiClient;
import com.ionoscloud.vmautoscaling.ApiException;
import com.ionoscloud.vmautoscaling.ApiResponse;
import com.ionoscloud.vmautoscaling.Configuration;
import com.ionoscloud.vmautoscaling.auth.*;
import com.ionoscloud.vmautoscaling.model.*;
import com.ionoscloud.vmautoscaling.api.AutoScalingGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure Api Key authorization: tokenAuth
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");
    AutoScalingGroupsApi apiInstance = new AutoScalingGroupsApi(defaultClient);
    String groupId = "groupId_example"; // String | 
    BigDecimal depth = new BigDecimal(78); // BigDecimal | With this parameter, you control the level of detail of the response objects:    - ``0``: Only direct properties are included; children (such as executions or transitions) are not considered.    - ``1``: Direct properties and children references are included.    - ``2``: Direct properties and children properties are included.    - ``3``: Direct properties and children properties and children's children are included.    - etc.  
    String orderBy = "createdDate"; // String | Use this parameter to specify by which the returned list should be sorted. Valid values are: ``createdDate`` and ``lastModifiedDate``.
    String orderBy = "orderBy_example"; // String | Order by field
    Integer maxResults = "maxResults_example"; // Integer | Maximum number of results to return
    try {
      ApiResponse<ServerCollection> result = apiInstance.groupsServersGetWithHttpInfo(groupId, depth, orderBy, orderBy, maxResults, filters);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoScalingGroupsApi#groupsServersGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```
⚠️ **Note**: for the example above, you need to provide all parameters to the method call. Null values will resolve to the API defaults.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupId** | **String**|  |
| **depth** | **BigDecimal**| With this parameter, you control the level of detail of the response objects:    - &#x60;&#x60;0&#x60;&#x60;: Only direct properties are included; children (such as executions or transitions) are not considered.    - &#x60;&#x60;1&#x60;&#x60;: Direct properties and children references are included.    - &#x60;&#x60;2&#x60;&#x60;: Direct properties and children properties are included.    - &#x60;&#x60;3&#x60;&#x60;: Direct properties and children properties and children&#39;s children are included.    - etc.   | [optional]
| **orderBy** | **String**| Use this parameter to specify by which the returned list should be sorted. Valid values are: &#x60;&#x60;createdDate&#x60;&#x60; and &#x60;&#x60;lastModifiedDate&#x60;&#x60;. | [optional] [default to createdDate]

### Return type

[**ServerCollection**](../models/ServerCollection.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

