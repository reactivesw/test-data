package io.reactivesw.data

import io.reactivesw.data.util.ProductTypeDataFactory
import io.reactivesw.data.util.RestClientFactory

/**
 * Created by rai on 17/4/2.
 */
class ProductTypeDataRunner {
    public static void main(String[] args) {

        println("-------------------- create product type -----------------------")
        String url = "http://localhost:8089/"
        def clotheProductType = RestClientFactory.post(url, ProductTypeDataFactory.clothes)
        println("create product type, id is: " + clotheProductType.id)

        def smartPhoneProductType = RestClientFactory.post(url, ProductTypeDataFactory.smartPhone)
        println("create product type, id is: " + smartPhoneProductType.id)

        def computerProductType = RestClientFactory.post(url, ProductTypeDataFactory.computer)
        println("create product type, id is: " + computerProductType.id)

        def lapTopProductType = RestClientFactory.post(url, ProductTypeDataFactory.lapTop)
        println("create product type, id is: " + lapTopProductType.id)

        def pantsProductType = RestClientFactory.post(url, ProductTypeDataFactory.pants)
        println("create product type, id is: " + pantsProductType.id)

        println("-------------------- end create product type -----------------------")
    }
}
