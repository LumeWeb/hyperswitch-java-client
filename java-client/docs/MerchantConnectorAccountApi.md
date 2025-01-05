# MerchantConnectorAccountApi

All URIs are relative to *https://sandbox.hyperswitch.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAMerchantConnector**](MerchantConnectorAccountApi.md#createAMerchantConnector) | **POST** /v2/connector_accounts | Connector Account - Create |
| [**createAMerchantConnectorWithHttpInfo**](MerchantConnectorAccountApi.md#createAMerchantConnectorWithHttpInfo) | **POST** /v2/connector_accounts | Connector Account - Create |
| [**deleteAMerchantConnector**](MerchantConnectorAccountApi.md#deleteAMerchantConnector) | **DELETE** /v2/connector_accounts/{id} | Merchant Connector - Delete |
| [**deleteAMerchantConnectorWithHttpInfo**](MerchantConnectorAccountApi.md#deleteAMerchantConnectorWithHttpInfo) | **DELETE** /v2/connector_accounts/{id} | Merchant Connector - Delete |
| [**retrieveAMerchantConnector**](MerchantConnectorAccountApi.md#retrieveAMerchantConnector) | **GET** /v2/connector_accounts/{id} | Connector Account - Retrieve |
| [**retrieveAMerchantConnectorWithHttpInfo**](MerchantConnectorAccountApi.md#retrieveAMerchantConnectorWithHttpInfo) | **GET** /v2/connector_accounts/{id} | Connector Account - Retrieve |
| [**updateAMerchantConnector**](MerchantConnectorAccountApi.md#updateAMerchantConnector) | **PUT** /v2/connector_accounts/{id} | Connector Account - Update |
| [**updateAMerchantConnectorWithHttpInfo**](MerchantConnectorAccountApi.md#updateAMerchantConnectorWithHttpInfo) | **PUT** /v2/connector_accounts/{id} | Connector Account - Update |



## createAMerchantConnector

> MerchantConnectorResponse createAMerchantConnector(merchantConnectorCreate)

Connector Account - Create

Creates a new Connector Account for the merchant account. The connector could be a payment processor/facilitator/acquirer or a provider of specialized services like Fraud/Accounting etc.

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.MerchantConnectorAccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: admin_api_key
        ApiKeyAuth admin_api_key = (ApiKeyAuth) defaultClient.getAuthentication("admin_api_key");
        admin_api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //admin_api_key.setApiKeyPrefix("Token");

        MerchantConnectorAccountApi apiInstance = new MerchantConnectorAccountApi(defaultClient);
        MerchantConnectorCreate merchantConnectorCreate = new MerchantConnectorCreate(); // MerchantConnectorCreate | 
        try {
            MerchantConnectorResponse result = apiInstance.createAMerchantConnector(merchantConnectorCreate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MerchantConnectorAccountApi#createAMerchantConnector");
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
| **merchantConnectorCreate** | [**MerchantConnectorCreate**](MerchantConnectorCreate.md)|  | |

### Return type

[**MerchantConnectorResponse**](MerchantConnectorResponse.md)


### Authorization

[admin_api_key](../README.md#admin_api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Merchant Connector Created |  -  |
| **400** | Missing Mandatory fields |  -  |

## createAMerchantConnectorWithHttpInfo

> ApiResponse<MerchantConnectorResponse> createAMerchantConnector createAMerchantConnectorWithHttpInfo(merchantConnectorCreate)

Connector Account - Create

Creates a new Connector Account for the merchant account. The connector could be a payment processor/facilitator/acquirer or a provider of specialized services like Fraud/Accounting etc.

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.ApiResponse;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.MerchantConnectorAccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: admin_api_key
        ApiKeyAuth admin_api_key = (ApiKeyAuth) defaultClient.getAuthentication("admin_api_key");
        admin_api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //admin_api_key.setApiKeyPrefix("Token");

        MerchantConnectorAccountApi apiInstance = new MerchantConnectorAccountApi(defaultClient);
        MerchantConnectorCreate merchantConnectorCreate = new MerchantConnectorCreate(); // MerchantConnectorCreate | 
        try {
            ApiResponse<MerchantConnectorResponse> response = apiInstance.createAMerchantConnectorWithHttpInfo(merchantConnectorCreate);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling MerchantConnectorAccountApi#createAMerchantConnector");
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
| **merchantConnectorCreate** | [**MerchantConnectorCreate**](MerchantConnectorCreate.md)|  | |

### Return type

ApiResponse<[**MerchantConnectorResponse**](MerchantConnectorResponse.md)>


### Authorization

[admin_api_key](../README.md#admin_api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Merchant Connector Created |  -  |
| **400** | Missing Mandatory fields |  -  |


## deleteAMerchantConnector

> MerchantConnectorDeleteResponse deleteAMerchantConnector(id)

Merchant Connector - Delete

Delete or Detach a Merchant Connector from Merchant Account

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.MerchantConnectorAccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: admin_api_key
        ApiKeyAuth admin_api_key = (ApiKeyAuth) defaultClient.getAuthentication("admin_api_key");
        admin_api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //admin_api_key.setApiKeyPrefix("Token");

        MerchantConnectorAccountApi apiInstance = new MerchantConnectorAccountApi(defaultClient);
        Integer id = 56; // Integer | The unique identifier for the Merchant Connector
        try {
            MerchantConnectorDeleteResponse result = apiInstance.deleteAMerchantConnector(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MerchantConnectorAccountApi#deleteAMerchantConnector");
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
| **id** | **Integer**| The unique identifier for the Merchant Connector | |

### Return type

[**MerchantConnectorDeleteResponse**](MerchantConnectorDeleteResponse.md)


### Authorization

[admin_api_key](../README.md#admin_api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Merchant Connector Deleted |  -  |
| **401** | Unauthorized request |  -  |
| **404** | Merchant Connector does not exist in records |  -  |

## deleteAMerchantConnectorWithHttpInfo

> ApiResponse<MerchantConnectorDeleteResponse> deleteAMerchantConnector deleteAMerchantConnectorWithHttpInfo(id)

Merchant Connector - Delete

Delete or Detach a Merchant Connector from Merchant Account

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.ApiResponse;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.MerchantConnectorAccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: admin_api_key
        ApiKeyAuth admin_api_key = (ApiKeyAuth) defaultClient.getAuthentication("admin_api_key");
        admin_api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //admin_api_key.setApiKeyPrefix("Token");

        MerchantConnectorAccountApi apiInstance = new MerchantConnectorAccountApi(defaultClient);
        Integer id = 56; // Integer | The unique identifier for the Merchant Connector
        try {
            ApiResponse<MerchantConnectorDeleteResponse> response = apiInstance.deleteAMerchantConnectorWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling MerchantConnectorAccountApi#deleteAMerchantConnector");
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
| **id** | **Integer**| The unique identifier for the Merchant Connector | |

### Return type

ApiResponse<[**MerchantConnectorDeleteResponse**](MerchantConnectorDeleteResponse.md)>


### Authorization

[admin_api_key](../README.md#admin_api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Merchant Connector Deleted |  -  |
| **401** | Unauthorized request |  -  |
| **404** | Merchant Connector does not exist in records |  -  |


## retrieveAMerchantConnector

> MerchantConnectorResponse retrieveAMerchantConnector(id)

Connector Account - Retrieve

Retrieves details of a Connector account

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.MerchantConnectorAccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: admin_api_key
        ApiKeyAuth admin_api_key = (ApiKeyAuth) defaultClient.getAuthentication("admin_api_key");
        admin_api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //admin_api_key.setApiKeyPrefix("Token");

        MerchantConnectorAccountApi apiInstance = new MerchantConnectorAccountApi(defaultClient);
        Integer id = 56; // Integer | The unique identifier for the Merchant Connector
        try {
            MerchantConnectorResponse result = apiInstance.retrieveAMerchantConnector(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MerchantConnectorAccountApi#retrieveAMerchantConnector");
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
| **id** | **Integer**| The unique identifier for the Merchant Connector | |

### Return type

[**MerchantConnectorResponse**](MerchantConnectorResponse.md)


### Authorization

[admin_api_key](../README.md#admin_api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Merchant Connector retrieved successfully |  -  |
| **401** | Unauthorized request |  -  |
| **404** | Merchant Connector does not exist in records |  -  |

## retrieveAMerchantConnectorWithHttpInfo

> ApiResponse<MerchantConnectorResponse> retrieveAMerchantConnector retrieveAMerchantConnectorWithHttpInfo(id)

Connector Account - Retrieve

Retrieves details of a Connector account

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.ApiResponse;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.MerchantConnectorAccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: admin_api_key
        ApiKeyAuth admin_api_key = (ApiKeyAuth) defaultClient.getAuthentication("admin_api_key");
        admin_api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //admin_api_key.setApiKeyPrefix("Token");

        MerchantConnectorAccountApi apiInstance = new MerchantConnectorAccountApi(defaultClient);
        Integer id = 56; // Integer | The unique identifier for the Merchant Connector
        try {
            ApiResponse<MerchantConnectorResponse> response = apiInstance.retrieveAMerchantConnectorWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling MerchantConnectorAccountApi#retrieveAMerchantConnector");
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
| **id** | **Integer**| The unique identifier for the Merchant Connector | |

### Return type

ApiResponse<[**MerchantConnectorResponse**](MerchantConnectorResponse.md)>


### Authorization

[admin_api_key](../README.md#admin_api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Merchant Connector retrieved successfully |  -  |
| **401** | Unauthorized request |  -  |
| **404** | Merchant Connector does not exist in records |  -  |


## updateAMerchantConnector

> MerchantConnectorResponse updateAMerchantConnector(id, merchantConnectorUpdate)

Connector Account - Update

To update an existing Connector account. Helpful in enabling/disabling different payment methods and other settings for the connector

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.MerchantConnectorAccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: admin_api_key
        ApiKeyAuth admin_api_key = (ApiKeyAuth) defaultClient.getAuthentication("admin_api_key");
        admin_api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //admin_api_key.setApiKeyPrefix("Token");

        MerchantConnectorAccountApi apiInstance = new MerchantConnectorAccountApi(defaultClient);
        Integer id = 56; // Integer | The unique identifier for the Merchant Connector
        MerchantConnectorUpdate merchantConnectorUpdate = new MerchantConnectorUpdate(); // MerchantConnectorUpdate | 
        try {
            MerchantConnectorResponse result = apiInstance.updateAMerchantConnector(id, merchantConnectorUpdate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MerchantConnectorAccountApi#updateAMerchantConnector");
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
| **id** | **Integer**| The unique identifier for the Merchant Connector | |
| **merchantConnectorUpdate** | [**MerchantConnectorUpdate**](MerchantConnectorUpdate.md)|  | |

### Return type

[**MerchantConnectorResponse**](MerchantConnectorResponse.md)


### Authorization

[admin_api_key](../README.md#admin_api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Merchant Connector Updated |  -  |
| **401** | Unauthorized request |  -  |
| **404** | Merchant Connector does not exist in records |  -  |

## updateAMerchantConnectorWithHttpInfo

> ApiResponse<MerchantConnectorResponse> updateAMerchantConnector updateAMerchantConnectorWithHttpInfo(id, merchantConnectorUpdate)

Connector Account - Update

To update an existing Connector account. Helpful in enabling/disabling different payment methods and other settings for the connector

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.ApiResponse;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.MerchantConnectorAccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: admin_api_key
        ApiKeyAuth admin_api_key = (ApiKeyAuth) defaultClient.getAuthentication("admin_api_key");
        admin_api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //admin_api_key.setApiKeyPrefix("Token");

        MerchantConnectorAccountApi apiInstance = new MerchantConnectorAccountApi(defaultClient);
        Integer id = 56; // Integer | The unique identifier for the Merchant Connector
        MerchantConnectorUpdate merchantConnectorUpdate = new MerchantConnectorUpdate(); // MerchantConnectorUpdate | 
        try {
            ApiResponse<MerchantConnectorResponse> response = apiInstance.updateAMerchantConnectorWithHttpInfo(id, merchantConnectorUpdate);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling MerchantConnectorAccountApi#updateAMerchantConnector");
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
| **id** | **Integer**| The unique identifier for the Merchant Connector | |
| **merchantConnectorUpdate** | [**MerchantConnectorUpdate**](MerchantConnectorUpdate.md)|  | |

### Return type

ApiResponse<[**MerchantConnectorResponse**](MerchantConnectorResponse.md)>


### Authorization

[admin_api_key](../README.md#admin_api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Merchant Connector Updated |  -  |
| **401** | Unauthorized request |  -  |
| **404** | Merchant Connector does not exist in records |  -  |

