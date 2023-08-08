package com.example.trackme.adapter.out

import com.example.trackme.application.port.out.AddTrackedPort
import com.example.trackme.domain.TrackedUrl
import org.springframework.stereotype.Component

@Component
class TrackedPersistenceAdapter(val mongoRepository: TrackedMongoRepository, val mapper: TrackedMapper) : AddTrackedPort {
    override fun addTracked(trackedUrl: TrackedUrl): TrackedId = mongoRepository.save(mapper.mapToTrackedEntity(trackedUrl))
}