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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.hyperswitch.client.model.BankTransferNextStepsData;
import com.hyperswitch.client.model.MobilePaymentConsent;
import com.hyperswitch.client.model.NextActionDataOneOf;
import com.hyperswitch.client.model.NextActionDataOneOf1;
import com.hyperswitch.client.model.NextActionDataOneOf2;
import com.hyperswitch.client.model.NextActionDataOneOf3;
import com.hyperswitch.client.model.NextActionDataOneOf4;
import com.hyperswitch.client.model.NextActionDataOneOf5;
import com.hyperswitch.client.model.NextActionDataOneOf6;
import com.hyperswitch.client.model.NextActionDataOneOf7;
import com.hyperswitch.client.model.NextActionDataOneOf8;
import com.hyperswitch.client.model.NextActionDataOneOf9;
import com.hyperswitch.client.model.SdkNextActionData;
import com.hyperswitch.client.model.SessionToken;
import com.hyperswitch.client.model.ThreeDsData;
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
 * NextActionData
 */
@JsonPropertyOrder({
  NextActionData.JSON_PROPERTY_REDIRECT_TO_URL,
  NextActionData.JSON_PROPERTY_TYPE,
  NextActionData.JSON_PROPERTY_BANK_TRANSFER_STEPS_AND_CHARGES_DETAILS,
  NextActionData.JSON_PROPERTY_SESSION_TOKEN,
  NextActionData.JSON_PROPERTY_IMAGE_DATA_URL,
  NextActionData.JSON_PROPERTY_DISPLAY_TO_TIMESTAMP,
  NextActionData.JSON_PROPERTY_QR_CODE_URL,
  NextActionData.JSON_PROPERTY_QR_CODE_FETCH_URL,
  NextActionData.JSON_PROPERTY_VOUCHER_DETAILS,
  NextActionData.JSON_PROPERTY_DISPLAY_FROM_TIMESTAMP,
  NextActionData.JSON_PROPERTY_THREE_DS_DATA,
  NextActionData.JSON_PROPERTY_NEXT_ACTION_DATA,
  NextActionData.JSON_PROPERTY_CONSENT_DATA_REQUIRED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = NextActionDataOneOf.class, name = "NextActionData_oneOf"),
  @JsonSubTypes.Type(value = NextActionDataOneOf1.class, name = "NextActionData_oneOf_1"),
  @JsonSubTypes.Type(value = NextActionDataOneOf2.class, name = "NextActionData_oneOf_2"),
  @JsonSubTypes.Type(value = NextActionDataOneOf3.class, name = "NextActionData_oneOf_3"),
  @JsonSubTypes.Type(value = NextActionDataOneOf4.class, name = "NextActionData_oneOf_4"),
  @JsonSubTypes.Type(value = NextActionDataOneOf5.class, name = "NextActionData_oneOf_5"),
  @JsonSubTypes.Type(value = NextActionDataOneOf6.class, name = "NextActionData_oneOf_6"),
  @JsonSubTypes.Type(value = NextActionDataOneOf7.class, name = "NextActionData_oneOf_7"),
  @JsonSubTypes.Type(value = NextActionDataOneOf8.class, name = "NextActionData_oneOf_8"),
  @JsonSubTypes.Type(value = NextActionDataOneOf9.class, name = "NextActionData_oneOf_9"),
})

public class NextActionData {
  public static final String JSON_PROPERTY_REDIRECT_TO_URL = "redirect_to_url";
  private String redirectToUrl;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    COLLECT_OTP("collect_otp");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  protected TypeEnum type;

  public static final String JSON_PROPERTY_BANK_TRANSFER_STEPS_AND_CHARGES_DETAILS = "bank_transfer_steps_and_charges_details";
  private BankTransferNextStepsData bankTransferStepsAndChargesDetails;

  public static final String JSON_PROPERTY_SESSION_TOKEN = "session_token";
  private JsonNullable<SessionToken> sessionToken = JsonNullable.<SessionToken>undefined();

  public static final String JSON_PROPERTY_IMAGE_DATA_URL = "image_data_url";
  private String imageDataUrl;

  public static final String JSON_PROPERTY_DISPLAY_TO_TIMESTAMP = "display_to_timestamp";
  private JsonNullable<Integer> displayToTimestamp = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_QR_CODE_URL = "qr_code_url";
  private String qrCodeUrl;

  public static final String JSON_PROPERTY_QR_CODE_FETCH_URL = "qr_code_fetch_url";
  private String qrCodeFetchUrl;

  public static final String JSON_PROPERTY_VOUCHER_DETAILS = "voucher_details";
  private String voucherDetails;

  public static final String JSON_PROPERTY_DISPLAY_FROM_TIMESTAMP = "display_from_timestamp";
  private Integer displayFromTimestamp;

  public static final String JSON_PROPERTY_THREE_DS_DATA = "three_ds_data";
  private ThreeDsData threeDsData;

  public static final String JSON_PROPERTY_NEXT_ACTION_DATA = "next_action_data";
  private SdkNextActionData nextActionData;

  public static final String JSON_PROPERTY_CONSENT_DATA_REQUIRED = "consent_data_required";
  private MobilePaymentConsent consentDataRequired;

  public NextActionData() {
  }

  public NextActionData redirectToUrl(String redirectToUrl) {
    
    this.redirectToUrl = redirectToUrl;
    return this;
  }

   /**
   * Get redirectToUrl
   * @return redirectToUrl
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REDIRECT_TO_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRedirectToUrl() {
    return redirectToUrl;
  }


  @JsonProperty(JSON_PROPERTY_REDIRECT_TO_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRedirectToUrl(String redirectToUrl) {
    this.redirectToUrl = redirectToUrl;
  }


  public NextActionData type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public NextActionData bankTransferStepsAndChargesDetails(BankTransferNextStepsData bankTransferStepsAndChargesDetails) {
    
    this.bankTransferStepsAndChargesDetails = bankTransferStepsAndChargesDetails;
    return this;
  }

   /**
   * Get bankTransferStepsAndChargesDetails
   * @return bankTransferStepsAndChargesDetails
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BANK_TRANSFER_STEPS_AND_CHARGES_DETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BankTransferNextStepsData getBankTransferStepsAndChargesDetails() {
    return bankTransferStepsAndChargesDetails;
  }


  @JsonProperty(JSON_PROPERTY_BANK_TRANSFER_STEPS_AND_CHARGES_DETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBankTransferStepsAndChargesDetails(BankTransferNextStepsData bankTransferStepsAndChargesDetails) {
    this.bankTransferStepsAndChargesDetails = bankTransferStepsAndChargesDetails;
  }


  public NextActionData sessionToken(SessionToken sessionToken) {
    this.sessionToken = JsonNullable.<SessionToken>of(sessionToken);
    
    return this;
  }

   /**
   * Get sessionToken
   * @return sessionToken
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public SessionToken getSessionToken() {
        return sessionToken.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SESSION_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<SessionToken> getSessionToken_JsonNullable() {
    return sessionToken;
  }
  
  @JsonProperty(JSON_PROPERTY_SESSION_TOKEN)
  public void setSessionToken_JsonNullable(JsonNullable<SessionToken> sessionToken) {
    this.sessionToken = sessionToken;
  }

  public void setSessionToken(SessionToken sessionToken) {
    this.sessionToken = JsonNullable.<SessionToken>of(sessionToken);
  }


  public NextActionData imageDataUrl(String imageDataUrl) {
    
    this.imageDataUrl = imageDataUrl;
    return this;
  }

   /**
   * Hyperswitch generated image data source url
   * @return imageDataUrl
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IMAGE_DATA_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getImageDataUrl() {
    return imageDataUrl;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_DATA_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setImageDataUrl(String imageDataUrl) {
    this.imageDataUrl = imageDataUrl;
  }


  public NextActionData displayToTimestamp(Integer displayToTimestamp) {
    this.displayToTimestamp = JsonNullable.<Integer>of(displayToTimestamp);
    
    return this;
  }

   /**
   * Get displayToTimestamp
   * @return displayToTimestamp
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Integer getDisplayToTimestamp() {
        return displayToTimestamp.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DISPLAY_TO_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getDisplayToTimestamp_JsonNullable() {
    return displayToTimestamp;
  }
  
  @JsonProperty(JSON_PROPERTY_DISPLAY_TO_TIMESTAMP)
  public void setDisplayToTimestamp_JsonNullable(JsonNullable<Integer> displayToTimestamp) {
    this.displayToTimestamp = displayToTimestamp;
  }

  public void setDisplayToTimestamp(Integer displayToTimestamp) {
    this.displayToTimestamp = JsonNullable.<Integer>of(displayToTimestamp);
  }


  public NextActionData qrCodeUrl(String qrCodeUrl) {
    
    this.qrCodeUrl = qrCodeUrl;
    return this;
  }

   /**
   * The url for Qr code given by the connector
   * @return qrCodeUrl
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_QR_CODE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getQrCodeUrl() {
    return qrCodeUrl;
  }


  @JsonProperty(JSON_PROPERTY_QR_CODE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQrCodeUrl(String qrCodeUrl) {
    this.qrCodeUrl = qrCodeUrl;
  }


  public NextActionData qrCodeFetchUrl(String qrCodeFetchUrl) {
    
    this.qrCodeFetchUrl = qrCodeFetchUrl;
    return this;
  }

   /**
   * Get qrCodeFetchUrl
   * @return qrCodeFetchUrl
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_QR_CODE_FETCH_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getQrCodeFetchUrl() {
    return qrCodeFetchUrl;
  }


  @JsonProperty(JSON_PROPERTY_QR_CODE_FETCH_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQrCodeFetchUrl(String qrCodeFetchUrl) {
    this.qrCodeFetchUrl = qrCodeFetchUrl;
  }


  public NextActionData voucherDetails(String voucherDetails) {
    
    this.voucherDetails = voucherDetails;
    return this;
  }

   /**
   * Get voucherDetails
   * @return voucherDetails
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VOUCHER_DETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getVoucherDetails() {
    return voucherDetails;
  }


  @JsonProperty(JSON_PROPERTY_VOUCHER_DETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVoucherDetails(String voucherDetails) {
    this.voucherDetails = voucherDetails;
  }


  public NextActionData displayFromTimestamp(Integer displayFromTimestamp) {
    
    this.displayFromTimestamp = displayFromTimestamp;
    return this;
  }

   /**
   * Get displayFromTimestamp
   * @return displayFromTimestamp
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DISPLAY_FROM_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getDisplayFromTimestamp() {
    return displayFromTimestamp;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_FROM_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDisplayFromTimestamp(Integer displayFromTimestamp) {
    this.displayFromTimestamp = displayFromTimestamp;
  }


  public NextActionData threeDsData(ThreeDsData threeDsData) {
    
    this.threeDsData = threeDsData;
    return this;
  }

   /**
   * Get threeDsData
   * @return threeDsData
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_THREE_DS_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ThreeDsData getThreeDsData() {
    return threeDsData;
  }


  @JsonProperty(JSON_PROPERTY_THREE_DS_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setThreeDsData(ThreeDsData threeDsData) {
    this.threeDsData = threeDsData;
  }


  public NextActionData nextActionData(SdkNextActionData nextActionData) {
    
    this.nextActionData = nextActionData;
    return this;
  }

   /**
   * Get nextActionData
   * @return nextActionData
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NEXT_ACTION_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SdkNextActionData getNextActionData() {
    return nextActionData;
  }


  @JsonProperty(JSON_PROPERTY_NEXT_ACTION_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNextActionData(SdkNextActionData nextActionData) {
    this.nextActionData = nextActionData;
  }


  public NextActionData consentDataRequired(MobilePaymentConsent consentDataRequired) {
    
    this.consentDataRequired = consentDataRequired;
    return this;
  }

   /**
   * Get consentDataRequired
   * @return consentDataRequired
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONSENT_DATA_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public MobilePaymentConsent getConsentDataRequired() {
    return consentDataRequired;
  }


  @JsonProperty(JSON_PROPERTY_CONSENT_DATA_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConsentDataRequired(MobilePaymentConsent consentDataRequired) {
    this.consentDataRequired = consentDataRequired;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NextActionData nextActionData = (NextActionData) o;
    return Objects.equals(this.redirectToUrl, nextActionData.redirectToUrl) &&
        Objects.equals(this.type, nextActionData.type) &&
        Objects.equals(this.bankTransferStepsAndChargesDetails, nextActionData.bankTransferStepsAndChargesDetails) &&
        equalsNullable(this.sessionToken, nextActionData.sessionToken) &&
        Objects.equals(this.imageDataUrl, nextActionData.imageDataUrl) &&
        equalsNullable(this.displayToTimestamp, nextActionData.displayToTimestamp) &&
        Objects.equals(this.qrCodeUrl, nextActionData.qrCodeUrl) &&
        Objects.equals(this.qrCodeFetchUrl, nextActionData.qrCodeFetchUrl) &&
        Objects.equals(this.voucherDetails, nextActionData.voucherDetails) &&
        Objects.equals(this.displayFromTimestamp, nextActionData.displayFromTimestamp) &&
        Objects.equals(this.threeDsData, nextActionData.threeDsData) &&
        Objects.equals(this.nextActionData, nextActionData.nextActionData) &&
        Objects.equals(this.consentDataRequired, nextActionData.consentDataRequired);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(redirectToUrl, type, bankTransferStepsAndChargesDetails, hashCodeNullable(sessionToken), imageDataUrl, hashCodeNullable(displayToTimestamp), qrCodeUrl, qrCodeFetchUrl, voucherDetails, displayFromTimestamp, threeDsData, nextActionData, consentDataRequired);
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
    sb.append("class NextActionData {\n");
    sb.append("    redirectToUrl: ").append(toIndentedString(redirectToUrl)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    bankTransferStepsAndChargesDetails: ").append(toIndentedString(bankTransferStepsAndChargesDetails)).append("\n");
    sb.append("    sessionToken: ").append(toIndentedString(sessionToken)).append("\n");
    sb.append("    imageDataUrl: ").append(toIndentedString(imageDataUrl)).append("\n");
    sb.append("    displayToTimestamp: ").append(toIndentedString(displayToTimestamp)).append("\n");
    sb.append("    qrCodeUrl: ").append(toIndentedString(qrCodeUrl)).append("\n");
    sb.append("    qrCodeFetchUrl: ").append(toIndentedString(qrCodeFetchUrl)).append("\n");
    sb.append("    voucherDetails: ").append(toIndentedString(voucherDetails)).append("\n");
    sb.append("    displayFromTimestamp: ").append(toIndentedString(displayFromTimestamp)).append("\n");
    sb.append("    threeDsData: ").append(toIndentedString(threeDsData)).append("\n");
    sb.append("    nextActionData: ").append(toIndentedString(nextActionData)).append("\n");
    sb.append("    consentDataRequired: ").append(toIndentedString(consentDataRequired)).append("\n");
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

    // add `redirect_to_url` to the URL query string
    if (getRedirectToUrl() != null) {
      try {
        joiner.add(String.format("%sredirect_to_url%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRedirectToUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `type` to the URL query string
    if (getType() != null) {
      try {
        joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `bank_transfer_steps_and_charges_details` to the URL query string
    if (getBankTransferStepsAndChargesDetails() != null) {
      joiner.add(getBankTransferStepsAndChargesDetails().toUrlQueryString(prefix + "bank_transfer_steps_and_charges_details" + suffix));
    }

    // add `session_token` to the URL query string
    if (getSessionToken() != null) {
      joiner.add(getSessionToken().toUrlQueryString(prefix + "session_token" + suffix));
    }

    // add `image_data_url` to the URL query string
    if (getImageDataUrl() != null) {
      try {
        joiner.add(String.format("%simage_data_url%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getImageDataUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `display_to_timestamp` to the URL query string
    if (getDisplayToTimestamp() != null) {
      try {
        joiner.add(String.format("%sdisplay_to_timestamp%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDisplayToTimestamp()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `qr_code_url` to the URL query string
    if (getQrCodeUrl() != null) {
      try {
        joiner.add(String.format("%sqr_code_url%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getQrCodeUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `qr_code_fetch_url` to the URL query string
    if (getQrCodeFetchUrl() != null) {
      try {
        joiner.add(String.format("%sqr_code_fetch_url%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getQrCodeFetchUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `voucher_details` to the URL query string
    if (getVoucherDetails() != null) {
      try {
        joiner.add(String.format("%svoucher_details%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVoucherDetails()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `display_from_timestamp` to the URL query string
    if (getDisplayFromTimestamp() != null) {
      try {
        joiner.add(String.format("%sdisplay_from_timestamp%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDisplayFromTimestamp()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `three_ds_data` to the URL query string
    if (getThreeDsData() != null) {
      joiner.add(getThreeDsData().toUrlQueryString(prefix + "three_ds_data" + suffix));
    }

    // add `next_action_data` to the URL query string
    if (getNextActionData() != null) {
      joiner.add(getNextActionData().toUrlQueryString(prefix + "next_action_data" + suffix));
    }

    // add `consent_data_required` to the URL query string
    if (getConsentDataRequired() != null) {
      try {
        joiner.add(String.format("%sconsent_data_required%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConsentDataRequired()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

