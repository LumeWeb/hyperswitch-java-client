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
import com.lumeweb.hyperswitch.model.FieldTypeOneOf;
import com.lumeweb.hyperswitch.model.FieldTypeOneOf1;
import com.lumeweb.hyperswitch.model.FieldTypeOneOf2;
import com.lumeweb.hyperswitch.model.FieldTypeOneOf3;
import com.lumeweb.hyperswitch.model.FieldTypeOneOf4;
import com.lumeweb.hyperswitch.model.FieldTypeOneOf5;
import com.lumeweb.hyperswitch.model.FieldTypeOneOfUserCountry;
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
import com.lumeweb.hyperswitch.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
@JsonDeserialize(using = FieldType.FieldTypeDeserializer.class)
@JsonSerialize(using = FieldType.FieldTypeSerializer.class)
public class FieldType extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(FieldType.class.getName());

    public static class FieldTypeSerializer extends StdSerializer<FieldType> {
        public FieldTypeSerializer(Class<FieldType> t) {
            super(t);
        }

        public FieldTypeSerializer() {
            this(null);
        }

        @Override
        public void serialize(FieldType value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class FieldTypeDeserializer extends StdDeserializer<FieldType> {
        public FieldTypeDeserializer() {
            this(FieldType.class);
        }

        public FieldTypeDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public FieldType deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize FieldTypeOneOf
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (FieldTypeOneOf.class.equals(Integer.class) || FieldTypeOneOf.class.equals(Long.class) || FieldTypeOneOf.class.equals(Float.class) || FieldTypeOneOf.class.equals(Double.class) || FieldTypeOneOf.class.equals(Boolean.class) || FieldTypeOneOf.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((FieldTypeOneOf.class.equals(Integer.class) || FieldTypeOneOf.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((FieldTypeOneOf.class.equals(Float.class) || FieldTypeOneOf.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (FieldTypeOneOf.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (FieldTypeOneOf.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(FieldTypeOneOf.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'FieldTypeOneOf'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'FieldTypeOneOf'", e);
            }

            // deserialize FieldTypeOneOf1
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (FieldTypeOneOf1.class.equals(Integer.class) || FieldTypeOneOf1.class.equals(Long.class) || FieldTypeOneOf1.class.equals(Float.class) || FieldTypeOneOf1.class.equals(Double.class) || FieldTypeOneOf1.class.equals(Boolean.class) || FieldTypeOneOf1.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((FieldTypeOneOf1.class.equals(Integer.class) || FieldTypeOneOf1.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((FieldTypeOneOf1.class.equals(Float.class) || FieldTypeOneOf1.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (FieldTypeOneOf1.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (FieldTypeOneOf1.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(FieldTypeOneOf1.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'FieldTypeOneOf1'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'FieldTypeOneOf1'", e);
            }

            // deserialize FieldTypeOneOf2
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (FieldTypeOneOf2.class.equals(Integer.class) || FieldTypeOneOf2.class.equals(Long.class) || FieldTypeOneOf2.class.equals(Float.class) || FieldTypeOneOf2.class.equals(Double.class) || FieldTypeOneOf2.class.equals(Boolean.class) || FieldTypeOneOf2.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((FieldTypeOneOf2.class.equals(Integer.class) || FieldTypeOneOf2.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((FieldTypeOneOf2.class.equals(Float.class) || FieldTypeOneOf2.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (FieldTypeOneOf2.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (FieldTypeOneOf2.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(FieldTypeOneOf2.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'FieldTypeOneOf2'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'FieldTypeOneOf2'", e);
            }

            // deserialize FieldTypeOneOf3
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (FieldTypeOneOf3.class.equals(Integer.class) || FieldTypeOneOf3.class.equals(Long.class) || FieldTypeOneOf3.class.equals(Float.class) || FieldTypeOneOf3.class.equals(Double.class) || FieldTypeOneOf3.class.equals(Boolean.class) || FieldTypeOneOf3.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((FieldTypeOneOf3.class.equals(Integer.class) || FieldTypeOneOf3.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((FieldTypeOneOf3.class.equals(Float.class) || FieldTypeOneOf3.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (FieldTypeOneOf3.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (FieldTypeOneOf3.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(FieldTypeOneOf3.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'FieldTypeOneOf3'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'FieldTypeOneOf3'", e);
            }

            // deserialize FieldTypeOneOf4
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (FieldTypeOneOf4.class.equals(Integer.class) || FieldTypeOneOf4.class.equals(Long.class) || FieldTypeOneOf4.class.equals(Float.class) || FieldTypeOneOf4.class.equals(Double.class) || FieldTypeOneOf4.class.equals(Boolean.class) || FieldTypeOneOf4.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((FieldTypeOneOf4.class.equals(Integer.class) || FieldTypeOneOf4.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((FieldTypeOneOf4.class.equals(Float.class) || FieldTypeOneOf4.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (FieldTypeOneOf4.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (FieldTypeOneOf4.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(FieldTypeOneOf4.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'FieldTypeOneOf4'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'FieldTypeOneOf4'", e);
            }

            // deserialize FieldTypeOneOf5
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (FieldTypeOneOf5.class.equals(Integer.class) || FieldTypeOneOf5.class.equals(Long.class) || FieldTypeOneOf5.class.equals(Float.class) || FieldTypeOneOf5.class.equals(Double.class) || FieldTypeOneOf5.class.equals(Boolean.class) || FieldTypeOneOf5.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((FieldTypeOneOf5.class.equals(Integer.class) || FieldTypeOneOf5.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((FieldTypeOneOf5.class.equals(Float.class) || FieldTypeOneOf5.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (FieldTypeOneOf5.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (FieldTypeOneOf5.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(FieldTypeOneOf5.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'FieldTypeOneOf5'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'FieldTypeOneOf5'", e);
            }

            // deserialize String
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (String.class.equals(Integer.class) || String.class.equals(Long.class) || String.class.equals(Float.class) || String.class.equals(Double.class) || String.class.equals(Boolean.class) || String.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((String.class.equals(Integer.class) || String.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((String.class.equals(Float.class) || String.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (String.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (String.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(String.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'String'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'String'", e);
            }

            if (match == 1) {
                FieldType ret = new FieldType();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for FieldType: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public FieldType getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "FieldType cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<>();

    public FieldType() {
        super("oneOf", Boolean.FALSE);
    }

    public FieldType(FieldTypeOneOf o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public FieldType(FieldTypeOneOf1 o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public FieldType(FieldTypeOneOf2 o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public FieldType(FieldTypeOneOf3 o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public FieldType(FieldTypeOneOf4 o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public FieldType(FieldTypeOneOf5 o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public FieldType(String o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("FieldTypeOneOf", FieldTypeOneOf.class);
        schemas.put("FieldTypeOneOf1", FieldTypeOneOf1.class);
        schemas.put("FieldTypeOneOf2", FieldTypeOneOf2.class);
        schemas.put("FieldTypeOneOf3", FieldTypeOneOf3.class);
        schemas.put("FieldTypeOneOf4", FieldTypeOneOf4.class);
        schemas.put("FieldTypeOneOf5", FieldTypeOneOf5.class);
        schemas.put("String", String.class);
        JSON.registerDescendants(FieldType.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return FieldType.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * FieldTypeOneOf, FieldTypeOneOf1, FieldTypeOneOf2, FieldTypeOneOf3, FieldTypeOneOf4, FieldTypeOneOf5, String
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(FieldTypeOneOf.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(FieldTypeOneOf1.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(FieldTypeOneOf2.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(FieldTypeOneOf3.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(FieldTypeOneOf4.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(FieldTypeOneOf5.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(String.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be FieldTypeOneOf, FieldTypeOneOf1, FieldTypeOneOf2, FieldTypeOneOf3, FieldTypeOneOf4, FieldTypeOneOf5, String");
    }

    /**
     * Get the actual instance, which can be the following:
     * FieldTypeOneOf, FieldTypeOneOf1, FieldTypeOneOf2, FieldTypeOneOf3, FieldTypeOneOf4, FieldTypeOneOf5, String
     *
     * @return The actual instance (FieldTypeOneOf, FieldTypeOneOf1, FieldTypeOneOf2, FieldTypeOneOf3, FieldTypeOneOf4, FieldTypeOneOf5, String)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `FieldTypeOneOf`. If the actual instance is not `FieldTypeOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FieldTypeOneOf`
     * @throws ClassCastException if the instance is not `FieldTypeOneOf`
     */
    public FieldTypeOneOf getFieldTypeOneOf() throws ClassCastException {
        return (FieldTypeOneOf)super.getActualInstance();
    }

    /**
     * Get the actual instance of `FieldTypeOneOf1`. If the actual instance is not `FieldTypeOneOf1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FieldTypeOneOf1`
     * @throws ClassCastException if the instance is not `FieldTypeOneOf1`
     */
    public FieldTypeOneOf1 getFieldTypeOneOf1() throws ClassCastException {
        return (FieldTypeOneOf1)super.getActualInstance();
    }

    /**
     * Get the actual instance of `FieldTypeOneOf2`. If the actual instance is not `FieldTypeOneOf2`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FieldTypeOneOf2`
     * @throws ClassCastException if the instance is not `FieldTypeOneOf2`
     */
    public FieldTypeOneOf2 getFieldTypeOneOf2() throws ClassCastException {
        return (FieldTypeOneOf2)super.getActualInstance();
    }

    /**
     * Get the actual instance of `FieldTypeOneOf3`. If the actual instance is not `FieldTypeOneOf3`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FieldTypeOneOf3`
     * @throws ClassCastException if the instance is not `FieldTypeOneOf3`
     */
    public FieldTypeOneOf3 getFieldTypeOneOf3() throws ClassCastException {
        return (FieldTypeOneOf3)super.getActualInstance();
    }

    /**
     * Get the actual instance of `FieldTypeOneOf4`. If the actual instance is not `FieldTypeOneOf4`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FieldTypeOneOf4`
     * @throws ClassCastException if the instance is not `FieldTypeOneOf4`
     */
    public FieldTypeOneOf4 getFieldTypeOneOf4() throws ClassCastException {
        return (FieldTypeOneOf4)super.getActualInstance();
    }

    /**
     * Get the actual instance of `FieldTypeOneOf5`. If the actual instance is not `FieldTypeOneOf5`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FieldTypeOneOf5`
     * @throws ClassCastException if the instance is not `FieldTypeOneOf5`
     */
    public FieldTypeOneOf5 getFieldTypeOneOf5() throws ClassCastException {
        return (FieldTypeOneOf5)super.getActualInstance();
    }

    /**
     * Get the actual instance of `String`. If the actual instance is not `String`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `String`
     * @throws ClassCastException if the instance is not `String`
     */
    public String getString() throws ClassCastException {
        return (String)super.getActualInstance();
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

    if (getActualInstance() instanceof String) {
        if (getActualInstance() != null) {
          joiner.add(String.format("%sone_of_0%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getActualInstance()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof FieldTypeOneOf) {
        if (getActualInstance() != null) {
          joiner.add(((FieldTypeOneOf)getActualInstance()).toUrlQueryString(prefix + "one_of_8" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof FieldTypeOneOf1) {
        if (getActualInstance() != null) {
          joiner.add(((FieldTypeOneOf1)getActualInstance()).toUrlQueryString(prefix + "one_of_9" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof FieldTypeOneOf2) {
        if (getActualInstance() != null) {
          joiner.add(((FieldTypeOneOf2)getActualInstance()).toUrlQueryString(prefix + "one_of_17" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof FieldTypeOneOf3) {
        if (getActualInstance() != null) {
          joiner.add(((FieldTypeOneOf3)getActualInstance()).toUrlQueryString(prefix + "one_of_24" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof FieldTypeOneOf4) {
        if (getActualInstance() != null) {
          joiner.add(((FieldTypeOneOf4)getActualInstance()).toUrlQueryString(prefix + "one_of_29" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof FieldTypeOneOf5) {
        if (getActualInstance() != null) {
          joiner.add(((FieldTypeOneOf5)getActualInstance()).toUrlQueryString(prefix + "one_of_32" + suffix));
        }
        return joiner.toString();
    }
    return null;
  }

}

