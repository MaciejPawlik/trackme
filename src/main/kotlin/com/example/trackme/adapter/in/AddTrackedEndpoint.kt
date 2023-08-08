package com.example.trackme.adapter.`in`

import com.example.trackme.adapter.out.TrackedId
import com.example.trackme.application.port.`in`.AddTrackedUseCase
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
@RestController
internal class AddTrackedEndpoint(val addTrackedUseCase: AddTrackedUseCase) {

    @PostMapping("/tracked")
    internal fun addTracked(@RequestBody tracked: TrackedDto): TrackedId =
        addTrackedUseCase.addTrackedCommand(AddTrackedUseCase.AddTrackedCommand(tracked.url))
}