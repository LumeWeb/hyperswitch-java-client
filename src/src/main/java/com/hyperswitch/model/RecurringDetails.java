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
import com.hyperswitch.model.NetworkTransactionIdAndCardDetails;
import com.hyperswitch.model.RecurringDetailsOneOf;
import com.hyperswitch.model.RecurringDetailsOneOf1;
import com.hyperswitch.model.RecurringDetailsOneOf2;
import com.hyperswitch.model.RecurringDetailsOneOf3;
import java.util.Arrays;
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
@JsonDeserialize(using = RecurringDetails.RecurringDetailsDeserializer.class)
@JsonSerialize(using = RecurringDetails.RecurringDetailsSerializer.class)
public class RecurringDetails extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(RecurringDetails.class.getName());

    public static class RecurringDetailsSerializer extends StdSerializer<RecurringDetails> {
        public RecurringDetailsSerializer(Class<RecurringDetails> t) {
            super(t);
        }

        public RecurringDetailsSerializer() {
            this(null);
        }

        @Override
        public void serialize(RecurringDetails value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class RecurringDetailsDeserializer extends StdDeserializer<RecurringDetails> {
        public RecurringDetailsDeserializer() {
            this(RecurringDetails.class);
        }

        public RecurringDetailsDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public RecurringDetails deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize RecurringDetailsOneOf
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (RecurringDetailsOneOf.class.equals(Integer.class) || RecurringDetailsOneOf.class.equals(Long.class) || RecurringDetailsOneOf.class.equals(Float.class) || RecurringDetailsOneOf.class.equals(Double.class) || RecurringDetailsOneOf.class.equals(Boolean.class) || RecurringDetailsOneOf.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((RecurringDetailsOneOf.class.equals(Integer.class) || RecurringDetailsOneOf.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((RecurringDetailsOneOf.class.equals(Float.class) || RecurringDetailsOneOf.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (RecurringDetailsOneOf.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (RecurringDetailsOneOf.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(RecurringDetailsOneOf.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'RecurringDetailsOneOf'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'RecurringDetailsOneOf'", e);
            }

            // deserialize RecurringDetailsOneOf1
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (RecurringDetailsOneOf1.class.equals(Integer.class) || RecurringDetailsOneOf1.class.equals(Long.class) || RecurringDetailsOneOf1.class.equals(Float.class) || RecurringDetailsOneOf1.class.equals(Double.class) || RecurringDetailsOneOf1.class.equals(Boolean.class) || RecurringDetailsOneOf1.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((RecurringDetailsOneOf1.class.equals(Integer.class) || RecurringDetailsOneOf1.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((RecurringDetailsOneOf1.class.equals(Float.class) || RecurringDetailsOneOf1.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (RecurringDetailsOneOf1.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (RecurringDetailsOneOf1.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(RecurringDetailsOneOf1.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'RecurringDetailsOneOf1'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'RecurringDetailsOneOf1'", e);
            }

            // deserialize RecurringDetailsOneOf2
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (RecurringDetailsOneOf2.class.equals(Integer.class) || RecurringDetailsOneOf2.class.equals(Long.class) || RecurringDetailsOneOf2.class.equals(Float.class) || RecurringDetailsOneOf2.class.equals(Double.class) || RecurringDetailsOneOf2.class.equals(Boolean.class) || RecurringDetailsOneOf2.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((RecurringDetailsOneOf2.class.equals(Integer.class) || RecurringDetailsOneOf2.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((RecurringDetailsOneOf2.class.equals(Float.class) || RecurringDetailsOneOf2.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (RecurringDetailsOneOf2.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (RecurringDetailsOneOf2.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(RecurringDetailsOneOf2.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'RecurringDetailsOneOf2'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'RecurringDetailsOneOf2'", e);
            }

            // deserialize RecurringDetailsOneOf3
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (RecurringDetailsOneOf3.class.equals(Integer.class) || RecurringDetailsOneOf3.class.equals(Long.class) || RecurringDetailsOneOf3.class.equals(Float.class) || RecurringDetailsOneOf3.class.equals(Double.class) || RecurringDetailsOneOf3.class.equals(Boolean.class) || RecurringDetailsOneOf3.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((RecurringDetailsOneOf3.class.equals(Integer.class) || RecurringDetailsOneOf3.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((RecurringDetailsOneOf3.class.equals(Float.class) || RecurringDetailsOneOf3.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (RecurringDetailsOneOf3.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (RecurringDetailsOneOf3.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(RecurringDetailsOneOf3.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'RecurringDetailsOneOf3'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'RecurringDetailsOneOf3'", e);
            }

            if (match == 1) {
                RecurringDetails ret = new RecurringDetails();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for RecurringDetails: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public RecurringDetails getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "RecurringDetails cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<>();

    public RecurringDetails() {
        super("oneOf", Boolean.FALSE);
    }

    public RecurringDetails(RecurringDetailsOneOf o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public RecurringDetails(RecurringDetailsOneOf1 o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public RecurringDetails(RecurringDetailsOneOf2 o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public RecurringDetails(RecurringDetailsOneOf3 o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("RecurringDetailsOneOf", RecurringDetailsOneOf.class);
        schemas.put("RecurringDetailsOneOf1", RecurringDetailsOneOf1.class);
        schemas.put("RecurringDetailsOneOf2", RecurringDetailsOneOf2.class);
        schemas.put("RecurringDetailsOneOf3", RecurringDetailsOneOf3.class);
        JSON.registerDescendants(RecurringDetails.class, Collections.unmodifiableMap(schemas));
        // Initialize and register the discriminator mappings.
        Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
        mappings.put("RecurringDetails_oneOf", RecurringDetailsOneOf.class);
        mappings.put("RecurringDetails_oneOf_1", RecurringDetailsOneOf1.class);
        mappings.put("RecurringDetails_oneOf_2", RecurringDetailsOneOf2.class);
        mappings.put("RecurringDetails_oneOf_3", RecurringDetailsOneOf3.class);
        mappings.put("RecurringDetails", RecurringDetails.class);
        JSON.registerDiscriminator(RecurringDetails.class, "type", mappings);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return RecurringDetails.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * RecurringDetailsOneOf, RecurringDetailsOneOf1, RecurringDetailsOneOf2, RecurringDetailsOneOf3
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(RecurringDetailsOneOf.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(RecurringDetailsOneOf1.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(RecurringDetailsOneOf2.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(RecurringDetailsOneOf3.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be RecurringDetailsOneOf, RecurringDetailsOneOf1, RecurringDetailsOneOf2, RecurringDetailsOneOf3");
    }

    /**
     * Get the actual instance, which can be the following:
     * RecurringDetailsOneOf, RecurringDetailsOneOf1, RecurringDetailsOneOf2, RecurringDetailsOneOf3
     *
     * @return The actual instance (RecurringDetailsOneOf, RecurringDetailsOneOf1, RecurringDetailsOneOf2, RecurringDetailsOneOf3)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `RecurringDetailsOneOf`. If the actual instance is not `RecurringDetailsOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RecurringDetailsOneOf`
     * @throws ClassCastException if the instance is not `RecurringDetailsOneOf`
     */
    public RecurringDetailsOneOf getRecurringDetailsOneOf() throws ClassCastException {
        return (RecurringDetailsOneOf)super.getActualInstance();
    }

    /**
     * Get the actual instance of `RecurringDetailsOneOf1`. If the actual instance is not `RecurringDetailsOneOf1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RecurringDetailsOneOf1`
     * @throws ClassCastException if the instance is not `RecurringDetailsOneOf1`
     */
    public RecurringDetailsOneOf1 getRecurringDetailsOneOf1() throws ClassCastException {
        return (RecurringDetailsOneOf1)super.getActualInstance();
    }

    /**
     * Get the actual instance of `RecurringDetailsOneOf2`. If the actual instance is not `RecurringDetailsOneOf2`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RecurringDetailsOneOf2`
     * @throws ClassCastException if the instance is not `RecurringDetailsOneOf2`
     */
    public RecurringDetailsOneOf2 getRecurringDetailsOneOf2() throws ClassCastException {
        return (RecurringDetailsOneOf2)super.getActualInstance();
    }

    /**
     * Get the actual instance of `RecurringDetailsOneOf3`. If the actual instance is not `RecurringDetailsOneOf3`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RecurringDetailsOneOf3`
     * @throws ClassCastException if the instance is not `RecurringDetailsOneOf3`
     */
    public RecurringDetailsOneOf3 getRecurringDetailsOneOf3() throws ClassCastException {
        return (RecurringDetailsOneOf3)super.getActualInstance();
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

    if (getActualInstance() instanceof RecurringDetailsOneOf) {
        if (getActualInstance() != null) {
          joiner.add(((RecurringDetailsOneOf)getActualInstance()).toUrlQueryString(prefix + "one_of_0" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof RecurringDetailsOneOf1) {
        if (getActualInstance() != null) {
          joiner.add(((RecurringDetailsOneOf1)getActualInstance()).toUrlQueryString(prefix + "one_of_1" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof RecurringDetailsOneOf2) {
        if (getActualInstance() != null) {
          joiner.add(((RecurringDetailsOneOf2)getActualInstance()).toUrlQueryString(prefix + "one_of_2" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof RecurringDetailsOneOf3) {
        if (getActualInstance() != null) {
          joiner.add(((RecurringDetailsOneOf3)getActualInstance()).toUrlQueryString(prefix + "one_of_3" + suffix));
        }
        return joiner.toString();
    }
    return null;
  }

}

