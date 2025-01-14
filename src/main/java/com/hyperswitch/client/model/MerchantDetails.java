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
import com.hyperswitch.client.model.AddressDetails;
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
 * MerchantDetails
 */
@JsonPropertyOrder({
  MerchantDetails.JSON_PROPERTY_PRIMARY_CONTACT_PERSON,
  MerchantDetails.JSON_PROPERTY_PRIMARY_PHONE,
  MerchantDetails.JSON_PROPERTY_PRIMARY_EMAIL,
  MerchantDetails.JSON_PROPERTY_SECONDARY_CONTACT_PERSON,
  MerchantDetails.JSON_PROPERTY_SECONDARY_PHONE,
  MerchantDetails.JSON_PROPERTY_SECONDARY_EMAIL,
  MerchantDetails.JSON_PROPERTY_WEBSITE,
  MerchantDetails.JSON_PROPERTY_ABOUT_BUSINESS,
  MerchantDetails.JSON_PROPERTY_ADDRESS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MerchantDetails {
  public static final String JSON_PROPERTY_PRIMARY_CONTACT_PERSON = "primary_contact_person";
  private JsonNullable<String> primaryContactPerson = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PRIMARY_PHONE = "primary_phone";
  private JsonNullable<String> primaryPhone = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PRIMARY_EMAIL = "primary_email";
  private JsonNullable<String> primaryEmail = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SECONDARY_CONTACT_PERSON = "secondary_contact_person";
  private JsonNullable<String> secondaryContactPerson = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SECONDARY_PHONE = "secondary_phone";
  private JsonNullable<String> secondaryPhone = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SECONDARY_EMAIL = "secondary_email";
  private JsonNullable<String> secondaryEmail = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_WEBSITE = "website";
  private JsonNullable<String> website = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ABOUT_BUSINESS = "about_business";
  private JsonNullable<String> aboutBusiness = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private JsonNullable<AddressDetails> address = JsonNullable.<AddressDetails>undefined();

  public MerchantDetails() {
  }

  public MerchantDetails primaryContactPerson(String primaryContactPerson) {
    this.primaryContactPerson = JsonNullable.<String>of(primaryContactPerson);
    
    return this;
  }

   /**
   * The merchant&#39;s primary contact name
   * @return primaryContactPerson
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getPrimaryContactPerson() {
        return primaryContactPerson.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRIMARY_CONTACT_PERSON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPrimaryContactPerson_JsonNullable() {
    return primaryContactPerson;
  }
  
  @JsonProperty(JSON_PROPERTY_PRIMARY_CONTACT_PERSON)
  public void setPrimaryContactPerson_JsonNullable(JsonNullable<String> primaryContactPerson) {
    this.primaryContactPerson = primaryContactPerson;
  }

  public void setPrimaryContactPerson(String primaryContactPerson) {
    this.primaryContactPerson = JsonNullable.<String>of(primaryContactPerson);
  }


  public MerchantDetails primaryPhone(String primaryPhone) {
    this.primaryPhone = JsonNullable.<String>of(primaryPhone);
    
    return this;
  }

   /**
   * The merchant&#39;s primary phone number
   * @return primaryPhone
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getPrimaryPhone() {
        return primaryPhone.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRIMARY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPrimaryPhone_JsonNullable() {
    return primaryPhone;
  }
  
  @JsonProperty(JSON_PROPERTY_PRIMARY_PHONE)
  public void setPrimaryPhone_JsonNullable(JsonNullable<String> primaryPhone) {
    this.primaryPhone = primaryPhone;
  }

  public void setPrimaryPhone(String primaryPhone) {
    this.primaryPhone = JsonNullable.<String>of(primaryPhone);
  }


  public MerchantDetails primaryEmail(String primaryEmail) {
    this.primaryEmail = JsonNullable.<String>of(primaryEmail);
    
    return this;
  }

   /**
   * The merchant&#39;s primary email address
   * @return primaryEmail
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getPrimaryEmail() {
        return primaryEmail.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRIMARY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPrimaryEmail_JsonNullable() {
    return primaryEmail;
  }
  
  @JsonProperty(JSON_PROPERTY_PRIMARY_EMAIL)
  public void setPrimaryEmail_JsonNullable(JsonNullable<String> primaryEmail) {
    this.primaryEmail = primaryEmail;
  }

  public void setPrimaryEmail(String primaryEmail) {
    this.primaryEmail = JsonNullable.<String>of(primaryEmail);
  }


  public MerchantDetails secondaryContactPerson(String secondaryContactPerson) {
    this.secondaryContactPerson = JsonNullable.<String>of(secondaryContactPerson);
    
    return this;
  }

   /**
   * The merchant&#39;s secondary contact name
   * @return secondaryContactPerson
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getSecondaryContactPerson() {
        return secondaryContactPerson.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SECONDARY_CONTACT_PERSON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSecondaryContactPerson_JsonNullable() {
    return secondaryContactPerson;
  }
  
  @JsonProperty(JSON_PROPERTY_SECONDARY_CONTACT_PERSON)
  public void setSecondaryContactPerson_JsonNullable(JsonNullable<String> secondaryContactPerson) {
    this.secondaryContactPerson = secondaryContactPerson;
  }

  public void setSecondaryContactPerson(String secondaryContactPerson) {
    this.secondaryContactPerson = JsonNullable.<String>of(secondaryContactPerson);
  }


  public MerchantDetails secondaryPhone(String secondaryPhone) {
    this.secondaryPhone = JsonNullable.<String>of(secondaryPhone);
    
    return this;
  }

   /**
   * The merchant&#39;s secondary phone number
   * @return secondaryPhone
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getSecondaryPhone() {
        return secondaryPhone.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SECONDARY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSecondaryPhone_JsonNullable() {
    return secondaryPhone;
  }
  
  @JsonProperty(JSON_PROPERTY_SECONDARY_PHONE)
  public void setSecondaryPhone_JsonNullable(JsonNullable<String> secondaryPhone) {
    this.secondaryPhone = secondaryPhone;
  }

  public void setSecondaryPhone(String secondaryPhone) {
    this.secondaryPhone = JsonNullable.<String>of(secondaryPhone);
  }


  public MerchantDetails secondaryEmail(String secondaryEmail) {
    this.secondaryEmail = JsonNullable.<String>of(secondaryEmail);
    
    return this;
  }

   /**
   * The merchant&#39;s secondary email address
   * @return secondaryEmail
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getSecondaryEmail() {
        return secondaryEmail.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SECONDARY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSecondaryEmail_JsonNullable() {
    return secondaryEmail;
  }
  
  @JsonProperty(JSON_PROPERTY_SECONDARY_EMAIL)
  public void setSecondaryEmail_JsonNullable(JsonNullable<String> secondaryEmail) {
    this.secondaryEmail = secondaryEmail;
  }

  public void setSecondaryEmail(String secondaryEmail) {
    this.secondaryEmail = JsonNullable.<String>of(secondaryEmail);
  }


  public MerchantDetails website(String website) {
    this.website = JsonNullable.<String>of(website);
    
    return this;
  }

   /**
   * The business website of the merchant
   * @return website
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getWebsite() {
        return website.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WEBSITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getWebsite_JsonNullable() {
    return website;
  }
  
  @JsonProperty(JSON_PROPERTY_WEBSITE)
  public void setWebsite_JsonNullable(JsonNullable<String> website) {
    this.website = website;
  }

  public void setWebsite(String website) {
    this.website = JsonNullable.<String>of(website);
  }


  public MerchantDetails aboutBusiness(String aboutBusiness) {
    this.aboutBusiness = JsonNullable.<String>of(aboutBusiness);
    
    return this;
  }

   /**
   * A brief description about merchant&#39;s business
   * @return aboutBusiness
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getAboutBusiness() {
        return aboutBusiness.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ABOUT_BUSINESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAboutBusiness_JsonNullable() {
    return aboutBusiness;
  }
  
  @JsonProperty(JSON_PROPERTY_ABOUT_BUSINESS)
  public void setAboutBusiness_JsonNullable(JsonNullable<String> aboutBusiness) {
    this.aboutBusiness = aboutBusiness;
  }

  public void setAboutBusiness(String aboutBusiness) {
    this.aboutBusiness = JsonNullable.<String>of(aboutBusiness);
  }


  public MerchantDetails address(AddressDetails address) {
    this.address = JsonNullable.<AddressDetails>of(address);
    
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public AddressDetails getAddress() {
        return address.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<AddressDetails> getAddress_JsonNullable() {
    return address;
  }
  
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  public void setAddress_JsonNullable(JsonNullable<AddressDetails> address) {
    this.address = address;
  }

  public void setAddress(AddressDetails address) {
    this.address = JsonNullable.<AddressDetails>of(address);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantDetails merchantDetails = (MerchantDetails) o;
    return equalsNullable(this.primaryContactPerson, merchantDetails.primaryContactPerson) &&
        equalsNullable(this.primaryPhone, merchantDetails.primaryPhone) &&
        equalsNullable(this.primaryEmail, merchantDetails.primaryEmail) &&
        equalsNullable(this.secondaryContactPerson, merchantDetails.secondaryContactPerson) &&
        equalsNullable(this.secondaryPhone, merchantDetails.secondaryPhone) &&
        equalsNullable(this.secondaryEmail, merchantDetails.secondaryEmail) &&
        equalsNullable(this.website, merchantDetails.website) &&
        equalsNullable(this.aboutBusiness, merchantDetails.aboutBusiness) &&
        equalsNullable(this.address, merchantDetails.address);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(primaryContactPerson), hashCodeNullable(primaryPhone), hashCodeNullable(primaryEmail), hashCodeNullable(secondaryContactPerson), hashCodeNullable(secondaryPhone), hashCodeNullable(secondaryEmail), hashCodeNullable(website), hashCodeNullable(aboutBusiness), hashCodeNullable(address));
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
    sb.append("class MerchantDetails {\n");
    sb.append("    primaryContactPerson: ").append(toIndentedString(primaryContactPerson)).append("\n");
    sb.append("    primaryPhone: ").append(toIndentedString(primaryPhone)).append("\n");
    sb.append("    primaryEmail: ").append(toIndentedString(primaryEmail)).append("\n");
    sb.append("    secondaryContactPerson: ").append(toIndentedString(secondaryContactPerson)).append("\n");
    sb.append("    secondaryPhone: ").append(toIndentedString(secondaryPhone)).append("\n");
    sb.append("    secondaryEmail: ").append(toIndentedString(secondaryEmail)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    aboutBusiness: ").append(toIndentedString(aboutBusiness)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

    // add `primary_contact_person` to the URL query string
    if (getPrimaryContactPerson() != null) {
      try {
        joiner.add(String.format("%sprimary_contact_person%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPrimaryContactPerson()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `primary_phone` to the URL query string
    if (getPrimaryPhone() != null) {
      try {
        joiner.add(String.format("%sprimary_phone%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPrimaryPhone()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `primary_email` to the URL query string
    if (getPrimaryEmail() != null) {
      try {
        joiner.add(String.format("%sprimary_email%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPrimaryEmail()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `secondary_contact_person` to the URL query string
    if (getSecondaryContactPerson() != null) {
      try {
        joiner.add(String.format("%ssecondary_contact_person%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSecondaryContactPerson()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `secondary_phone` to the URL query string
    if (getSecondaryPhone() != null) {
      try {
        joiner.add(String.format("%ssecondary_phone%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSecondaryPhone()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `secondary_email` to the URL query string
    if (getSecondaryEmail() != null) {
      try {
        joiner.add(String.format("%ssecondary_email%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSecondaryEmail()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `website` to the URL query string
    if (getWebsite() != null) {
      try {
        joiner.add(String.format("%swebsite%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWebsite()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `about_business` to the URL query string
    if (getAboutBusiness() != null) {
      try {
        joiner.add(String.format("%sabout_business%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAboutBusiness()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `address` to the URL query string
    if (getAddress() != null) {
      joiner.add(getAddress().toUrlQueryString(prefix + "address" + suffix));
    }

    return joiner.toString();
  }

}

