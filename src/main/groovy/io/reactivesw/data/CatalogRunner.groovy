package io.reactivesw.data

import io.reactivesw.data.util.CategoryDataFactory
import io.reactivesw.data.util.ProductDataFactory
import io.reactivesw.data.util.ProductTypeDataFactory
import io.reactivesw.data.util.RestClientFactory
import io.reactivesw.data.util.UrlUtils

public def static addData() {
    println("-------------------- create category -----------------------")
    def clothesCategory = RestClientFactory.post(UrlUtils.CATEGORYURL, CategoryDataFactory.clothes)
    println("create clothe category, id is: " + clothesCategory.id)

    def pantsCategory = RestClientFactory.post(UrlUtils.CATEGORYURL, CategoryDataFactory.pants)
    println("create pants category, id is: " + pantsCategory.id)

    def lapTopCategory = RestClientFactory.post(UrlUtils.CATEGORYURL, CategoryDataFactory.lapTop)
    println("create laptop category, id is: " + lapTopCategory.id)

    def smartPhoneCategory = RestClientFactory.post(UrlUtils.CATEGORYURL, CategoryDataFactory.smartPhone)
    println("create smart phone category, id is: " + smartPhoneCategory.id)

    println("-------------------- end create category --------------------")

    println("-------------------- create product type -----------------------")
    def clotheProductType = RestClientFactory.post(UrlUtils.PRODUCTTYPEURL, ProductTypeDataFactory.clothes)
    println("create clothes product type, id is: " + clotheProductType.id)

    def smartPhoneProductType = RestClientFactory.post(UrlUtils.PRODUCTTYPEURL, ProductTypeDataFactory.smartPhone)
    println("create smartPhone product type, id is: " + smartPhoneProductType.id)

    def lapTopProductType = RestClientFactory.post(UrlUtils.PRODUCTTYPEURL, ProductTypeDataFactory.lapTop)
    println("create lapTop product type, id is: " + lapTopProductType.id)

    def pantsProductType = RestClientFactory.post(UrlUtils.PRODUCTTYPEURL, ProductTypeDataFactory.pants)
    println("create pants product type, id is: " + pantsProductType.id)

    println("-------------------- end create product type -----------------------")

    println("-------------------- create product  -----------------------")
    def blouse = ProductDataFactory.blouse
    blouse['categories'][0]['id'] = "ed79f652-ed9f-49ca-9e34-bc9578768762"
    blouse['productType']['id'] = "3c743a07-1a39-4925-843f-bb4d3127779c"
    def blouseProduct = RestClientFactory.post(UrlUtils.PRODUCTURL, blouse)
    println("create blouse product, id is: " + blouseProduct.id)

    def levisJean = ProductDataFactory.levisJean
    levisJean['categories'][0]['id'] = "581f0d41-98b8-4e61-be95-8098eef89b71"
    levisJean['productType']['id'] = "784b277b-686b-43c6-b5a7-d15317748ab2"
    def levisJeanProduct = RestClientFactory.post(UrlUtils.PRODUCTURL, levisJean)
    println("create levisJean product, id is: " + levisJeanProduct.id)

    def alienware15R2 = ProductDataFactory.alienware15R2
    alienware15R2['categories'][0]['id'] = "52cb49ef-6fd3-477f-8978-f4e0d2e9aefa"
    alienware15R2['productType']['id'] = "946b3058-6f97-43d7-af49-1a885cf5331f"
    def alienware15R2Product = RestClientFactory.post(UrlUtils.PRODUCTURL, alienware15R2)
    println("create alienware15R2 product, id is: " + alienware15R2Product.id)

    def onePlus3T = ProductDataFactory.onePlus3T
    onePlus3T['categories'][0]['id'] = "9df106d4-e063-48fb-8061-21e0e4c6db56"
    onePlus3T['productType']['id'] = "ef4233ae-05f9-4255-9985-09badd747ceb"
    def onePlus3TProduct = RestClientFactory.post(UrlUtils.PRODUCTURL, onePlus3T)
    println("create iphone10 product, id is: " + onePlus3TProduct.id)

    println("-------------------- end create product -----------------------")
}