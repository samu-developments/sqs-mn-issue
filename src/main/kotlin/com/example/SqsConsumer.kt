package com.example

import io.micronaut.jms.annotations.JMSListener
import io.micronaut.jms.annotations.Queue
import io.micronaut.jms.sqs.configuration.SqsConfiguration.CONNECTION_FACTORY_BEAN_NAME
import io.micronaut.messaging.annotation.MessageBody

@JMSListener(CONNECTION_FACTORY_BEAN_NAME)
class SqsConsumer {

    @Queue("test_queue")
    fun consume(@MessageBody body: String) {
        println("message: $body")
    }
}