package io.reactivesw.data.util

/**
 * Created by Davis on 17/4/1.
 */
class ProductTypeDataFactory {
    static def slurper = new groovy.json.JsonSlurper()

    public static def getClothes() {
        return slurper.parse(new FileReader("src/main/resources/product_type/clothes.json"))
    }

    public static def getComputer() {
        return slurper.parse(new FileReader("src/main/resources/product_type/computer.json"))
    }

    public static def getLapTop() {
        return slurper.parse(new FileReader("src/main/resources/product_type/gaming_lap_top.json"))
    }

    public static def getPants() {
        return slurper.parse(new FileReader("src/main/resources/product_type/pants.json"))
    }

    public static def getSmartPhone() {
        return slurper.parse(new FileReader("src/main/resources/product_type/smart_phone.json"))
    }
}
