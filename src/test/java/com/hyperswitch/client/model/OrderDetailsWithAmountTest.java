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
import com.hyperswitch.client.model.ProductType;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for OrderDetailsWithAmount
 */
public class OrderDetailsWithAmountTest {
    private final OrderDetailsWithAmount model = new OrderDetailsWithAmount();

    /**
     * Model tests for OrderDetailsWithAmount
     */
    @Test
    public void testOrderDetailsWithAmount() {
        // TODO: test OrderDetailsWithAmount
    }

    /**
     * Test the property 'productName'
     */
    @Test
    public void productNameTest() {
        // TODO: test productName
    }

    /**
     * Test the property 'quantity'
     */
    @Test
    public void quantityTest() {
        // TODO: test quantity
    }

    /**
     * Test the property 'amount'
     */
    @Test
    public void amountTest() {
        // TODO: test amount
    }

    /**
     * Test the property 'requiresShipping'
     */
    @Test
    public void requiresShippingTest() {
        // TODO: test requiresShipping
    }

    /**
     * Test the property 'productImgLink'
     */
    @Test
    public void productImgLinkTest() {
        // TODO: test productImgLink
    }

    /**
     * Test the property 'productId'
     */
    @Test
    public void productIdTest() {
        // TODO: test productId
    }

    /**
     * Test the property 'category'
     */
    @Test
    public void categoryTest() {
        // TODO: test category
    }

    /**
     * Test the property 'subCategory'
     */
    @Test
    public void subCategoryTest() {
        // TODO: test subCategory
    }

    /**
     * Test the property 'brand'
     */
    @Test
    public void brandTest() {
        // TODO: test brand
    }

    /**
     * Test the property 'productType'
     */
    @Test
    public void productTypeTest() {
        // TODO: test productType
    }

    /**
     * Test the property 'productTaxCode'
     */
    @Test
    public void productTaxCodeTest() {
        // TODO: test productTaxCode
    }

}
