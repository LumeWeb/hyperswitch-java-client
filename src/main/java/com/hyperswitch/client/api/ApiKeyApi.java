package com.hyperswitch.client.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.EncodingUtils;
import com.hyperswitch.client.model.ApiResponse;

import com.hyperswitch.client.model.CreateApiKeyRequest;
import com.hyperswitch.client.model.CreateApiKeyResponse;
import com.hyperswitch.client.model.RetrieveApiKeyResponse;
import com.hyperswitch.client.model.RevokeApiKeyResponse;
import com.hyperswitch.client.model.UpdateApiKeyRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public interface ApiKeyApi extends ApiClient.Api {


  /**
   * API Key - Create
   * Create a new API Key for accessing our APIs from your servers. The plaintext API Key will be displayed only once on creation, so ensure you store it securely.
   * @param merchantId The unique identifier for the merchant account (required)
   * @param createApiKeyRequest  (required)
   * @return CreateApiKeyResponse
   */
  @RequestLine("POST /api_keys/{merchantId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateApiKeyResponse createAnAPIKey(@Param("merchantId") String merchantId, CreateApiKeyRequest createApiKeyRequest);

  /**
   * API Key - Create
   * Similar to <code>createAnAPIKey</code> but it also returns the http response headers .
   * Create a new API Key for accessing our APIs from your servers. The plaintext API Key will be displayed only once on creation, so ensure you store it securely.
   * @param merchantId The unique identifier for the merchant account (required)
   * @param createApiKeyRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api_keys/{merchantId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateApiKeyResponse> createAnAPIKeyWithHttpInfo(@Param("merchantId") String merchantId, CreateApiKeyRequest createApiKeyRequest);



  /**
   * API Key - List
   * List all the API Keys associated to a merchant account.
   * @param merchantId The unique identifier for the merchant account (required)
   * @param limit The maximum number of API Keys to include in the response (optional)
   * @param skip The number of API Keys to skip when retrieving the list of API keys. (optional)
   * @return List&lt;RetrieveApiKeyResponse&gt;
   */
  @RequestLine("GET /api_keys/{merchantId}/list?limit={limit}&skip={skip}")
  @Headers({
    "Accept: application/json",
  })
  List<RetrieveApiKeyResponse> listAllAPIKeysAssociatedWithAMerchantAccount(@Param("merchantId") String merchantId, @Param("limit") Long limit, @Param("skip") Long skip);

  /**
   * API Key - List
   * Similar to <code>listAllAPIKeysAssociatedWithAMerchantAccount</code> but it also returns the http response headers .
   * List all the API Keys associated to a merchant account.
   * @param merchantId The unique identifier for the merchant account (required)
   * @param limit The maximum number of API Keys to include in the response (optional)
   * @param skip The number of API Keys to skip when retrieving the list of API keys. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api_keys/{merchantId}/list?limit={limit}&skip={skip}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<List<RetrieveApiKeyResponse>> listAllAPIKeysAssociatedWithAMerchantAccountWithHttpInfo(@Param("merchantId") String merchantId, @Param("limit") Long limit, @Param("skip") Long skip);


  /**
   * API Key - List
   * List all the API Keys associated to a merchant account.
   * Note, this is equivalent to the other <code>listAllAPIKeysAssociatedWithAMerchantAccount</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListAllAPIKeysAssociatedWithAMerchantAccountQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param merchantId The unique identifier for the merchant account (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>limit - The maximum number of API Keys to include in the response (optional)</li>
   *   <li>skip - The number of API Keys to skip when retrieving the list of API keys. (optional)</li>
   *   </ul>
   * @return List&lt;RetrieveApiKeyResponse&gt;
   */
  @RequestLine("GET /api_keys/{merchantId}/list?limit={limit}&skip={skip}")
  @Headers({
  "Accept: application/json",
  })
  List<RetrieveApiKeyResponse> listAllAPIKeysAssociatedWithAMerchantAccount(@Param("merchantId") String merchantId, @QueryMap(encoded=true) ListAllAPIKeysAssociatedWithAMerchantAccountQueryParams queryParams);

  /**
  * API Key - List
  * List all the API Keys associated to a merchant account.
  * Note, this is equivalent to the other <code>listAllAPIKeysAssociatedWithAMerchantAccount</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param merchantId The unique identifier for the merchant account (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>limit - The maximum number of API Keys to include in the response (optional)</li>
          *   <li>skip - The number of API Keys to skip when retrieving the list of API keys. (optional)</li>
      *   </ul>
          * @return List&lt;RetrieveApiKeyResponse&gt;
      */
      @RequestLine("GET /api_keys/{merchantId}/list?limit={limit}&skip={skip}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<List<RetrieveApiKeyResponse>> listAllAPIKeysAssociatedWithAMerchantAccountWithHttpInfo(@Param("merchantId") String merchantId, @QueryMap(encoded=true) ListAllAPIKeysAssociatedWithAMerchantAccountQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listAllAPIKeysAssociatedWithAMerchantAccount</code> method in a fluent style.
   */
  public static class ListAllAPIKeysAssociatedWithAMerchantAccountQueryParams extends HashMap<String, Object> {
    public ListAllAPIKeysAssociatedWithAMerchantAccountQueryParams limit(final Long value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListAllAPIKeysAssociatedWithAMerchantAccountQueryParams skip(final Long value) {
      put("skip", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * API Key - Retrieve
   * Retrieve information about the specified API Key.
   * @param merchantId The unique identifier for the merchant account (required)
   * @param keyId The unique identifier for the API Key (required)
   * @return RetrieveApiKeyResponse
   */
  @RequestLine("GET /api_keys/{merchantId}/{keyId}")
  @Headers({
    "Accept: application/json",
  })
  RetrieveApiKeyResponse retrieveAnAPIKey(@Param("merchantId") String merchantId, @Param("keyId") String keyId);

  /**
   * API Key - Retrieve
   * Similar to <code>retrieveAnAPIKey</code> but it also returns the http response headers .
   * Retrieve information about the specified API Key.
   * @param merchantId The unique identifier for the merchant account (required)
   * @param keyId The unique identifier for the API Key (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api_keys/{merchantId}/{keyId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<RetrieveApiKeyResponse> retrieveAnAPIKeyWithHttpInfo(@Param("merchantId") String merchantId, @Param("keyId") String keyId);



  /**
   * API Key - Revoke
   * Revoke the specified API Key. Once revoked, the API Key can no longer be used for authenticating with our APIs.
   * @param merchantId The unique identifier for the merchant account (required)
   * @param keyId The unique identifier for the API Key (required)
   * @return RevokeApiKeyResponse
   */
  @RequestLine("DELETE /api_keys/{merchantId}/{keyId}")
  @Headers({
    "Accept: application/json",
  })
  RevokeApiKeyResponse revokeAnAPIKey(@Param("merchantId") String merchantId, @Param("keyId") String keyId);

  /**
   * API Key - Revoke
   * Similar to <code>revokeAnAPIKey</code> but it also returns the http response headers .
   * Revoke the specified API Key. Once revoked, the API Key can no longer be used for authenticating with our APIs.
   * @param merchantId The unique identifier for the merchant account (required)
   * @param keyId The unique identifier for the API Key (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /api_keys/{merchantId}/{keyId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<RevokeApiKeyResponse> revokeAnAPIKeyWithHttpInfo(@Param("merchantId") String merchantId, @Param("keyId") String keyId);



  /**
   * API Key - Update
   * Update information for the specified API Key.
   * @param merchantId The unique identifier for the merchant account (required)
   * @param keyId The unique identifier for the API Key (required)
   * @param updateApiKeyRequest  (required)
   * @return RetrieveApiKeyResponse
   */
  @RequestLine("POST /api_keys/{merchantId}/{keyId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RetrieveApiKeyResponse updateAnAPIKey(@Param("merchantId") String merchantId, @Param("keyId") String keyId, UpdateApiKeyRequest updateApiKeyRequest);

  /**
   * API Key - Update
   * Similar to <code>updateAnAPIKey</code> but it also returns the http response headers .
   * Update information for the specified API Key.
   * @param merchantId The unique identifier for the merchant account (required)
   * @param keyId The unique identifier for the API Key (required)
   * @param updateApiKeyRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api_keys/{merchantId}/{keyId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RetrieveApiKeyResponse> updateAnAPIKeyWithHttpInfo(@Param("merchantId") String merchantId, @Param("keyId") String keyId, UpdateApiKeyRequest updateApiKeyRequest);


}
