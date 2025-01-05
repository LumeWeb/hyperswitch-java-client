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
import com.hyperswitch.model.Bank;
import com.hyperswitch.model.CardPayout;
import com.hyperswitch.model.PayoutMethodDataOneOf;
import com.hyperswitch.model.PayoutMethodDataOneOf1;
import com.hyperswitch.model.PayoutMethodDataOneOf2;
import com.hyperswitch.model.Wallet;
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
@JsonDeserialize(using = PayoutMethodData.PayoutMethodDataDeserializer.class)
@JsonSerialize(using = PayoutMethodData.PayoutMethodDataSerializer.class)
public class PayoutMethodData extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(PayoutMethodData.class.getName());

    public static class PayoutMethodDataSerializer extends StdSerializer<PayoutMethodData> {
        public PayoutMethodDataSerializer(Class<PayoutMethodData> t) {
            super(t);
        }

        public PayoutMethodDataSerializer() {
            this(null);
        }

        @Override
        public void serialize(PayoutMethodData value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class PayoutMethodDataDeserializer extends StdDeserializer<PayoutMethodData> {
        public PayoutMethodDataDeserializer() {
            this(PayoutMethodData.class);
        }

        public PayoutMethodDataDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public PayoutMethodData deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize PayoutMethodDataOneOf
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (PayoutMethodDataOneOf.class.equals(Integer.class) || PayoutMethodDataOneOf.class.equals(Long.class) || PayoutMethodDataOneOf.class.equals(Float.class) || PayoutMethodDataOneOf.class.equals(Double.class) || PayoutMethodDataOneOf.class.equals(Boolean.class) || PayoutMethodDataOneOf.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((PayoutMethodDataOneOf.class.equals(Integer.class) || PayoutMethodDataOneOf.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((PayoutMethodDataOneOf.class.equals(Float.class) || PayoutMethodDataOneOf.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (PayoutMethodDataOneOf.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (PayoutMethodDataOneOf.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(PayoutMethodDataOneOf.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'PayoutMethodDataOneOf'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'PayoutMethodDataOneOf'", e);
            }

            // deserialize PayoutMethodDataOneOf1
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (PayoutMethodDataOneOf1.class.equals(Integer.class) || PayoutMethodDataOneOf1.class.equals(Long.class) || PayoutMethodDataOneOf1.class.equals(Float.class) || PayoutMethodDataOneOf1.class.equals(Double.class) || PayoutMethodDataOneOf1.class.equals(Boolean.class) || PayoutMethodDataOneOf1.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((PayoutMethodDataOneOf1.class.equals(Integer.class) || PayoutMethodDataOneOf1.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((PayoutMethodDataOneOf1.class.equals(Float.class) || PayoutMethodDataOneOf1.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (PayoutMethodDataOneOf1.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (PayoutMethodDataOneOf1.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(PayoutMethodDataOneOf1.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'PayoutMethodDataOneOf1'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'PayoutMethodDataOneOf1'", e);
            }

            // deserialize PayoutMethodDataOneOf2
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (PayoutMethodDataOneOf2.class.equals(Integer.class) || PayoutMethodDataOneOf2.class.equals(Long.class) || PayoutMethodDataOneOf2.class.equals(Float.class) || PayoutMethodDataOneOf2.class.equals(Double.class) || PayoutMethodDataOneOf2.class.equals(Boolean.class) || PayoutMethodDataOneOf2.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((PayoutMethodDataOneOf2.class.equals(Integer.class) || PayoutMethodDataOneOf2.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((PayoutMethodDataOneOf2.class.equals(Float.class) || PayoutMethodDataOneOf2.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (PayoutMethodDataOneOf2.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (PayoutMethodDataOneOf2.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(PayoutMethodDataOneOf2.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'PayoutMethodDataOneOf2'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'PayoutMethodDataOneOf2'", e);
            }

            if (match == 1) {
                PayoutMethodData ret = new PayoutMethodData();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for PayoutMethodData: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public PayoutMethodData getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "PayoutMethodData cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<>();

    public PayoutMethodData() {
        super("oneOf", Boolean.FALSE);
    }

    public PayoutMethodData(PayoutMethodDataOneOf o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public PayoutMethodData(PayoutMethodDataOneOf1 o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public PayoutMethodData(PayoutMethodDataOneOf2 o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("PayoutMethodDataOneOf", PayoutMethodDataOneOf.class);
        schemas.put("PayoutMethodDataOneOf1", PayoutMethodDataOneOf1.class);
        schemas.put("PayoutMethodDataOneOf2", PayoutMethodDataOneOf2.class);
        JSON.registerDescendants(PayoutMethodData.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return PayoutMethodData.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * PayoutMethodDataOneOf, PayoutMethodDataOneOf1, PayoutMethodDataOneOf2
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(PayoutMethodDataOneOf.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(PayoutMethodDataOneOf1.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(PayoutMethodDataOneOf2.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be PayoutMethodDataOneOf, PayoutMethodDataOneOf1, PayoutMethodDataOneOf2");
    }

    /**
     * Get the actual instance, which can be the following:
     * PayoutMethodDataOneOf, PayoutMethodDataOneOf1, PayoutMethodDataOneOf2
     *
     * @return The actual instance (PayoutMethodDataOneOf, PayoutMethodDataOneOf1, PayoutMethodDataOneOf2)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `PayoutMethodDataOneOf`. If the actual instance is not `PayoutMethodDataOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PayoutMethodDataOneOf`
     * @throws ClassCastException if the instance is not `PayoutMethodDataOneOf`
     */
    public PayoutMethodDataOneOf getPayoutMethodDataOneOf() throws ClassCastException {
        return (PayoutMethodDataOneOf)super.getActualInstance();
    }

    /**
     * Get the actual instance of `PayoutMethodDataOneOf1`. If the actual instance is not `PayoutMethodDataOneOf1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PayoutMethodDataOneOf1`
     * @throws ClassCastException if the instance is not `PayoutMethodDataOneOf1`
     */
    public PayoutMethodDataOneOf1 getPayoutMethodDataOneOf1() throws ClassCastException {
        return (PayoutMethodDataOneOf1)super.getActualInstance();
    }

    /**
     * Get the actual instance of `PayoutMethodDataOneOf2`. If the actual instance is not `PayoutMethodDataOneOf2`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PayoutMethodDataOneOf2`
     * @throws ClassCastException if the instance is not `PayoutMethodDataOneOf2`
     */
    public PayoutMethodDataOneOf2 getPayoutMethodDataOneOf2() throws ClassCastException {
        return (PayoutMethodDataOneOf2)super.getActualInstance();
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

    if (getActualInstance() instanceof PayoutMethodDataOneOf) {
        if (getActualInstance() != null) {
          joiner.add(((PayoutMethodDataOneOf)getActualInstance()).toUrlQueryString(prefix + "one_of_0" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof PayoutMethodDataOneOf1) {
        if (getActualInstance() != null) {
          joiner.add(((PayoutMethodDataOneOf1)getActualInstance()).toUrlQueryString(prefix + "one_of_1" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof PayoutMethodDataOneOf2) {
        if (getActualInstance() != null) {
          joiner.add(((PayoutMethodDataOneOf2)getActualInstance()).toUrlQueryString(prefix + "one_of_2" + suffix));
        }
        return joiner.toString();
    }
    return null;
  }

}

