package com.jarvis.ai.ai.providers

import com.jarvis.ai.ai.AIProvider

class MistralProvider(private val apiKey: String?) : AIProvider {
    override val name: String = "Mistral Large"
    override suspend fun generateResponse(systemPrompt: String?, userPrompt: String): String {
        return "[Mistral] Response placeholder"
    }
}