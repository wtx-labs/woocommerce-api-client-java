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
 * OrderTaxLine
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class OrderTaxLine {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private Integer id;

  public static final String SERIALIZED_NAME_RATE_CODE = "rate_code";
  @SerializedName(SERIALIZED_NAME_RATE_CODE)
  @javax.annotation.Nullable
  private String rateCode;

  public static final String SERIALIZED_NAME_RATE_ID = "rate_id";
  @SerializedName(SERIALIZED_NAME_RATE_ID)
  @javax.annotation.Nullable
  private String rateId;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  @javax.annotation.Nullable
  private String label;

  public static final String SERIALIZED_NAME_COMPOUND = "compound";
  @SerializedName(SERIALIZED_NAME_COMPOUND)
  @javax.annotation.Nullable
  private Boolean compound;

  public static final String SERIALIZED_NAME_TAX_TOTAL = "tax_total";
  @SerializedName(SERIALIZED_NAME_TAX_TOTAL)
  @javax.annotation.Nullable
  private String taxTotal;

  public static final String SERIALIZED_NAME_SHIPPING_TAX_TOTAL = "shipping_tax_total";
  @SerializedName(SERIALIZED_NAME_SHIPPING_TAX_TOTAL)
  @javax.annotation.Nullable
  private String shippingTaxTotal;

  public static final String SERIALIZED_NAME_META_DATA = "meta_data";
  @SerializedName(SERIALIZED_NAME_META_DATA)
  @javax.annotation.Nullable
  private List<MetaData> metaData = new ArrayList<>();

  public OrderTaxLine() {
  }

  public OrderTaxLine id(@javax.annotation.Nullable Integer id) {
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


  public OrderTaxLine rateCode(@javax.annotation.Nullable String rateCode) {
    this.rateCode = rateCode;
    return this;
  }

  /**
   * Tax rate code.
   * @return rateCode
   */
  @javax.annotation.Nullable
  public String getRateCode() {
    return rateCode;
  }

  public void setRateCode(@javax.annotation.Nullable String rateCode) {
    this.rateCode = rateCode;
  }


  public OrderTaxLine rateId(@javax.annotation.Nullable String rateId) {
    this.rateId = rateId;
    return this;
  }

  /**
   * Tax rate ID.
   * @return rateId
   */
  @javax.annotation.Nullable
  public String getRateId() {
    return rateId;
  }

  public void setRateId(@javax.annotation.Nullable String rateId) {
    this.rateId = rateId;
  }


  public OrderTaxLine label(@javax.annotation.Nullable String label) {
    this.label = label;
    return this;
  }

  /**
   * Tax rate label.
   * @return label
   */
  @javax.annotation.Nullable
  public String getLabel() {
    return label;
  }

  public void setLabel(@javax.annotation.Nullable String label) {
    this.label = label;
  }


  public OrderTaxLine compound(@javax.annotation.Nullable Boolean compound) {
    this.compound = compound;
    return this;
  }

  /**
   * Whether or not this is a compound tax rate.
   * @return compound
   */
  @javax.annotation.Nullable
  public Boolean getCompound() {
    return compound;
  }

  public void setCompound(@javax.annotation.Nullable Boolean compound) {
    this.compound = compound;
  }


  public OrderTaxLine taxTotal(@javax.annotation.Nullable String taxTotal) {
    this.taxTotal = taxTotal;
    return this;
  }

  /**
   * Tax total (not including shipping taxes).
   * @return taxTotal
   */
  @javax.annotation.Nullable
  public String getTaxTotal() {
    return taxTotal;
  }

  public void setTaxTotal(@javax.annotation.Nullable String taxTotal) {
    this.taxTotal = taxTotal;
  }


  public OrderTaxLine shippingTaxTotal(@javax.annotation.Nullable String shippingTaxTotal) {
    this.shippingTaxTotal = shippingTaxTotal;
    return this;
  }

  /**
   * Shipping tax total.
   * @return shippingTaxTotal
   */
  @javax.annotation.Nullable
  public String getShippingTaxTotal() {
    return shippingTaxTotal;
  }

  public void setShippingTaxTotal(@javax.annotation.Nullable String shippingTaxTotal) {
    this.shippingTaxTotal = shippingTaxTotal;
  }


  public OrderTaxLine metaData(@javax.annotation.Nullable List<MetaData> metaData) {
    this.metaData = metaData;
    return this;
  }

  public OrderTaxLine addMetaDataItem(MetaData metaDataItem) {
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
    OrderTaxLine orderTaxLine = (OrderTaxLine) o;
    return Objects.equals(this.id, orderTaxLine.id) &&
        Objects.equals(this.rateCode, orderTaxLine.rateCode) &&
        Objects.equals(this.rateId, orderTaxLine.rateId) &&
        Objects.equals(this.label, orderTaxLine.label) &&
        Objects.equals(this.compound, orderTaxLine.compound) &&
        Objects.equals(this.taxTotal, orderTaxLine.taxTotal) &&
        Objects.equals(this.shippingTaxTotal, orderTaxLine.shippingTaxTotal) &&
        Objects.equals(this.metaData, orderTaxLine.metaData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, rateCode, rateId, label, compound, taxTotal, shippingTaxTotal, metaData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderTaxLine {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    rateCode: ").append(toIndentedString(rateCode)).append("\n");
    sb.append("    rateId: ").append(toIndentedString(rateId)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    compound: ").append(toIndentedString(compound)).append("\n");
    sb.append("    taxTotal: ").append(toIndentedString(taxTotal)).append("\n");
    sb.append("    shippingTaxTotal: ").append(toIndentedString(shippingTaxTotal)).append("\n");
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
    openapiFields.add("rate_code");
    openapiFields.add("rate_id");
    openapiFields.add("label");
    openapiFields.add("compound");
    openapiFields.add("tax_total");
    openapiFields.add("shipping_tax_total");
    openapiFields.add("meta_data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OrderTaxLine
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderTaxLine.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderTaxLine is not found in the empty JSON string", OrderTaxLine.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderTaxLine.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderTaxLine` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("rate_code") != null && !jsonObj.get("rate_code").isJsonNull()) && !jsonObj.get("rate_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rate_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rate_code").toString()));
      }
      if ((jsonObj.get("rate_id") != null && !jsonObj.get("rate_id").isJsonNull()) && !jsonObj.get("rate_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rate_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rate_id").toString()));
      }
      if ((jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull()) && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      if ((jsonObj.get("tax_total") != null && !jsonObj.get("tax_total").isJsonNull()) && !jsonObj.get("tax_total").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax_total` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tax_total").toString()));
      }
      if ((jsonObj.get("shipping_tax_total") != null && !jsonObj.get("shipping_tax_total").isJsonNull()) && !jsonObj.get("shipping_tax_total").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shipping_tax_total` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shipping_tax_total").toString()));
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
       if (!OrderTaxLine.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderTaxLine' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderTaxLine> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderTaxLine.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderTaxLine>() {
           @Override
           public void write(JsonWriter out, OrderTaxLine value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderTaxLine read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OrderTaxLine given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OrderTaxLine
   * @throws IOException if the JSON string is invalid with respect to OrderTaxLine
   */
  public static OrderTaxLine fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderTaxLine.class);
  }

  /**
   * Convert an instance of OrderTaxLine to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

