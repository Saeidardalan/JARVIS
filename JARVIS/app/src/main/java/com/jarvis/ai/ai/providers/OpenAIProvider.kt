package com.jarvis.ai.ai.providers

import com.jarvis.ai.ai.AIProvider

class OpenAIProvider(private val apiKey: String?) : AIProvider {
    override val name: String = "OpenAI GPT-4o"
    override suspend fun generateResponse(systemPrompt: String?, userPrompt: String): String {
        // TODO: Implement Retrofit call to OpenAI
        return "[OpenAI] Response placeholder"
    }
}