package com.example.trackme.domain

import java.net.URL

interface TrackedUrl {
    fun getURL(): URL
/*
    fun getResponse(): String

    fun getFieldPaths(): Map<String, String>

    fun getCurrent(): Map<String, String>

    fun getPrevious(): Map<String, String>*/
}