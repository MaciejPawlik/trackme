package com.example.trackme.adapter.out

import com.example.trackme.domain.TrackedUrl
import org.springframework.stereotype.Component

@Component
class TrackedMapper {
    internal fun mapToTrackedEntity(trackedUrl: TrackedUrl): TrackedMongoEntity = TrackedMongoEntity(null, trackedUrl.getURL().toString())
}