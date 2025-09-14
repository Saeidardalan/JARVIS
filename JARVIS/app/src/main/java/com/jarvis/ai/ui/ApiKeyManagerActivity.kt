package com.jarvis.ai.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jarvis.ai.databinding.ActivityApiKeyManagerBinding
import com.jarvis.ai.data.secure.EncryptedPrefs

class ApiKeyManagerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityApiKeyManagerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityApiKeyManagerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val prefs = EncryptedPrefs.get(this)

        binding.saveButton.setOnClickListener {
            prefs.putString(KEY_OPENAI, binding.openAiKey.text?.toString())
            prefs.putString(KEY_GEMINI, binding.geminiKey.text?.toString())
            prefs.putString(KEY_QWEN, binding.qwenKey.text?.toString())
            prefs.putString(KEY_MISTRAL, binding.mistralKey.text?.toString())
            prefs.putString(KEY_LLAMA, binding.llamaKey.text?.toString())
            prefs.putString(KEY_CLAUDE, binding.claudeKey.text?.toString())
            prefs.putString(KEY_ELEVENLABS, binding.elevenLabsKey.text?.toString())
            finish()
        }

        binding.openAiKey.setText(prefs.getString(KEY_OPENAI, ""))
        binding.geminiKey.setText(prefs.getString(KEY_GEMINI, ""))
        binding.qwenKey.setText(prefs.getString(KEY_QWEN, ""))
        binding.mistralKey.setText(prefs.getString(KEY_MISTRAL, ""))
        binding.llamaKey.setText(prefs.getString(KEY_LLAMA, ""))
        binding.claudeKey.setText(prefs.getString(KEY_CLAUDE, ""))
        binding.elevenLabsKey.setText(prefs.getString(KEY_ELEVENLABS, ""))
    }

    companion object {
        const val KEY_OPENAI = "key_openai"
        const val KEY_GEMINI = "key_gemini"
        const val KEY_QWEN = "key_qwen"
        const val KEY_MISTRAL = "key_mistral"
        const val KEY_LLAMA = "key_llama"
        const val KEY_CLAUDE = "key_claude"
        const val KEY_ELEVENLABS = "key_elevenlabs"
    }
}