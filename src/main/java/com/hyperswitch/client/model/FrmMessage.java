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


package com.hyperswitch.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * frm message is an object sent inside the payments response...when frm is invoked, its value is Some(...), else its None
 */
@JsonPropertyOrder({
  FrmMessage.JSON_PROPERTY_FRM_NAME,
  FrmMessage.JSON_PROPERTY_FRM_TRANSACTION_ID,
  FrmMessage.JSON_PROPERTY_FRM_TRANSACTION_TYPE,
  FrmMessage.JSON_PROPERTY_FRM_STATUS,
  FrmMessage.JSON_PROPERTY_FRM_SCORE,
  FrmMessage.JSON_PROPERTY_FRM_REASON,
  FrmMessage.JSON_PROPERTY_FRM_ERROR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class FrmMessage {
  public static final String JSON_PROPERTY_FRM_NAME = "frm_name";
  @javax.annotation.Nonnull
  private String frmName;

  public static final String JSON_PROPERTY_FRM_TRANSACTION_ID = "frm_transaction_id";
  @javax.annotation.Nullable
  private JsonNullable<String> frmTransactionId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FRM_TRANSACTION_TYPE = "frm_transaction_type";
  @javax.annotation.Nullable
  private JsonNullable<String> frmTransactionType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FRM_STATUS = "frm_status";
  @javax.annotation.Nullable
  private JsonNullable<String> frmStatus = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FRM_SCORE = "frm_score";
  @javax.annotation.Nullable
  private JsonNullable<Integer> frmScore = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_FRM_REASON = "frm_reason";
  @javax.annotation.Nullable
  private JsonNullable<Object> frmReason = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_FRM_ERROR = "frm_error";
  @javax.annotation.Nullable
  private JsonNullable<String> frmError = JsonNullable.<String>undefined();

  public FrmMessage() {
  }

  public FrmMessage frmName(@javax.annotation.Nonnull String frmName) {
    
    this.frmName = frmName;
    return this;
  }

  /**
   * Get frmName
   * @return frmName
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FRM_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFrmName() {
    return frmName;
  }


  @JsonProperty(JSON_PROPERTY_FRM_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFrmName(@javax.annotation.Nonnull String frmName) {
    this.frmName = frmName;
  }

  public FrmMessage frmTransactionId(@javax.annotation.Nullable String frmTransactionId) {
    this.frmTransactionId = JsonNullable.<String>of(frmTransactionId);
    
    return this;
  }

  /**
   * Get frmTransactionId
   * @return frmTransactionId
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getFrmTransactionId() {
        return frmTransactionId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FRM_TRANSACTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFrmTransactionId_JsonNullable() {
    return frmTransactionId;
  }
  
  @JsonProperty(JSON_PROPERTY_FRM_TRANSACTION_ID)
  public void setFrmTransactionId_JsonNullable(JsonNullable<String> frmTransactionId) {
    this.frmTransactionId = frmTransactionId;
  }

  public void setFrmTransactionId(@javax.annotation.Nullable String frmTransactionId) {
    this.frmTransactionId = JsonNullable.<String>of(frmTransactionId);
  }

  public FrmMessage frmTransactionType(@javax.annotation.Nullable String frmTransactionType) {
    this.frmTransactionType = JsonNullable.<String>of(frmTransactionType);
    
    return this;
  }

  /**
   * Get frmTransactionType
   * @return frmTransactionType
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getFrmTransactionType() {
        return frmTransactionType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FRM_TRANSACTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFrmTransactionType_JsonNullable() {
    return frmTransactionType;
  }
  
  @JsonProperty(JSON_PROPERTY_FRM_TRANSACTION_TYPE)
  public void setFrmTransactionType_JsonNullable(JsonNullable<String> frmTransactionType) {
    this.frmTransactionType = frmTransactionType;
  }

  public void setFrmTransactionType(@javax.annotation.Nullable String frmTransactionType) {
    this.frmTransactionType = JsonNullable.<String>of(frmTransactionType);
  }

  public FrmMessage frmStatus(@javax.annotation.Nullable String frmStatus) {
    this.frmStatus = JsonNullable.<String>of(frmStatus);
    
    return this;
  }

  /**
   * Get frmStatus
   * @return frmStatus
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getFrmStatus() {
        return frmStatus.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FRM_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFrmStatus_JsonNullable() {
    return frmStatus;
  }
  
  @JsonProperty(JSON_PROPERTY_FRM_STATUS)
  public void setFrmStatus_JsonNullable(JsonNullable<String> frmStatus) {
    this.frmStatus = frmStatus;
  }

  public void setFrmStatus(@javax.annotation.Nullable String frmStatus) {
    this.frmStatus = JsonNullable.<String>of(frmStatus);
  }

  public FrmMessage frmScore(@javax.annotation.Nullable Integer frmScore) {
    this.frmScore = JsonNullable.<Integer>of(frmScore);
    
    return this;
  }

  /**
   * Get frmScore
   * @return frmScore
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Integer getFrmScore() {
        return frmScore.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FRM_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getFrmScore_JsonNullable() {
    return frmScore;
  }
  
  @JsonProperty(JSON_PROPERTY_FRM_SCORE)
  public void setFrmScore_JsonNullable(JsonNullable<Integer> frmScore) {
    this.frmScore = frmScore;
  }

  public void setFrmScore(@javax.annotation.Nullable Integer frmScore) {
    this.frmScore = JsonNullable.<Integer>of(frmScore);
  }

  public FrmMessage frmReason(@javax.annotation.Nullable Object frmReason) {
    this.frmReason = JsonNullable.<Object>of(frmReason);
    
    return this;
  }

  /**
   * Get frmReason
   * @return frmReason
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getFrmReason() {
        return frmReason.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FRM_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getFrmReason_JsonNullable() {
    return frmReason;
  }
  
  @JsonProperty(JSON_PROPERTY_FRM_REASON)
  public void setFrmReason_JsonNullable(JsonNullable<Object> frmReason) {
    this.frmReason = frmReason;
  }

  public void setFrmReason(@javax.annotation.Nullable Object frmReason) {
    this.frmReason = JsonNullable.<Object>of(frmReason);
  }

  public FrmMessage frmError(@javax.annotation.Nullable String frmError) {
    this.frmError = JsonNullable.<String>of(frmError);
    
    return this;
  }

  /**
   * Get frmError
   * @return frmError
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getFrmError() {
        return frmError.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FRM_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFrmError_JsonNullable() {
    return frmError;
  }
  
  @JsonProperty(JSON_PROPERTY_FRM_ERROR)
  public void setFrmError_JsonNullable(JsonNullable<String> frmError) {
    this.frmError = frmError;
  }

  public void setFrmError(@javax.annotation.Nullable String frmError) {
    this.frmError = JsonNullable.<String>of(frmError);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FrmMessage frmMessage = (FrmMessage) o;
    return Objects.equals(this.frmName, frmMessage.frmName) &&
        equalsNullable(this.frmTransactionId, frmMessage.frmTransactionId) &&
        equalsNullable(this.frmTransactionType, frmMessage.frmTransactionType) &&
        equalsNullable(this.frmStatus, frmMessage.frmStatus) &&
        equalsNullable(this.frmScore, frmMessage.frmScore) &&
        equalsNullable(this.frmReason, frmMessage.frmReason) &&
        equalsNullable(this.frmError, frmMessage.frmError);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(frmName, hashCodeNullable(frmTransactionId), hashCodeNullable(frmTransactionType), hashCodeNullable(frmStatus), hashCodeNullable(frmScore), hashCodeNullable(frmReason), hashCodeNullable(frmError));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FrmMessage {\n");
    sb.append("    frmName: ").append(toIndentedString(frmName)).append("\n");
    sb.append("    frmTransactionId: ").append(toIndentedString(frmTransactionId)).append("\n");
    sb.append("    frmTransactionType: ").append(toIndentedString(frmTransactionType)).append("\n");
    sb.append("    frmStatus: ").append(toIndentedString(frmStatus)).append("\n");
    sb.append("    frmScore: ").append(toIndentedString(frmScore)).append("\n");
    sb.append("    frmReason: ").append(toIndentedString(frmReason)).append("\n");
    sb.append("    frmError: ").append(toIndentedString(frmError)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
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

    // add `frm_name` to the URL query string
    if (getFrmName() != null) {
      try {
        joiner.add(String.format("%sfrm_name%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFrmName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `frm_transaction_id` to the URL query string
    if (getFrmTransactionId() != null) {
      try {
        joiner.add(String.format("%sfrm_transaction_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFrmTransactionId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `frm_transaction_type` to the URL query string
    if (getFrmTransactionType() != null) {
      try {
        joiner.add(String.format("%sfrm_transaction_type%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFrmTransactionType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `frm_status` to the URL query string
    if (getFrmStatus() != null) {
      try {
        joiner.add(String.format("%sfrm_status%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFrmStatus()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `frm_score` to the URL query string
    if (getFrmScore() != null) {
      try {
        joiner.add(String.format("%sfrm_score%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFrmScore()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `frm_reason` to the URL query string
    if (getFrmReason() != null) {
      try {
        joiner.add(String.format("%sfrm_reason%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFrmReason()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `frm_error` to the URL query string
    if (getFrmError() != null) {
      try {
        joiner.add(String.format("%sfrm_error%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFrmError()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

