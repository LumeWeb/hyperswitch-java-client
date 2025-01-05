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
import com.lumeweb.hyperswitch.model.BlocklistRequestOneOf;
import com.lumeweb.hyperswitch.model.BlocklistRequestOneOf1;
import com.lumeweb.hyperswitch.model.BlocklistRequestOneOf2;
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
@JsonDeserialize(using = BlocklistRequest.BlocklistRequestDeserializer.class)
@JsonSerialize(using = BlocklistRequest.BlocklistRequestSerializer.class)
public class BlocklistRequest extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(BlocklistRequest.class.getName());

    public static class BlocklistRequestSerializer extends StdSerializer<BlocklistRequest> {
        public BlocklistRequestSerializer(Class<BlocklistRequest> t) {
            super(t);
        }

        public BlocklistRequestSerializer() {
            this(null);
        }

        @Override
        public void serialize(BlocklistRequest value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class BlocklistRequestDeserializer extends StdDeserializer<BlocklistRequest> {
        public BlocklistRequestDeserializer() {
            this(BlocklistRequest.class);
        }

        public BlocklistRequestDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public BlocklistRequest deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize BlocklistRequestOneOf
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (BlocklistRequestOneOf.class.equals(Integer.class) || BlocklistRequestOneOf.class.equals(Long.class) || BlocklistRequestOneOf.class.equals(Float.class) || BlocklistRequestOneOf.class.equals(Double.class) || BlocklistRequestOneOf.class.equals(Boolean.class) || BlocklistRequestOneOf.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((BlocklistRequestOneOf.class.equals(Integer.class) || BlocklistRequestOneOf.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((BlocklistRequestOneOf.class.equals(Float.class) || BlocklistRequestOneOf.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (BlocklistRequestOneOf.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (BlocklistRequestOneOf.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(BlocklistRequestOneOf.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'BlocklistRequestOneOf'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'BlocklistRequestOneOf'", e);
            }

            // deserialize BlocklistRequestOneOf1
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (BlocklistRequestOneOf1.class.equals(Integer.class) || BlocklistRequestOneOf1.class.equals(Long.class) || BlocklistRequestOneOf1.class.equals(Float.class) || BlocklistRequestOneOf1.class.equals(Double.class) || BlocklistRequestOneOf1.class.equals(Boolean.class) || BlocklistRequestOneOf1.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((BlocklistRequestOneOf1.class.equals(Integer.class) || BlocklistRequestOneOf1.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((BlocklistRequestOneOf1.class.equals(Float.class) || BlocklistRequestOneOf1.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (BlocklistRequestOneOf1.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (BlocklistRequestOneOf1.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(BlocklistRequestOneOf1.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'BlocklistRequestOneOf1'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'BlocklistRequestOneOf1'", e);
            }

            // deserialize BlocklistRequestOneOf2
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (BlocklistRequestOneOf2.class.equals(Integer.class) || BlocklistRequestOneOf2.class.equals(Long.class) || BlocklistRequestOneOf2.class.equals(Float.class) || BlocklistRequestOneOf2.class.equals(Double.class) || BlocklistRequestOneOf2.class.equals(Boolean.class) || BlocklistRequestOneOf2.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((BlocklistRequestOneOf2.class.equals(Integer.class) || BlocklistRequestOneOf2.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((BlocklistRequestOneOf2.class.equals(Float.class) || BlocklistRequestOneOf2.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (BlocklistRequestOneOf2.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (BlocklistRequestOneOf2.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(BlocklistRequestOneOf2.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'BlocklistRequestOneOf2'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'BlocklistRequestOneOf2'", e);
            }

            if (match == 1) {
                BlocklistRequest ret = new BlocklistRequest();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for BlocklistRequest: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public BlocklistRequest getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "BlocklistRequest cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<>();

    public BlocklistRequest() {
        super("oneOf", Boolean.FALSE);
    }

    public BlocklistRequest(BlocklistRequestOneOf o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public BlocklistRequest(BlocklistRequestOneOf1 o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public BlocklistRequest(BlocklistRequestOneOf2 o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("BlocklistRequestOneOf", BlocklistRequestOneOf.class);
        schemas.put("BlocklistRequestOneOf1", BlocklistRequestOneOf1.class);
        schemas.put("BlocklistRequestOneOf2", BlocklistRequestOneOf2.class);
        JSON.registerDescendants(BlocklistRequest.class, Collections.unmodifiableMap(schemas));
        // Initialize and register the discriminator mappings.
        Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
        mappings.put("BlocklistRequest_oneOf", BlocklistRequestOneOf.class);
        mappings.put("BlocklistRequest_oneOf_1", BlocklistRequestOneOf1.class);
        mappings.put("BlocklistRequest_oneOf_2", BlocklistRequestOneOf2.class);
        mappings.put("BlocklistRequest", BlocklistRequest.class);
        JSON.registerDiscriminator(BlocklistRequest.class, "type", mappings);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return BlocklistRequest.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * BlocklistRequestOneOf, BlocklistRequestOneOf1, BlocklistRequestOneOf2
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(BlocklistRequestOneOf.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(BlocklistRequestOneOf1.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(BlocklistRequestOneOf2.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be BlocklistRequestOneOf, BlocklistRequestOneOf1, BlocklistRequestOneOf2");
    }

    /**
     * Get the actual instance, which can be the following:
     * BlocklistRequestOneOf, BlocklistRequestOneOf1, BlocklistRequestOneOf2
     *
     * @return The actual instance (BlocklistRequestOneOf, BlocklistRequestOneOf1, BlocklistRequestOneOf2)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `BlocklistRequestOneOf`. If the actual instance is not `BlocklistRequestOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `BlocklistRequestOneOf`
     * @throws ClassCastException if the instance is not `BlocklistRequestOneOf`
     */
    public BlocklistRequestOneOf getBlocklistRequestOneOf() throws ClassCastException {
        return (BlocklistRequestOneOf)super.getActualInstance();
    }

    /**
     * Get the actual instance of `BlocklistRequestOneOf1`. If the actual instance is not `BlocklistRequestOneOf1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `BlocklistRequestOneOf1`
     * @throws ClassCastException if the instance is not `BlocklistRequestOneOf1`
     */
    public BlocklistRequestOneOf1 getBlocklistRequestOneOf1() throws ClassCastException {
        return (BlocklistRequestOneOf1)super.getActualInstance();
    }

    /**
     * Get the actual instance of `BlocklistRequestOneOf2`. If the actual instance is not `BlocklistRequestOneOf2`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `BlocklistRequestOneOf2`
     * @throws ClassCastException if the instance is not `BlocklistRequestOneOf2`
     */
    public BlocklistRequestOneOf2 getBlocklistRequestOneOf2() throws ClassCastException {
        return (BlocklistRequestOneOf2)super.getActualInstance();
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

    if (getActualInstance() instanceof BlocklistRequestOneOf) {
        if (getActualInstance() != null) {
          joiner.add(((BlocklistRequestOneOf)getActualInstance()).toUrlQueryString(prefix + "one_of_0" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof BlocklistRequestOneOf1) {
        if (getActualInstance() != null) {
          joiner.add(((BlocklistRequestOneOf1)getActualInstance()).toUrlQueryString(prefix + "one_of_1" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof BlocklistRequestOneOf2) {
        if (getActualInstance() != null) {
          joiner.add(((BlocklistRequestOneOf2)getActualInstance()).toUrlQueryString(prefix + "one_of_2" + suffix));
        }
        return joiner.toString();
    }
    return null;
  }

}

