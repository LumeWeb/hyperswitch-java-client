# CustomersApi

All URIs are relative to *https://sandbox.hyperswitch.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createACustomer**](CustomersApi.md#createACustomer) | **POST** /v2/customers | Customers - Create |
| [**createACustomerWithHttpInfo**](CustomersApi.md#createACustomerWithHttpInfo) | **POST** /v2/customers | Customers - Create |
| [**deleteACustomer**](CustomersApi.md#deleteACustomer) | **DELETE** /v2/customers/{id} | Customers - Delete |
| [**deleteACustomerWithHttpInfo**](CustomersApi.md#deleteACustomerWithHttpInfo) | **DELETE** /v2/customers/{id} | Customers - Delete |
| [**listAllCustomersForAMerchant**](CustomersApi.md#listAllCustomersForAMerchant) | **GET** /v2/customers/list | Customers - List |
| [**listAllCustomersForAMerchantWithHttpInfo**](CustomersApi.md#listAllCustomersForAMerchantWithHttpInfo) | **GET** /v2/customers/list | Customers - List |
| [**retrieveACustomer**](CustomersApi.md#retrieveACustomer) | **GET** /v2/customers/{id} | Customers - Retrieve |
| [**retrieveACustomerWithHttpInfo**](CustomersApi.md#retrieveACustomerWithHttpInfo) | **GET** /v2/customers/{id} | Customers - Retrieve |
| [**updateACustomer**](CustomersApi.md#updateACustomer) | **POST** /v2/customers/{id} | Customers - Update |
| [**updateACustomerWithHttpInfo**](CustomersApi.md#updateACustomerWithHttpInfo) | **POST** /v2/customers/{id} | Customers - Update |



## createACustomer

> CustomerResponse createACustomer(customerRequest)

Customers - Create

Creates a customer object and stores the customer details to be reused for future payments. Incase the customer already exists in the system, this API will respond with the customer details.

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.CustomersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        CustomersApi apiInstance = new CustomersApi(defaultClient);
        CustomerRequest customerRequest = new CustomerRequest(); // CustomerRequest | 
        try {
            CustomerResponse result = apiInstance.createACustomer(customerRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomersApi#createACustomer");
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
| **customerRequest** | [**CustomerRequest**](CustomerRequest.md)|  | |

### Return type

[**CustomerResponse**](CustomerResponse.md)


### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Customer Created |  -  |
| **400** | Invalid data |  -  |

## createACustomerWithHttpInfo

> ApiResponse<CustomerResponse> createACustomer createACustomerWithHttpInfo(customerRequest)

Customers - Create

Creates a customer object and stores the customer details to be reused for future payments. Incase the customer already exists in the system, this API will respond with the customer details.

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.ApiResponse;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.CustomersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        CustomersApi apiInstance = new CustomersApi(defaultClient);
        CustomerRequest customerRequest = new CustomerRequest(); // CustomerRequest | 
        try {
            ApiResponse<CustomerResponse> response = apiInstance.createACustomerWithHttpInfo(customerRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomersApi#createACustomer");
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
| **customerRequest** | [**CustomerRequest**](CustomerRequest.md)|  | |

### Return type

ApiResponse<[**CustomerResponse**](CustomerResponse.md)>


### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Customer Created |  -  |
| **400** | Invalid data |  -  |


## deleteACustomer

> CustomerDeleteResponse deleteACustomer(id)

Customers - Delete

Delete a customer record.

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.CustomersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        CustomersApi apiInstance = new CustomersApi(defaultClient);
        String id = "id_example"; // String | The unique identifier for the Customer
        try {
            CustomerDeleteResponse result = apiInstance.deleteACustomer(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomersApi#deleteACustomer");
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
| **id** | **String**| The unique identifier for the Customer | |

### Return type

[**CustomerDeleteResponse**](CustomerDeleteResponse.md)


### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Customer was Deleted |  -  |
| **404** | Customer was not found |  -  |

## deleteACustomerWithHttpInfo

> ApiResponse<CustomerDeleteResponse> deleteACustomer deleteACustomerWithHttpInfo(id)

Customers - Delete

Delete a customer record.

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.ApiResponse;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.CustomersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        CustomersApi apiInstance = new CustomersApi(defaultClient);
        String id = "id_example"; // String | The unique identifier for the Customer
        try {
            ApiResponse<CustomerDeleteResponse> response = apiInstance.deleteACustomerWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomersApi#deleteACustomer");
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
| **id** | **String**| The unique identifier for the Customer | |

### Return type

ApiResponse<[**CustomerDeleteResponse**](CustomerDeleteResponse.md)>


### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Customer was Deleted |  -  |
| **404** | Customer was not found |  -  |


## listAllCustomersForAMerchant

> List<CustomerResponse> listAllCustomersForAMerchant()

Customers - List

Lists all the customers for a particular merchant id.

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.CustomersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        CustomersApi apiInstance = new CustomersApi(defaultClient);
        try {
            List<CustomerResponse> result = apiInstance.listAllCustomersForAMerchant();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomersApi#listAllCustomersForAMerchant");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;CustomerResponse&gt;**](CustomerResponse.md)


### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Customers retrieved |  -  |
| **400** | Invalid Data |  -  |

## listAllCustomersForAMerchantWithHttpInfo

> ApiResponse<List<CustomerResponse>> listAllCustomersForAMerchant listAllCustomersForAMerchantWithHttpInfo()

Customers - List

Lists all the customers for a particular merchant id.

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.ApiResponse;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.CustomersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        CustomersApi apiInstance = new CustomersApi(defaultClient);
        try {
            ApiResponse<List<CustomerResponse>> response = apiInstance.listAllCustomersForAMerchantWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomersApi#listAllCustomersForAMerchant");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**List&lt;CustomerResponse&gt;**](CustomerResponse.md)>


### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Customers retrieved |  -  |
| **400** | Invalid Data |  -  |


## retrieveACustomer

> CustomerResponse retrieveACustomer(id)

Customers - Retrieve

Retrieves a customer&#39;s details.

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.CustomersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        // Configure API key authorization: ephemeral_key
        ApiKeyAuth ephemeral_key = (ApiKeyAuth) defaultClient.getAuthentication("ephemeral_key");
        ephemeral_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ephemeral_key.setApiKeyPrefix("Token");

        CustomersApi apiInstance = new CustomersApi(defaultClient);
        String id = "id_example"; // String | The unique identifier for the Customer
        try {
            CustomerResponse result = apiInstance.retrieveACustomer(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomersApi#retrieveACustomer");
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
| **id** | **String**| The unique identifier for the Customer | |

### Return type

[**CustomerResponse**](CustomerResponse.md)


### Authorization

[api_key](../README.md#api_key), [ephemeral_key](../README.md#ephemeral_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Customer Retrieved |  -  |
| **404** | Customer was not found |  -  |

## retrieveACustomerWithHttpInfo

> ApiResponse<CustomerResponse> retrieveACustomer retrieveACustomerWithHttpInfo(id)

Customers - Retrieve

Retrieves a customer&#39;s details.

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.ApiResponse;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.CustomersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        // Configure API key authorization: ephemeral_key
        ApiKeyAuth ephemeral_key = (ApiKeyAuth) defaultClient.getAuthentication("ephemeral_key");
        ephemeral_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ephemeral_key.setApiKeyPrefix("Token");

        CustomersApi apiInstance = new CustomersApi(defaultClient);
        String id = "id_example"; // String | The unique identifier for the Customer
        try {
            ApiResponse<CustomerResponse> response = apiInstance.retrieveACustomerWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomersApi#retrieveACustomer");
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
| **id** | **String**| The unique identifier for the Customer | |

### Return type

ApiResponse<[**CustomerResponse**](CustomerResponse.md)>


### Authorization

[api_key](../README.md#api_key), [ephemeral_key](../README.md#ephemeral_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Customer Retrieved |  -  |
| **404** | Customer was not found |  -  |


## updateACustomer

> CustomerResponse updateACustomer(id, customerRequest)

Customers - Update

Updates the customer&#39;s details in a customer object.

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.CustomersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        CustomersApi apiInstance = new CustomersApi(defaultClient);
        String id = "id_example"; // String | The unique identifier for the Customer
        CustomerRequest customerRequest = new CustomerRequest(); // CustomerRequest | 
        try {
            CustomerResponse result = apiInstance.updateACustomer(id, customerRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomersApi#updateACustomer");
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
| **id** | **String**| The unique identifier for the Customer | |
| **customerRequest** | [**CustomerRequest**](CustomerRequest.md)|  | |

### Return type

[**CustomerResponse**](CustomerResponse.md)


### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Customer was Updated |  -  |
| **404** | Customer was not found |  -  |

## updateACustomerWithHttpInfo

> ApiResponse<CustomerResponse> updateACustomer updateACustomerWithHttpInfo(id, customerRequest)

Customers - Update

Updates the customer&#39;s details in a customer object.

### Example

```java
// Import classes:
import com.lumeweb.hyperswitch.client.ApiClient;
import com.lumeweb.hyperswitch.client.ApiException;
import com.lumeweb.hyperswitch.client.ApiResponse;
import com.lumeweb.hyperswitch.client.Configuration;
import com.lumeweb.hyperswitch.client.auth.*;
import com.lumeweb.hyperswitch.client.models.*;
import com.lumeweb.hyperswitch.api.CustomersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.hyperswitch.io");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        CustomersApi apiInstance = new CustomersApi(defaultClient);
        String id = "id_example"; // String | The unique identifier for the Customer
        CustomerRequest customerRequest = new CustomerRequest(); // CustomerRequest | 
        try {
            ApiResponse<CustomerResponse> response = apiInstance.updateACustomerWithHttpInfo(id, customerRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomersApi#updateACustomer");
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
| **id** | **String**| The unique identifier for the Customer | |
| **customerRequest** | [**CustomerRequest**](CustomerRequest.md)|  | |

### Return type

ApiResponse<[**CustomerResponse**](CustomerResponse.md)>


### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Customer was Updated |  -  |
| **404** | Customer was not found |  -  |

