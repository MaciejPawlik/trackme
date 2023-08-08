package com.example.trackme.domain

import java.net.URL

data class Tracked(val url: URL) : TrackedUrl {
    override fun getURL() = url
}