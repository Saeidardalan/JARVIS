package com.jarvis.ai.ai.providers

import com.jarvis.ai.ai.AIProvider

class ClaudeProvider(private val apiKey: String?) : AIProvider {
    override val name: String = "Claude 3"
    override suspend fun generateResponse(systemPrompt: String?, userPrompt: String): String {
        return "[Claude] Response placeholder"
    }
}