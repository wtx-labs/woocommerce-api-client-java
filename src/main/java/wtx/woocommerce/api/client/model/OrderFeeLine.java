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
 * OrderFeeLine
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T13:35:20.422255800+01:00[Europe/Warsaw]", comments = "Generator version: 7.10.0")
public class OrderFeeLine {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_TAX_CLASS = "tax_class";
  @SerializedName(SERIALIZED_NAME_TAX_CLASS)
  @javax.annotation.Nullable
  private String taxClass;

  /**
   * Tax status of fee.
   */
  @JsonAdapter(TaxStatusEnum.Adapter.class)
  public enum TaxStatusEnum {
    TAXABLE("taxable"),
    
    NONE("none");

    private String value;

    TaxStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TaxStatusEnum fromValue(String value) {
      for (TaxStatusEnum b : TaxStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TaxStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TaxStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TaxStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TaxStatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TaxStatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TAX_STATUS = "tax_status";
  @SerializedName(SERIALIZED_NAME_TAX_STATUS)
  @javax.annotation.Nullable
  private TaxStatusEnum taxStatus;

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

  public OrderFeeLine() {
  }

  public OrderFeeLine id(@javax.annotation.Nullable Integer id) {
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


  public OrderFeeLine name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Fee name.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public OrderFeeLine taxClass(@javax.annotation.Nullable String taxClass) {
    this.taxClass = taxClass;
    return this;
  }

  /**
   * Tax class of fee.
   * @return taxClass
   */
  @javax.annotation.Nullable
  public String getTaxClass() {
    return taxClass;
  }

  public void setTaxClass(@javax.annotation.Nullable String taxClass) {
    this.taxClass = taxClass;
  }


  public OrderFeeLine taxStatus(@javax.annotation.Nullable TaxStatusEnum taxStatus) {
    this.taxStatus = taxStatus;
    return this;
  }

  /**
   * Tax status of fee.
   * @return taxStatus
   */
  @javax.annotation.Nullable
  public TaxStatusEnum getTaxStatus() {
    return taxStatus;
  }

  public void setTaxStatus(@javax.annotation.Nullable TaxStatusEnum taxStatus) {
    this.taxStatus = taxStatus;
  }


  public OrderFeeLine total(@javax.annotation.Nullable String total) {
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


  public OrderFeeLine totalTax(@javax.annotation.Nullable String totalTax) {
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


  public OrderFeeLine taxes(@javax.annotation.Nullable List<OrderTaxLine> taxes) {
    this.taxes = taxes;
    return this;
  }

  public OrderFeeLine addTaxesItem(OrderTaxLine taxesItem) {
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


  public OrderFeeLine metaData(@javax.annotation.Nullable List<MetaData> metaData) {
    this.metaData = metaData;
    return this;
  }

  public OrderFeeLine addMetaDataItem(MetaData metaDataItem) {
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
    OrderFeeLine orderFeeLine = (OrderFeeLine) o;
    return Objects.equals(this.id, orderFeeLine.id) &&
        Objects.equals(this.name, orderFeeLine.name) &&
        Objects.equals(this.taxClass, orderFeeLine.taxClass) &&
        Objects.equals(this.taxStatus, orderFeeLine.taxStatus) &&
        Objects.equals(this.total, orderFeeLine.total) &&
        Objects.equals(this.totalTax, orderFeeLine.totalTax) &&
        Objects.equals(this.taxes, orderFeeLine.taxes) &&
        Objects.equals(this.metaData, orderFeeLine.metaData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, taxClass, taxStatus, total, totalTax, taxes, metaData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderFeeLine {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    taxClass: ").append(toIndentedString(taxClass)).append("\n");
    sb.append("    taxStatus: ").append(toIndentedString(taxStatus)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("tax_class");
    openapiFields.add("tax_status");
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
   * @throws IOException if the JSON Element is invalid with respect to OrderFeeLine
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderFeeLine.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderFeeLine is not found in the empty JSON string", OrderFeeLine.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderFeeLine.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderFeeLine` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("tax_class") != null && !jsonObj.get("tax_class").isJsonNull()) && !jsonObj.get("tax_class").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax_class` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tax_class").toString()));
      }
      if ((jsonObj.get("tax_status") != null && !jsonObj.get("tax_status").isJsonNull()) && !jsonObj.get("tax_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tax_status").toString()));
      }
      // validate the optional field `tax_status`
      if (jsonObj.get("tax_status") != null && !jsonObj.get("tax_status").isJsonNull()) {
        TaxStatusEnum.validateJsonElement(jsonObj.get("tax_status"));
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
       if (!OrderFeeLine.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderFeeLine' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderFeeLine> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderFeeLine.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderFeeLine>() {
           @Override
           public void write(JsonWriter out, OrderFeeLine value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderFeeLine read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OrderFeeLine given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OrderFeeLine
   * @throws IOException if the JSON string is invalid with respect to OrderFeeLine
   */
  public static OrderFeeLine fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderFeeLine.class);
  }

  /**
   * Convert an instance of OrderFeeLine to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

