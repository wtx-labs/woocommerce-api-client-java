/*
 * WooCommerce REST API
 * The REST API is a powerful part of WooCommerce which lets you read and write various parts of WooCommerce data such as orders, products, coupons, customers, and shipping zones.
 *
 * The version of the OpenAPI document: v3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package wtx.woocommerce.api.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import wtx.woocommerce.api.client.model.Billing;
import wtx.woocommerce.api.client.model.MetaData;
import wtx.woocommerce.api.client.model.Shipping;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import wtx.woocommerce.api.client.invoker.JSON;

/**
 * Customer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class Customer {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private Integer id;

  public static final String SERIALIZED_NAME_DATE_CREATED = "date_created";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  @javax.annotation.Nullable
  private OffsetDateTime dateCreated;

  public static final String SERIALIZED_NAME_DATE_CREATED_GMT = "date_created_gmt";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED_GMT)
  @javax.annotation.Nullable
  private OffsetDateTime dateCreatedGmt;

  public static final String SERIALIZED_NAME_DATE_MODIFIED = "date_modified";
  @SerializedName(SERIALIZED_NAME_DATE_MODIFIED)
  @javax.annotation.Nullable
  private OffsetDateTime dateModified;

  public static final String SERIALIZED_NAME_DATE_MODIFIED_GMT = "date_modified_gmt";
  @SerializedName(SERIALIZED_NAME_DATE_MODIFIED_GMT)
  @javax.annotation.Nullable
  private OffsetDateTime dateModifiedGmt;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  @javax.annotation.Nullable
  private String email;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  @javax.annotation.Nullable
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  @javax.annotation.Nullable
  private String lastName;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  @javax.annotation.Nullable
  private String role;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  @javax.annotation.Nullable
  private String username;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  @javax.annotation.Nullable
  private String password;

  public static final String SERIALIZED_NAME_BILLING = "billing";
  @SerializedName(SERIALIZED_NAME_BILLING)
  @javax.annotation.Nullable
  private Billing billing;

  public static final String SERIALIZED_NAME_SHIPPING = "shipping";
  @SerializedName(SERIALIZED_NAME_SHIPPING)
  @javax.annotation.Nullable
  private Shipping shipping;

  public static final String SERIALIZED_NAME_IS_PAYING_CUSTOMER = "is_paying_customer";
  @SerializedName(SERIALIZED_NAME_IS_PAYING_CUSTOMER)
  @javax.annotation.Nullable
  private Boolean isPayingCustomer;

  public static final String SERIALIZED_NAME_AVATAR_URL = "avatar_url";
  @SerializedName(SERIALIZED_NAME_AVATAR_URL)
  @javax.annotation.Nullable
  private String avatarUrl;

  public static final String SERIALIZED_NAME_META_DATA = "meta_data";
  @SerializedName(SERIALIZED_NAME_META_DATA)
  @javax.annotation.Nullable
  private List<MetaData> metaData = new ArrayList<>();

  public Customer() {
  }

  public Customer id(@javax.annotation.Nullable Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the resource. read-only
   * @return id
   */
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable Integer id) {
    this.id = id;
  }


  public Customer dateCreated(@javax.annotation.Nullable OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

  /**
   * The date the customer was created, in the site&#39;s timezone. read-only
   * @return dateCreated
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(@javax.annotation.Nullable OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }


  public Customer dateCreatedGmt(@javax.annotation.Nullable OffsetDateTime dateCreatedGmt) {
    this.dateCreatedGmt = dateCreatedGmt;
    return this;
  }

  /**
   * The date the customer was created, as GMT. read-only
   * @return dateCreatedGmt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDateCreatedGmt() {
    return dateCreatedGmt;
  }

  public void setDateCreatedGmt(@javax.annotation.Nullable OffsetDateTime dateCreatedGmt) {
    this.dateCreatedGmt = dateCreatedGmt;
  }


  public Customer dateModified(@javax.annotation.Nullable OffsetDateTime dateModified) {
    this.dateModified = dateModified;
    return this;
  }

  /**
   * The date the customer was last modified, in the site&#39;s timezone. read-only
   * @return dateModified
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDateModified() {
    return dateModified;
  }

  public void setDateModified(@javax.annotation.Nullable OffsetDateTime dateModified) {
    this.dateModified = dateModified;
  }


  public Customer dateModifiedGmt(@javax.annotation.Nullable OffsetDateTime dateModifiedGmt) {
    this.dateModifiedGmt = dateModifiedGmt;
    return this;
  }

  /**
   * The date the customer was last modified, as GMT. read-only
   * @return dateModifiedGmt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDateModifiedGmt() {
    return dateModifiedGmt;
  }

  public void setDateModifiedGmt(@javax.annotation.Nullable OffsetDateTime dateModifiedGmt) {
    this.dateModifiedGmt = dateModifiedGmt;
  }


  public Customer email(@javax.annotation.Nullable String email) {
    this.email = email;
    return this;
  }

  /**
   * The email address for the customer. mandatory
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(@javax.annotation.Nullable String email) {
    this.email = email;
  }


  public Customer firstName(@javax.annotation.Nullable String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Customer first name.
   * @return firstName
   */
  @javax.annotation.Nullable
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(@javax.annotation.Nullable String firstName) {
    this.firstName = firstName;
  }


  public Customer lastName(@javax.annotation.Nullable String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Customer last name.
   * @return lastName
   */
  @javax.annotation.Nullable
  public String getLastName() {
    return lastName;
  }

  public void setLastName(@javax.annotation.Nullable String lastName) {
    this.lastName = lastName;
  }


  public Customer role(@javax.annotation.Nullable String role) {
    this.role = role;
    return this;
  }

  /**
   * Customer role. read-only
   * @return role
   */
  @javax.annotation.Nullable
  public String getRole() {
    return role;
  }

  public void setRole(@javax.annotation.Nullable String role) {
    this.role = role;
  }


  public Customer username(@javax.annotation.Nullable String username) {
    this.username = username;
    return this;
  }

  /**
   * Customer login name.
   * @return username
   */
  @javax.annotation.Nullable
  public String getUsername() {
    return username;
  }

  public void setUsername(@javax.annotation.Nullable String username) {
    this.username = username;
  }


  public Customer password(@javax.annotation.Nullable String password) {
    this.password = password;
    return this;
  }

  /**
   * Customer password. write-only
   * @return password
   */
  @javax.annotation.Nullable
  public String getPassword() {
    return password;
  }

  public void setPassword(@javax.annotation.Nullable String password) {
    this.password = password;
  }


  public Customer billing(@javax.annotation.Nullable Billing billing) {
    this.billing = billing;
    return this;
  }

  /**
   * Get billing
   * @return billing
   */
  @javax.annotation.Nullable
  public Billing getBilling() {
    return billing;
  }

  public void setBilling(@javax.annotation.Nullable Billing billing) {
    this.billing = billing;
  }


  public Customer shipping(@javax.annotation.Nullable Shipping shipping) {
    this.shipping = shipping;
    return this;
  }

  /**
   * Get shipping
   * @return shipping
   */
  @javax.annotation.Nullable
  public Shipping getShipping() {
    return shipping;
  }

  public void setShipping(@javax.annotation.Nullable Shipping shipping) {
    this.shipping = shipping;
  }


  public Customer isPayingCustomer(@javax.annotation.Nullable Boolean isPayingCustomer) {
    this.isPayingCustomer = isPayingCustomer;
    return this;
  }

  /**
   * Is the customer a paying customer? read-only
   * @return isPayingCustomer
   */
  @javax.annotation.Nullable
  public Boolean getIsPayingCustomer() {
    return isPayingCustomer;
  }

  public void setIsPayingCustomer(@javax.annotation.Nullable Boolean isPayingCustomer) {
    this.isPayingCustomer = isPayingCustomer;
  }


  public Customer avatarUrl(@javax.annotation.Nullable String avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

  /**
   * Avatar URL. read-only
   * @return avatarUrl
   */
  @javax.annotation.Nullable
  public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(@javax.annotation.Nullable String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }


  public Customer metaData(@javax.annotation.Nullable List<MetaData> metaData) {
    this.metaData = metaData;
    return this;
  }

  public Customer addMetaDataItem(MetaData metaDataItem) {
    if (this.metaData == null) {
      this.metaData = new ArrayList<>();
    }
    this.metaData.add(metaDataItem);
    return this;
  }

  /**
   * Meta data.
   * @return metaData
   */
  @javax.annotation.Nullable
  public List<MetaData> getMetaData() {
    return metaData;
  }

  public void setMetaData(@javax.annotation.Nullable List<MetaData> metaData) {
    this.metaData = metaData;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(this.id, customer.id) &&
        Objects.equals(this.dateCreated, customer.dateCreated) &&
        Objects.equals(this.dateCreatedGmt, customer.dateCreatedGmt) &&
        Objects.equals(this.dateModified, customer.dateModified) &&
        Objects.equals(this.dateModifiedGmt, customer.dateModifiedGmt) &&
        Objects.equals(this.email, customer.email) &&
        Objects.equals(this.firstName, customer.firstName) &&
        Objects.equals(this.lastName, customer.lastName) &&
        Objects.equals(this.role, customer.role) &&
        Objects.equals(this.username, customer.username) &&
        Objects.equals(this.password, customer.password) &&
        Objects.equals(this.billing, customer.billing) &&
        Objects.equals(this.shipping, customer.shipping) &&
        Objects.equals(this.isPayingCustomer, customer.isPayingCustomer) &&
        Objects.equals(this.avatarUrl, customer.avatarUrl) &&
        Objects.equals(this.metaData, customer.metaData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dateCreated, dateCreatedGmt, dateModified, dateModifiedGmt, email, firstName, lastName, role, username, password, billing, shipping, isPayingCustomer, avatarUrl, metaData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateCreatedGmt: ").append(toIndentedString(dateCreatedGmt)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    dateModifiedGmt: ").append(toIndentedString(dateModifiedGmt)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    billing: ").append(toIndentedString(billing)).append("\n");
    sb.append("    shipping: ").append(toIndentedString(shipping)).append("\n");
    sb.append("    isPayingCustomer: ").append(toIndentedString(isPayingCustomer)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("date_created");
    openapiFields.add("date_created_gmt");
    openapiFields.add("date_modified");
    openapiFields.add("date_modified_gmt");
    openapiFields.add("email");
    openapiFields.add("first_name");
    openapiFields.add("last_name");
    openapiFields.add("role");
    openapiFields.add("username");
    openapiFields.add("password");
    openapiFields.add("billing");
    openapiFields.add("shipping");
    openapiFields.add("is_paying_customer");
    openapiFields.add("avatar_url");
    openapiFields.add("meta_data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Customer
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Customer.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Customer is not found in the empty JSON string", Customer.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Customer.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Customer` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("first_name") != null && !jsonObj.get("first_name").isJsonNull()) && !jsonObj.get("first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_name").toString()));
      }
      if ((jsonObj.get("last_name") != null && !jsonObj.get("last_name").isJsonNull()) && !jsonObj.get("last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_name").toString()));
      }
      if ((jsonObj.get("role") != null && !jsonObj.get("role").isJsonNull()) && !jsonObj.get("role").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `role` to be a primitive type in the JSON string but got `%s`", jsonObj.get("role").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      // validate the optional field `billing`
      if (jsonObj.get("billing") != null && !jsonObj.get("billing").isJsonNull()) {
        Billing.validateJsonElement(jsonObj.get("billing"));
      }
      // validate the optional field `shipping`
      if (jsonObj.get("shipping") != null && !jsonObj.get("shipping").isJsonNull()) {
        Shipping.validateJsonElement(jsonObj.get("shipping"));
      }
      if ((jsonObj.get("avatar_url") != null && !jsonObj.get("avatar_url").isJsonNull()) && !jsonObj.get("avatar_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `avatar_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("avatar_url").toString()));
      }
      if (jsonObj.get("meta_data") != null && !jsonObj.get("meta_data").isJsonNull()) {
        JsonArray jsonArraymetaData = jsonObj.getAsJsonArray("meta_data");
        if (jsonArraymetaData != null) {
          // ensure the json data is an array
          if (!jsonObj.get("meta_data").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `meta_data` to be an array in the JSON string but got `%s`", jsonObj.get("meta_data").toString()));
          }

          // validate the optional field `meta_data` (array)
          for (int i = 0; i < jsonArraymetaData.size(); i++) {
            MetaData.validateJsonElement(jsonArraymetaData.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Customer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Customer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Customer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Customer.class));

       return (TypeAdapter<T>) new TypeAdapter<Customer>() {
           @Override
           public void write(JsonWriter out, Customer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Customer read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Customer given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Customer
   * @throws IOException if the JSON string is invalid with respect to Customer
   */
  public static Customer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Customer.class);
  }

  /**
   * Convert an instance of Customer to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

