package com.hyperswitch.client.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.EncodingUtils;
import com.hyperswitch.client.model.ApiResponse;

import com.hyperswitch.client.model.BlocklistDataKind;
import com.hyperswitch.client.model.BlocklistRequest;
import com.hyperswitch.client.model.BlocklistResponse;
import com.hyperswitch.client.model.ToggleBlocklistResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public interface BlocklistApi extends ApiClient.Api {


  /**
   * 
   * 
   * @param blocklistRequest  (required)
   * @return BlocklistResponse
   */
  @RequestLine("POST /blocklist")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BlocklistResponse blockAFingerprint(BlocklistRequest blocklistRequest);

  /**
   * 
   * Similar to <code>blockAFingerprint</code> but it also returns the http response headers .
   * 
   * @param blocklistRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /blocklist")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BlocklistResponse> blockAFingerprintWithHttpInfo(BlocklistRequest blocklistRequest);



  /**
   * 
   * 
   * @param dataKind Kind of the fingerprint list requested (required)
   * @return BlocklistResponse
   */
  @RequestLine("GET /blocklist?data_kind={dataKind}")
  @Headers({
    "Accept: application/json",
  })
  BlocklistResponse listBlockedFingerprintsOfAParticularKind(@Param("dataKind") BlocklistDataKind dataKind);

  /**
   * 
   * Similar to <code>listBlockedFingerprintsOfAParticularKind</code> but it also returns the http response headers .
   * 
   * @param dataKind Kind of the fingerprint list requested (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /blocklist?data_kind={dataKind}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<BlocklistResponse> listBlockedFingerprintsOfAParticularKindWithHttpInfo(@Param("dataKind") BlocklistDataKind dataKind);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>listBlockedFingerprintsOfAParticularKind</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListBlockedFingerprintsOfAParticularKindQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>dataKind - Kind of the fingerprint list requested (required)</li>
   *   </ul>
   * @return BlocklistResponse
   */
  @RequestLine("GET /blocklist?data_kind={dataKind}")
  @Headers({
  "Accept: application/json",
  })
  BlocklistResponse listBlockedFingerprintsOfAParticularKind(@QueryMap(encoded=true) ListBlockedFingerprintsOfAParticularKindQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>listBlockedFingerprintsOfAParticularKind</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>dataKind - Kind of the fingerprint list requested (required)</li>
      *   </ul>
          * @return BlocklistResponse
      */
      @RequestLine("GET /blocklist?data_kind={dataKind}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<BlocklistResponse> listBlockedFingerprintsOfAParticularKindWithHttpInfo(@QueryMap(encoded=true) ListBlockedFingerprintsOfAParticularKindQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listBlockedFingerprintsOfAParticularKind</code> method in a fluent style.
   */
  public static class ListBlockedFingerprintsOfAParticularKindQueryParams extends HashMap<String, Object> {
    public ListBlockedFingerprintsOfAParticularKindQueryParams dataKind(final BlocklistDataKind value) {
      put("data_kind", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param status Boolean value to enable/disable blocklist (required)
   * @return ToggleBlocklistResponse
   */
  @RequestLine("POST /blocklist/toggle?status={status}")
  @Headers({
    "Accept: application/json",
  })
  ToggleBlocklistResponse toggleBlocklistGuardForAParticularMerchant(@Param("status") Boolean status);

  /**
   * 
   * Similar to <code>toggleBlocklistGuardForAParticularMerchant</code> but it also returns the http response headers .
   * 
   * @param status Boolean value to enable/disable blocklist (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /blocklist/toggle?status={status}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<ToggleBlocklistResponse> toggleBlocklistGuardForAParticularMerchantWithHttpInfo(@Param("status") Boolean status);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>toggleBlocklistGuardForAParticularMerchant</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ToggleBlocklistGuardForAParticularMerchantQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>status - Boolean value to enable/disable blocklist (required)</li>
   *   </ul>
   * @return ToggleBlocklistResponse
   */
  @RequestLine("POST /blocklist/toggle?status={status}")
  @Headers({
  "Accept: application/json",
  })
  ToggleBlocklistResponse toggleBlocklistGuardForAParticularMerchant(@QueryMap(encoded=true) ToggleBlocklistGuardForAParticularMerchantQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>toggleBlocklistGuardForAParticularMerchant</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>status - Boolean value to enable/disable blocklist (required)</li>
      *   </ul>
          * @return ToggleBlocklistResponse
      */
      @RequestLine("POST /blocklist/toggle?status={status}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<ToggleBlocklistResponse> toggleBlocklistGuardForAParticularMerchantWithHttpInfo(@QueryMap(encoded=true) ToggleBlocklistGuardForAParticularMerchantQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>toggleBlocklistGuardForAParticularMerchant</code> method in a fluent style.
   */
  public static class ToggleBlocklistGuardForAParticularMerchantQueryParams extends HashMap<String, Object> {
    public ToggleBlocklistGuardForAParticularMerchantQueryParams status(final Boolean value) {
      put("status", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param blocklistRequest  (required)
   * @return BlocklistResponse
   */
  @RequestLine("DELETE /blocklist")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BlocklistResponse unblockAFingerprint(BlocklistRequest blocklistRequest);

  /**
   * 
   * Similar to <code>unblockAFingerprint</code> but it also returns the http response headers .
   * 
   * @param blocklistRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /blocklist")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BlocklistResponse> unblockAFingerprintWithHttpInfo(BlocklistRequest blocklistRequest);


}
