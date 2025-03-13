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
 * ProductDimension
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class ProductDimension {
  public static final String SERIALIZED_NAME_LENGTH = "length";
  @SerializedName(SERIALIZED_NAME_LENGTH)
  @javax.annotation.Nullable
  private String length;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  @javax.annotation.Nullable
  private String width;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  @javax.annotation.Nullable
  private String height;

  public ProductDimension() {
  }

  public ProductDimension length(@javax.annotation.Nullable String length) {
    this.length = length;
    return this;
  }

  /**
   * Product length.
   * @return length
   */
  @javax.annotation.Nullable
  public String getLength() {
    return length;
  }

  public void setLength(@javax.annotation.Nullable String length) {
    this.length = length;
  }


  public ProductDimension width(@javax.annotation.Nullable String width) {
    this.width = width;
    return this;
  }

  /**
   * Product width.
   * @return width
   */
  @javax.annotation.Nullable
  public String getWidth() {
    return width;
  }

  public void setWidth(@javax.annotation.Nullable String width) {
    this.width = width;
  }


  public ProductDimension height(@javax.annotation.Nullable String height) {
    this.height = height;
    return this;
  }

  /**
   * Product height.
   * @return height
   */
  @javax.annotation.Nullable
  public String getHeight() {
    return height;
  }

  public void setHeight(@javax.annotation.Nullable String height) {
    this.height = height;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductDimension productDimension = (ProductDimension) o;
    return Objects.equals(this.length, productDimension.length) &&
        Objects.equals(this.width, productDimension.width) &&
        Objects.equals(this.height, productDimension.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(length, width, height);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDimension {\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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
    openapiFields.add("length");
    openapiFields.add("width");
    openapiFields.add("height");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProductDimension
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductDimension.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductDimension is not found in the empty JSON string", ProductDimension.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProductDimension.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductDimension` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("length") != null && !jsonObj.get("length").isJsonNull()) && !jsonObj.get("length").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `length` to be a primitive type in the JSON string but got `%s`", jsonObj.get("length").toString()));
      }
      if ((jsonObj.get("width") != null && !jsonObj.get("width").isJsonNull()) && !jsonObj.get("width").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `width` to be a primitive type in the JSON string but got `%s`", jsonObj.get("width").toString()));
      }
      if ((jsonObj.get("height") != null && !jsonObj.get("height").isJsonNull()) && !jsonObj.get("height").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `height` to be a primitive type in the JSON string but got `%s`", jsonObj.get("height").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductDimension.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductDimension' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductDimension> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductDimension.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductDimension>() {
           @Override
           public void write(JsonWriter out, ProductDimension value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductDimension read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ProductDimension given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ProductDimension
   * @throws IOException if the JSON string is invalid with respect to ProductDimension
   */
  public static ProductDimension fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductDimension.class);
  }

  /**
   * Convert an instance of ProductDimension to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

