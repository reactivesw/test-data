package io.reactivesw.data.util

/**
 * Created by Davis on 17/4/1.
 */
class CategoryDataFactory {
    static def slurper = new groovy.json.JsonSlurper()

    public static def getClothes() {
        return slurper.parse(new FileReader("src/main/resources/category/clothes.json"))
    }

    public static def getLapTop() {
        return slurper.parse(new FileReader("src/main/resources/category/lap_top.json"))
    }

    public static def getPants() {
        return slurper.parse(new FileReader("src/main/resources/category/pants.json"))
    }

    public static def getSmartPhone() {
        return slurper.parse(new FileReader("src/main/resources/category/smart_phone.json"))
    }
}
