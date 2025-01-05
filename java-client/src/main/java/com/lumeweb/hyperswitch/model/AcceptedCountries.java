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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.lumeweb.hyperswitch.model.AcceptedCountriesOneOf;
import com.lumeweb.hyperswitch.model.AcceptedCountriesOneOf1;
import com.lumeweb.hyperswitch.model.AcceptedCountriesOneOf2;
import com.lumeweb.hyperswitch.model.CountryAlpha2;
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
import com.lumeweb.hyperswitch.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
@JsonDeserialize(using = AcceptedCountries.AcceptedCountriesDeserializer.class)
@JsonSerialize(using = AcceptedCountries.AcceptedCountriesSerializer.class)
public class AcceptedCountries extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(AcceptedCountries.class.getName());

    public static class AcceptedCountriesSerializer extends StdSerializer<AcceptedCountries> {
        public AcceptedCountriesSerializer(Class<AcceptedCountries> t) {
            super(t);
        }

        public AcceptedCountriesSerializer() {
            this(null);
        }

        @Override
        public void serialize(AcceptedCountries value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class AcceptedCountriesDeserializer extends StdDeserializer<AcceptedCountries> {
        public AcceptedCountriesDeserializer() {
            this(AcceptedCountries.class);
        }

        public AcceptedCountriesDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public AcceptedCountries deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize AcceptedCountriesOneOf
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (AcceptedCountriesOneOf.class.equals(Integer.class) || AcceptedCountriesOneOf.class.equals(Long.class) || AcceptedCountriesOneOf.class.equals(Float.class) || AcceptedCountriesOneOf.class.equals(Double.class) || AcceptedCountriesOneOf.class.equals(Boolean.class) || AcceptedCountriesOneOf.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((AcceptedCountriesOneOf.class.equals(Integer.class) || AcceptedCountriesOneOf.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((AcceptedCountriesOneOf.class.equals(Float.class) || AcceptedCountriesOneOf.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (AcceptedCountriesOneOf.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (AcceptedCountriesOneOf.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(AcceptedCountriesOneOf.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'AcceptedCountriesOneOf'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'AcceptedCountriesOneOf'", e);
            }

            // deserialize AcceptedCountriesOneOf1
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (AcceptedCountriesOneOf1.class.equals(Integer.class) || AcceptedCountriesOneOf1.class.equals(Long.class) || AcceptedCountriesOneOf1.class.equals(Float.class) || AcceptedCountriesOneOf1.class.equals(Double.class) || AcceptedCountriesOneOf1.class.equals(Boolean.class) || AcceptedCountriesOneOf1.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((AcceptedCountriesOneOf1.class.equals(Integer.class) || AcceptedCountriesOneOf1.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((AcceptedCountriesOneOf1.class.equals(Float.class) || AcceptedCountriesOneOf1.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (AcceptedCountriesOneOf1.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (AcceptedCountriesOneOf1.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(AcceptedCountriesOneOf1.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'AcceptedCountriesOneOf1'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'AcceptedCountriesOneOf1'", e);
            }

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

            if (match == 1) {
                AcceptedCountries ret = new AcceptedCountries();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for AcceptedCountries: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public AcceptedCountries getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "AcceptedCountries cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<>();

    public AcceptedCountries() {
        super("oneOf", Boolean.FALSE);
    }

    public AcceptedCountries(AcceptedCountriesOneOf o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AcceptedCountries(AcceptedCountriesOneOf1 o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AcceptedCountries(AcceptedCountriesOneOf2 o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("AcceptedCountriesOneOf", AcceptedCountriesOneOf.class);
        schemas.put("AcceptedCountriesOneOf1", AcceptedCountriesOneOf1.class);
        schemas.put("AcceptedCountriesOneOf2", AcceptedCountriesOneOf2.class);
        JSON.registerDescendants(AcceptedCountries.class, Collections.unmodifiableMap(schemas));
        // Initialize and register the discriminator mappings.
        Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
        mappings.put("AcceptedCountries_oneOf", AcceptedCountriesOneOf.class);
        mappings.put("AcceptedCountries_oneOf_1", AcceptedCountriesOneOf1.class);
        mappings.put("AcceptedCountries_oneOf_2", AcceptedCountriesOneOf2.class);
        mappings.put("AcceptedCountries", AcceptedCountries.class);
        JSON.registerDiscriminator(AcceptedCountries.class, "type", mappings);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return AcceptedCountries.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * AcceptedCountriesOneOf, AcceptedCountriesOneOf1, AcceptedCountriesOneOf2
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(AcceptedCountriesOneOf.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(AcceptedCountriesOneOf1.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(AcceptedCountriesOneOf2.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be AcceptedCountriesOneOf, AcceptedCountriesOneOf1, AcceptedCountriesOneOf2");
    }

    /**
     * Get the actual instance, which can be the following:
     * AcceptedCountriesOneOf, AcceptedCountriesOneOf1, AcceptedCountriesOneOf2
     *
     * @return The actual instance (AcceptedCountriesOneOf, AcceptedCountriesOneOf1, AcceptedCountriesOneOf2)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `AcceptedCountriesOneOf`. If the actual instance is not `AcceptedCountriesOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AcceptedCountriesOneOf`
     * @throws ClassCastException if the instance is not `AcceptedCountriesOneOf`
     */
    public AcceptedCountriesOneOf getAcceptedCountriesOneOf() throws ClassCastException {
        return (AcceptedCountriesOneOf)super.getActualInstance();
    }

    /**
     * Get the actual instance of `AcceptedCountriesOneOf1`. If the actual instance is not `AcceptedCountriesOneOf1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AcceptedCountriesOneOf1`
     * @throws ClassCastException if the instance is not `AcceptedCountriesOneOf1`
     */
    public AcceptedCountriesOneOf1 getAcceptedCountriesOneOf1() throws ClassCastException {
        return (AcceptedCountriesOneOf1)super.getActualInstance();
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

    if (getActualInstance() instanceof AcceptedCountriesOneOf) {
        if (getActualInstance() != null) {
          joiner.add(((AcceptedCountriesOneOf)getActualInstance()).toUrlQueryString(prefix + "one_of_0" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof AcceptedCountriesOneOf1) {
        if (getActualInstance() != null) {
          joiner.add(((AcceptedCountriesOneOf1)getActualInstance()).toUrlQueryString(prefix + "one_of_1" + suffix));
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

