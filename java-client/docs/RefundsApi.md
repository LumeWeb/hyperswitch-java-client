# RefundsApi

All URIs are relative to *https://sandbox.hyperswitch.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createARefund**](RefundsApi.md#createARefund) | **POST** /v2/refunds | Refunds - Create |
| [**createARefundWithHttpInfo**](RefundsApi.md#createARefundWithHttpInfo) | **POST** /v2/refunds | Refunds - Create |



## createARefund

> RefundResponse createARefund(refundsCreateRequest)

Refunds - Create

Creates a refund against an already processed payment. In case of some processors, you can even opt to refund only a partial amount multiple times until the original charge amount has been refunded

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.RefundsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        RefundsApi apiInstance = new RefundsApi(defaultClient);
        RefundsCreateRequest refundsCreateRequest = new RefundsCreateRequest(); // RefundsCreateRequest | 
        try {
            RefundResponse result = apiInstance.createARefund(refundsCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RefundsApi#createARefund");
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
| **refundsCreateRequest** | [**RefundsCreateRequest**](RefundsCreateRequest.md)|  | |

### Return type

[**RefundResponse**](RefundResponse.md)


### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Refund created |  -  |
| **400** | Missing Mandatory fields |  -  |

## createARefundWithHttpInfo

> ApiResponse<RefundResponse> createARefund createARefundWithHttpInfo(refundsCreateRequest)

Refunds - Create

Creates a refund against an already processed payment. In case of some processors, you can even opt to refund only a partial amount multiple times until the original charge amount has been refunded

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.ApiResponse;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.RefundsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        RefundsApi apiInstance = new RefundsApi(defaultClient);
        RefundsCreateRequest refundsCreateRequest = new RefundsCreateRequest(); // RefundsCreateRequest | 
        try {
            ApiResponse<RefundResponse> response = apiInstance.createARefundWithHttpInfo(refundsCreateRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RefundsApi#createARefund");
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
| **refundsCreateRequest** | [**RefundsCreateRequest**](RefundsCreateRequest.md)|  | |

### Return type

ApiResponse<[**RefundResponse**](RefundResponse.md)>


### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Refund created |  -  |
| **400** | Missing Mandatory fields |  -  |

