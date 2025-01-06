package com.hyperswitch.client.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.EncodingUtils;
import com.hyperswitch.client.model.ApiResponse;

import com.hyperswitch.client.model.OrganizationCreateRequest;
import com.hyperswitch.client.model.OrganizationResponse;
import com.hyperswitch.client.model.OrganizationUpdateRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public interface OrganizationApi extends ApiClient.Api {


  /**
   * Organization - Create
   * Create a new organization
   * @param organizationCreateRequest  (required)
   * @return OrganizationResponse
   */
  @RequestLine("POST /organization")
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
  @RequestLine("POST /organization")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OrganizationResponse> createAnOrganizationWithHttpInfo(OrganizationCreateRequest organizationCreateRequest);



  /**
   * Organization - Retrieve
   * Retrieve an existing organization
   * @param id The unique identifier for the Organization (required)
   * @return OrganizationResponse
   */
  @RequestLine("GET /organization/{id}")
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
  @RequestLine("GET /organization/{id}")
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
  @RequestLine("PUT /organization/{id}")
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
  @RequestLine("PUT /organization/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OrganizationResponse> updateAnOrganizationWithHttpInfo(@Param("id") String id, OrganizationUpdateRequest organizationUpdateRequest);


}
