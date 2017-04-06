package io.reactivesw.data.util

/**
 * Created by Davis on 17/4/1.
 */
class InventoryDataFactory {
    static def slurper = new groovy.json.JsonSlurper()

    public static def getAlienware15R2i78888HK960m15() {
        return slurper.parse(new FileReader("src/main/resources/inventory/Alienware15R2-i7-8888HK-960m-15.json"))
    }

    public static def getAlienware15R2i78888HK970m17() {
        return slurper.parse(new FileReader("src/main/resources/inventory/Alienware15R2-i7-8888HK-970m-17.json"))
    }

    public static def getBlouseBlack170() {
        return slurper.parse(new FileReader("src/main/resources/inventory/blouse-black-170.json"))
    }

    public static def getBlouseBlack175() {
        return slurper.parse(new FileReader("src/main/resources/inventory/blouse-black-175.json"))
    }

    public static def getBlouseYellow170() {
        return slurper.parse(new FileReader("src/main/resources/inventory/blouse-yellow-170.json"))
    }

    public static def getiPhone1046black2G32G() {
        return slurper.parse(new FileReader("src/main/resources/inventory/iPhone10-4_6-black-2G-32G.json"))
    }

    public static def getiPhone1046black2G64G() {
        return slurper.parse(new FileReader("src/main/resources/inventory/iPhone10-4_6-black-2G-64G.json"))
    }

    public static def getiPhone1046white2G32G() {
        return slurper.parse(new FileReader("src/main/resources/inventory/iPhone10-4_6-white-2G-32G.json"))
    }

    public static def getiPhone1046white2G64G() {
        return slurper.parse(new FileReader("src/main/resources/inventory/iPhone10-4_6-white-2G-64G.json"))
    }

    public static def getiPhone1050gold2G128G() {
        return slurper.parse(new FileReader("src/main/resources/inventory/iPhone10-5_0-gold-2G-128G.json"))
    }

    public static def getJean170light16() {
        return slurper.parse(new FileReader("src/main/resources/inventory/jean-170-light-16.json"))
    }

    public static def getJean170mediumblack16() {
        return slurper.parse(new FileReader("src/main/resources/inventory/jean-170-medium_black-16.json"))
    }

    public static def getJean175Dark16() {
        return slurper.parse(new FileReader("src/main/resources/inventory/jean-175-Dark-16.json"))
    }
}
