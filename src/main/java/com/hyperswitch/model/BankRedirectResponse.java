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

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.hyperswitch.model.BancontactBankRedirectAdditionalData;
import com.hyperswitch.model.BankNames;
import com.hyperswitch.model.BankRedirectResponseAllOf;
import com.hyperswitch.model.BlikBankRedirectAdditionalData;
import com.hyperswitch.model.GiropayBankRedirectAdditionalData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * BankRedirectResponse
 */
@JsonPropertyOrder({
  BankRedirectResponse.JSON_PROPERTY_BANK_NAME,
  BankRedirectResponse.JSON_PROPERTY_BANCONTACT_CARD,
  BankRedirectResponse.JSON_PROPERTY_BLIK,
  BankRedirectResponse.JSON_PROPERTY_GIROPAY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BankRedirectResponse {
  public static final String JSON_PROPERTY_BANK_NAME = "bank_name";
  private JsonNullable<BankNames> bankName = JsonNullable.<BankNames>undefined();

  public static final String JSON_PROPERTY_BANCONTACT_CARD = "BancontactCard";
  private BancontactBankRedirectAdditionalData bancontactCard;

  public static final String JSON_PROPERTY_BLIK = "Blik";
  private BlikBankRedirectAdditionalData blik;

  public static final String JSON_PROPERTY_GIROPAY = "Giropay";
  private GiropayBankRedirectAdditionalData giropay;

  public BankRedirectResponse() { 
  }

  public BankRedirectResponse bankName(BankNames bankName) {
    this.bankName = JsonNullable.<BankNames>of(bankName);
    
    return this;
  }

   /**
   * Get bankName
   * @return bankName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public BankNames getBankName() {
        return bankName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BANK_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BankNames> getBankName_JsonNullable() {
    return bankName;
  }
  
  @JsonProperty(JSON_PROPERTY_BANK_NAME)
  public void setBankName_JsonNullable(JsonNullable<BankNames> bankName) {
    this.bankName = bankName;
  }

  public void setBankName(BankNames bankName) {
    this.bankName = JsonNullable.<BankNames>of(bankName);
  }


  public BankRedirectResponse bancontactCard(BancontactBankRedirectAdditionalData bancontactCard) {
    
    this.bancontactCard = bancontactCard;
    return this;
  }

   /**
   * Get bancontactCard
   * @return bancontactCard
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_BANCONTACT_CARD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BancontactBankRedirectAdditionalData getBancontactCard() {
    return bancontactCard;
  }


  @JsonProperty(JSON_PROPERTY_BANCONTACT_CARD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBancontactCard(BancontactBankRedirectAdditionalData bancontactCard) {
    this.bancontactCard = bancontactCard;
  }


  public BankRedirectResponse blik(BlikBankRedirectAdditionalData blik) {
    
    this.blik = blik;
    return this;
  }

   /**
   * Get blik
   * @return blik
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_BLIK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BlikBankRedirectAdditionalData getBlik() {
    return blik;
  }


  @JsonProperty(JSON_PROPERTY_BLIK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBlik(BlikBankRedirectAdditionalData blik) {
    this.blik = blik;
  }


  public BankRedirectResponse giropay(GiropayBankRedirectAdditionalData giropay) {
    
    this.giropay = giropay;
    return this;
  }

   /**
   * Get giropay
   * @return giropay
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_GIROPAY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public GiropayBankRedirectAdditionalData getGiropay() {
    return giropay;
  }


  @JsonProperty(JSON_PROPERTY_GIROPAY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGiropay(GiropayBankRedirectAdditionalData giropay) {
    this.giropay = giropay;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankRedirectResponse bankRedirectResponse = (BankRedirectResponse) o;
    return equalsNullable(this.bankName, bankRedirectResponse.bankName) &&
        Objects.equals(this.bancontactCard, bankRedirectResponse.bancontactCard) &&
        Objects.equals(this.blik, bankRedirectResponse.blik) &&
        Objects.equals(this.giropay, bankRedirectResponse.giropay);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(bankName), bancontactCard, blik, giropay);
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
    sb.append("class BankRedirectResponse {\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    bancontactCard: ").append(toIndentedString(bancontactCard)).append("\n");
    sb.append("    blik: ").append(toIndentedString(blik)).append("\n");
    sb.append("    giropay: ").append(toIndentedString(giropay)).append("\n");
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

}

