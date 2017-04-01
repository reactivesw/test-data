package io.reactivesw.data.util

/**
 * Created by Davis on 17/4/1.
 */
class ProductDataFactory {
    static def slurper = new groovy.json.JsonSlurper()

    public static def getTShirt() {
        return slurper.parse(new FileReader("src/main/resources/product/T-Shirt.json"))
    }

    public static def getIphone10() {
        return slurper.parse(new FileReader("src/main/resources/product/iPhone10.json"))
    }

    public static def getIphone18() {
        return slurper.parse(new FileReader("src/main/resources/product/iPhone18.json"))
    }

    public static def getMECHREVO() {
        return slurper.parse(new FileReader("src/main/resources/product/MECHREVO.json"))
    }

    public static def getMSIGT78() {
        return slurper.parse(new FileReader("src/main/resources/product/MSI_GT78.json"))
    }

    public static def getMSIGT79() {
        return slurper.parse(new FileReader("src/main/resources/product/MSI_GT79.json"))
    }

    public static def getLevisJean() {
        return slurper.parse(new FileReader("src/main/resources/product/Levis_Jean.json"))
    }
}
