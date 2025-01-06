package com.hyperswitch.client.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.model.ProfileCreate;
import com.hyperswitch.client.model.ProfileResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProfileApi
 */
class ProfileApiTest {

    private ProfileApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(ProfileApi.class);
    }

    
    /**
     * Profile - Create
     *
     * Creates a new *profile* for a merchant
     */
    @Test
    void createAProfileTest() {
        String accountId = null;
        ProfileCreate profileCreate = null;
        // ProfileResponse response = api.createAProfile(accountId, profileCreate);

        // TODO: test validations
    }

    
    /**
     * Profile - Delete
     *
     * Delete the *profile*
     */
    @Test
    void deleteTheProfileTest() {
        String accountId = null;
        String profileId = null;
        // Boolean response = api.deleteTheProfile(accountId, profileId);

        // TODO: test validations
    }

    
    /**
     * Profile - List
     *
     * Lists all the *profiles* under a merchant
     */
    @Test
    void listProfilesTest() {
        String accountId = null;
        // List<ProfileResponse> response = api.listProfiles(accountId);

        // TODO: test validations
    }

    
    /**
     * Profile - Retrieve
     *
     * Retrieve existing *profile*
     */
    @Test
    void retrieveAProfileTest() {
        String accountId = null;
        String profileId = null;
        // ProfileResponse response = api.retrieveAProfile(accountId, profileId);

        // TODO: test validations
    }

    
    /**
     * Profile - Update
     *
     * Update the *profile*
     */
    @Test
    void updateAProfileTest() {
        String accountId = null;
        String profileId = null;
        ProfileCreate profileCreate = null;
        // ProfileResponse response = api.updateAProfile(accountId, profileId, profileCreate);

        // TODO: test validations
    }

    
}
