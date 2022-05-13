package com.example.demo

import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class Consumer {
    companion object {
        private val logger = LoggerFactory.getLogger(this::class.java)
    }

    @KafkaListener(topics = arrayOf("quickstart-events"))
    fun listenMessages(message: String) {
        logger.info("Messages are: $message")
    }
}