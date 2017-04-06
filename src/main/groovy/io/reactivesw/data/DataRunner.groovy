package io.reactivesw.data

import io.reactivesw.data.util.*

/**
 * Created by Davis on 17/4/1.
 */
class DataRunner {
    public static void main(String[] args) {
        createCatalog()
        createInventory()
    }

    private static void createCatalog() {
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

        def iphone10 = ProductDataFactory.iphone10
        iphone10['categories'][0]['id'] = smartPhoneCategory.id
        iphone10['productType']['id'] = smartPhoneProductType.id
        def iphone10Product = RestClientFactory.post(UrlUtils.PRODUCTURL, iphone10)
        println("create product, id is: " + iphone10Product.id)

        println("-------------------- end create product -----------------------")
    }

    static def createInventory() {

        println("-------------------- create inventory -----------------------")

        def inventory1 = RestClientFactory.post(UrlUtils.INVENTORYURL, InventoryDataFactory.alienware15R2i78888HK960m15)
        println("create inventory, id is: " + inventory1.id)

        def inventory2 = RestClientFactory.post(UrlUtils.INVENTORYURL, InventoryDataFactory.alienware15R2i78888HK970m17)
        println("create inventory, id is: " + inventory2.id)

        def inventory3 = RestClientFactory.post(UrlUtils.INVENTORYURL, InventoryDataFactory.blouseBlack170)
        println("create inventory, id is: " + inventory3.id)

        def inventory4 = RestClientFactory.post(UrlUtils.INVENTORYURL, InventoryDataFactory.blouseBlack175)
        println("create inventory, id is: " + inventory4.id)

        def inventory5 = RestClientFactory.post(UrlUtils.INVENTORYURL, InventoryDataFactory.blouseYellow170)
        println("create inventory, id is: " + inventory5.id)

        def inventory6 = RestClientFactory.post(UrlUtils.INVENTORYURL, InventoryDataFactory.iPhone1046black2G32G)
        println("create inventory, id is: " + inventory6.id)

        def inventory7 = RestClientFactory.post(UrlUtils.INVENTORYURL, InventoryDataFactory.iPhone1046black2G64G)
        println("create inventory, id is: " + inventory7.id)

        def inventory8 = RestClientFactory.post(UrlUtils.INVENTORYURL, InventoryDataFactory.iPhone1046white2G32G)
        println("create inventory, id is: " + inventory8.id)

        def inventory9 = RestClientFactory.post(UrlUtils.INVENTORYURL, InventoryDataFactory.iPhone1046white2G64G)
        println("create inventory, id is: " + inventory9.id)

        def inventory10 = RestClientFactory.post(UrlUtils.INVENTORYURL, InventoryDataFactory.iPhone1050gold2G128G)
        println("create inventory, id is: " + inventory10.id)

        def inventory11 = RestClientFactory.post(UrlUtils.INVENTORYURL, InventoryDataFactory.jean170light16)
        println("create inventory, id is: " + inventory11.id)

        def inventory12 = RestClientFactory.post(UrlUtils.INVENTORYURL, InventoryDataFactory.jean170mediumblack16)
        println("create inventory, id is: " + inventory12.id)

        def inventory13 = RestClientFactory.post(UrlUtils.INVENTORYURL, InventoryDataFactory.jean175Dark16)
        println("create inventory, id is: " + inventory13.id)
        println("-------------------- end create inventory -----------------------")
    }
}
