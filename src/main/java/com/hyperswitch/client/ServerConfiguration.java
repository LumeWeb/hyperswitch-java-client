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


package com.hyperswitch.client;

import java.util.Map;

/**
 * Representing a Server configuration.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class ServerConfiguration {
    public String URL;
    public String description;
    public Map<String, ServerVariable> variables;

    /**
     * @param URL A URL to the target host.
     * @param description A description of the host designated by the URL.
     * @param variables A map between a variable name and its value. The value is used for substitution in the server's URL template.
     */
    public ServerConfiguration(String URL, String description, Map<String, ServerVariable> variables) {
        this.URL = URL;
        this.description = description;
        this.variables = variables;
    }

    /**
     * Format URL template using given variables.
     *
     * @param variables A map between a variable name and its value.
     * @return Formatted URL.
     */
    public String URL(Map<String, String> variables) {
        String url = this.URL;

        // go through variables and replace placeholders
        for (Map.Entry<String, ServerVariable> variable: this.variables.entrySet()) {
            String name = variable.getKey();
            ServerVariable serverVariable = variable.getValue();
            String value = serverVariable.defaultValue;

            if (variables != null && variables.containsKey(name)) {
                value = variables.get(name);
                if (serverVariable.enumValues.size() > 0 && !serverVariable.enumValues.contains(value)) {
                    throw new IllegalArgumentException("The variable " + name + " in the server URL has invalid value " + value + ".");
                }
            }
            url = url.replace("{" + name + "}", value);
        }
        return url;
    }

    /**
     * Format URL template using default server variables.
     *
     * @return Formatted URL.
     */
    public String URL() {
        return URL(null);
    }
}
