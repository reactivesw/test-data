## How to Run

### 0. Introduction

This project uses following technology:

* gradle 3.1
* groovy 2.4
* http-builder 0.7

### 1. Change root url

open `UrlUtils.groovy`, edit field `ROOTURL`, set it to api-gateway url.

### 2. Run project

```shell
gradle addData -q
```