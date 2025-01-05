package com.hyperswitch.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.model.CreateApiKeyRequest;
import com.hyperswitch.model.CreateApiKeyResponse;
import com.hyperswitch.model.RetrieveApiKeyResponse;
import com.hyperswitch.model.RevokeApiKeyResponse;
import com.hyperswitch.model.UpdateApiKeyRequest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ApiKeyApi
 */
class ApiKeyApiTest {

    private ApiKeyApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(ApiKeyApi.class);
    }

    
    /**
     * API Key - Create
     *
     * Create a new API Key for accessing our APIs from your servers. The plaintext API Key will be displayed only once on creation, so ensure you store it securely.
     */
    @Test
    void createAnAPIKeyTest() {
        CreateApiKeyRequest createApiKeyRequest = null;
        // CreateApiKeyResponse response = api.createAnAPIKey(createApiKeyRequest);

        // TODO: test validations
    }

    
    /**
     * API Key - List
     *
     * List all the API Keys associated to a merchant account.
     */
    @Test
    void listAllAPIKeysAssociatedWithAMerchantAccountTest() {
        Long limit = null;
        Long skip = null;
        // List<RetrieveApiKeyResponse> response = api.listAllAPIKeysAssociatedWithAMerchantAccount(limit, skip);

        // TODO: test validations
    }

    /**
     * API Key - List
     *
     * List all the API Keys associated to a merchant account.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listAllAPIKeysAssociatedWithAMerchantAccountTestQueryMap() {
        ApiKeyApi.ListAllAPIKeysAssociatedWithAMerchantAccountQueryParams queryParams = new ApiKeyApi.ListAllAPIKeysAssociatedWithAMerchantAccountQueryParams()
            .limit(null)
            .skip(null);
        // List<RetrieveApiKeyResponse> response = api.listAllAPIKeysAssociatedWithAMerchantAccount(queryParams);

    // TODO: test validations
    }
    
    /**
     * API Key - Retrieve
     *
     * Retrieve information about the specified API Key.
     */
    @Test
    void retrieveAnAPIKeyTest() {
        String id = null;
        // RetrieveApiKeyResponse response = api.retrieveAnAPIKey(id);

        // TODO: test validations
    }

    
    /**
     * API Key - Revoke
     *
     * Revoke the specified API Key. Once revoked, the API Key can no longer be used for authenticating with our APIs.
     */
    @Test
    void revokeAnAPIKeyTest() {
        String id = null;
        // RevokeApiKeyResponse response = api.revokeAnAPIKey(id);

        // TODO: test validations
    }

    
    /**
     * API Key - Update
     *
     * Update information for the specified API Key.
     */
    @Test
    void updateAnAPIKeyTest() {
        String id = null;
        UpdateApiKeyRequest updateApiKeyRequest = null;
        // RetrieveApiKeyResponse response = api.updateAnAPIKey(id, updateApiKeyRequest);

        // TODO: test validations
    }

    
}
