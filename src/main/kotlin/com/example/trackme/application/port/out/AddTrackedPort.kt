package com.example.trackme.application.port.out

import com.example.trackme.adapter.out.TrackedId
import com.example.trackme.domain.TrackedUrl

interface AddTrackedPort {
    fun addTracked(trackedUrl: TrackedUrl): TrackedId
}