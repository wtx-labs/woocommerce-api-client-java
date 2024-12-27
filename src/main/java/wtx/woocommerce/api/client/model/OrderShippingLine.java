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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import wtx.woocommerce.api.client.model.MetaData;
import wtx.woocommerce.api.client.model.OrderTaxLine;

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
 * OrderShippingLine
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-28T00:49:53.851918900+01:00[Europe/Warsaw]", comments = "Generator version: 7.10.0")
public class OrderShippingLine {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private Integer id;

  public static final String SERIALIZED_NAME_METHOD_TITLE = "method_title";
  @SerializedName(SERIALIZED_NAME_METHOD_TITLE)
  @javax.annotation.Nullable
  private String methodTitle;

  public static final String SERIALIZED_NAME_METHOD_ID = "method_id";
  @SerializedName(SERIALIZED_NAME_METHOD_ID)
  @javax.annotation.Nullable
  private String methodId;

  public static final String SERIALIZED_NAME_INSTANCE_ID = "instance_id";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ID)
  @javax.annotation.Nullable
  private String instanceId;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  @javax.annotation.Nullable
  private String total;

  public static final String SERIALIZED_NAME_TOTAL_TAX = "total_tax";
  @SerializedName(SERIALIZED_NAME_TOTAL_TAX)
  @javax.annotation.Nullable
  private String totalTax;

  public static final String SERIALIZED_NAME_TAXES = "taxes";
  @SerializedName(SERIALIZED_NAME_TAXES)
  @javax.annotation.Nullable
  private List<OrderTaxLine> taxes = new ArrayList<>();

  public static final String SERIALIZED_NAME_META_DATA = "meta_data";
  @SerializedName(SERIALIZED_NAME_META_DATA)
  @javax.annotation.Nullable
  private List<MetaData> metaData = new ArrayList<>();

  public OrderShippingLine() {
  }

  public OrderShippingLine id(@javax.annotation.Nullable Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Item ID.
   * @return id
   */
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable Integer id) {
    this.id = id;
  }


  public OrderShippingLine methodTitle(@javax.annotation.Nullable String methodTitle) {
    this.methodTitle = methodTitle;
    return this;
  }

  /**
   * Shipping method name.
   * @return methodTitle
   */
  @javax.annotation.Nullable
  public String getMethodTitle() {
    return methodTitle;
  }

  public void setMethodTitle(@javax.annotation.Nullable String methodTitle) {
    this.methodTitle = methodTitle;
  }


  public OrderShippingLine methodId(@javax.annotation.Nullable String methodId) {
    this.methodId = methodId;
    return this;
  }

  /**
   * Shipping method ID.
   * @return methodId
   */
  @javax.annotation.Nullable
  public String getMethodId() {
    return methodId;
  }

  public void setMethodId(@javax.annotation.Nullable String methodId) {
    this.methodId = methodId;
  }


  public OrderShippingLine instanceId(@javax.annotation.Nullable String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

  /**
   * Shipping instance ID.
   * @return instanceId
   */
  @javax.annotation.Nullable
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(@javax.annotation.Nullable String instanceId) {
    this.instanceId = instanceId;
  }


  public OrderShippingLine total(@javax.annotation.Nullable String total) {
    this.total = total;
    return this;
  }

  /**
   * Line total (after discounts).
   * @return total
   */
  @javax.annotation.Nullable
  public String getTotal() {
    return total;
  }

  public void setTotal(@javax.annotation.Nullable String total) {
    this.total = total;
  }


  public OrderShippingLine totalTax(@javax.annotation.Nullable String totalTax) {
    this.totalTax = totalTax;
    return this;
  }

  /**
   * Line total tax (after discounts).
   * @return totalTax
   */
  @javax.annotation.Nullable
  public String getTotalTax() {
    return totalTax;
  }

  public void setTotalTax(@javax.annotation.Nullable String totalTax) {
    this.totalTax = totalTax;
  }


  public OrderShippingLine taxes(@javax.annotation.Nullable List<OrderTaxLine> taxes) {
    this.taxes = taxes;
    return this;
  }

  public OrderShippingLine addTaxesItem(OrderTaxLine taxesItem) {
    if (this.taxes == null) {
      this.taxes = new ArrayList<>();
    }
    this.taxes.add(taxesItem);
    return this;
  }

  /**
   * Line taxes.
   * @return taxes
   */
  @javax.annotation.Nullable
  public List<OrderTaxLine> getTaxes() {
    return taxes;
  }

  public void setTaxes(@javax.annotation.Nullable List<OrderTaxLine> taxes) {
    this.taxes = taxes;
  }


  public OrderShippingLine metaData(@javax.annotation.Nullable List<MetaData> metaData) {
    this.metaData = metaData;
    return this;
  }

  public OrderShippingLine addMetaDataItem(MetaData metaDataItem) {
    if (this.metaData == null) {
      this.metaData = new ArrayList<>();
    }
    this.metaData.add(metaDataItem);
    return this;
  }

  /**
   * Meta data properties.
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
    OrderShippingLine orderShippingLine = (OrderShippingLine) o;
    return Objects.equals(this.id, orderShippingLine.id) &&
        Objects.equals(this.methodTitle, orderShippingLine.methodTitle) &&
        Objects.equals(this.methodId, orderShippingLine.methodId) &&
        Objects.equals(this.instanceId, orderShippingLine.instanceId) &&
        Objects.equals(this.total, orderShippingLine.total) &&
        Objects.equals(this.totalTax, orderShippingLine.totalTax) &&
        Objects.equals(this.taxes, orderShippingLine.taxes) &&
        Objects.equals(this.metaData, orderShippingLine.metaData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, methodTitle, methodId, instanceId, total, totalTax, taxes, metaData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderShippingLine {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    methodTitle: ").append(toIndentedString(methodTitle)).append("\n");
    sb.append("    methodId: ").append(toIndentedString(methodId)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    totalTax: ").append(toIndentedString(totalTax)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
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
    openapiFields.add("method_title");
    openapiFields.add("method_id");
    openapiFields.add("instance_id");
    openapiFields.add("total");
    openapiFields.add("total_tax");
    openapiFields.add("taxes");
    openapiFields.add("meta_data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OrderShippingLine
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderShippingLine.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderShippingLine is not found in the empty JSON string", OrderShippingLine.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderShippingLine.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderShippingLine` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("method_title") != null && !jsonObj.get("method_title").isJsonNull()) && !jsonObj.get("method_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `method_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("method_title").toString()));
      }
      if ((jsonObj.get("method_id") != null && !jsonObj.get("method_id").isJsonNull()) && !jsonObj.get("method_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `method_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("method_id").toString()));
      }
      if ((jsonObj.get("instance_id") != null && !jsonObj.get("instance_id").isJsonNull()) && !jsonObj.get("instance_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instance_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instance_id").toString()));
      }
      if ((jsonObj.get("total") != null && !jsonObj.get("total").isJsonNull()) && !jsonObj.get("total").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total").toString()));
      }
      if ((jsonObj.get("total_tax") != null && !jsonObj.get("total_tax").isJsonNull()) && !jsonObj.get("total_tax").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_tax` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_tax").toString()));
      }
      if (jsonObj.get("taxes") != null && !jsonObj.get("taxes").isJsonNull()) {
        JsonArray jsonArraytaxes = jsonObj.getAsJsonArray("taxes");
        if (jsonArraytaxes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("taxes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `taxes` to be an array in the JSON string but got `%s`", jsonObj.get("taxes").toString()));
          }

          // validate the optional field `taxes` (array)
          for (int i = 0; i < jsonArraytaxes.size(); i++) {
            OrderTaxLine.validateJsonElement(jsonArraytaxes.get(i));
          };
        }
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
       if (!OrderShippingLine.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderShippingLine' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderShippingLine> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderShippingLine.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderShippingLine>() {
           @Override
           public void write(JsonWriter out, OrderShippingLine value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderShippingLine read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OrderShippingLine given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OrderShippingLine
   * @throws IOException if the JSON string is invalid with respect to OrderShippingLine
   */
  public static OrderShippingLine fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderShippingLine.class);
  }

  /**
   * Convert an instance of OrderShippingLine to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
