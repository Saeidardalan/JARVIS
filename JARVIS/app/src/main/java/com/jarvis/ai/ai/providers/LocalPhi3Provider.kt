package com.jarvis.ai.ai.providers

import com.jarvis.ai.ai.AIProvider

class LocalPhi3Provider : AIProvider {
    override val name: String = "Local Phi-3-mini"
    override suspend fun generateResponse(systemPrompt: String?, userPrompt: String): String {
        return "[Phi-3-mini Offline] Response placeholder"
    }
}