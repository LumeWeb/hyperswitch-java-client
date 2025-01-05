package com.hyperswitch.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.EncodingUtils;
import com.hyperswitch.model.ApiResponse;

import com.hyperswitch.model.MerchantAccountResponse;
import com.hyperswitch.model.OrganizationCreateRequest;
import com.hyperswitch.model.OrganizationResponse;
import com.hyperswitch.model.OrganizationUpdateRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
public interface OrganizationApi extends ApiClient.Api {


  /**
   * Organization - Create
   * Create a new organization
   * @param organizationCreateRequest  (required)
   * @return OrganizationResponse
   */
  @RequestLine("POST /v2/organization")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OrganizationResponse createAnOrganization(OrganizationCreateRequest organizationCreateRequest);

  /**
   * Organization - Create
   * Similar to <code>createAnOrganization</code> but it also returns the http response headers .
   * Create a new organization
   * @param organizationCreateRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v2/organization")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OrganizationResponse> createAnOrganizationWithHttpInfo(OrganizationCreateRequest organizationCreateRequest);



  /**
   * Organization - Merchant Account - List
   * List merchant accounts for an Organization
   * @param id The unique identifier for the Organization (required)
   * @return List&lt;MerchantAccountResponse&gt;
   */
  @RequestLine("GET /v2/organization/{id}/merchant_accounts")
  @Headers({
    "Accept: application/json",
  })
  List<MerchantAccountResponse> listMerchantAccounts(@Param("id") String id);

  /**
   * Organization - Merchant Account - List
   * Similar to <code>listMerchantAccounts</code> but it also returns the http response headers .
   * List merchant accounts for an Organization
   * @param id The unique identifier for the Organization (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v2/organization/{id}/merchant_accounts")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<List<MerchantAccountResponse>> listMerchantAccountsWithHttpInfo(@Param("id") String id);



  /**
   * Organization - Retrieve
   * Retrieve an existing organization
   * @param id The unique identifier for the Organization (required)
   * @return OrganizationResponse
   */
  @RequestLine("GET /v2/organization/{id}")
  @Headers({
    "Accept: application/json",
  })
  OrganizationResponse retrieveAnOrganization(@Param("id") String id);

  /**
   * Organization - Retrieve
   * Similar to <code>retrieveAnOrganization</code> but it also returns the http response headers .
   * Retrieve an existing organization
   * @param id The unique identifier for the Organization (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v2/organization/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<OrganizationResponse> retrieveAnOrganizationWithHttpInfo(@Param("id") String id);



  /**
   * Organization - Update
   * Create a new organization for .
   * @param id The unique identifier for the Organization (required)
   * @param organizationUpdateRequest  (required)
   * @return OrganizationResponse
   */
  @RequestLine("PUT /v2/organization/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OrganizationResponse updateAnOrganization(@Param("id") String id, OrganizationUpdateRequest organizationUpdateRequest);

  /**
   * Organization - Update
   * Similar to <code>updateAnOrganization</code> but it also returns the http response headers .
   * Create a new organization for .
   * @param id The unique identifier for the Organization (required)
   * @param organizationUpdateRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v2/organization/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OrganizationResponse> updateAnOrganizationWithHttpInfo(@Param("id") String id, OrganizationUpdateRequest organizationUpdateRequest);


}
