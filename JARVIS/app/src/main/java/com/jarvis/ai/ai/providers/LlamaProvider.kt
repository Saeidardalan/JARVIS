package com.jarvis.ai.ai.providers

import com.jarvis.ai.ai.AIProvider

class LlamaProvider(private val apiKey: String?) : AIProvider {
    override val name: String = "Llama 3"
    override suspend fun generateResponse(systemPrompt: String?, userPrompt: String): String {
        return "[Llama] Response placeholder"
    }
}