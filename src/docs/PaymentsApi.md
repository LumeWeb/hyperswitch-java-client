# PaymentsApi

All URIs are relative to *https://sandbox.hyperswitch.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**confirmPaymentIntent**](PaymentsApi.md#confirmPaymentIntent) | **POST** /v2/payments/{id}/confirm-intent | Payments - Confirm Intent |
| [**confirmPaymentIntentWithHttpInfo**](PaymentsApi.md#confirmPaymentIntentWithHttpInfo) | **POST** /v2/payments/{id}/confirm-intent | Payments - Confirm Intent |
| [**createAPaymentIntent**](PaymentsApi.md#createAPaymentIntent) | **POST** /v2/payments/create-intent | Payments - Create Intent |
| [**createAPaymentIntentWithHttpInfo**](PaymentsApi.md#createAPaymentIntentWithHttpInfo) | **POST** /v2/payments/create-intent | Payments - Create Intent |
| [**createSessionTokensForAPayment**](PaymentsApi.md#createSessionTokensForAPayment) | **POST** /v2/payments/{payment_id}/create-external-sdk-tokens | Payments - Session token |
| [**createSessionTokensForAPaymentWithHttpInfo**](PaymentsApi.md#createSessionTokensForAPaymentWithHttpInfo) | **POST** /v2/payments/{payment_id}/create-external-sdk-tokens | Payments - Session token |
| [**getThePaymentIntentDetails**](PaymentsApi.md#getThePaymentIntentDetails) | **GET** /v2/payments/{id}/get-intent | Payments - Get Intent |
| [**getThePaymentIntentDetailsWithHttpInfo**](PaymentsApi.md#getThePaymentIntentDetailsWithHttpInfo) | **GET** /v2/payments/{id}/get-intent | Payments - Get Intent |



## confirmPaymentIntent

> PaymentsConfirmIntentResponse confirmPaymentIntent(id, paymentsConfirmIntentRequest)

Payments - Confirm Intent

**Confirms a payment intent object with the payment method data**  .

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.PaymentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");

        PaymentsApi apiInstance = new PaymentsApi(defaultClient);
        String id = "id_example"; // String | The payment identifier
        PaymentsConfirmIntentRequest paymentsConfirmIntentRequest = new PaymentsConfirmIntentRequest(); // PaymentsConfirmIntentRequest | 
        try {
            PaymentsConfirmIntentResponse result = apiInstance.confirmPaymentIntent(id, paymentsConfirmIntentRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentsApi#confirmPaymentIntent");
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
| **id** | **String**| The payment identifier | |
| **paymentsConfirmIntentRequest** | [**PaymentsConfirmIntentRequest**](PaymentsConfirmIntentRequest.md)|  | |

### Return type

[**PaymentsConfirmIntentResponse**](PaymentsConfirmIntentResponse.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Payment created |  -  |
| **400** | Missing Mandatory fields |  -  |

## confirmPaymentIntentWithHttpInfo

> ApiResponse<PaymentsConfirmIntentResponse> confirmPaymentIntent confirmPaymentIntentWithHttpInfo(id, paymentsConfirmIntentRequest)

Payments - Confirm Intent

**Confirms a payment intent object with the payment method data**  .

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.ApiResponse;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.PaymentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");

        PaymentsApi apiInstance = new PaymentsApi(defaultClient);
        String id = "id_example"; // String | The payment identifier
        PaymentsConfirmIntentRequest paymentsConfirmIntentRequest = new PaymentsConfirmIntentRequest(); // PaymentsConfirmIntentRequest | 
        try {
            ApiResponse<PaymentsConfirmIntentResponse> response = apiInstance.confirmPaymentIntentWithHttpInfo(id, paymentsConfirmIntentRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentsApi#confirmPaymentIntent");
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
| **id** | **String**| The payment identifier | |
| **paymentsConfirmIntentRequest** | [**PaymentsConfirmIntentRequest**](PaymentsConfirmIntentRequest.md)|  | |

### Return type

ApiResponse<[**PaymentsConfirmIntentResponse**](PaymentsConfirmIntentResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Payment created |  -  |
| **400** | Missing Mandatory fields |  -  |


## createAPaymentIntent

> PaymentsIntentResponse createAPaymentIntent(paymentsCreateIntentRequest)

Payments - Create Intent

**Creates a payment intent object when amount_details are passed.**  You will require the &#39;API - Key&#39; from the Hyperswitch dashboard to make the first call, and use the &#39;client secret&#39; returned in this API along with your &#39;publishable key&#39; to make subsequent API calls from your client.

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.PaymentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        PaymentsApi apiInstance = new PaymentsApi(defaultClient);
        PaymentsCreateIntentRequest paymentsCreateIntentRequest = new PaymentsCreateIntentRequest(); // PaymentsCreateIntentRequest | 
        try {
            PaymentsIntentResponse result = apiInstance.createAPaymentIntent(paymentsCreateIntentRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentsApi#createAPaymentIntent");
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
| **paymentsCreateIntentRequest** | [**PaymentsCreateIntentRequest**](PaymentsCreateIntentRequest.md)|  | |

### Return type

[**PaymentsIntentResponse**](PaymentsIntentResponse.md)


### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Payment created |  -  |
| **400** | Missing Mandatory fields |  -  |

## createAPaymentIntentWithHttpInfo

> ApiResponse<PaymentsIntentResponse> createAPaymentIntent createAPaymentIntentWithHttpInfo(paymentsCreateIntentRequest)

Payments - Create Intent

**Creates a payment intent object when amount_details are passed.**  You will require the &#39;API - Key&#39; from the Hyperswitch dashboard to make the first call, and use the &#39;client secret&#39; returned in this API along with your &#39;publishable key&#39; to make subsequent API calls from your client.

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.ApiResponse;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.PaymentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        PaymentsApi apiInstance = new PaymentsApi(defaultClient);
        PaymentsCreateIntentRequest paymentsCreateIntentRequest = new PaymentsCreateIntentRequest(); // PaymentsCreateIntentRequest | 
        try {
            ApiResponse<PaymentsIntentResponse> response = apiInstance.createAPaymentIntentWithHttpInfo(paymentsCreateIntentRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentsApi#createAPaymentIntent");
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
| **paymentsCreateIntentRequest** | [**PaymentsCreateIntentRequest**](PaymentsCreateIntentRequest.md)|  | |

### Return type

ApiResponse<[**PaymentsIntentResponse**](PaymentsIntentResponse.md)>


### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Payment created |  -  |
| **400** | Missing Mandatory fields |  -  |


## createSessionTokensForAPayment

> PaymentsSessionResponse createSessionTokensForAPayment(paymentId, body)

Payments - Session token

Creates a session object or a session token for wallets like Apple Pay, Google Pay, etc. These tokens are used by Hyperswitch&#39;s SDK to initiate these wallets&#39; SDK.

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.PaymentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: publishable_key
        ApiKeyAuth publishable_key = (ApiKeyAuth) defaultClient.getAuthentication("publishable_key");
        publishable_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //publishable_key.setApiKeyPrefix("Token");

        PaymentsApi apiInstance = new PaymentsApi(defaultClient);
        String paymentId = "paymentId_example"; // String | The identifier for payment
        Object body = null; // Object | 
        try {
            PaymentsSessionResponse result = apiInstance.createSessionTokensForAPayment(paymentId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentsApi#createSessionTokensForAPayment");
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
| **paymentId** | **String**| The identifier for payment | |
| **body** | **Object**|  | |

### Return type

[**PaymentsSessionResponse**](PaymentsSessionResponse.md)


### Authorization

[publishable_key](../README.md#publishable_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Payment session object created or session token was retrieved from wallets |  -  |
| **400** | Missing mandatory fields |  -  |

## createSessionTokensForAPaymentWithHttpInfo

> ApiResponse<PaymentsSessionResponse> createSessionTokensForAPayment createSessionTokensForAPaymentWithHttpInfo(paymentId, body)

Payments - Session token

Creates a session object or a session token for wallets like Apple Pay, Google Pay, etc. These tokens are used by Hyperswitch&#39;s SDK to initiate these wallets&#39; SDK.

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.ApiResponse;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.PaymentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: publishable_key
        ApiKeyAuth publishable_key = (ApiKeyAuth) defaultClient.getAuthentication("publishable_key");
        publishable_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //publishable_key.setApiKeyPrefix("Token");

        PaymentsApi apiInstance = new PaymentsApi(defaultClient);
        String paymentId = "paymentId_example"; // String | The identifier for payment
        Object body = null; // Object | 
        try {
            ApiResponse<PaymentsSessionResponse> response = apiInstance.createSessionTokensForAPaymentWithHttpInfo(paymentId, body);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentsApi#createSessionTokensForAPayment");
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
| **paymentId** | **String**| The identifier for payment | |
| **body** | **Object**|  | |

### Return type

ApiResponse<[**PaymentsSessionResponse**](PaymentsSessionResponse.md)>


### Authorization

[publishable_key](../README.md#publishable_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Payment session object created or session token was retrieved from wallets |  -  |
| **400** | Missing mandatory fields |  -  |


## getThePaymentIntentDetails

> PaymentsIntentResponse getThePaymentIntentDetails(id)

Payments - Get Intent

**Get a payment intent object when id is passed in path**  You will require the &#39;API - Key&#39; from the Hyperswitch dashboard to make the call.

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.PaymentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        PaymentsApi apiInstance = new PaymentsApi(defaultClient);
        String id = "id_example"; // String | The unique identifier for the Payment Intent
        try {
            PaymentsIntentResponse result = apiInstance.getThePaymentIntentDetails(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentsApi#getThePaymentIntentDetails");
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
| **id** | **String**| The unique identifier for the Payment Intent | |

### Return type

[**PaymentsIntentResponse**](PaymentsIntentResponse.md)


### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Payment Intent |  -  |
| **404** | Payment Intent not found |  -  |

## getThePaymentIntentDetailsWithHttpInfo

> ApiResponse<PaymentsIntentResponse> getThePaymentIntentDetails getThePaymentIntentDetailsWithHttpInfo(id)

Payments - Get Intent

**Get a payment intent object when id is passed in path**  You will require the &#39;API - Key&#39; from the Hyperswitch dashboard to make the call.

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.ApiResponse;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.PaymentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        PaymentsApi apiInstance = new PaymentsApi(defaultClient);
        String id = "id_example"; // String | The unique identifier for the Payment Intent
        try {
            ApiResponse<PaymentsIntentResponse> response = apiInstance.getThePaymentIntentDetailsWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentsApi#getThePaymentIntentDetails");
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
| **id** | **String**| The unique identifier for the Payment Intent | |

### Return type

ApiResponse<[**PaymentsIntentResponse**](PaymentsIntentResponse.md)>


### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Payment Intent |  -  |
| **404** | Payment Intent not found |  -  |

