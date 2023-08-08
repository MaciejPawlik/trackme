package com.example.trackme.application.port

import com.example.trackme.adapter.out.TrackedId
import com.example.trackme.application.port.`in`.AddTrackedUseCase
import com.example.trackme.application.port.out.AddTrackedPort
import com.example.trackme.domain.Tracked
import org.springframework.stereotype.Service

@Service
internal class AddTrackedService(val addTrackedPort: AddTrackedPort) : AddTrackedUseCase {
    override fun addTrackedCommand(tracked: AddTrackedUseCase.AddTrackedCommand): TrackedId =
        addTrackedPort.addTracked(Tracked(tracked.url))
}