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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.hyperswitch.model.AcceptedCountriesOneOf2;
import com.hyperswitch.model.AcceptedCurrenciesOneOf;
import com.hyperswitch.model.AcceptedCurrenciesOneOf1;
import com.hyperswitch.model.Currency;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
@JsonDeserialize(using = AcceptedCurrencies.AcceptedCurrenciesDeserializer.class)
@JsonSerialize(using = AcceptedCurrencies.AcceptedCurrenciesSerializer.class)
public class AcceptedCurrencies extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(AcceptedCurrencies.class.getName());

    public static class AcceptedCurrenciesSerializer extends StdSerializer<AcceptedCurrencies> {
        public AcceptedCurrenciesSerializer(Class<AcceptedCurrencies> t) {
            super(t);
        }

        public AcceptedCurrenciesSerializer() {
            this(null);
        }

        @Override
        public void serialize(AcceptedCurrencies value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class AcceptedCurrenciesDeserializer extends StdDeserializer<AcceptedCurrencies> {
        public AcceptedCurrenciesDeserializer() {
            this(AcceptedCurrencies.class);
        }

        public AcceptedCurrenciesDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public AcceptedCurrencies deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize AcceptedCountriesOneOf2
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (AcceptedCountriesOneOf2.class.equals(Integer.class) || AcceptedCountriesOneOf2.class.equals(Long.class) || AcceptedCountriesOneOf2.class.equals(Float.class) || AcceptedCountriesOneOf2.class.equals(Double.class) || AcceptedCountriesOneOf2.class.equals(Boolean.class) || AcceptedCountriesOneOf2.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((AcceptedCountriesOneOf2.class.equals(Integer.class) || AcceptedCountriesOneOf2.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((AcceptedCountriesOneOf2.class.equals(Float.class) || AcceptedCountriesOneOf2.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (AcceptedCountriesOneOf2.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (AcceptedCountriesOneOf2.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(AcceptedCountriesOneOf2.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'AcceptedCountriesOneOf2'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'AcceptedCountriesOneOf2'", e);
            }

            // deserialize AcceptedCurrenciesOneOf
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (AcceptedCurrenciesOneOf.class.equals(Integer.class) || AcceptedCurrenciesOneOf.class.equals(Long.class) || AcceptedCurrenciesOneOf.class.equals(Float.class) || AcceptedCurrenciesOneOf.class.equals(Double.class) || AcceptedCurrenciesOneOf.class.equals(Boolean.class) || AcceptedCurrenciesOneOf.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((AcceptedCurrenciesOneOf.class.equals(Integer.class) || AcceptedCurrenciesOneOf.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((AcceptedCurrenciesOneOf.class.equals(Float.class) || AcceptedCurrenciesOneOf.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (AcceptedCurrenciesOneOf.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (AcceptedCurrenciesOneOf.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(AcceptedCurrenciesOneOf.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'AcceptedCurrenciesOneOf'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'AcceptedCurrenciesOneOf'", e);
            }

            // deserialize AcceptedCurrenciesOneOf1
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (AcceptedCurrenciesOneOf1.class.equals(Integer.class) || AcceptedCurrenciesOneOf1.class.equals(Long.class) || AcceptedCurrenciesOneOf1.class.equals(Float.class) || AcceptedCurrenciesOneOf1.class.equals(Double.class) || AcceptedCurrenciesOneOf1.class.equals(Boolean.class) || AcceptedCurrenciesOneOf1.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((AcceptedCurrenciesOneOf1.class.equals(Integer.class) || AcceptedCurrenciesOneOf1.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((AcceptedCurrenciesOneOf1.class.equals(Float.class) || AcceptedCurrenciesOneOf1.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (AcceptedCurrenciesOneOf1.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (AcceptedCurrenciesOneOf1.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(AcceptedCurrenciesOneOf1.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'AcceptedCurrenciesOneOf1'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'AcceptedCurrenciesOneOf1'", e);
            }

            if (match == 1) {
                AcceptedCurrencies ret = new AcceptedCurrencies();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for AcceptedCurrencies: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public AcceptedCurrencies getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "AcceptedCurrencies cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<>();

    public AcceptedCurrencies() {
        super("oneOf", Boolean.FALSE);
    }

    public AcceptedCurrencies(AcceptedCountriesOneOf2 o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AcceptedCurrencies(AcceptedCurrenciesOneOf o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AcceptedCurrencies(AcceptedCurrenciesOneOf1 o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("AcceptedCountriesOneOf2", AcceptedCountriesOneOf2.class);
        schemas.put("AcceptedCurrenciesOneOf", AcceptedCurrenciesOneOf.class);
        schemas.put("AcceptedCurrenciesOneOf1", AcceptedCurrenciesOneOf1.class);
        JSON.registerDescendants(AcceptedCurrencies.class, Collections.unmodifiableMap(schemas));
        // Initialize and register the discriminator mappings.
        Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
        mappings.put("AcceptedCountries_oneOf_2", AcceptedCountriesOneOf2.class);
        mappings.put("AcceptedCurrencies_oneOf", AcceptedCurrenciesOneOf.class);
        mappings.put("AcceptedCurrencies_oneOf_1", AcceptedCurrenciesOneOf1.class);
        mappings.put("AcceptedCurrencies", AcceptedCurrencies.class);
        JSON.registerDiscriminator(AcceptedCurrencies.class, "type", mappings);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return AcceptedCurrencies.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * AcceptedCountriesOneOf2, AcceptedCurrenciesOneOf, AcceptedCurrenciesOneOf1
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(AcceptedCountriesOneOf2.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(AcceptedCurrenciesOneOf.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(AcceptedCurrenciesOneOf1.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be AcceptedCountriesOneOf2, AcceptedCurrenciesOneOf, AcceptedCurrenciesOneOf1");
    }

    /**
     * Get the actual instance, which can be the following:
     * AcceptedCountriesOneOf2, AcceptedCurrenciesOneOf, AcceptedCurrenciesOneOf1
     *
     * @return The actual instance (AcceptedCountriesOneOf2, AcceptedCurrenciesOneOf, AcceptedCurrenciesOneOf1)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `AcceptedCountriesOneOf2`. If the actual instance is not `AcceptedCountriesOneOf2`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AcceptedCountriesOneOf2`
     * @throws ClassCastException if the instance is not `AcceptedCountriesOneOf2`
     */
    public AcceptedCountriesOneOf2 getAcceptedCountriesOneOf2() throws ClassCastException {
        return (AcceptedCountriesOneOf2)super.getActualInstance();
    }

    /**
     * Get the actual instance of `AcceptedCurrenciesOneOf`. If the actual instance is not `AcceptedCurrenciesOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AcceptedCurrenciesOneOf`
     * @throws ClassCastException if the instance is not `AcceptedCurrenciesOneOf`
     */
    public AcceptedCurrenciesOneOf getAcceptedCurrenciesOneOf() throws ClassCastException {
        return (AcceptedCurrenciesOneOf)super.getActualInstance();
    }

    /**
     * Get the actual instance of `AcceptedCurrenciesOneOf1`. If the actual instance is not `AcceptedCurrenciesOneOf1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AcceptedCurrenciesOneOf1`
     * @throws ClassCastException if the instance is not `AcceptedCurrenciesOneOf1`
     */
    public AcceptedCurrenciesOneOf1 getAcceptedCurrenciesOneOf1() throws ClassCastException {
        return (AcceptedCurrenciesOneOf1)super.getActualInstance();
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

    if (getActualInstance() instanceof AcceptedCurrenciesOneOf) {
        if (getActualInstance() != null) {
          joiner.add(((AcceptedCurrenciesOneOf)getActualInstance()).toUrlQueryString(prefix + "one_of_0" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof AcceptedCurrenciesOneOf1) {
        if (getActualInstance() != null) {
          joiner.add(((AcceptedCurrenciesOneOf1)getActualInstance()).toUrlQueryString(prefix + "one_of_1" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof AcceptedCountriesOneOf2) {
        if (getActualInstance() != null) {
          joiner.add(((AcceptedCountriesOneOf2)getActualInstance()).toUrlQueryString(prefix + "one_of_2" + suffix));
        }
        return joiner.toString();
    }
    return null;
  }

}

