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
        def tShirt = ProductDataFactory.TShirt
        tShirt['categories'][0]['id'] = clothesCategory.id
        tShirt['productType']['id'] = clotheProductType.id
        def tShirtProduct = RestClientFactory.post(UrlUtils.PRODUCTURL, tShirt)
        println("create product, id is: " + tShirtProduct.id)

        def msigt79 = ProductDataFactory.MSIGT79
        msigt79['categories'][0]['id'] = lapTopCategory.id
        msigt79['productType']['id'] = lapTopProductType.id
        def msigt79Product = RestClientFactory.post(UrlUtils.PRODUCTURL, msigt79)
        println("create product, id is: " + msigt79Product.id)

        def iphone18 = ProductDataFactory.iphone18
        iphone18['categories'][0]['id'] = smartPhoneCategory.id
        iphone18['productType']['id'] = smartPhoneProductType.id
        def iphone18Product = RestClientFactory.post(UrlUtils.PRODUCTURL, iphone18)
        println("create product, id is: " + iphone18Product.id)

        def iphone10 = ProductDataFactory.iphone10
        iphone10['categories'][0]['id'] = smartPhoneCategory.id
        iphone10['productType']['id'] = smartPhoneProductType.id
        def iphone10Product = RestClientFactory.post(UrlUtils.PRODUCTURL, iphone10)
        println("create product, id is: " + iphone10Product.id)

        println("-------------------- end create product -----------------------")
    }

    static def createInventory() {

        println("-------------------- create inventory -----------------------")

        def inventory1 = RestClientFactory.post(UrlUtils.INVENTORYURL, InventoryDataFactory.inventoryEntry1)
        println("create inventory, id is: " + inventory1.id)

        def inventory2 = RestClientFactory.post(UrlUtils.INVENTORYURL, InventoryDataFactory.inventoryEntry2)
        println("create inventory, id is: " + inventory2.id)

        def inventory3 = RestClientFactory.post(UrlUtils.INVENTORYURL, InventoryDataFactory.inventoryEntry3)
        println("create inventory, id is: " + inventory3.id)

        def inventory4 = RestClientFactory.post(UrlUtils.INVENTORYURL, InventoryDataFactory.inventoryEntry4)
        println("create inventory, id is: " + inventory4.id)

        def inventory5 = RestClientFactory.post(UrlUtils.INVENTORYURL, InventoryDataFactory.inventoryEntry5)
        println("create inventory, id is: " + inventory5.id)

        def inventory6 = RestClientFactory.post(UrlUtils.INVENTORYURL, InventoryDataFactory.inventoryEntry6)
        println("create inventory, id is: " + inventory6.id)

        def inventory7 = RestClientFactory.post(UrlUtils.INVENTORYURL, InventoryDataFactory.inventoryEntry7)
        println("create inventory, id is: " + inventory7.id)

        def inventory8 = RestClientFactory.post(UrlUtils.INVENTORYURL, InventoryDataFactory.inventoryEntry8)
        println("create inventory, id is: " + inventory8.id)

        def inventory9 = RestClientFactory.post(UrlUtils.INVENTORYURL, InventoryDataFactory.inventoryEntry9)
        println("create inventory, id is: " + inventory9.id)

        def inventory10 = RestClientFactory.post(UrlUtils.INVENTORYURL, InventoryDataFactory.inventoryEntry10)
        println("create inventory, id is: " + inventory10.id)

        def inventory11 = RestClientFactory.post(UrlUtils.INVENTORYURL, InventoryDataFactory.inventoryEntry11)
        println("create inventory, id is: " + inventory11.id)

        def inventory12 = RestClientFactory.post(UrlUtils.INVENTORYURL, InventoryDataFactory.inventoryEntry12)
        println("create inventory, id is: " + inventory12.id)

        def inventory13 = RestClientFactory.post(UrlUtils.INVENTORYURL, InventoryDataFactory.inventoryEntry13)
        println("create inventory, id is: " + inventory13.id)

        def inventory14 = RestClientFactory.post(UrlUtils.INVENTORYURL, InventoryDataFactory.inventoryEntry14)
        println("create inventory, id is: " + inventory14.id)

        def inventory15 = RestClientFactory.post(UrlUtils.INVENTORYURL, InventoryDataFactory.inventoryEntry15)
        println("create inventory, id is: " + inventory15.id)

        def inventory16 = RestClientFactory.post(UrlUtils.INVENTORYURL, InventoryDataFactory.inventoryEntry16)
        println("create inventory, id is: " + inventory16.id)

        def inventory17 = RestClientFactory.post(UrlUtils.INVENTORYURL, InventoryDataFactory.inventoryEntry17)
        println("create inventory, id is: " + inventory17.id)

        def inventory18 = RestClientFactory.post(UrlUtils.INVENTORYURL, InventoryDataFactory.inventoryEntry18)
        println("create inventory, id is: " + inventory18.id)

        def inventory19 = RestClientFactory.post(UrlUtils.INVENTORYURL, InventoryDataFactory.inventoryEntry19)
        println("create inventory, id is: " + inventory19.id)

        def inventory20 = RestClientFactory.post(UrlUtils.INVENTORYURL, InventoryDataFactory.inventoryEntry20)
        println("create inventory, id is: " + inventory20.id)

        def inventory21 = RestClientFactory.post(UrlUtils.INVENTORYURL, InventoryDataFactory.inventoryEntry21)
        println("create inventory, id is: " + inventory21.id)

        def inventory22 = RestClientFactory.post(UrlUtils.INVENTORYURL, InventoryDataFactory.inventoryEntry22)
        println("create inventory, id is: " + inventory22.id)

        def inventory23 = RestClientFactory.post(UrlUtils.INVENTORYURL, InventoryDataFactory.inventoryEntry23)
        println("create inventory, id is: " + inventory23.id)

        def inventory24 = RestClientFactory.post(UrlUtils.INVENTORYURL, InventoryDataFactory.inventoryEntry24)
        println("create inventory, id is: " + inventory24.id)

        def inventory25 = RestClientFactory.post(UrlUtils.INVENTORYURL, InventoryDataFactory.inventoryEntry25)
        println("create inventory, id is: " + inventory25.id)

        println("-------------------- end create inventory -----------------------")
    }
}
