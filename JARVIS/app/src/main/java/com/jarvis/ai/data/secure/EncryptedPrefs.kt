package com.jarvis.ai.data.secure

import android.content.Context
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKey

class EncryptedPrefs private constructor(context: Context) {
    private val masterKey = MasterKey.Builder(context)
        .setKeyScheme(MasterKey.KeyScheme.AES256_GCM)
        .build()

    private val prefs = EncryptedSharedPreferences.create(
        context,
        "jarvis_encrypted_prefs",
        masterKey,
        EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
        EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
    )

    fun putString(key: String, value: String?) {
        prefs.edit().putString(key, value).apply()
    }

    fun getString(key: String, def: String? = null): String? = prefs.getString(key, def)

    companion object {
        @Volatile private var instance: EncryptedPrefs? = null
        fun get(context: Context): EncryptedPrefs =
            instance ?: synchronized(this) {
                instance ?: EncryptedPrefs(context.applicationContext).also { instance = it }
            }
    }
}