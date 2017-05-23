package io.reactivesw.data.util

/**
 * Created by Davis on 17/4/1.
 */
class ProductDataFactory {
    static def slurper = new groovy.json.JsonSlurper()

    public static def getBlouse() {
        return slurper.parse(new FileReader("src/main/resources/product/Blouse.json"))
    }

    public static def getOnePlus3T() {
        return slurper.parse(new FileReader("src/main/resources/product/OnePlus3T.json"))
    }

    public static def getAlienware15R2() {
        return slurper.parse(new FileReader("src/main/resources/product/Alienware15R2.json"))
    }

    public static def getLevisJean() {
        return slurper.parse(new FileReader("src/main/resources/product/Levis_Jean.json"))
    }

    public static def getPublishAction() {
        return slurper.parse(new FileReader("src/main/resources/product/PublishAction.json"))
    }
}
