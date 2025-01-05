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


package com.hyperswitch.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.hyperswitch.model.GooglePaySessionResponse;
import com.hyperswitch.model.GooglePayThirdPartySdk;
import com.hyperswitch.model.GpayAllowedPaymentMethods;
import com.hyperswitch.model.GpayMerchantInfo;
import com.hyperswitch.model.GpayShippingAddressParameters;
import com.hyperswitch.model.GpayTransactionInfo;
import com.hyperswitch.model.SdkNextAction;
import com.hyperswitch.model.SecretInfoToInitiateSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import com.fasterxml.jackson.core.type.TypeReference;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.hyperswitch.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
@JsonDeserialize(using = GpaySessionTokenResponse.GpaySessionTokenResponseDeserializer.class)
@JsonSerialize(using = GpaySessionTokenResponse.GpaySessionTokenResponseSerializer.class)
public class GpaySessionTokenResponse extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(GpaySessionTokenResponse.class.getName());

    public static class GpaySessionTokenResponseSerializer extends StdSerializer<GpaySessionTokenResponse> {
        public GpaySessionTokenResponseSerializer(Class<GpaySessionTokenResponse> t) {
            super(t);
        }

        public GpaySessionTokenResponseSerializer() {
            this(null);
        }

        @Override
        public void serialize(GpaySessionTokenResponse value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class GpaySessionTokenResponseDeserializer extends StdDeserializer<GpaySessionTokenResponse> {
        public GpaySessionTokenResponseDeserializer() {
            this(GpaySessionTokenResponse.class);
        }

        public GpaySessionTokenResponseDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public GpaySessionTokenResponse deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize GooglePaySessionResponse
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (GooglePaySessionResponse.class.equals(Integer.class) || GooglePaySessionResponse.class.equals(Long.class) || GooglePaySessionResponse.class.equals(Float.class) || GooglePaySessionResponse.class.equals(Double.class) || GooglePaySessionResponse.class.equals(Boolean.class) || GooglePaySessionResponse.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((GooglePaySessionResponse.class.equals(Integer.class) || GooglePaySessionResponse.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((GooglePaySessionResponse.class.equals(Float.class) || GooglePaySessionResponse.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (GooglePaySessionResponse.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (GooglePaySessionResponse.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(GooglePaySessionResponse.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'GooglePaySessionResponse'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'GooglePaySessionResponse'", e);
            }

            // deserialize GooglePayThirdPartySdk
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (GooglePayThirdPartySdk.class.equals(Integer.class) || GooglePayThirdPartySdk.class.equals(Long.class) || GooglePayThirdPartySdk.class.equals(Float.class) || GooglePayThirdPartySdk.class.equals(Double.class) || GooglePayThirdPartySdk.class.equals(Boolean.class) || GooglePayThirdPartySdk.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((GooglePayThirdPartySdk.class.equals(Integer.class) || GooglePayThirdPartySdk.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((GooglePayThirdPartySdk.class.equals(Float.class) || GooglePayThirdPartySdk.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (GooglePayThirdPartySdk.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (GooglePayThirdPartySdk.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(GooglePayThirdPartySdk.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'GooglePayThirdPartySdk'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'GooglePayThirdPartySdk'", e);
            }

            if (match == 1) {
                GpaySessionTokenResponse ret = new GpaySessionTokenResponse();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for GpaySessionTokenResponse: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public GpaySessionTokenResponse getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "GpaySessionTokenResponse cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<>();

    public GpaySessionTokenResponse() {
        super("oneOf", Boolean.FALSE);
    }

    public GpaySessionTokenResponse(GooglePaySessionResponse o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GpaySessionTokenResponse(GooglePayThirdPartySdk o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("GooglePaySessionResponse", GooglePaySessionResponse.class);
        schemas.put("GooglePayThirdPartySdk", GooglePayThirdPartySdk.class);
        JSON.registerDescendants(GpaySessionTokenResponse.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return GpaySessionTokenResponse.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * GooglePaySessionResponse, GooglePayThirdPartySdk
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(GooglePaySessionResponse.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(GooglePayThirdPartySdk.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be GooglePaySessionResponse, GooglePayThirdPartySdk");
    }

    /**
     * Get the actual instance, which can be the following:
     * GooglePaySessionResponse, GooglePayThirdPartySdk
     *
     * @return The actual instance (GooglePaySessionResponse, GooglePayThirdPartySdk)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `GooglePaySessionResponse`. If the actual instance is not `GooglePaySessionResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GooglePaySessionResponse`
     * @throws ClassCastException if the instance is not `GooglePaySessionResponse`
     */
    public GooglePaySessionResponse getGooglePaySessionResponse() throws ClassCastException {
        return (GooglePaySessionResponse)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GooglePayThirdPartySdk`. If the actual instance is not `GooglePayThirdPartySdk`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GooglePayThirdPartySdk`
     * @throws ClassCastException if the instance is not `GooglePayThirdPartySdk`
     */
    public GooglePayThirdPartySdk getGooglePayThirdPartySdk() throws ClassCastException {
        return (GooglePayThirdPartySdk)super.getActualInstance();
    }



  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    if (getActualInstance() instanceof GooglePayThirdPartySdk) {
        if (getActualInstance() != null) {
          joiner.add(((GooglePayThirdPartySdk)getActualInstance()).toUrlQueryString(prefix + "one_of_0" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof GooglePaySessionResponse) {
        if (getActualInstance() != null) {
          joiner.add(((GooglePaySessionResponse)getActualInstance()).toUrlQueryString(prefix + "one_of_1" + suffix));
        }
        return joiner.toString();
    }
    return null;
  }

}

