package io.reactivesw.data.util

import groovyx.net.http.ContentType
import groovyx.net.http.RESTClient

/**
 * Created by Davis on 17/4/1.
 */
class RestClientFactory {
    public static def getJsonClient(String url) {
        def client = new RESTClient(url)
        client.contentType = ContentType.JSON
        client.handler.failure = { resp ->
            resp.status
        }
        return client
    }

    public static def post(String url, def body) {
        def client = getJsonClient(url)
        def response = client.post(body: body)
        return response.data
    }
}
