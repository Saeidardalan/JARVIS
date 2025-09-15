package com.jarvis.ai.ai

interface AIProvider {
    suspend fun generateResponse(systemPrompt: String?, userPrompt: String): String
    val name: String
}