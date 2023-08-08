package com.example.trackme.adapter.out

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

@Document("tracked")
data class TrackedMongoEntity(
    @Id
    @Field(name = "id")
    private var trackedId: String? = null,

    private var url: String
) : TrackedId {
    override fun getId(): String = trackedId.toString()
}
