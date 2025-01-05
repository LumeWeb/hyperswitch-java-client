# MerchantAccountApi

All URIs are relative to *https://sandbox.hyperswitch.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAMerchantAccount**](MerchantAccountApi.md#createAMerchantAccount) | **POST** /v2/merchant_accounts | Merchant Account - Create |
| [**createAMerchantAccountWithHttpInfo**](MerchantAccountApi.md#createAMerchantAccountWithHttpInfo) | **POST** /v2/merchant_accounts | Merchant Account - Create |
| [**listProfiles**](MerchantAccountApi.md#listProfiles) | **GET** /v2/merchant_accounts/{id}/profiles | Merchant Account - Profile List |
| [**listProfilesWithHttpInfo**](MerchantAccountApi.md#listProfilesWithHttpInfo) | **GET** /v2/merchant_accounts/{id}/profiles | Merchant Account - Profile List |
| [**retrieveAMerchantAccount**](MerchantAccountApi.md#retrieveAMerchantAccount) | **GET** /v2/merchant_accounts/{id} | Merchant Account - Retrieve |
| [**retrieveAMerchantAccountWithHttpInfo**](MerchantAccountApi.md#retrieveAMerchantAccountWithHttpInfo) | **GET** /v2/merchant_accounts/{id} | Merchant Account - Retrieve |
| [**updateAMerchantAccount**](MerchantAccountApi.md#updateAMerchantAccount) | **PUT** /v2/merchant_accounts/{id} | Merchant Account - Update |
| [**updateAMerchantAccountWithHttpInfo**](MerchantAccountApi.md#updateAMerchantAccountWithHttpInfo) | **PUT** /v2/merchant_accounts/{id} | Merchant Account - Update |



## createAMerchantAccount

> MerchantAccountResponse createAMerchantAccount(xOrganizationId, merchantAccountCreate)

Merchant Account - Create

Create a new account for a *merchant* and the *merchant* could be a seller or retailer or client who likes to receive and send payments.  Before creating the merchant account, it is mandatory to create an organization.

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.MerchantAccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: admin_api_key
        ApiKeyAuth admin_api_key = (ApiKeyAuth) defaultClient.getAuthentication("admin_api_key");
        admin_api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //admin_api_key.setApiKeyPrefix("Token");

        MerchantAccountApi apiInstance = new MerchantAccountApi(defaultClient);
        String xOrganizationId = "{\"X-Organization-Id\":\"org_abcdefghijklmnop\"}"; // String | Organization ID for which the merchant account has to be created.
        MerchantAccountCreate merchantAccountCreate = new MerchantAccountCreate(); // MerchantAccountCreate | 
        try {
            MerchantAccountResponse result = apiInstance.createAMerchantAccount(xOrganizationId, merchantAccountCreate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MerchantAccountApi#createAMerchantAccount");
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
| **xOrganizationId** | **String**| Organization ID for which the merchant account has to be created. | |
| **merchantAccountCreate** | [**MerchantAccountCreate**](MerchantAccountCreate.md)|  | |

### Return type

[**MerchantAccountResponse**](MerchantAccountResponse.md)


### Authorization

[admin_api_key](../README.md#admin_api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Merchant Account Created |  -  |
| **400** | Invalid data |  -  |

## createAMerchantAccountWithHttpInfo

> ApiResponse<MerchantAccountResponse> createAMerchantAccount createAMerchantAccountWithHttpInfo(xOrganizationId, merchantAccountCreate)

Merchant Account - Create

Create a new account for a *merchant* and the *merchant* could be a seller or retailer or client who likes to receive and send payments.  Before creating the merchant account, it is mandatory to create an organization.

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.ApiResponse;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.MerchantAccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: admin_api_key
        ApiKeyAuth admin_api_key = (ApiKeyAuth) defaultClient.getAuthentication("admin_api_key");
        admin_api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //admin_api_key.setApiKeyPrefix("Token");

        MerchantAccountApi apiInstance = new MerchantAccountApi(defaultClient);
        String xOrganizationId = "{\"X-Organization-Id\":\"org_abcdefghijklmnop\"}"; // String | Organization ID for which the merchant account has to be created.
        MerchantAccountCreate merchantAccountCreate = new MerchantAccountCreate(); // MerchantAccountCreate | 
        try {
            ApiResponse<MerchantAccountResponse> response = apiInstance.createAMerchantAccountWithHttpInfo(xOrganizationId, merchantAccountCreate);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling MerchantAccountApi#createAMerchantAccount");
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
| **xOrganizationId** | **String**| Organization ID for which the merchant account has to be created. | |
| **merchantAccountCreate** | [**MerchantAccountCreate**](MerchantAccountCreate.md)|  | |

### Return type

ApiResponse<[**MerchantAccountResponse**](MerchantAccountResponse.md)>


### Authorization

[admin_api_key](../README.md#admin_api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Merchant Account Created |  -  |
| **400** | Invalid data |  -  |


## listProfiles

> List<ProfileResponse> listProfiles(id)

Merchant Account - Profile List

List profiles for an Merchant

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.MerchantAccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: admin_api_key
        ApiKeyAuth admin_api_key = (ApiKeyAuth) defaultClient.getAuthentication("admin_api_key");
        admin_api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //admin_api_key.setApiKeyPrefix("Token");

        MerchantAccountApi apiInstance = new MerchantAccountApi(defaultClient);
        String id = "id_example"; // String | The unique identifier for the Merchant
        try {
            List<ProfileResponse> result = apiInstance.listProfiles(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MerchantAccountApi#listProfiles");
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
| **id** | **String**| The unique identifier for the Merchant | |

### Return type

[**List&lt;ProfileResponse&gt;**](ProfileResponse.md)


### Authorization

[admin_api_key](../README.md#admin_api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | profile list retrieved successfully |  -  |
| **400** | Invalid data |  -  |

## listProfilesWithHttpInfo

> ApiResponse<List<ProfileResponse>> listProfiles listProfilesWithHttpInfo(id)

Merchant Account - Profile List

List profiles for an Merchant

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.ApiResponse;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.MerchantAccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: admin_api_key
        ApiKeyAuth admin_api_key = (ApiKeyAuth) defaultClient.getAuthentication("admin_api_key");
        admin_api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //admin_api_key.setApiKeyPrefix("Token");

        MerchantAccountApi apiInstance = new MerchantAccountApi(defaultClient);
        String id = "id_example"; // String | The unique identifier for the Merchant
        try {
            ApiResponse<List<ProfileResponse>> response = apiInstance.listProfilesWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling MerchantAccountApi#listProfiles");
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
| **id** | **String**| The unique identifier for the Merchant | |

### Return type

ApiResponse<[**List&lt;ProfileResponse&gt;**](ProfileResponse.md)>


### Authorization

[admin_api_key](../README.md#admin_api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | profile list retrieved successfully |  -  |
| **400** | Invalid data |  -  |


## retrieveAMerchantAccount

> MerchantAccountResponse retrieveAMerchantAccount(id)

Merchant Account - Retrieve

Retrieve a *merchant* account details.

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.MerchantAccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: admin_api_key
        ApiKeyAuth admin_api_key = (ApiKeyAuth) defaultClient.getAuthentication("admin_api_key");
        admin_api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //admin_api_key.setApiKeyPrefix("Token");

        MerchantAccountApi apiInstance = new MerchantAccountApi(defaultClient);
        String id = "id_example"; // String | The unique identifier for the merchant account
        try {
            MerchantAccountResponse result = apiInstance.retrieveAMerchantAccount(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MerchantAccountApi#retrieveAMerchantAccount");
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
| **id** | **String**| The unique identifier for the merchant account | |

### Return type

[**MerchantAccountResponse**](MerchantAccountResponse.md)


### Authorization

[admin_api_key](../README.md#admin_api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Merchant Account Retrieved |  -  |
| **404** | Merchant account not found |  -  |

## retrieveAMerchantAccountWithHttpInfo

> ApiResponse<MerchantAccountResponse> retrieveAMerchantAccount retrieveAMerchantAccountWithHttpInfo(id)

Merchant Account - Retrieve

Retrieve a *merchant* account details.

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.ApiResponse;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.MerchantAccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: admin_api_key
        ApiKeyAuth admin_api_key = (ApiKeyAuth) defaultClient.getAuthentication("admin_api_key");
        admin_api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //admin_api_key.setApiKeyPrefix("Token");

        MerchantAccountApi apiInstance = new MerchantAccountApi(defaultClient);
        String id = "id_example"; // String | The unique identifier for the merchant account
        try {
            ApiResponse<MerchantAccountResponse> response = apiInstance.retrieveAMerchantAccountWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling MerchantAccountApi#retrieveAMerchantAccount");
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
| **id** | **String**| The unique identifier for the merchant account | |

### Return type

ApiResponse<[**MerchantAccountResponse**](MerchantAccountResponse.md)>


### Authorization

[admin_api_key](../README.md#admin_api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Merchant Account Retrieved |  -  |
| **404** | Merchant account not found |  -  |


## updateAMerchantAccount

> MerchantAccountResponse updateAMerchantAccount(id, merchantAccountUpdate)

Merchant Account - Update

Updates details of an existing merchant account. Helpful in updating merchant details such as email, contact details, or other configuration details like webhook, routing algorithm etc

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.MerchantAccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: admin_api_key
        ApiKeyAuth admin_api_key = (ApiKeyAuth) defaultClient.getAuthentication("admin_api_key");
        admin_api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //admin_api_key.setApiKeyPrefix("Token");

        MerchantAccountApi apiInstance = new MerchantAccountApi(defaultClient);
        String id = "id_example"; // String | The unique identifier for the merchant account
        MerchantAccountUpdate merchantAccountUpdate = new MerchantAccountUpdate(); // MerchantAccountUpdate | 
        try {
            MerchantAccountResponse result = apiInstance.updateAMerchantAccount(id, merchantAccountUpdate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MerchantAccountApi#updateAMerchantAccount");
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
| **id** | **String**| The unique identifier for the merchant account | |
| **merchantAccountUpdate** | [**MerchantAccountUpdate**](MerchantAccountUpdate.md)|  | |

### Return type

[**MerchantAccountResponse**](MerchantAccountResponse.md)


### Authorization

[admin_api_key](../README.md#admin_api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Merchant Account Updated |  -  |
| **404** | Merchant account not found |  -  |

## updateAMerchantAccountWithHttpInfo

> ApiResponse<MerchantAccountResponse> updateAMerchantAccount updateAMerchantAccountWithHttpInfo(id, merchantAccountUpdate)

Merchant Account - Update

Updates details of an existing merchant account. Helpful in updating merchant details such as email, contact details, or other configuration details like webhook, routing algorithm etc

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.ApiResponse;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.MerchantAccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: admin_api_key
        ApiKeyAuth admin_api_key = (ApiKeyAuth) defaultClient.getAuthentication("admin_api_key");
        admin_api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //admin_api_key.setApiKeyPrefix("Token");

        MerchantAccountApi apiInstance = new MerchantAccountApi(defaultClient);
        String id = "id_example"; // String | The unique identifier for the merchant account
        MerchantAccountUpdate merchantAccountUpdate = new MerchantAccountUpdate(); // MerchantAccountUpdate | 
        try {
            ApiResponse<MerchantAccountResponse> response = apiInstance.updateAMerchantAccountWithHttpInfo(id, merchantAccountUpdate);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling MerchantAccountApi#updateAMerchantAccount");
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
| **id** | **String**| The unique identifier for the merchant account | |
| **merchantAccountUpdate** | [**MerchantAccountUpdate**](MerchantAccountUpdate.md)|  | |

### Return type

ApiResponse<[**MerchantAccountResponse**](MerchantAccountResponse.md)>


### Authorization

[admin_api_key](../README.md#admin_api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Merchant Account Updated |  -  |
| **404** | Merchant account not found |  -  |

