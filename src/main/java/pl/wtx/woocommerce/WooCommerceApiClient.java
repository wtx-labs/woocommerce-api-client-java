package pl.wtx.woocommerce;

import pl.wtx.woocommerce.api.client.config.GsonConfig;
import pl.wtx.woocommerce.api.client.config.OkHttpClientConfig;
import pl.wtx.woocommerce.api.client.invoker.ApiClient;
import pl.wtx.woocommerce.api.client.invoker.JSON;

/**
 * WooCommerce API Client
 * @author WTX Labs
 * @see https://github.com/wtx-labs/woocommerce-api-client-java
 * @license MIT
 */
public class WooCommerceApiClient extends ApiClient {

    // Default setup of the API Client to provide ignoring not recognized fields in the response.
    public WooCommerceApiClient() {
        JSON.setGson(GsonConfig.createGson());
        setUserAgent("WooCommerceApiClient (by wtx-labs)");
    }

    // Default configuration improved with logging API communication messages.
    public WooCommerceApiClient(boolean enableLoggingApiMessages) {
        JSON.setGson(GsonConfig.createGson());
        setUserAgent("WooCommerceApiClient (by wtx-labs)");
        if (enableLoggingApiMessages) {
            setHttpClient(OkHttpClientConfig.configureClient(getHttpClient()));
        }
    }

}
