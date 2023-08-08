package com.example.trackme.application.port.`in`

import com.example.trackme.adapter.out.TrackedId
import java.net.URL

interface AddTrackedUseCase {
    fun addTrackedCommand(tracked: AddTrackedCommand): TrackedId

    class AddTrackedCommand(trackedUrl: String) {
        val url = URL(trackedUrl)
    }
}