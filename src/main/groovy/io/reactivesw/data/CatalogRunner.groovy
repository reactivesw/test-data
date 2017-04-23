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
    blouse['categories'][0]['id'] = clothesCategory.id
    blouse['productType']['id'] = clotheProductType.id
    def blouseProduct = RestClientFactory.post(UrlUtils.PRODUCTURL, blouse)
    println("create blouse product, id is: " + blouseProduct.id)

    def levisJean = ProductDataFactory.levisJean
    levisJean['categories'][0]['id'] = pantsCategory.id
    levisJean['productType']['id'] = pantsProductType.id
    def levisJeanProduct = RestClientFactory.post(UrlUtils.PRODUCTURL, levisJean)
    println("create levisJean product, id is: " + levisJeanProduct.id)

    def alienware15R2 = ProductDataFactory.alienware15R2
    alienware15R2['categories'][0]['id'] = lapTopCategory.id
    alienware15R2['productType']['id'] = lapTopProductType.id
    def alienware15R2Product = RestClientFactory.post(UrlUtils.PRODUCTURL, alienware15R2)
    println("create alienware15R2 product, id is: " + alienware15R2Product.id)

    def onePlus3T = ProductDataFactory.onePlus3T
    onePlus3T['categories'][0]['id'] = smartPhoneCategory.id
    onePlus3T['productType']['id'] = smartPhoneProductType.id
    def onePlus3TProduct = RestClientFactory.post(UrlUtils.PRODUCTURL, onePlus3T)
    println("create iphone10 product, id is: " + onePlus3TProduct.id)

    println("-------------------- end create product -----------------------")
}