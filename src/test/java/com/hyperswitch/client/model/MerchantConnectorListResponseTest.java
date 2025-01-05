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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.hyperswitch.client.model.AdditionalMerchantData;
import com.hyperswitch.client.model.Connector;
import com.hyperswitch.client.model.ConnectorStatus;
import com.hyperswitch.client.model.ConnectorType;
import com.hyperswitch.client.model.ConnectorWalletDetails;
import com.hyperswitch.client.model.FrmConfigs;
import com.hyperswitch.client.model.PaymentMethodsEnabled;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.Test;


/**
 * Model tests for MerchantConnectorListResponse
 */
class MerchantConnectorListResponseTest {
    private final MerchantConnectorListResponse model = new MerchantConnectorListResponse();

    /**
     * Model tests for MerchantConnectorListResponse
     */
    @Test
    void testMerchantConnectorListResponse() {
        // TODO: test MerchantConnectorListResponse
    }

    /**
     * Test the property 'connectorType'
     */
    @Test
    void connectorTypeTest() {
        // TODO: test connectorType
    }

    /**
     * Test the property 'connectorName'
     */
    @Test
    void connectorNameTest() {
        // TODO: test connectorName
    }

    /**
     * Test the property 'connectorLabel'
     */
    @Test
    void connectorLabelTest() {
        // TODO: test connectorLabel
    }

    /**
     * Test the property 'id'
     */
    @Test
    void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'profileId'
     */
    @Test
    void profileIdTest() {
        // TODO: test profileId
    }

    /**
     * Test the property 'paymentMethodsEnabled'
     */
    @Test
    void paymentMethodsEnabledTest() {
        // TODO: test paymentMethodsEnabled
    }

    /**
     * Test the property 'metadata'
     */
    @Test
    void metadataTest() {
        // TODO: test metadata
    }

    /**
     * Test the property 'disabled'
     */
    @Test
    void disabledTest() {
        // TODO: test disabled
    }

    /**
     * Test the property 'frmConfigs'
     */
    @Test
    void frmConfigsTest() {
        // TODO: test frmConfigs
    }

    /**
     * Test the property 'applepayVerifiedDomains'
     */
    @Test
    void applepayVerifiedDomainsTest() {
        // TODO: test applepayVerifiedDomains
    }

    /**
     * Test the property 'pmAuthConfig'
     */
    @Test
    void pmAuthConfigTest() {
        // TODO: test pmAuthConfig
    }

    /**
     * Test the property 'status'
     */
    @Test
    void statusTest() {
        // TODO: test status
    }

    /**
     * Test the property 'additionalMerchantData'
     */
    @Test
    void additionalMerchantDataTest() {
        // TODO: test additionalMerchantData
    }

    /**
     * Test the property 'connectorWalletsDetails'
     */
    @Test
    void connectorWalletsDetailsTest() {
        // TODO: test connectorWalletsDetails
    }

}
