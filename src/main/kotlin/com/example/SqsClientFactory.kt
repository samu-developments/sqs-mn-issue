package com.example

import io.micronaut.context.annotation.Factory
import io.micronaut.context.annotation.Replaces
import jakarta.inject.Singleton
import software.amazon.awssdk.regions.Region
import software.amazon.awssdk.services.sqs.SqsClient

@Factory
@Replaces(factory = io.micronaut.aws.sdk.v2.service.sqs.SqsClientFactory::class)
class SqsClientFactory {
    @Singleton
    fun sqsClient(): SqsClient {
        return SqsClient.builder()
            .region(Region.EU_NORTH_1)
            .build()
    }
}