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


package com.lumeweb.hyperswitch.model;

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
import com.lumeweb.hyperswitch.model.PaypalAdditionalData;
import com.lumeweb.hyperswitch.model.VenmoAdditionalData;
import java.util.Arrays;
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
import com.lumeweb.hyperswitch.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
@JsonDeserialize(using = WalletAdditionalData.WalletAdditionalDataDeserializer.class)
@JsonSerialize(using = WalletAdditionalData.WalletAdditionalDataSerializer.class)
public class WalletAdditionalData extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(WalletAdditionalData.class.getName());

    public static class WalletAdditionalDataSerializer extends StdSerializer<WalletAdditionalData> {
        public WalletAdditionalDataSerializer(Class<WalletAdditionalData> t) {
            super(t);
        }

        public WalletAdditionalDataSerializer() {
            this(null);
        }

        @Override
        public void serialize(WalletAdditionalData value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class WalletAdditionalDataDeserializer extends StdDeserializer<WalletAdditionalData> {
        public WalletAdditionalDataDeserializer() {
            this(WalletAdditionalData.class);
        }

        public WalletAdditionalDataDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public WalletAdditionalData deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize PaypalAdditionalData
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (PaypalAdditionalData.class.equals(Integer.class) || PaypalAdditionalData.class.equals(Long.class) || PaypalAdditionalData.class.equals(Float.class) || PaypalAdditionalData.class.equals(Double.class) || PaypalAdditionalData.class.equals(Boolean.class) || PaypalAdditionalData.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((PaypalAdditionalData.class.equals(Integer.class) || PaypalAdditionalData.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((PaypalAdditionalData.class.equals(Float.class) || PaypalAdditionalData.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (PaypalAdditionalData.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (PaypalAdditionalData.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(PaypalAdditionalData.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'PaypalAdditionalData'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'PaypalAdditionalData'", e);
            }

            // deserialize VenmoAdditionalData
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (VenmoAdditionalData.class.equals(Integer.class) || VenmoAdditionalData.class.equals(Long.class) || VenmoAdditionalData.class.equals(Float.class) || VenmoAdditionalData.class.equals(Double.class) || VenmoAdditionalData.class.equals(Boolean.class) || VenmoAdditionalData.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((VenmoAdditionalData.class.equals(Integer.class) || VenmoAdditionalData.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((VenmoAdditionalData.class.equals(Float.class) || VenmoAdditionalData.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (VenmoAdditionalData.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (VenmoAdditionalData.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(VenmoAdditionalData.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'VenmoAdditionalData'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'VenmoAdditionalData'", e);
            }

            if (match == 1) {
                WalletAdditionalData ret = new WalletAdditionalData();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for WalletAdditionalData: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public WalletAdditionalData getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "WalletAdditionalData cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<>();

    public WalletAdditionalData() {
        super("oneOf", Boolean.FALSE);
    }

    public WalletAdditionalData(PaypalAdditionalData o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public WalletAdditionalData(VenmoAdditionalData o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("PaypalAdditionalData", PaypalAdditionalData.class);
        schemas.put("VenmoAdditionalData", VenmoAdditionalData.class);
        JSON.registerDescendants(WalletAdditionalData.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return WalletAdditionalData.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * PaypalAdditionalData, VenmoAdditionalData
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(PaypalAdditionalData.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(VenmoAdditionalData.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be PaypalAdditionalData, VenmoAdditionalData");
    }

    /**
     * Get the actual instance, which can be the following:
     * PaypalAdditionalData, VenmoAdditionalData
     *
     * @return The actual instance (PaypalAdditionalData, VenmoAdditionalData)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `PaypalAdditionalData`. If the actual instance is not `PaypalAdditionalData`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PaypalAdditionalData`
     * @throws ClassCastException if the instance is not `PaypalAdditionalData`
     */
    public PaypalAdditionalData getPaypalAdditionalData() throws ClassCastException {
        return (PaypalAdditionalData)super.getActualInstance();
    }

    /**
     * Get the actual instance of `VenmoAdditionalData`. If the actual instance is not `VenmoAdditionalData`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `VenmoAdditionalData`
     * @throws ClassCastException if the instance is not `VenmoAdditionalData`
     */
    public VenmoAdditionalData getVenmoAdditionalData() throws ClassCastException {
        return (VenmoAdditionalData)super.getActualInstance();
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

    if (getActualInstance() instanceof PaypalAdditionalData) {
        if (getActualInstance() != null) {
          joiner.add(((PaypalAdditionalData)getActualInstance()).toUrlQueryString(prefix + "one_of_0" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof VenmoAdditionalData) {
        if (getActualInstance() != null) {
          joiner.add(((VenmoAdditionalData)getActualInstance()).toUrlQueryString(prefix + "one_of_1" + suffix));
        }
        return joiner.toString();
    }
    return null;
  }

}

