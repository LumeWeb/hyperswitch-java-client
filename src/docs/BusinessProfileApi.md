# BusinessProfileApi

All URIs are relative to *https://sandbox.hyperswitch.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listAllConnectorAccounts**](BusinessProfileApi.md#listAllConnectorAccounts) | **GET** /v2/profiles/{id}/connector_accounts | Profile - Connector Accounts List |
| [**listAllConnectorAccountsWithHttpInfo**](BusinessProfileApi.md#listAllConnectorAccountsWithHttpInfo) | **GET** /v2/profiles/{id}/connector_accounts | Profile - Connector Accounts List |



## listAllConnectorAccounts

> List<MerchantConnectorResponse> listAllConnectorAccounts(id, xMerchantId)

Profile - Connector Accounts List

List Connector Accounts for the profile

### Example

```java
// Import classes:
import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.ApiException;
import com.hyperswitch.client.Configuration;
import com.hyperswitch.client.auth.*;
import com.hyperswitch.client.models.*;
import com.hyperswitch.api.BusinessProfileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: admin_api_key
        ApiKeyAuth admin_api_key = (ApiKeyAuth) defaultClient.getAuthentication("admin_api_key");
        admin_api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //admin_api_key.setApiKeyPrefix("Token");

        BusinessProfileApi apiInstance = new BusinessProfileApi(defaultClient);
        String id = "id_example"; // String | The unique identifier for the business profile
        String xMerchantId = "{\"X-Merchant-Id\":\"abc_iG5VNjsN9xuCg7Xx0uWh\"}"; // String | Merchant ID of the profile.
        try {
            List<MerchantConnectorResponse> result = apiInstance.listAllConnectorAccounts(id, xMerchantId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BusinessProfileApi#listAllConnectorAccounts");
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
| **id** | **String**| The unique identifier for the business profile | |
| **xMerchantId** | **String**| Merchant ID of the profile. | |

### Return type

[**List&lt;MerchantConnectorResponse&gt;**](MerchantConnectorResponse.md)


### Authorization

[admin_api_key](../README.md#admin_api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Merchant Connector list retrieved successfully |  -  |
| **401** | Unauthorized request |  -  |
| **404** | Merchant Connector does not exist in records |  -  |

## listAllConnectorAccountsWithHttpInfo

> ApiResponse<List<MerchantConnectorResponse>> listAllConnectorAccounts listAllConnectorAccountsWithHttpInfo(id, xMerchantId)

Profile - Connector Accounts List

List Connector Accounts for the profile

### Example

```java
// Import classes:
import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.ApiException;
import com.hyperswitch.client.ApiResponse;
import com.hyperswitch.client.Configuration;
import com.hyperswitch.client.auth.*;
import com.hyperswitch.client.models.*;
import com.hyperswitch.api.BusinessProfileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: admin_api_key
        ApiKeyAuth admin_api_key = (ApiKeyAuth) defaultClient.getAuthentication("admin_api_key");
        admin_api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //admin_api_key.setApiKeyPrefix("Token");

        BusinessProfileApi apiInstance = new BusinessProfileApi(defaultClient);
        String id = "id_example"; // String | The unique identifier for the business profile
        String xMerchantId = "{\"X-Merchant-Id\":\"abc_iG5VNjsN9xuCg7Xx0uWh\"}"; // String | Merchant ID of the profile.
        try {
            ApiResponse<List<MerchantConnectorResponse>> response = apiInstance.listAllConnectorAccountsWithHttpInfo(id, xMerchantId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling BusinessProfileApi#listAllConnectorAccounts");
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
| **id** | **String**| The unique identifier for the business profile | |
| **xMerchantId** | **String**| Merchant ID of the profile. | |

### Return type

ApiResponse<[**List&lt;MerchantConnectorResponse&gt;**](MerchantConnectorResponse.md)>


### Authorization

[admin_api_key](../README.md#admin_api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Merchant Connector list retrieved successfully |  -  |
| **401** | Unauthorized request |  -  |
| **404** | Merchant Connector does not exist in records |  -  |

