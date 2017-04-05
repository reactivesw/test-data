package io.reactivesw.data

import io.reactivesw.data.util.ProductDataFactory
import io.reactivesw.data.util.RestClientFactory
import io.reactivesw.data.util.UrlUtils

/**
 * Created by rai on 17/4/2.
 */
class ProductDataRunner {
    public static void main(String[] args) {
        def mechrevo = ProductDataFactory.MECHREVO
        mechrevo['categories'][0]['id'] = "b6d8b3d8-6ab9-42c5-8d30-a5ab19ade16e"
        mechrevo['productType']['id'] = "f21ed464-b97d-42e1-ad80-97fbc49a6ddd"
        def mechrevoProduct = RestClientFactory.post(UrlUtils.PRODUCTURL, mechrevo)
        println("create product, id is: " + mechrevoProduct.id)
    }
}
