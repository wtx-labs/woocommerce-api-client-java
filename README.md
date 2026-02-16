# WooCommerce API Client for Java

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Java Version](https://img.shields.io/badge/Java-8%2B-blue)](https://www.java.com)
[![Maven Central](https://img.shields.io/maven-central/v/pl.wtx.woocommerce/woocommerce-api-client?label=Maven%20Central&logo=apache-maven&color=blue)](https://mvnrepository.com/artifact/pl.wtx.woocommerce/woocommerce-api-client)

A lightweight Java client library for WooCommerce REST API integration. Built for Java developers who need to integrate their applications with WooCommerce e-commerce platform. 🚀

This API client provides a type-safe Java interface for WooCommerce REST API v3, enabling seamless management of:

- **Products & Inventory Management**
  - Products with full CRUD operations, variations, duplication, and batch processing
  - Product attributes, attribute terms, categories, tags, shipping classes, and reviews
  - Complete product catalog management with inventory tracking

- **Customer & Order Management**
  - Customer data management with full CRUD and batch operations
  - Order processing with complete lifecycle management
  - Order notes for internal communication and tracking
  - Order refunds for financial transaction handling

- **E-commerce Operations**
  - Coupon management for discounts and promotions
  - Payment gateway configuration and management
  - Tax rates and tax classes configuration
  - Shipping zones, locations, and shipping methods setup

- **Store Configuration**
  - Settings management for store configuration
  - Webhook setup for real-time event notifications
  - System status monitoring and diagnostic tools

- **Reporting & Analytics**
  - Sales reports and summaries
  - Top sellers analysis
  - Totals reports for coupons, customers, orders, products, and reviews

## ✨ Why choose this client?

- 💡 **Type-Safe Java API** - fully typed interfaces for WooCommerce REST endpoints
- 🛡️ **Basic authentication** - secure WooCommerce API access
- 📚 **Clear documentation** - comprehensive examples for Java integration
- 🚀 **Wide Java support** - compatible with Java 8 and newer
- ⚡ **OpenAPI Generated** - based on our [OpenAPI specification](https://github.com/wtx-labs/woocommerce-api-openapi-specification) developed from official WooCommerce documentation

- ✅ Customers API
  - List all customers
  - Create a new customer
  - Get a specific customer
  - Update a customer
  - Delete a customer
  - Batch create, update and delete multiple customers

- ✅ Products API
  - List all products
  - Create a new product
  - Get a specific product
  - Update a product
  - Delete a product
  - Duplicate a product
  - Batch create, update and delete multiple products

- ✅ Product Variations API
  - List all variations of a product
  - Create a new product variation
  - Get a specific product variation
  - Update a product variation
  - Delete a product variation
  - Batch create, update and delete multiple product variations

- ✅ Product Attributes API
  - List all product attributes
  - Create a new product attribute
  - Get a specific product attribute
  - Update a product attribute
  - Delete a product attribute
  - Batch create, update and delete multiple product attributes

- ✅ Product Attribute Terms API
  - List all terms of a product attribute
  - Create a new product attribute term
  - Get a specific product attribute term
  - Update a product attribute term
  - Delete a product attribute term
  - Batch create, update and delete attribute terms

- ✅ Product Categories API
  - List all product categories
  - Create a new product category
  - Get a specific product category
  - Update a product category
  - Delete a product category
  - Batch create, update and delete multiple product categories

- ✅ Product Shipping Classes API
  - List all product shipping classes
  - Create a new product shipping class
  - Get a specific product shipping class
  - Update a product shipping class
  - Delete a product shipping class
  - Batch create, update and delete multiple shipping classes

- ✅ Product Tags API
  - List all product tags
  - Create a new product tag
  - Get a specific product tag
  - Update a product tag
  - Delete a product tag
  - Batch create, update and delete multiple product tags

- ✅ Product Reviews API
  - List all product reviews
  - Create a new product review
  - Get a specific product review
  - Update a product review
  - Delete a product review
  - Batch create, update and delete multiple product reviews

- ✅ Orders API
  - List all orders
  - Create a new order
  - Get a specific order
  - Update an order
  - Delete an order
  - Batch create, update and delete multiple orders

- ✅ Order Notes API
  - List all notes for an order
  - Create a new order note
  - Get a specific order note
  - Delete an order note

- ✅ Order Refunds API
  - List all refunds for an order
  - Create a new order refund
  - Get a specific order refund
  - Delete an order refund

- ✅ Coupons API
  - List all coupons
  - Create a new coupon
  - Get a specific coupon
  - Update a coupon
  - Delete a coupon
  - Batch create, update and delete multiple coupons

- ✅ Settings API
  - List all settings groups
  - Get a specific settings group
  - Get a specific setting
  - Update a specific setting

- ✅ Shipping Zones API
  - List all shipping zones
  - Create a new shipping zone
  - Get a specific shipping zone
  - Update a shipping zone
  - Delete a shipping zone

- ✅ Shipping Zone Locations API
  - List all locations for a shipping zone
  - Update locations for a shipping zone

- ✅ Shipping Zone Methods API
  - List all shipping methods for a shipping zone
  - Create a new shipping method for a shipping zone
  - Get a specific shipping zone method
  - Update a shipping zone method
  - Delete a shipping zone method

- ✅ Payment Gateways API
  - List all payment gateways
  - Get a specific payment gateway
  - Update a payment gateway

- ✅ Taxes API
  - List all taxes
  - Create a new tax
  - Get a specific tax
  - Update a tax
  - Delete a tax
  - Batch create, update and delete multiple taxes

- ✅ Tax Classes API
  - List all tax classes
  - Create a new tax class
  - Get a specific tax class by slug
  - Delete a tax class

- ✅ Webhooks API
  - List all webhooks
  - Create a new webhook
  - Get a specific webhook
  - Update a webhook
  - Delete a webhook
  - Batch create, update and delete multiple webhooks

- ✅ Reports API
  - List all reports
  - Retrieve and view sales report
  - Retrieve and view top sellers report
  - Retrieve and view coupons totals report
  - Retrieve and view customers totals report
  - Retrieve and view orders totals report
  - Retrieve and view products totals report
  - Retrieve and view reviews totals report

- ✅ System Status API
  - Get system status
  - List all system status tools
  - Get a specific system status tool
  - Run a system status tool

## 📦 Version information

- **Current version**: `1.0.0`
- **Supported WooCommerce API version**: `v3`
- **Java compatibility**: Java 8+

## 🔓 License

**MIT License**

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files, to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the software.

The only requirement is to preserve the original author attribution in the source code and documentation.

## 🚀 Quick start guide

### 1️⃣ Installation

You can add the library to your project by including the dependency from Maven Central:
```xml
<!-- https://mvnrepository.com/artifact/pl.wtx.woocommerce/woocommerce-api-client -->
<dependency>
    <groupId>pl.wtx.woocommerce</groupId>
    <artifactId>woocommerce-api-client</artifactId>
    <version>1.0.0</version>
</dependency>
```

Alternatively, clone and build the library from source:

```sh
git clone https://github.com/wtx-labs/woocommerce-api-client-java.git
cd woocommerce-api-client-java
mvn clean install
```

Then add the locally built artifact to your project:

```xml
<dependency>
    <groupId>pl.wtx.woocommerce</groupId>
    <artifactId>woocommerce-api-client</artifactId>
    <version>1.0.0</version>
</dependency>
```

### 2️⃣ Java integration example

Here's how to fetch WooCommerce customer data using the client:

```java
package pl.wtx.woocommerce;

import java.util.List;

import pl.wtx.woocommerce.api.client.CustomersApi;
import pl.wtx.woocommerce.api.client.invoker.ApiException;
import pl.wtx.woocommerce.api.client.model.Customer;

public class WooCommerceApiClientUsageDemo {

    // TODO: Set your WooCommerce API base path!
    private static final String API_BASE_PATH = "https://your-woocommerce-shop.com/wp-json/wc/v3";
    private static final String API_USERNAME = "TODO_SET_API_USERNAME";
    private static final String API_PASSWORD = "TODO_SET_API_PASSWORD";

    public static void main(String[] args) {

        System.out.println(">>> Start running the WooCommerceApiClientUsageDemo...");

        // Use WooCommerceApiClient(true) if you need to log API communication messages.
        WooCommerceApiClient apiClient = new WooCommerceApiClient();

        apiClient.setBasePath(API_BASE_PATH);
        apiClient.setUsername(API_USERNAME);
        apiClient.setPassword(API_PASSWORD);

        CustomersApi customersApi = new CustomersApi(apiClient);

        try {

            List<Customer> customers = customersApi.listAllCustomers(
                null, null, null, null, null, null, null, null, null, null, null
            );

            // Example list of customer's emails:
            customers.forEach(customer -> System.out.println("Customer: " + customer.getEmail()));

        } catch (ApiException e) {
            System.err.println("Error occurred during API call: " + e);
        }

        System.out.println("<<< The WooCommerceApiClientUsageDemo has been finished.");

    }

}
```

## 🔗 Get involved

- ✨ Check our [GitHub Issues](https://github.com/wtx-labs/woocommerce-api-client-java/issues) for latest updates
- 💡 Have suggestions? Open an Issue or contribute to the project
- 🌟 Star this repository if you find it helpful!

## 📊 Project statistics

- ⭐ 9 GitHub stars
- 🔄 Regular updates and improvements
- 👥 Open for community contributions

## 🔍 Keywords

woocommerce java client, woocommerce rest api java, java woocommerce integration, woocommerce api v3 java, e-commerce java integration, woocommerce java library, java rest api client woocommerce, woocommerce api client library for java

🚀 Happy coding! 😊

**Your WTX Labs Team** 🚀
