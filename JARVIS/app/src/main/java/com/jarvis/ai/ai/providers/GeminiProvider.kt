package com.jarvis.ai.ai.providers

import com.jarvis.ai.ai.AIProvider

class GeminiProvider(private val apiKey: String?) : AIProvider {
    override val name: String = "Google Gemini Pro"
    override suspend fun generateResponse(systemPrompt: String?, userPrompt: String): String {
        return "[Gemini] Response placeholder"
    }
}