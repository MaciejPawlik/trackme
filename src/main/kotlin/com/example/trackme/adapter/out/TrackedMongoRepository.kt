package com.example.trackme.adapter.out

import org.springframework.data.mongodb.repository.MongoRepository

interface TrackedMongoRepository : MongoRepository<TrackedMongoEntity, String>