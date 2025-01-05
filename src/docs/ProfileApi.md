# ProfileApi

All URIs are relative to *https://sandbox.hyperswitch.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activatesARoutingAlgorithmUnderAProfile**](ProfileApi.md#activatesARoutingAlgorithmUnderAProfile) | **PATCH** /v2/profiles/{id}/activate_routing_algorithm | Profile - Activate routing algorithm |
| [**activatesARoutingAlgorithmUnderAProfileWithHttpInfo**](ProfileApi.md#activatesARoutingAlgorithmUnderAProfileWithHttpInfo) | **PATCH** /v2/profiles/{id}/activate_routing_algorithm | Profile - Activate routing algorithm |
| [**createAProfile**](ProfileApi.md#createAProfile) | **POST** /v2/profiles | Profile - Create |
| [**createAProfileWithHttpInfo**](ProfileApi.md#createAProfileWithHttpInfo) | **POST** /v2/profiles | Profile - Create |
| [**deactivatesARoutingAlgorithmUnderAProfile**](ProfileApi.md#deactivatesARoutingAlgorithmUnderAProfile) | **PATCH** /v2/profiles/{id}/deactivate_routing_algorithm | Profile - Deactivate routing algorithm |
| [**deactivatesARoutingAlgorithmUnderAProfileWithHttpInfo**](ProfileApi.md#deactivatesARoutingAlgorithmUnderAProfileWithHttpInfo) | **PATCH** /v2/profiles/{id}/deactivate_routing_algorithm | Profile - Deactivate routing algorithm |
| [**retrieveAProfile**](ProfileApi.md#retrieveAProfile) | **GET** /v2/profiles/{id} | Profile - Retrieve |
| [**retrieveAProfileWithHttpInfo**](ProfileApi.md#retrieveAProfileWithHttpInfo) | **GET** /v2/profiles/{id} | Profile - Retrieve |
| [**retrieveTheActiveRoutingAlgorithmUnderTheProfile**](ProfileApi.md#retrieveTheActiveRoutingAlgorithmUnderTheProfile) | **GET** /v2/profiles/{id}/routing_algorithm | Profile - Retrieve Active Routing Algorithm |
| [**retrieveTheActiveRoutingAlgorithmUnderTheProfileWithHttpInfo**](ProfileApi.md#retrieveTheActiveRoutingAlgorithmUnderTheProfileWithHttpInfo) | **GET** /v2/profiles/{id}/routing_algorithm | Profile - Retrieve Active Routing Algorithm |
| [**retrieveTheDefaultFallbackRoutingAlgorithmForTheProfile**](ProfileApi.md#retrieveTheDefaultFallbackRoutingAlgorithmForTheProfile) | **GET** /v2/profiles/{id}/fallback_routing | Profile - Retrieve Default Fallback Routing Algorithm |
| [**retrieveTheDefaultFallbackRoutingAlgorithmForTheProfileWithHttpInfo**](ProfileApi.md#retrieveTheDefaultFallbackRoutingAlgorithmForTheProfileWithHttpInfo) | **GET** /v2/profiles/{id}/fallback_routing | Profile - Retrieve Default Fallback Routing Algorithm |
| [**updateAProfile**](ProfileApi.md#updateAProfile) | **PUT** /v2/profiles/{id} | Profile - Update |
| [**updateAProfileWithHttpInfo**](ProfileApi.md#updateAProfileWithHttpInfo) | **PUT** /v2/profiles/{id} | Profile - Update |
| [**updateTheDefaultFallbackRoutingAlgorithmForTheProfile**](ProfileApi.md#updateTheDefaultFallbackRoutingAlgorithmForTheProfile) | **PATCH** /v2/profiles/{id}/fallback_routing | Profile - Update Default Fallback Routing Algorithm |
| [**updateTheDefaultFallbackRoutingAlgorithmForTheProfileWithHttpInfo**](ProfileApi.md#updateTheDefaultFallbackRoutingAlgorithmForTheProfileWithHttpInfo) | **PATCH** /v2/profiles/{id}/fallback_routing | Profile - Update Default Fallback Routing Algorithm |



## activatesARoutingAlgorithmUnderAProfile

> RoutingDictionaryRecord activatesARoutingAlgorithmUnderAProfile(id, routingAlgorithmId)

Profile - Activate routing algorithm

Activates a routing algorithm under a profile

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.ProfileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        ProfileApi apiInstance = new ProfileApi(defaultClient);
        String id = "id_example"; // String | The unique identifier for the profile
        RoutingAlgorithmId routingAlgorithmId = new RoutingAlgorithmId(); // RoutingAlgorithmId | 
        try {
            RoutingDictionaryRecord result = apiInstance.activatesARoutingAlgorithmUnderAProfile(id, routingAlgorithmId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfileApi#activatesARoutingAlgorithmUnderAProfile");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The unique identifier for the profile | |
| **routingAlgorithmId** | [**RoutingAlgorithmId**](RoutingAlgorithmId.md)|  | |

### Return type

[**RoutingDictionaryRecord**](RoutingDictionaryRecord.md)


### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Routing Algorithm is activated |  -  |
| **400** | Bad request |  -  |
| **404** | Resource missing |  -  |
| **500** | Internal server error |  -  |

## activatesARoutingAlgorithmUnderAProfileWithHttpInfo

> ApiResponse<RoutingDictionaryRecord> activatesARoutingAlgorithmUnderAProfile activatesARoutingAlgorithmUnderAProfileWithHttpInfo(id, routingAlgorithmId)

Profile - Activate routing algorithm

Activates a routing algorithm under a profile

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.ApiResponse;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.ProfileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        ProfileApi apiInstance = new ProfileApi(defaultClient);
        String id = "id_example"; // String | The unique identifier for the profile
        RoutingAlgorithmId routingAlgorithmId = new RoutingAlgorithmId(); // RoutingAlgorithmId | 
        try {
            ApiResponse<RoutingDictionaryRecord> response = apiInstance.activatesARoutingAlgorithmUnderAProfileWithHttpInfo(id, routingAlgorithmId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfileApi#activatesARoutingAlgorithmUnderAProfile");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The unique identifier for the profile | |
| **routingAlgorithmId** | [**RoutingAlgorithmId**](RoutingAlgorithmId.md)|  | |

### Return type

ApiResponse<[**RoutingDictionaryRecord**](RoutingDictionaryRecord.md)>


### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Routing Algorithm is activated |  -  |
| **400** | Bad request |  -  |
| **404** | Resource missing |  -  |
| **500** | Internal server error |  -  |


## createAProfile

> ProfileResponse createAProfile(xMerchantId, profileCreate)

Profile - Create

Creates a new *profile* for a merchant

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.ProfileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: admin_api_key
        ApiKeyAuth admin_api_key = (ApiKeyAuth) defaultClient.getAuthentication("admin_api_key");
        admin_api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //admin_api_key.setApiKeyPrefix("Token");

        ProfileApi apiInstance = new ProfileApi(defaultClient);
        String xMerchantId = "{\"X-Merchant-Id\":\"abc_iG5VNjsN9xuCg7Xx0uWh\"}"; // String | Merchant ID of the profile.
        ProfileCreate profileCreate = new ProfileCreate(); // ProfileCreate | 
        try {
            ProfileResponse result = apiInstance.createAProfile(xMerchantId, profileCreate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfileApi#createAProfile");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xMerchantId** | **String**| Merchant ID of the profile. | |
| **profileCreate** | [**ProfileCreate**](ProfileCreate.md)|  | |

### Return type

[**ProfileResponse**](ProfileResponse.md)


### Authorization

[admin_api_key](../README.md#admin_api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Account Created |  -  |
| **400** | Invalid data |  -  |

## createAProfileWithHttpInfo

> ApiResponse<ProfileResponse> createAProfile createAProfileWithHttpInfo(xMerchantId, profileCreate)

Profile - Create

Creates a new *profile* for a merchant

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.ApiResponse;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.ProfileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: admin_api_key
        ApiKeyAuth admin_api_key = (ApiKeyAuth) defaultClient.getAuthentication("admin_api_key");
        admin_api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //admin_api_key.setApiKeyPrefix("Token");

        ProfileApi apiInstance = new ProfileApi(defaultClient);
        String xMerchantId = "{\"X-Merchant-Id\":\"abc_iG5VNjsN9xuCg7Xx0uWh\"}"; // String | Merchant ID of the profile.
        ProfileCreate profileCreate = new ProfileCreate(); // ProfileCreate | 
        try {
            ApiResponse<ProfileResponse> response = apiInstance.createAProfileWithHttpInfo(xMerchantId, profileCreate);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfileApi#createAProfile");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xMerchantId** | **String**| Merchant ID of the profile. | |
| **profileCreate** | [**ProfileCreate**](ProfileCreate.md)|  | |

### Return type

ApiResponse<[**ProfileResponse**](ProfileResponse.md)>


### Authorization

[admin_api_key](../README.md#admin_api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Account Created |  -  |
| **400** | Invalid data |  -  |


## deactivatesARoutingAlgorithmUnderAProfile

> RoutingDictionaryRecord deactivatesARoutingAlgorithmUnderAProfile(id)

Profile - Deactivate routing algorithm

Deactivates a routing algorithm under a profile

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.ProfileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        ProfileApi apiInstance = new ProfileApi(defaultClient);
        String id = "id_example"; // String | The unique identifier for the profile
        try {
            RoutingDictionaryRecord result = apiInstance.deactivatesARoutingAlgorithmUnderAProfile(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfileApi#deactivatesARoutingAlgorithmUnderAProfile");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The unique identifier for the profile | |

### Return type

[**RoutingDictionaryRecord**](RoutingDictionaryRecord.md)


### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully deactivated routing config |  -  |
| **400** | Malformed request |  -  |
| **403** | Malformed request |  -  |
| **422** | Unprocessable request |  -  |
| **500** | Internal server error |  -  |

## deactivatesARoutingAlgorithmUnderAProfileWithHttpInfo

> ApiResponse<RoutingDictionaryRecord> deactivatesARoutingAlgorithmUnderAProfile deactivatesARoutingAlgorithmUnderAProfileWithHttpInfo(id)

Profile - Deactivate routing algorithm

Deactivates a routing algorithm under a profile

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.ApiResponse;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.ProfileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        ProfileApi apiInstance = new ProfileApi(defaultClient);
        String id = "id_example"; // String | The unique identifier for the profile
        try {
            ApiResponse<RoutingDictionaryRecord> response = apiInstance.deactivatesARoutingAlgorithmUnderAProfileWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfileApi#deactivatesARoutingAlgorithmUnderAProfile");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The unique identifier for the profile | |

### Return type

ApiResponse<[**RoutingDictionaryRecord**](RoutingDictionaryRecord.md)>


### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully deactivated routing config |  -  |
| **400** | Malformed request |  -  |
| **403** | Malformed request |  -  |
| **422** | Unprocessable request |  -  |
| **500** | Internal server error |  -  |


## retrieveAProfile

> ProfileResponse retrieveAProfile(id, xMerchantId)

Profile - Retrieve

Retrieve existing *profile*

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.ProfileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: admin_api_key
        ApiKeyAuth admin_api_key = (ApiKeyAuth) defaultClient.getAuthentication("admin_api_key");
        admin_api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //admin_api_key.setApiKeyPrefix("Token");

        ProfileApi apiInstance = new ProfileApi(defaultClient);
        String id = "id_example"; // String | The unique identifier for the profile
        String xMerchantId = "{\"X-Merchant-Id\":\"abc_iG5VNjsN9xuCg7Xx0uWh\"}"; // String | Merchant ID of the profile.
        try {
            ProfileResponse result = apiInstance.retrieveAProfile(id, xMerchantId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfileApi#retrieveAProfile");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The unique identifier for the profile | |
| **xMerchantId** | **String**| Merchant ID of the profile. | |

### Return type

[**ProfileResponse**](ProfileResponse.md)


### Authorization

[admin_api_key](../README.md#admin_api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Profile Updated |  -  |
| **400** | Invalid data |  -  |

## retrieveAProfileWithHttpInfo

> ApiResponse<ProfileResponse> retrieveAProfile retrieveAProfileWithHttpInfo(id, xMerchantId)

Profile - Retrieve

Retrieve existing *profile*

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.ApiResponse;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.ProfileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: admin_api_key
        ApiKeyAuth admin_api_key = (ApiKeyAuth) defaultClient.getAuthentication("admin_api_key");
        admin_api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //admin_api_key.setApiKeyPrefix("Token");

        ProfileApi apiInstance = new ProfileApi(defaultClient);
        String id = "id_example"; // String | The unique identifier for the profile
        String xMerchantId = "{\"X-Merchant-Id\":\"abc_iG5VNjsN9xuCg7Xx0uWh\"}"; // String | Merchant ID of the profile.
        try {
            ApiResponse<ProfileResponse> response = apiInstance.retrieveAProfileWithHttpInfo(id, xMerchantId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfileApi#retrieveAProfile");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The unique identifier for the profile | |
| **xMerchantId** | **String**| Merchant ID of the profile. | |

### Return type

ApiResponse<[**ProfileResponse**](ProfileResponse.md)>


### Authorization

[admin_api_key](../README.md#admin_api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Profile Updated |  -  |
| **400** | Invalid data |  -  |


## retrieveTheActiveRoutingAlgorithmUnderTheProfile

> LinkedRoutingConfigRetrieveResponse retrieveTheActiveRoutingAlgorithmUnderTheProfile(id, limit, offset)

Profile - Retrieve Active Routing Algorithm

Retrieve active routing algorithm under the profile

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.ProfileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        ProfileApi apiInstance = new ProfileApi(defaultClient);
        String id = "id_example"; // String | The unique identifier for the profile
        Integer limit = 56; // Integer | The number of records of the algorithms to be returned
        Integer offset = 56; // Integer | The record offset of the algorithm from which to start gathering the results
        try {
            LinkedRoutingConfigRetrieveResponse result = apiInstance.retrieveTheActiveRoutingAlgorithmUnderTheProfile(id, limit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfileApi#retrieveTheActiveRoutingAlgorithmUnderTheProfile");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The unique identifier for the profile | |
| **limit** | **Integer**| The number of records of the algorithms to be returned | [optional] |
| **offset** | **Integer**| The record offset of the algorithm from which to start gathering the results | [optional] |

### Return type

[**LinkedRoutingConfigRetrieveResponse**](LinkedRoutingConfigRetrieveResponse.md)


### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved active config |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource missing |  -  |
| **500** | Internal server error |  -  |

## retrieveTheActiveRoutingAlgorithmUnderTheProfileWithHttpInfo

> ApiResponse<LinkedRoutingConfigRetrieveResponse> retrieveTheActiveRoutingAlgorithmUnderTheProfile retrieveTheActiveRoutingAlgorithmUnderTheProfileWithHttpInfo(id, limit, offset)

Profile - Retrieve Active Routing Algorithm

Retrieve active routing algorithm under the profile

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.ApiResponse;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.ProfileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        ProfileApi apiInstance = new ProfileApi(defaultClient);
        String id = "id_example"; // String | The unique identifier for the profile
        Integer limit = 56; // Integer | The number of records of the algorithms to be returned
        Integer offset = 56; // Integer | The record offset of the algorithm from which to start gathering the results
        try {
            ApiResponse<LinkedRoutingConfigRetrieveResponse> response = apiInstance.retrieveTheActiveRoutingAlgorithmUnderTheProfileWithHttpInfo(id, limit, offset);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfileApi#retrieveTheActiveRoutingAlgorithmUnderTheProfile");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The unique identifier for the profile | |
| **limit** | **Integer**| The number of records of the algorithms to be returned | [optional] |
| **offset** | **Integer**| The record offset of the algorithm from which to start gathering the results | [optional] |

### Return type

ApiResponse<[**LinkedRoutingConfigRetrieveResponse**](LinkedRoutingConfigRetrieveResponse.md)>


### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved active config |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource missing |  -  |
| **500** | Internal server error |  -  |


## retrieveTheDefaultFallbackRoutingAlgorithmForTheProfile

> List<RoutableConnectorChoice> retrieveTheDefaultFallbackRoutingAlgorithmForTheProfile(id)

Profile - Retrieve Default Fallback Routing Algorithm

Retrieve the default fallback routing algorithm for the profile

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.ProfileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        ProfileApi apiInstance = new ProfileApi(defaultClient);
        String id = "id_example"; // String | The unique identifier for the profile
        try {
            List<RoutableConnectorChoice> result = apiInstance.retrieveTheDefaultFallbackRoutingAlgorithmForTheProfile(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfileApi#retrieveTheDefaultFallbackRoutingAlgorithmForTheProfile");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The unique identifier for the profile | |

### Return type

[**List&lt;RoutableConnectorChoice&gt;**](RoutableConnectorChoice.md)


### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved default fallback routing algorithm |  -  |
| **500** | Internal server error |  -  |

## retrieveTheDefaultFallbackRoutingAlgorithmForTheProfileWithHttpInfo

> ApiResponse<List<RoutableConnectorChoice>> retrieveTheDefaultFallbackRoutingAlgorithmForTheProfile retrieveTheDefaultFallbackRoutingAlgorithmForTheProfileWithHttpInfo(id)

Profile - Retrieve Default Fallback Routing Algorithm

Retrieve the default fallback routing algorithm for the profile

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.ApiResponse;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.ProfileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        ProfileApi apiInstance = new ProfileApi(defaultClient);
        String id = "id_example"; // String | The unique identifier for the profile
        try {
            ApiResponse<List<RoutableConnectorChoice>> response = apiInstance.retrieveTheDefaultFallbackRoutingAlgorithmForTheProfileWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfileApi#retrieveTheDefaultFallbackRoutingAlgorithmForTheProfile");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The unique identifier for the profile | |

### Return type

ApiResponse<[**List&lt;RoutableConnectorChoice&gt;**](RoutableConnectorChoice.md)>


### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved default fallback routing algorithm |  -  |
| **500** | Internal server error |  -  |


## updateAProfile

> ProfileResponse updateAProfile(id, xMerchantId, profileCreate)

Profile - Update

Update the *profile*

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.ProfileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: admin_api_key
        ApiKeyAuth admin_api_key = (ApiKeyAuth) defaultClient.getAuthentication("admin_api_key");
        admin_api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //admin_api_key.setApiKeyPrefix("Token");

        ProfileApi apiInstance = new ProfileApi(defaultClient);
        String id = "id_example"; // String | The unique identifier for the profile
        String xMerchantId = "{\"X-Merchant-Id\":\"abc_iG5VNjsN9xuCg7Xx0uWh\"}"; // String | Merchant ID of the profile.
        ProfileCreate profileCreate = new ProfileCreate(); // ProfileCreate | 
        try {
            ProfileResponse result = apiInstance.updateAProfile(id, xMerchantId, profileCreate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfileApi#updateAProfile");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The unique identifier for the profile | |
| **xMerchantId** | **String**| Merchant ID of the profile. | |
| **profileCreate** | [**ProfileCreate**](ProfileCreate.md)|  | |

### Return type

[**ProfileResponse**](ProfileResponse.md)


### Authorization

[admin_api_key](../README.md#admin_api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Profile Updated |  -  |
| **400** | Invalid data |  -  |

## updateAProfileWithHttpInfo

> ApiResponse<ProfileResponse> updateAProfile updateAProfileWithHttpInfo(id, xMerchantId, profileCreate)

Profile - Update

Update the *profile*

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.ApiResponse;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.ProfileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: admin_api_key
        ApiKeyAuth admin_api_key = (ApiKeyAuth) defaultClient.getAuthentication("admin_api_key");
        admin_api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //admin_api_key.setApiKeyPrefix("Token");

        ProfileApi apiInstance = new ProfileApi(defaultClient);
        String id = "id_example"; // String | The unique identifier for the profile
        String xMerchantId = "{\"X-Merchant-Id\":\"abc_iG5VNjsN9xuCg7Xx0uWh\"}"; // String | Merchant ID of the profile.
        ProfileCreate profileCreate = new ProfileCreate(); // ProfileCreate | 
        try {
            ApiResponse<ProfileResponse> response = apiInstance.updateAProfileWithHttpInfo(id, xMerchantId, profileCreate);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfileApi#updateAProfile");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The unique identifier for the profile | |
| **xMerchantId** | **String**| Merchant ID of the profile. | |
| **profileCreate** | [**ProfileCreate**](ProfileCreate.md)|  | |

### Return type

ApiResponse<[**ProfileResponse**](ProfileResponse.md)>


### Authorization

[admin_api_key](../README.md#admin_api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Profile Updated |  -  |
| **400** | Invalid data |  -  |


## updateTheDefaultFallbackRoutingAlgorithmForTheProfile

> List<RoutableConnectorChoice> updateTheDefaultFallbackRoutingAlgorithmForTheProfile(id, routableConnectorChoice)

Profile - Update Default Fallback Routing Algorithm

Update the default fallback routing algorithm for the profile

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.ProfileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        ProfileApi apiInstance = new ProfileApi(defaultClient);
        String id = "id_example"; // String | The unique identifier for the profile
        List<RoutableConnectorChoice> routableConnectorChoice = Arrays.asList(); // List<RoutableConnectorChoice> | 
        try {
            List<RoutableConnectorChoice> result = apiInstance.updateTheDefaultFallbackRoutingAlgorithmForTheProfile(id, routableConnectorChoice);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfileApi#updateTheDefaultFallbackRoutingAlgorithmForTheProfile");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The unique identifier for the profile | |
| **routableConnectorChoice** | [**List&lt;RoutableConnectorChoice&gt;**](RoutableConnectorChoice.md)|  | |

### Return type

[**List&lt;RoutableConnectorChoice&gt;**](RoutableConnectorChoice.md)


### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully updated the default fallback routing algorithm |  -  |
| **400** | Malformed request |  -  |
| **422** | Unprocessable request |  -  |
| **500** | Internal server error |  -  |

## updateTheDefaultFallbackRoutingAlgorithmForTheProfileWithHttpInfo

> ApiResponse<List<RoutableConnectorChoice>> updateTheDefaultFallbackRoutingAlgorithmForTheProfile updateTheDefaultFallbackRoutingAlgorithmForTheProfileWithHttpInfo(id, routableConnectorChoice)

Profile - Update Default Fallback Routing Algorithm

Update the default fallback routing algorithm for the profile

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.ApiResponse;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.ProfileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        ProfileApi apiInstance = new ProfileApi(defaultClient);
        String id = "id_example"; // String | The unique identifier for the profile
        List<RoutableConnectorChoice> routableConnectorChoice = Arrays.asList(); // List<RoutableConnectorChoice> | 
        try {
            ApiResponse<List<RoutableConnectorChoice>> response = apiInstance.updateTheDefaultFallbackRoutingAlgorithmForTheProfileWithHttpInfo(id, routableConnectorChoice);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfileApi#updateTheDefaultFallbackRoutingAlgorithmForTheProfile");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The unique identifier for the profile | |
| **routableConnectorChoice** | [**List&lt;RoutableConnectorChoice&gt;**](RoutableConnectorChoice.md)|  | |

### Return type

ApiResponse<[**List&lt;RoutableConnectorChoice&gt;**](RoutableConnectorChoice.md)>


### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully updated the default fallback routing algorithm |  -  |
| **400** | Malformed request |  -  |
| **422** | Unprocessable request |  -  |
| **500** | Internal server error |  -  |

