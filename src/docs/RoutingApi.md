# RoutingApi

All URIs are relative to *https://sandbox.hyperswitch.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createARoutingAlgprithm**](RoutingApi.md#createARoutingAlgprithm) | **POST** /v2/routing_algorithm | Routing - Create |
| [**createARoutingAlgprithmWithHttpInfo**](RoutingApi.md#createARoutingAlgprithmWithHttpInfo) | **POST** /v2/routing_algorithm | Routing - Create |
| [**retrieveARoutingAlgorithmWithItsAlgorithmId**](RoutingApi.md#retrieveARoutingAlgorithmWithItsAlgorithmId) | **GET** /v2/routing_algorithm/{id} | Routing - Retrieve |
| [**retrieveARoutingAlgorithmWithItsAlgorithmIdWithHttpInfo**](RoutingApi.md#retrieveARoutingAlgorithmWithItsAlgorithmIdWithHttpInfo) | **GET** /v2/routing_algorithm/{id} | Routing - Retrieve |



## createARoutingAlgprithm

> RoutingDictionaryRecord createARoutingAlgprithm(routingConfigRequest)

Routing - Create

Create a routing algorithm

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.RoutingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        RoutingApi apiInstance = new RoutingApi(defaultClient);
        RoutingConfigRequest routingConfigRequest = new RoutingConfigRequest(); // RoutingConfigRequest | 
        try {
            RoutingDictionaryRecord result = apiInstance.createARoutingAlgprithm(routingConfigRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoutingApi#createARoutingAlgprithm");
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
| **routingConfigRequest** | [**RoutingConfigRequest**](RoutingConfigRequest.md)|  | |

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
| **200** | Routing Algorithm created |  -  |
| **400** | Request body is malformed |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource missing |  -  |
| **422** | Unprocessable request |  -  |
| **500** | Internal server error |  -  |

## createARoutingAlgprithmWithHttpInfo

> ApiResponse<RoutingDictionaryRecord> createARoutingAlgprithm createARoutingAlgprithmWithHttpInfo(routingConfigRequest)

Routing - Create

Create a routing algorithm

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.ApiResponse;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.RoutingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        RoutingApi apiInstance = new RoutingApi(defaultClient);
        RoutingConfigRequest routingConfigRequest = new RoutingConfigRequest(); // RoutingConfigRequest | 
        try {
            ApiResponse<RoutingDictionaryRecord> response = apiInstance.createARoutingAlgprithmWithHttpInfo(routingConfigRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RoutingApi#createARoutingAlgprithm");
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
| **routingConfigRequest** | [**RoutingConfigRequest**](RoutingConfigRequest.md)|  | |

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
| **200** | Routing Algorithm created |  -  |
| **400** | Request body is malformed |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource missing |  -  |
| **422** | Unprocessable request |  -  |
| **500** | Internal server error |  -  |


## retrieveARoutingAlgorithmWithItsAlgorithmId

> MerchantRoutingAlgorithm retrieveARoutingAlgorithmWithItsAlgorithmId(id)

Routing - Retrieve

Retrieve a routing algorithm with its algorithm id

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.RoutingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        RoutingApi apiInstance = new RoutingApi(defaultClient);
        String id = "id_example"; // String | The unique identifier for a routing algorithm
        try {
            MerchantRoutingAlgorithm result = apiInstance.retrieveARoutingAlgorithmWithItsAlgorithmId(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoutingApi#retrieveARoutingAlgorithmWithItsAlgorithmId");
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
| **id** | **String**| The unique identifier for a routing algorithm | |

### Return type

[**MerchantRoutingAlgorithm**](MerchantRoutingAlgorithm.md)


### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully fetched routing algorithm |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource missing |  -  |
| **500** | Internal server error |  -  |

## retrieveARoutingAlgorithmWithItsAlgorithmIdWithHttpInfo

> ApiResponse<MerchantRoutingAlgorithm> retrieveARoutingAlgorithmWithItsAlgorithmId retrieveARoutingAlgorithmWithItsAlgorithmIdWithHttpInfo(id)

Routing - Retrieve

Retrieve a routing algorithm with its algorithm id

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.ApiResponse;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.RoutingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        RoutingApi apiInstance = new RoutingApi(defaultClient);
        String id = "id_example"; // String | The unique identifier for a routing algorithm
        try {
            ApiResponse<MerchantRoutingAlgorithm> response = apiInstance.retrieveARoutingAlgorithmWithItsAlgorithmIdWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RoutingApi#retrieveARoutingAlgorithmWithItsAlgorithmId");
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
| **id** | **String**| The unique identifier for a routing algorithm | |

### Return type

ApiResponse<[**MerchantRoutingAlgorithm**](MerchantRoutingAlgorithm.md)>


### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully fetched routing algorithm |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource missing |  -  |
| **500** | Internal server error |  -  |

