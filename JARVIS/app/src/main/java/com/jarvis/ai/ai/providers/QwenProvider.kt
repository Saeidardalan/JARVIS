package com.jarvis.ai.ai.providers

import com.jarvis.ai.ai.AIProvider

class QwenProvider(private val apiKey: String?) : AIProvider {
    override val name: String = "Alibaba Qwen"
    override suspend fun generateResponse(systemPrompt: String?, userPrompt: String): String {
        return "[Qwen] Response placeholder"
    }
}