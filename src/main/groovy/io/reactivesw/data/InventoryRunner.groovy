package io.reactivesw.data

import io.reactivesw.data.util.InventoryDataFactory
import io.reactivesw.data.util.RestClientFactory
import io.reactivesw.data.util.UrlUtils


public static def addData() {

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

    def inventory6 = RestClientFactory.post(UrlUtils.INVENTORYURL, InventoryDataFactory.oneplus3t46black2G32G)
    println("create inventory, id is: " + inventory6.id)

    def inventory7 = RestClientFactory.post(UrlUtils.INVENTORYURL, InventoryDataFactory.oneplus3t46black2G64G)
    println("create inventory, id is: " + inventory7.id)

    def inventory8 = RestClientFactory.post(UrlUtils.INVENTORYURL, InventoryDataFactory.oneplus3t46white2G32G)
    println("create inventory, id is: " + inventory8.id)

    def inventory9 = RestClientFactory.post(UrlUtils.INVENTORYURL, InventoryDataFactory.oneplus3t46white2G64G)
    println("create inventory, id is: " + inventory9.id)

    def inventory10 = RestClientFactory.post(UrlUtils.INVENTORYURL, InventoryDataFactory.oneplus3t50gold2G128G)
    println("create inventory, id is: " + inventory10.id)

    def inventory11 = RestClientFactory.post(UrlUtils.INVENTORYURL, InventoryDataFactory.jean170light16)
    println("create inventory, id is: " + inventory11.id)

    def inventory12 = RestClientFactory.post(UrlUtils.INVENTORYURL, InventoryDataFactory.jean170mediumblack16)
    println("create inventory, id is: " + inventory12.id)

    def inventory13 = RestClientFactory.post(UrlUtils.INVENTORYURL, InventoryDataFactory.jean175Dark16)
    println("create inventory, id is: " + inventory13.id)
    println("-------------------- end create inventory -----------------------")
}