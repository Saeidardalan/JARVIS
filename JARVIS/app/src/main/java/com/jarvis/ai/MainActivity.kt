package com.jarvis.ai

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import com.jarvis.ai.databinding.ActivityMainBinding
import com.jarvis.ai.ui.ApiKeyManagerActivity
import com.jarvis.ai.service.VoiceService

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val requestPermissions = registerForActivityResult(
        ActivityResultContracts.RequestMultiplePermissions()
    ) { }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fabVoice.setOnClickListener {
            toggleVoiceService()
        }

        // Ask for core runtime permissions
        val perms = mutableListOf(
            Manifest.permission.RECORD_AUDIO,
            Manifest.permission.CAMERA,
            Manifest.permission.ACCESS_FINE_LOCATION
        )
        if (Build.VERSION.SDK_INT >= 33) {
            perms += Manifest.permission.POST_NOTIFICATIONS
        }
        requestPermissions.launch(perms.toTypedArray())
    }

    private fun toggleVoiceService() {
        val intent = Intent(this, VoiceService::class.java)
        if (isServiceRunning()) {
            stopService(intent)
        } else {
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO) == PackageManager.PERMISSION_GRANTED) {
                startForegroundService(intent)
            }
        }
    }

    private fun isServiceRunning(): Boolean {
        // Simplified placeholder; proper check should query running services
        return false
    }

    private fun openApiKeys() {
        startActivity(Intent(this, ApiKeyManagerActivity::class.java))
    }
}