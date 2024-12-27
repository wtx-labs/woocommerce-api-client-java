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
import wtx.woocommerce.api.client.model.MetaData;
import wtx.woocommerce.api.client.model.ProductAttribute;

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
 * Product
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-28T00:49:53.851918900+01:00[Europe/Warsaw]", comments = "Generator version: 7.10.0")
public class Product {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private Integer id;

  public static final String SERIALIZED_NAME_DATE_CREATED = "date_created";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  @javax.annotation.Nullable
  private OffsetDateTime dateCreated;

  public static final String SERIALIZED_NAME_DATE_MODIFIED = "date_modified";
  @SerializedName(SERIALIZED_NAME_DATE_MODIFIED)
  @javax.annotation.Nullable
  private OffsetDateTime dateModified;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_SKU = "sku";
  @SerializedName(SERIALIZED_NAME_SKU)
  @javax.annotation.Nullable
  private String sku;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nullable
  private String type;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private String status;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_SHORT_DESCRIPTION = "short_description";
  @SerializedName(SERIALIZED_NAME_SHORT_DESCRIPTION)
  @javax.annotation.Nullable
  private String shortDescription;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  @javax.annotation.Nullable
  private String price;

  public static final String SERIALIZED_NAME_STOCK_QUANTITY = "stock_quantity";
  @SerializedName(SERIALIZED_NAME_STOCK_QUANTITY)
  @javax.annotation.Nullable
  private Integer stockQuantity;

  public static final String SERIALIZED_NAME_STOCK_STATUS = "stock_status";
  @SerializedName(SERIALIZED_NAME_STOCK_STATUS)
  @javax.annotation.Nullable
  private String stockStatus;

  public static final String SERIALIZED_NAME_PARENT_ID = "parent_id";
  @SerializedName(SERIALIZED_NAME_PARENT_ID)
  @javax.annotation.Nullable
  private Integer parentId;

  public static final String SERIALIZED_NAME_VARIATIONS = "variations";
  @SerializedName(SERIALIZED_NAME_VARIATIONS)
  @javax.annotation.Nullable
  private List<Integer> variations = new ArrayList<>();

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  @javax.annotation.Nullable
  private List<ProductAttribute> attributes = new ArrayList<>();

  public static final String SERIALIZED_NAME_META_DATA = "meta_data";
  @SerializedName(SERIALIZED_NAME_META_DATA)
  @javax.annotation.Nullable
  private List<MetaData> metaData = new ArrayList<>();

  public Product() {
  }

  public Product id(@javax.annotation.Nullable Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the resource.
   * @return id
   */
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable Integer id) {
    this.id = id;
  }


  public Product dateCreated(@javax.annotation.Nullable OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

  /**
   * The date the product was created, in the site&#39;s timezone.
   * @return dateCreated
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(@javax.annotation.Nullable OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }


  public Product dateModified(@javax.annotation.Nullable OffsetDateTime dateModified) {
    this.dateModified = dateModified;
    return this;
  }

  /**
   * The date the product was last modified, in the site&#39;s timezone.
   * @return dateModified
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDateModified() {
    return dateModified;
  }

  public void setDateModified(@javax.annotation.Nullable OffsetDateTime dateModified) {
    this.dateModified = dateModified;
  }


  public Product name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Product name.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public Product sku(@javax.annotation.Nullable String sku) {
    this.sku = sku;
    return this;
  }

  /**
   * Unique identifier.
   * @return sku
   */
  @javax.annotation.Nullable
  public String getSku() {
    return sku;
  }

  public void setSku(@javax.annotation.Nullable String sku) {
    this.sku = sku;
  }


  public Product type(@javax.annotation.Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * Product type. Options: simple, grouped, external and variable. Default is simple.
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(@javax.annotation.Nullable String type) {
    this.type = type;
  }


  public Product status(@javax.annotation.Nullable String status) {
    this.status = status;
    return this;
  }

  /**
   * Product status (post status). Options: draft, pending, private and publish. Default is publish.
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable String status) {
    this.status = status;
  }


  public Product description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Product description.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public Product shortDescription(@javax.annotation.Nullable String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

  /**
   * Product short description.
   * @return shortDescription
   */
  @javax.annotation.Nullable
  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(@javax.annotation.Nullable String shortDescription) {
    this.shortDescription = shortDescription;
  }


  public Product price(@javax.annotation.Nullable String price) {
    this.price = price;
    return this;
  }

  /**
   * Current product price.
   * @return price
   */
  @javax.annotation.Nullable
  public String getPrice() {
    return price;
  }

  public void setPrice(@javax.annotation.Nullable String price) {
    this.price = price;
  }


  public Product stockQuantity(@javax.annotation.Nullable Integer stockQuantity) {
    this.stockQuantity = stockQuantity;
    return this;
  }

  /**
   * Stock quantity.
   * @return stockQuantity
   */
  @javax.annotation.Nullable
  public Integer getStockQuantity() {
    return stockQuantity;
  }

  public void setStockQuantity(@javax.annotation.Nullable Integer stockQuantity) {
    this.stockQuantity = stockQuantity;
  }


  public Product stockStatus(@javax.annotation.Nullable String stockStatus) {
    this.stockStatus = stockStatus;
    return this;
  }

  /**
   * Controls the stock status of the product. Options: instock, outofstock, onbackorder. Default is instock.
   * @return stockStatus
   */
  @javax.annotation.Nullable
  public String getStockStatus() {
    return stockStatus;
  }

  public void setStockStatus(@javax.annotation.Nullable String stockStatus) {
    this.stockStatus = stockStatus;
  }


  public Product parentId(@javax.annotation.Nullable Integer parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Product parent ID.
   * @return parentId
   */
  @javax.annotation.Nullable
  public Integer getParentId() {
    return parentId;
  }

  public void setParentId(@javax.annotation.Nullable Integer parentId) {
    this.parentId = parentId;
  }


  public Product variations(@javax.annotation.Nullable List<Integer> variations) {
    this.variations = variations;
    return this;
  }

  public Product addVariationsItem(Integer variationsItem) {
    if (this.variations == null) {
      this.variations = new ArrayList<>();
    }
    this.variations.add(variationsItem);
    return this;
  }

  /**
   * List of variations IDs.
   * @return variations
   */
  @javax.annotation.Nullable
  public List<Integer> getVariations() {
    return variations;
  }

  public void setVariations(@javax.annotation.Nullable List<Integer> variations) {
    this.variations = variations;
  }


  public Product attributes(@javax.annotation.Nullable List<ProductAttribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  public Product addAttributesItem(ProductAttribute attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

  /**
   * List of attributes.
   * @return attributes
   */
  @javax.annotation.Nullable
  public List<ProductAttribute> getAttributes() {
    return attributes;
  }

  public void setAttributes(@javax.annotation.Nullable List<ProductAttribute> attributes) {
    this.attributes = attributes;
  }


  public Product metaData(@javax.annotation.Nullable List<MetaData> metaData) {
    this.metaData = metaData;
    return this;
  }

  public Product addMetaDataItem(MetaData metaDataItem) {
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
    Product product = (Product) o;
    return Objects.equals(this.id, product.id) &&
        Objects.equals(this.dateCreated, product.dateCreated) &&
        Objects.equals(this.dateModified, product.dateModified) &&
        Objects.equals(this.name, product.name) &&
        Objects.equals(this.sku, product.sku) &&
        Objects.equals(this.type, product.type) &&
        Objects.equals(this.status, product.status) &&
        Objects.equals(this.description, product.description) &&
        Objects.equals(this.shortDescription, product.shortDescription) &&
        Objects.equals(this.price, product.price) &&
        Objects.equals(this.stockQuantity, product.stockQuantity) &&
        Objects.equals(this.stockStatus, product.stockStatus) &&
        Objects.equals(this.parentId, product.parentId) &&
        Objects.equals(this.variations, product.variations) &&
        Objects.equals(this.attributes, product.attributes) &&
        Objects.equals(this.metaData, product.metaData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dateCreated, dateModified, name, sku, type, status, description, shortDescription, price, stockQuantity, stockStatus, parentId, variations, attributes, metaData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    stockQuantity: ").append(toIndentedString(stockQuantity)).append("\n");
    sb.append("    stockStatus: ").append(toIndentedString(stockStatus)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    variations: ").append(toIndentedString(variations)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
    openapiFields.add("date_modified");
    openapiFields.add("name");
    openapiFields.add("sku");
    openapiFields.add("type");
    openapiFields.add("status");
    openapiFields.add("description");
    openapiFields.add("short_description");
    openapiFields.add("price");
    openapiFields.add("stock_quantity");
    openapiFields.add("stock_status");
    openapiFields.add("parent_id");
    openapiFields.add("variations");
    openapiFields.add("attributes");
    openapiFields.add("meta_data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Product
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Product.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Product is not found in the empty JSON string", Product.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Product.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Product` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("sku") != null && !jsonObj.get("sku").isJsonNull()) && !jsonObj.get("sku").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sku` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sku").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("short_description") != null && !jsonObj.get("short_description").isJsonNull()) && !jsonObj.get("short_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `short_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("short_description").toString()));
      }
      if ((jsonObj.get("price") != null && !jsonObj.get("price").isJsonNull()) && !jsonObj.get("price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("price").toString()));
      }
      if ((jsonObj.get("stock_status") != null && !jsonObj.get("stock_status").isJsonNull()) && !jsonObj.get("stock_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stock_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stock_status").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("variations") != null && !jsonObj.get("variations").isJsonNull() && !jsonObj.get("variations").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `variations` to be an array in the JSON string but got `%s`", jsonObj.get("variations").toString()));
      }
      if (jsonObj.get("attributes") != null && !jsonObj.get("attributes").isJsonNull()) {
        JsonArray jsonArrayattributes = jsonObj.getAsJsonArray("attributes");
        if (jsonArrayattributes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("attributes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `attributes` to be an array in the JSON string but got `%s`", jsonObj.get("attributes").toString()));
          }

          // validate the optional field `attributes` (array)
          for (int i = 0; i < jsonArrayattributes.size(); i++) {
            ProductAttribute.validateJsonElement(jsonArrayattributes.get(i));
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
       if (!Product.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Product' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Product> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Product.class));

       return (TypeAdapter<T>) new TypeAdapter<Product>() {
           @Override
           public void write(JsonWriter out, Product value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Product read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Product given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Product
   * @throws IOException if the JSON string is invalid with respect to Product
   */
  public static Product fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Product.class);
  }

  /**
   * Convert an instance of Product to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

