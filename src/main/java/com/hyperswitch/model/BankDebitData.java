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
import com.hyperswitch.model.BankDebitDataOneOf;
import com.hyperswitch.model.BankDebitDataOneOf1;
import com.hyperswitch.model.BankDebitDataOneOf1SepaBankDebit;
import com.hyperswitch.model.BankDebitDataOneOf2;
import com.hyperswitch.model.BankDebitDataOneOf2BecsBankDebit;
import com.hyperswitch.model.BankDebitDataOneOf3;
import com.hyperswitch.model.BankDebitDataOneOf3BacsBankDebit;
import com.hyperswitch.model.BankDebitDataOneOfAchBankDebit;
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
@JsonDeserialize(using = BankDebitData.BankDebitDataDeserializer.class)
@JsonSerialize(using = BankDebitData.BankDebitDataSerializer.class)
public class BankDebitData extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(BankDebitData.class.getName());

    public static class BankDebitDataSerializer extends StdSerializer<BankDebitData> {
        public BankDebitDataSerializer(Class<BankDebitData> t) {
            super(t);
        }

        public BankDebitDataSerializer() {
            this(null);
        }

        @Override
        public void serialize(BankDebitData value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class BankDebitDataDeserializer extends StdDeserializer<BankDebitData> {
        public BankDebitDataDeserializer() {
            this(BankDebitData.class);
        }

        public BankDebitDataDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public BankDebitData deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize BankDebitDataOneOf
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (BankDebitDataOneOf.class.equals(Integer.class) || BankDebitDataOneOf.class.equals(Long.class) || BankDebitDataOneOf.class.equals(Float.class) || BankDebitDataOneOf.class.equals(Double.class) || BankDebitDataOneOf.class.equals(Boolean.class) || BankDebitDataOneOf.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((BankDebitDataOneOf.class.equals(Integer.class) || BankDebitDataOneOf.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((BankDebitDataOneOf.class.equals(Float.class) || BankDebitDataOneOf.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (BankDebitDataOneOf.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (BankDebitDataOneOf.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(BankDebitDataOneOf.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'BankDebitDataOneOf'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'BankDebitDataOneOf'", e);
            }

            // deserialize BankDebitDataOneOf1
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (BankDebitDataOneOf1.class.equals(Integer.class) || BankDebitDataOneOf1.class.equals(Long.class) || BankDebitDataOneOf1.class.equals(Float.class) || BankDebitDataOneOf1.class.equals(Double.class) || BankDebitDataOneOf1.class.equals(Boolean.class) || BankDebitDataOneOf1.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((BankDebitDataOneOf1.class.equals(Integer.class) || BankDebitDataOneOf1.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((BankDebitDataOneOf1.class.equals(Float.class) || BankDebitDataOneOf1.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (BankDebitDataOneOf1.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (BankDebitDataOneOf1.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(BankDebitDataOneOf1.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'BankDebitDataOneOf1'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'BankDebitDataOneOf1'", e);
            }

            // deserialize BankDebitDataOneOf2
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (BankDebitDataOneOf2.class.equals(Integer.class) || BankDebitDataOneOf2.class.equals(Long.class) || BankDebitDataOneOf2.class.equals(Float.class) || BankDebitDataOneOf2.class.equals(Double.class) || BankDebitDataOneOf2.class.equals(Boolean.class) || BankDebitDataOneOf2.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((BankDebitDataOneOf2.class.equals(Integer.class) || BankDebitDataOneOf2.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((BankDebitDataOneOf2.class.equals(Float.class) || BankDebitDataOneOf2.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (BankDebitDataOneOf2.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (BankDebitDataOneOf2.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(BankDebitDataOneOf2.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'BankDebitDataOneOf2'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'BankDebitDataOneOf2'", e);
            }

            // deserialize BankDebitDataOneOf3
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (BankDebitDataOneOf3.class.equals(Integer.class) || BankDebitDataOneOf3.class.equals(Long.class) || BankDebitDataOneOf3.class.equals(Float.class) || BankDebitDataOneOf3.class.equals(Double.class) || BankDebitDataOneOf3.class.equals(Boolean.class) || BankDebitDataOneOf3.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((BankDebitDataOneOf3.class.equals(Integer.class) || BankDebitDataOneOf3.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((BankDebitDataOneOf3.class.equals(Float.class) || BankDebitDataOneOf3.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (BankDebitDataOneOf3.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (BankDebitDataOneOf3.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(BankDebitDataOneOf3.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'BankDebitDataOneOf3'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'BankDebitDataOneOf3'", e);
            }

            if (match == 1) {
                BankDebitData ret = new BankDebitData();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for BankDebitData: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public BankDebitData getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "BankDebitData cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<>();

    public BankDebitData() {
        super("oneOf", Boolean.FALSE);
    }

    public BankDebitData(BankDebitDataOneOf o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public BankDebitData(BankDebitDataOneOf1 o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public BankDebitData(BankDebitDataOneOf2 o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public BankDebitData(BankDebitDataOneOf3 o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("BankDebitDataOneOf", BankDebitDataOneOf.class);
        schemas.put("BankDebitDataOneOf1", BankDebitDataOneOf1.class);
        schemas.put("BankDebitDataOneOf2", BankDebitDataOneOf2.class);
        schemas.put("BankDebitDataOneOf3", BankDebitDataOneOf3.class);
        JSON.registerDescendants(BankDebitData.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return BankDebitData.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * BankDebitDataOneOf, BankDebitDataOneOf1, BankDebitDataOneOf2, BankDebitDataOneOf3
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(BankDebitDataOneOf.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(BankDebitDataOneOf1.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(BankDebitDataOneOf2.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(BankDebitDataOneOf3.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be BankDebitDataOneOf, BankDebitDataOneOf1, BankDebitDataOneOf2, BankDebitDataOneOf3");
    }

    /**
     * Get the actual instance, which can be the following:
     * BankDebitDataOneOf, BankDebitDataOneOf1, BankDebitDataOneOf2, BankDebitDataOneOf3
     *
     * @return The actual instance (BankDebitDataOneOf, BankDebitDataOneOf1, BankDebitDataOneOf2, BankDebitDataOneOf3)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `BankDebitDataOneOf`. If the actual instance is not `BankDebitDataOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `BankDebitDataOneOf`
     * @throws ClassCastException if the instance is not `BankDebitDataOneOf`
     */
    public BankDebitDataOneOf getBankDebitDataOneOf() throws ClassCastException {
        return (BankDebitDataOneOf)super.getActualInstance();
    }

    /**
     * Get the actual instance of `BankDebitDataOneOf1`. If the actual instance is not `BankDebitDataOneOf1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `BankDebitDataOneOf1`
     * @throws ClassCastException if the instance is not `BankDebitDataOneOf1`
     */
    public BankDebitDataOneOf1 getBankDebitDataOneOf1() throws ClassCastException {
        return (BankDebitDataOneOf1)super.getActualInstance();
    }

    /**
     * Get the actual instance of `BankDebitDataOneOf2`. If the actual instance is not `BankDebitDataOneOf2`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `BankDebitDataOneOf2`
     * @throws ClassCastException if the instance is not `BankDebitDataOneOf2`
     */
    public BankDebitDataOneOf2 getBankDebitDataOneOf2() throws ClassCastException {
        return (BankDebitDataOneOf2)super.getActualInstance();
    }

    /**
     * Get the actual instance of `BankDebitDataOneOf3`. If the actual instance is not `BankDebitDataOneOf3`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `BankDebitDataOneOf3`
     * @throws ClassCastException if the instance is not `BankDebitDataOneOf3`
     */
    public BankDebitDataOneOf3 getBankDebitDataOneOf3() throws ClassCastException {
        return (BankDebitDataOneOf3)super.getActualInstance();
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

    if (getActualInstance() instanceof BankDebitDataOneOf) {
        if (getActualInstance() != null) {
          joiner.add(((BankDebitDataOneOf)getActualInstance()).toUrlQueryString(prefix + "one_of_0" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof BankDebitDataOneOf1) {
        if (getActualInstance() != null) {
          joiner.add(((BankDebitDataOneOf1)getActualInstance()).toUrlQueryString(prefix + "one_of_1" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof BankDebitDataOneOf2) {
        if (getActualInstance() != null) {
          joiner.add(((BankDebitDataOneOf2)getActualInstance()).toUrlQueryString(prefix + "one_of_2" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof BankDebitDataOneOf3) {
        if (getActualInstance() != null) {
          joiner.add(((BankDebitDataOneOf3)getActualInstance()).toUrlQueryString(prefix + "one_of_3" + suffix));
        }
        return joiner.toString();
    }
    return null;
  }

}

