# ApiKeyApi

All URIs are relative to *https://sandbox.hyperswitch.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAnAPIKey**](ApiKeyApi.md#createAnAPIKey) | **POST** /v2/api_keys | API Key - Create |
| [**createAnAPIKeyWithHttpInfo**](ApiKeyApi.md#createAnAPIKeyWithHttpInfo) | **POST** /v2/api_keys | API Key - Create |
| [**listAllAPIKeysAssociatedWithAMerchantAccount**](ApiKeyApi.md#listAllAPIKeysAssociatedWithAMerchantAccount) | **GET** /v2/api_keys/list | API Key - List |
| [**listAllAPIKeysAssociatedWithAMerchantAccountWithHttpInfo**](ApiKeyApi.md#listAllAPIKeysAssociatedWithAMerchantAccountWithHttpInfo) | **GET** /v2/api_keys/list | API Key - List |
| [**retrieveAnAPIKey**](ApiKeyApi.md#retrieveAnAPIKey) | **GET** /v2/api_keys/{id} | API Key - Retrieve |
| [**retrieveAnAPIKeyWithHttpInfo**](ApiKeyApi.md#retrieveAnAPIKeyWithHttpInfo) | **GET** /v2/api_keys/{id} | API Key - Retrieve |
| [**revokeAnAPIKey**](ApiKeyApi.md#revokeAnAPIKey) | **DELETE** /v2/api_keys/{id} | API Key - Revoke |
| [**revokeAnAPIKeyWithHttpInfo**](ApiKeyApi.md#revokeAnAPIKeyWithHttpInfo) | **DELETE** /v2/api_keys/{id} | API Key - Revoke |
| [**updateAnAPIKey**](ApiKeyApi.md#updateAnAPIKey) | **PUT** /v2/api_keys/{id} | API Key - Update |
| [**updateAnAPIKeyWithHttpInfo**](ApiKeyApi.md#updateAnAPIKeyWithHttpInfo) | **PUT** /v2/api_keys/{id} | API Key - Update |



## createAnAPIKey

> CreateApiKeyResponse createAnAPIKey(createApiKeyRequest)

API Key - Create

Create a new API Key for accessing our APIs from your servers. The plaintext API Key will be displayed only once on creation, so ensure you store it securely.

### Example

```java
// Import classes:
import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.ApiException;
import com.hyperswitch.client.Configuration;
import com.hyperswitch.client.auth.*;
import com.hyperswitch.client.models.*;
import com.hyperswitch.api.ApiKeyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: admin_api_key
        ApiKeyAuth admin_api_key = (ApiKeyAuth) defaultClient.getAuthentication("admin_api_key");
        admin_api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //admin_api_key.setApiKeyPrefix("Token");

        ApiKeyApi apiInstance = new ApiKeyApi(defaultClient);
        CreateApiKeyRequest createApiKeyRequest = new CreateApiKeyRequest(); // CreateApiKeyRequest | 
        try {
            CreateApiKeyResponse result = apiInstance.createAnAPIKey(createApiKeyRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiKeyApi#createAnAPIKey");
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
| **createApiKeyRequest** | [**CreateApiKeyRequest**](CreateApiKeyRequest.md)|  | |

### Return type

[**CreateApiKeyResponse**](CreateApiKeyResponse.md)


### Authorization

[admin_api_key](../README.md#admin_api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | API Key created |  -  |
| **400** | Invalid data |  -  |

## createAnAPIKeyWithHttpInfo

> ApiResponse<CreateApiKeyResponse> createAnAPIKey createAnAPIKeyWithHttpInfo(createApiKeyRequest)

API Key - Create

Create a new API Key for accessing our APIs from your servers. The plaintext API Key will be displayed only once on creation, so ensure you store it securely.

### Example

```java
// Import classes:
import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.ApiException;
import com.hyperswitch.client.ApiResponse;
import com.hyperswitch.client.Configuration;
import com.hyperswitch.client.auth.*;
import com.hyperswitch.client.models.*;
import com.hyperswitch.api.ApiKeyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: admin_api_key
        ApiKeyAuth admin_api_key = (ApiKeyAuth) defaultClient.getAuthentication("admin_api_key");
        admin_api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //admin_api_key.setApiKeyPrefix("Token");

        ApiKeyApi apiInstance = new ApiKeyApi(defaultClient);
        CreateApiKeyRequest createApiKeyRequest = new CreateApiKeyRequest(); // CreateApiKeyRequest | 
        try {
            ApiResponse<CreateApiKeyResponse> response = apiInstance.createAnAPIKeyWithHttpInfo(createApiKeyRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiKeyApi#createAnAPIKey");
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
| **createApiKeyRequest** | [**CreateApiKeyRequest**](CreateApiKeyRequest.md)|  | |

### Return type

ApiResponse<[**CreateApiKeyResponse**](CreateApiKeyResponse.md)>


### Authorization

[admin_api_key](../README.md#admin_api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | API Key created |  -  |
| **400** | Invalid data |  -  |


## listAllAPIKeysAssociatedWithAMerchantAccount

> List<RetrieveApiKeyResponse> listAllAPIKeysAssociatedWithAMerchantAccount(limit, skip)

API Key - List

List all the API Keys associated to a merchant account.

### Example

```java
// Import classes:
import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.ApiException;
import com.hyperswitch.client.Configuration;
import com.hyperswitch.client.auth.*;
import com.hyperswitch.client.models.*;
import com.hyperswitch.api.ApiKeyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: admin_api_key
        ApiKeyAuth admin_api_key = (ApiKeyAuth) defaultClient.getAuthentication("admin_api_key");
        admin_api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //admin_api_key.setApiKeyPrefix("Token");

        ApiKeyApi apiInstance = new ApiKeyApi(defaultClient);
        Long limit = 56L; // Long | The maximum number of API Keys to include in the response
        Long skip = 56L; // Long | The number of API Keys to skip when retrieving the list of API keys.
        try {
            List<RetrieveApiKeyResponse> result = apiInstance.listAllAPIKeysAssociatedWithAMerchantAccount(limit, skip);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiKeyApi#listAllAPIKeysAssociatedWithAMerchantAccount");
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
| **limit** | **Long**| The maximum number of API Keys to include in the response | [optional] |
| **skip** | **Long**| The number of API Keys to skip when retrieving the list of API keys. | [optional] |

### Return type

[**List&lt;RetrieveApiKeyResponse&gt;**](RetrieveApiKeyResponse.md)


### Authorization

[admin_api_key](../README.md#admin_api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of API Keys retrieved successfully |  -  |

## listAllAPIKeysAssociatedWithAMerchantAccountWithHttpInfo

> ApiResponse<List<RetrieveApiKeyResponse>> listAllAPIKeysAssociatedWithAMerchantAccount listAllAPIKeysAssociatedWithAMerchantAccountWithHttpInfo(limit, skip)

API Key - List

List all the API Keys associated to a merchant account.

### Example

```java
// Import classes:
import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.ApiException;
import com.hyperswitch.client.ApiResponse;
import com.hyperswitch.client.Configuration;
import com.hyperswitch.client.auth.*;
import com.hyperswitch.client.models.*;
import com.hyperswitch.api.ApiKeyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: admin_api_key
        ApiKeyAuth admin_api_key = (ApiKeyAuth) defaultClient.getAuthentication("admin_api_key");
        admin_api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //admin_api_key.setApiKeyPrefix("Token");

        ApiKeyApi apiInstance = new ApiKeyApi(defaultClient);
        Long limit = 56L; // Long | The maximum number of API Keys to include in the response
        Long skip = 56L; // Long | The number of API Keys to skip when retrieving the list of API keys.
        try {
            ApiResponse<List<RetrieveApiKeyResponse>> response = apiInstance.listAllAPIKeysAssociatedWithAMerchantAccountWithHttpInfo(limit, skip);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiKeyApi#listAllAPIKeysAssociatedWithAMerchantAccount");
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
| **limit** | **Long**| The maximum number of API Keys to include in the response | [optional] |
| **skip** | **Long**| The number of API Keys to skip when retrieving the list of API keys. | [optional] |

### Return type

ApiResponse<[**List&lt;RetrieveApiKeyResponse&gt;**](RetrieveApiKeyResponse.md)>


### Authorization

[admin_api_key](../README.md#admin_api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of API Keys retrieved successfully |  -  |


## retrieveAnAPIKey

> RetrieveApiKeyResponse retrieveAnAPIKey(id)

API Key - Retrieve

Retrieve information about the specified API Key.

### Example

```java
// Import classes:
import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.ApiException;
import com.hyperswitch.client.Configuration;
import com.hyperswitch.client.auth.*;
import com.hyperswitch.client.models.*;
import com.hyperswitch.api.ApiKeyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: admin_api_key
        ApiKeyAuth admin_api_key = (ApiKeyAuth) defaultClient.getAuthentication("admin_api_key");
        admin_api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //admin_api_key.setApiKeyPrefix("Token");

        ApiKeyApi apiInstance = new ApiKeyApi(defaultClient);
        String id = "id_example"; // String | The unique identifier for the API Key
        try {
            RetrieveApiKeyResponse result = apiInstance.retrieveAnAPIKey(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiKeyApi#retrieveAnAPIKey");
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
| **id** | **String**| The unique identifier for the API Key | |

### Return type

[**RetrieveApiKeyResponse**](RetrieveApiKeyResponse.md)


### Authorization

[admin_api_key](../README.md#admin_api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | API Key retrieved |  -  |
| **404** | API Key not found |  -  |

## retrieveAnAPIKeyWithHttpInfo

> ApiResponse<RetrieveApiKeyResponse> retrieveAnAPIKey retrieveAnAPIKeyWithHttpInfo(id)

API Key - Retrieve

Retrieve information about the specified API Key.

### Example

```java
// Import classes:
import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.ApiException;
import com.hyperswitch.client.ApiResponse;
import com.hyperswitch.client.Configuration;
import com.hyperswitch.client.auth.*;
import com.hyperswitch.client.models.*;
import com.hyperswitch.api.ApiKeyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: admin_api_key
        ApiKeyAuth admin_api_key = (ApiKeyAuth) defaultClient.getAuthentication("admin_api_key");
        admin_api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //admin_api_key.setApiKeyPrefix("Token");

        ApiKeyApi apiInstance = new ApiKeyApi(defaultClient);
        String id = "id_example"; // String | The unique identifier for the API Key
        try {
            ApiResponse<RetrieveApiKeyResponse> response = apiInstance.retrieveAnAPIKeyWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiKeyApi#retrieveAnAPIKey");
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
| **id** | **String**| The unique identifier for the API Key | |

### Return type

ApiResponse<[**RetrieveApiKeyResponse**](RetrieveApiKeyResponse.md)>


### Authorization

[admin_api_key](../README.md#admin_api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | API Key retrieved |  -  |
| **404** | API Key not found |  -  |


## revokeAnAPIKey

> RevokeApiKeyResponse revokeAnAPIKey(id)

API Key - Revoke

Revoke the specified API Key. Once revoked, the API Key can no longer be used for authenticating with our APIs.

### Example

```java
// Import classes:
import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.ApiException;
import com.hyperswitch.client.Configuration;
import com.hyperswitch.client.auth.*;
import com.hyperswitch.client.models.*;
import com.hyperswitch.api.ApiKeyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: admin_api_key
        ApiKeyAuth admin_api_key = (ApiKeyAuth) defaultClient.getAuthentication("admin_api_key");
        admin_api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //admin_api_key.setApiKeyPrefix("Token");

        ApiKeyApi apiInstance = new ApiKeyApi(defaultClient);
        String id = "id_example"; // String | The unique identifier for the API Key
        try {
            RevokeApiKeyResponse result = apiInstance.revokeAnAPIKey(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiKeyApi#revokeAnAPIKey");
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
| **id** | **String**| The unique identifier for the API Key | |

### Return type

[**RevokeApiKeyResponse**](RevokeApiKeyResponse.md)


### Authorization

[admin_api_key](../README.md#admin_api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | API Key revoked |  -  |
| **404** | API Key not found |  -  |

## revokeAnAPIKeyWithHttpInfo

> ApiResponse<RevokeApiKeyResponse> revokeAnAPIKey revokeAnAPIKeyWithHttpInfo(id)

API Key - Revoke

Revoke the specified API Key. Once revoked, the API Key can no longer be used for authenticating with our APIs.

### Example

```java
// Import classes:
import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.ApiException;
import com.hyperswitch.client.ApiResponse;
import com.hyperswitch.client.Configuration;
import com.hyperswitch.client.auth.*;
import com.hyperswitch.client.models.*;
import com.hyperswitch.api.ApiKeyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: admin_api_key
        ApiKeyAuth admin_api_key = (ApiKeyAuth) defaultClient.getAuthentication("admin_api_key");
        admin_api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //admin_api_key.setApiKeyPrefix("Token");

        ApiKeyApi apiInstance = new ApiKeyApi(defaultClient);
        String id = "id_example"; // String | The unique identifier for the API Key
        try {
            ApiResponse<RevokeApiKeyResponse> response = apiInstance.revokeAnAPIKeyWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiKeyApi#revokeAnAPIKey");
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
| **id** | **String**| The unique identifier for the API Key | |

### Return type

ApiResponse<[**RevokeApiKeyResponse**](RevokeApiKeyResponse.md)>


### Authorization

[admin_api_key](../README.md#admin_api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | API Key revoked |  -  |
| **404** | API Key not found |  -  |


## updateAnAPIKey

> RetrieveApiKeyResponse updateAnAPIKey(id, updateApiKeyRequest)

API Key - Update

Update information for the specified API Key.

### Example

```java
// Import classes:
import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.ApiException;
import com.hyperswitch.client.Configuration;
import com.hyperswitch.client.auth.*;
import com.hyperswitch.client.models.*;
import com.hyperswitch.api.ApiKeyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: admin_api_key
        ApiKeyAuth admin_api_key = (ApiKeyAuth) defaultClient.getAuthentication("admin_api_key");
        admin_api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //admin_api_key.setApiKeyPrefix("Token");

        ApiKeyApi apiInstance = new ApiKeyApi(defaultClient);
        String id = "id_example"; // String | The unique identifier for the API Key
        UpdateApiKeyRequest updateApiKeyRequest = new UpdateApiKeyRequest(); // UpdateApiKeyRequest | 
        try {
            RetrieveApiKeyResponse result = apiInstance.updateAnAPIKey(id, updateApiKeyRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiKeyApi#updateAnAPIKey");
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
| **id** | **String**| The unique identifier for the API Key | |
| **updateApiKeyRequest** | [**UpdateApiKeyRequest**](UpdateApiKeyRequest.md)|  | |

### Return type

[**RetrieveApiKeyResponse**](RetrieveApiKeyResponse.md)


### Authorization

[admin_api_key](../README.md#admin_api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | API Key updated |  -  |
| **404** | API Key not found |  -  |

## updateAnAPIKeyWithHttpInfo

> ApiResponse<RetrieveApiKeyResponse> updateAnAPIKey updateAnAPIKeyWithHttpInfo(id, updateApiKeyRequest)

API Key - Update

Update information for the specified API Key.

### Example

```java
// Import classes:
import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.ApiException;
import com.hyperswitch.client.ApiResponse;
import com.hyperswitch.client.Configuration;
import com.hyperswitch.client.auth.*;
import com.hyperswitch.client.models.*;
import com.hyperswitch.api.ApiKeyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: admin_api_key
        ApiKeyAuth admin_api_key = (ApiKeyAuth) defaultClient.getAuthentication("admin_api_key");
        admin_api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //admin_api_key.setApiKeyPrefix("Token");

        ApiKeyApi apiInstance = new ApiKeyApi(defaultClient);
        String id = "id_example"; // String | The unique identifier for the API Key
        UpdateApiKeyRequest updateApiKeyRequest = new UpdateApiKeyRequest(); // UpdateApiKeyRequest | 
        try {
            ApiResponse<RetrieveApiKeyResponse> response = apiInstance.updateAnAPIKeyWithHttpInfo(id, updateApiKeyRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiKeyApi#updateAnAPIKey");
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
| **id** | **String**| The unique identifier for the API Key | |
| **updateApiKeyRequest** | [**UpdateApiKeyRequest**](UpdateApiKeyRequest.md)|  | |

### Return type

ApiResponse<[**RetrieveApiKeyResponse**](RetrieveApiKeyResponse.md)>


### Authorization

[admin_api_key](../README.md#admin_api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | API Key updated |  -  |
| **404** | API Key not found |  -  |

