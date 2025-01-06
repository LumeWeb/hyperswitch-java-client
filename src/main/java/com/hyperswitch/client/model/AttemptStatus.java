/*
 * Hyperswitch - API Documentation
 *  ## Get started  Hyperswitch provides a collection of APIs that enable you to process and manage payments. Our APIs accept and return JSON in the HTTP body, and return standard HTTP response codes.  You can consume the APIs directly using your favorite HTTP/REST library.  We have a testing environment referred to \"sandbox\", which you can setup to test API calls without affecting production data. Currently, our sandbox environment is live while our production environment is under development and will be available soon. You can sign up on our Dashboard to get API keys to access Hyperswitch API.  ### Environment  Use the following base URLs when making requests to the APIs:  | Environment   |  Base URL                          | |---------------|------------------------------------| | Sandbox       | <https://sandbox.hyperswitch.io>   | | Production    | <https://api.hyperswitch.io>       |  ## Authentication  When you sign up on our [dashboard](https://app.hyperswitch.io) and create a merchant account, you are given a secret key (also referred as api-key) and a publishable key. You may authenticate all API requests with Hyperswitch server by providing the appropriate key in the request Authorization header.  | Key             |  Description                                                                                  | |-----------------|-----------------------------------------------------------------------------------------------| | api-key         | Private key. Used to authenticate all API requests from your merchant server                  | | publishable key | Unique identifier for your account. Used to authenticate API requests from your app's client  |  Never share your secret api keys. Keep them guarded and secure. 
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: hyperswitch@juspay.in
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.hyperswitch.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The status of the attempt
 */
public enum AttemptStatus {
  
  STARTED("started"),
  
  AUTHENTICATION_FAILED("authentication_failed"),
  
  ROUTER_DECLINED("router_declined"),
  
  AUTHENTICATION_PENDING("authentication_pending"),
  
  AUTHENTICATION_SUCCESSFUL("authentication_successful"),
  
  AUTHORIZED("authorized"),
  
  AUTHORIZATION_FAILED("authorization_failed"),
  
  CHARGED("charged"),
  
  AUTHORIZING("authorizing"),
  
  COD_INITIATED("cod_initiated"),
  
  VOIDED("voided"),
  
  VOID_INITIATED("void_initiated"),
  
  CAPTURE_INITIATED("capture_initiated"),
  
  CAPTURE_FAILED("capture_failed"),
  
  VOID_FAILED("void_failed"),
  
  AUTO_REFUNDED("auto_refunded"),
  
  PARTIAL_CHARGED("partial_charged"),
  
  PARTIAL_CHARGED_AND_CHARGEABLE("partial_charged_and_chargeable"),
  
  UNRESOLVED("unresolved"),
  
  PENDING("pending"),
  
  FAILURE("failure"),
  
  PAYMENT_METHOD_AWAITED("payment_method_awaited"),
  
  CONFIRMATION_AWAITED("confirmation_awaited"),
  
  DEVICE_DATA_COLLECTION_PENDING("device_data_collection_pending");

  private String value;

  AttemptStatus(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AttemptStatus fromValue(String value) {
    for (AttemptStatus b : AttemptStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

