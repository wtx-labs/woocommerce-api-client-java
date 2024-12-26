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
import java.util.Arrays;

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
 * ReportOrderTotalSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-26T19:20:41.898235500+01:00[Europe/Warsaw]", comments = "Generator version: 7.10.0")
public class ReportOrderTotalSummary {
  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  @javax.annotation.Nullable
  private String slug;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  @javax.annotation.Nullable
  private Integer total;

  public ReportOrderTotalSummary() {
  }

  public ReportOrderTotalSummary slug(@javax.annotation.Nullable String slug) {
    this.slug = slug;
    return this;
  }

  /**
   * An alphanumeric identifier for the resource.
   * @return slug
   */
  @javax.annotation.Nullable
  public String getSlug() {
    return slug;
  }

  public void setSlug(@javax.annotation.Nullable String slug) {
    this.slug = slug;
  }


  public ReportOrderTotalSummary name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Orders status name.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public ReportOrderTotalSummary total(@javax.annotation.Nullable Integer total) {
    this.total = total;
    return this;
  }

  /**
   * Amount of orders.
   * @return total
   */
  @javax.annotation.Nullable
  public Integer getTotal() {
    return total;
  }

  public void setTotal(@javax.annotation.Nullable Integer total) {
    this.total = total;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportOrderTotalSummary reportOrderTotalSummary = (ReportOrderTotalSummary) o;
    return Objects.equals(this.slug, reportOrderTotalSummary.slug) &&
        Objects.equals(this.name, reportOrderTotalSummary.name) &&
        Objects.equals(this.total, reportOrderTotalSummary.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slug, name, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportOrderTotalSummary {\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
    openapiFields.add("slug");
    openapiFields.add("name");
    openapiFields.add("total");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ReportOrderTotalSummary
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReportOrderTotalSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReportOrderTotalSummary is not found in the empty JSON string", ReportOrderTotalSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReportOrderTotalSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReportOrderTotalSummary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("slug") != null && !jsonObj.get("slug").isJsonNull()) && !jsonObj.get("slug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `slug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("slug").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportOrderTotalSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportOrderTotalSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportOrderTotalSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportOrderTotalSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportOrderTotalSummary>() {
           @Override
           public void write(JsonWriter out, ReportOrderTotalSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportOrderTotalSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ReportOrderTotalSummary given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReportOrderTotalSummary
   * @throws IOException if the JSON string is invalid with respect to ReportOrderTotalSummary
   */
  public static ReportOrderTotalSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportOrderTotalSummary.class);
  }

  /**
   * Convert an instance of ReportOrderTotalSummary to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

