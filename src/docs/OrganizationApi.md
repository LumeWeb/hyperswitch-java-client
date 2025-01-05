# OrganizationApi

All URIs are relative to *https://sandbox.hyperswitch.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAnOrganization**](OrganizationApi.md#createAnOrganization) | **POST** /v2/organization | Organization - Create |
| [**createAnOrganizationWithHttpInfo**](OrganizationApi.md#createAnOrganizationWithHttpInfo) | **POST** /v2/organization | Organization - Create |
| [**listMerchantAccounts**](OrganizationApi.md#listMerchantAccounts) | **GET** /v2/organization/{id}/merchant_accounts | Organization - Merchant Account - List |
| [**listMerchantAccountsWithHttpInfo**](OrganizationApi.md#listMerchantAccountsWithHttpInfo) | **GET** /v2/organization/{id}/merchant_accounts | Organization - Merchant Account - List |
| [**retrieveAnOrganization**](OrganizationApi.md#retrieveAnOrganization) | **GET** /v2/organization/{id} | Organization - Retrieve |
| [**retrieveAnOrganizationWithHttpInfo**](OrganizationApi.md#retrieveAnOrganizationWithHttpInfo) | **GET** /v2/organization/{id} | Organization - Retrieve |
| [**updateAnOrganization**](OrganizationApi.md#updateAnOrganization) | **PUT** /v2/organization/{id} | Organization - Update |
| [**updateAnOrganizationWithHttpInfo**](OrganizationApi.md#updateAnOrganizationWithHttpInfo) | **PUT** /v2/organization/{id} | Organization - Update |



## createAnOrganization

> OrganizationResponse createAnOrganization(organizationCreateRequest)

Organization - Create

Create a new organization

### Example

```java
// Import classes:
import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.ApiException;
import com.hyperswitch.client.Configuration;
import com.hyperswitch.client.auth.*;
import com.hyperswitch.client.models.*;
import com.hyperswitch.api.OrganizationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: admin_api_key
        ApiKeyAuth admin_api_key = (ApiKeyAuth) defaultClient.getAuthentication("admin_api_key");
        admin_api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //admin_api_key.setApiKeyPrefix("Token");

        OrganizationApi apiInstance = new OrganizationApi(defaultClient);
        OrganizationCreateRequest organizationCreateRequest = new OrganizationCreateRequest(); // OrganizationCreateRequest | 
        try {
            OrganizationResponse result = apiInstance.createAnOrganization(organizationCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationApi#createAnOrganization");
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
| **organizationCreateRequest** | [**OrganizationCreateRequest**](OrganizationCreateRequest.md)|  | |

### Return type

[**OrganizationResponse**](OrganizationResponse.md)


### Authorization

[admin_api_key](../README.md#admin_api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Organization Created |  -  |
| **400** | Invalid data |  -  |

## createAnOrganizationWithHttpInfo

> ApiResponse<OrganizationResponse> createAnOrganization createAnOrganizationWithHttpInfo(organizationCreateRequest)

Organization - Create

Create a new organization

### Example

```java
// Import classes:
import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.ApiException;
import com.hyperswitch.client.ApiResponse;
import com.hyperswitch.client.Configuration;
import com.hyperswitch.client.auth.*;
import com.hyperswitch.client.models.*;
import com.hyperswitch.api.OrganizationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: admin_api_key
        ApiKeyAuth admin_api_key = (ApiKeyAuth) defaultClient.getAuthentication("admin_api_key");
        admin_api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //admin_api_key.setApiKeyPrefix("Token");

        OrganizationApi apiInstance = new OrganizationApi(defaultClient);
        OrganizationCreateRequest organizationCreateRequest = new OrganizationCreateRequest(); // OrganizationCreateRequest | 
        try {
            ApiResponse<OrganizationResponse> response = apiInstance.createAnOrganizationWithHttpInfo(organizationCreateRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationApi#createAnOrganization");
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
| **organizationCreateRequest** | [**OrganizationCreateRequest**](OrganizationCreateRequest.md)|  | |

### Return type

ApiResponse<[**OrganizationResponse**](OrganizationResponse.md)>


### Authorization

[admin_api_key](../README.md#admin_api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Organization Created |  -  |
| **400** | Invalid data |  -  |


## listMerchantAccounts

> List<MerchantAccountResponse> listMerchantAccounts(id)

Organization - Merchant Account - List

List merchant accounts for an Organization

### Example

```java
// Import classes:
import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.ApiException;
import com.hyperswitch.client.Configuration;
import com.hyperswitch.client.auth.*;
import com.hyperswitch.client.models.*;
import com.hyperswitch.api.OrganizationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: admin_api_key
        ApiKeyAuth admin_api_key = (ApiKeyAuth) defaultClient.getAuthentication("admin_api_key");
        admin_api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //admin_api_key.setApiKeyPrefix("Token");

        OrganizationApi apiInstance = new OrganizationApi(defaultClient);
        String id = "id_example"; // String | The unique identifier for the Organization
        try {
            List<MerchantAccountResponse> result = apiInstance.listMerchantAccounts(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationApi#listMerchantAccounts");
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
| **id** | **String**| The unique identifier for the Organization | |

### Return type

[**List&lt;MerchantAccountResponse&gt;**](MerchantAccountResponse.md)


### Authorization

[admin_api_key](../README.md#admin_api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Merchant Account list retrieved successfully |  -  |
| **400** | Invalid data |  -  |

## listMerchantAccountsWithHttpInfo

> ApiResponse<List<MerchantAccountResponse>> listMerchantAccounts listMerchantAccountsWithHttpInfo(id)

Organization - Merchant Account - List

List merchant accounts for an Organization

### Example

```java
// Import classes:
import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.ApiException;
import com.hyperswitch.client.ApiResponse;
import com.hyperswitch.client.Configuration;
import com.hyperswitch.client.auth.*;
import com.hyperswitch.client.models.*;
import com.hyperswitch.api.OrganizationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: admin_api_key
        ApiKeyAuth admin_api_key = (ApiKeyAuth) defaultClient.getAuthentication("admin_api_key");
        admin_api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //admin_api_key.setApiKeyPrefix("Token");

        OrganizationApi apiInstance = new OrganizationApi(defaultClient);
        String id = "id_example"; // String | The unique identifier for the Organization
        try {
            ApiResponse<List<MerchantAccountResponse>> response = apiInstance.listMerchantAccountsWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationApi#listMerchantAccounts");
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
| **id** | **String**| The unique identifier for the Organization | |

### Return type

ApiResponse<[**List&lt;MerchantAccountResponse&gt;**](MerchantAccountResponse.md)>


### Authorization

[admin_api_key](../README.md#admin_api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Merchant Account list retrieved successfully |  -  |
| **400** | Invalid data |  -  |


## retrieveAnOrganization

> OrganizationResponse retrieveAnOrganization(id)

Organization - Retrieve

Retrieve an existing organization

### Example

```java
// Import classes:
import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.ApiException;
import com.hyperswitch.client.Configuration;
import com.hyperswitch.client.auth.*;
import com.hyperswitch.client.models.*;
import com.hyperswitch.api.OrganizationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: admin_api_key
        ApiKeyAuth admin_api_key = (ApiKeyAuth) defaultClient.getAuthentication("admin_api_key");
        admin_api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //admin_api_key.setApiKeyPrefix("Token");

        OrganizationApi apiInstance = new OrganizationApi(defaultClient);
        String id = "id_example"; // String | The unique identifier for the Organization
        try {
            OrganizationResponse result = apiInstance.retrieveAnOrganization(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationApi#retrieveAnOrganization");
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
| **id** | **String**| The unique identifier for the Organization | |

### Return type

[**OrganizationResponse**](OrganizationResponse.md)


### Authorization

[admin_api_key](../README.md#admin_api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Organization Created |  -  |
| **400** | Invalid data |  -  |

## retrieveAnOrganizationWithHttpInfo

> ApiResponse<OrganizationResponse> retrieveAnOrganization retrieveAnOrganizationWithHttpInfo(id)

Organization - Retrieve

Retrieve an existing organization

### Example

```java
// Import classes:
import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.ApiException;
import com.hyperswitch.client.ApiResponse;
import com.hyperswitch.client.Configuration;
import com.hyperswitch.client.auth.*;
import com.hyperswitch.client.models.*;
import com.hyperswitch.api.OrganizationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: admin_api_key
        ApiKeyAuth admin_api_key = (ApiKeyAuth) defaultClient.getAuthentication("admin_api_key");
        admin_api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //admin_api_key.setApiKeyPrefix("Token");

        OrganizationApi apiInstance = new OrganizationApi(defaultClient);
        String id = "id_example"; // String | The unique identifier for the Organization
        try {
            ApiResponse<OrganizationResponse> response = apiInstance.retrieveAnOrganizationWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationApi#retrieveAnOrganization");
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
| **id** | **String**| The unique identifier for the Organization | |

### Return type

ApiResponse<[**OrganizationResponse**](OrganizationResponse.md)>


### Authorization

[admin_api_key](../README.md#admin_api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Organization Created |  -  |
| **400** | Invalid data |  -  |


## updateAnOrganization

> OrganizationResponse updateAnOrganization(id, organizationUpdateRequest)

Organization - Update

Create a new organization for .

### Example

```java
// Import classes:
import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.ApiException;
import com.hyperswitch.client.Configuration;
import com.hyperswitch.client.auth.*;
import com.hyperswitch.client.models.*;
import com.hyperswitch.api.OrganizationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: admin_api_key
        ApiKeyAuth admin_api_key = (ApiKeyAuth) defaultClient.getAuthentication("admin_api_key");
        admin_api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //admin_api_key.setApiKeyPrefix("Token");

        OrganizationApi apiInstance = new OrganizationApi(defaultClient);
        String id = "id_example"; // String | The unique identifier for the Organization
        OrganizationUpdateRequest organizationUpdateRequest = new OrganizationUpdateRequest(); // OrganizationUpdateRequest | 
        try {
            OrganizationResponse result = apiInstance.updateAnOrganization(id, organizationUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationApi#updateAnOrganization");
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
| **id** | **String**| The unique identifier for the Organization | |
| **organizationUpdateRequest** | [**OrganizationUpdateRequest**](OrganizationUpdateRequest.md)|  | |

### Return type

[**OrganizationResponse**](OrganizationResponse.md)


### Authorization

[admin_api_key](../README.md#admin_api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Organization Created |  -  |
| **400** | Invalid data |  -  |

## updateAnOrganizationWithHttpInfo

> ApiResponse<OrganizationResponse> updateAnOrganization updateAnOrganizationWithHttpInfo(id, organizationUpdateRequest)

Organization - Update

Create a new organization for .

### Example

```java
// Import classes:
import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.ApiException;
import com.hyperswitch.client.ApiResponse;
import com.hyperswitch.client.Configuration;
import com.hyperswitch.client.auth.*;
import com.hyperswitch.client.models.*;
import com.hyperswitch.api.OrganizationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: admin_api_key
        ApiKeyAuth admin_api_key = (ApiKeyAuth) defaultClient.getAuthentication("admin_api_key");
        admin_api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //admin_api_key.setApiKeyPrefix("Token");

        OrganizationApi apiInstance = new OrganizationApi(defaultClient);
        String id = "id_example"; // String | The unique identifier for the Organization
        OrganizationUpdateRequest organizationUpdateRequest = new OrganizationUpdateRequest(); // OrganizationUpdateRequest | 
        try {
            ApiResponse<OrganizationResponse> response = apiInstance.updateAnOrganizationWithHttpInfo(id, organizationUpdateRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationApi#updateAnOrganization");
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
| **id** | **String**| The unique identifier for the Organization | |
| **organizationUpdateRequest** | [**OrganizationUpdateRequest**](OrganizationUpdateRequest.md)|  | |

### Return type

ApiResponse<[**OrganizationResponse**](OrganizationResponse.md)>


### Authorization

[admin_api_key](../README.md#admin_api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Organization Created |  -  |
| **400** | Invalid data |  -  |

