# JARVIS (Android, Kotlin)

A universal AI personal assistant with voice interface, multi‑AI integration, device control, and offline fallback.

## Requirements
- Android Studio Hedgehog or later
- Android Gradle Plugin 8.5+
- Kotlin 1.9+
- Min SDK 21, Target SDK 34

## Features (Phase 1 skeleton)
- Foreground Voice Service skeleton
- AccessibilityService skeleton for system controls
- Encrypted API key storage screen
- AI Provider abstraction stubs (OpenAI, Gemini, Qwen, Mistral, Llama, Claude, Local Phi‑3)
- Assets placeholders for TFLite model and Porcupine wake words

## Setup
1. Open the project in Android Studio (Open -> `JARVIS`).
2. Sync Gradle.
3. Add real assets:
   - `app/src/main/assets/models/phi-3-mini.tflite`: Download a valid TFLite model for offline use.
   - `app/src/main/assets/pico/hey_jarvis_en.pmm` and `hey_jarvis_fa.pmm`: Obtain Porcupine keyword models from Picovoice Console.
4. Create/adjust API keys via the app: Menu -> API Keys.

## API Keys
- OpenAI: get from `https://platform.openai.com`
- Google Gemini: get from `https://ai.google.dev/`
- Alibaba Qwen: get from `https://dashscope.aliyun.com/`
- Mistral: get from `https://console.mistral.ai/`
- Llama (Meta): use gateway/provider key as applicable
- Claude (Anthropic): get from `https://console.anthropic.com/`
- ElevenLabs (voice cloning): `https://elevenlabs.io/`

All keys are stored locally encrypted via `androidx.security:security-crypto` (AES‑256).

## Permissions & Services
- Declared in `app/src/main/AndroidManifest.xml` including camera, mic, location, bluetooth, wifi, sms, contacts, calendar, notifications, storage, settings, accessibility, foreground services, and boot receiver.

## Building a Signed APK
1. Build > Generate Signed Bundle / APK
2. Create a new keystore if needed
3. Select `APK` -> `app` -> `release`

## Foreground Service & Accessibility
- On first launch, grant microphone, camera, location, and notifications.
- Enable the JARVIS Accessibility Service in system settings if needed for system controls.

## Next Steps (not yet implemented)
- Real speech recognition (Persian/English), wake word with Porcupine
- TTS dual-language support
- Computer vision (CameraX + TFLite), OCR, and QR scanning
- Smart routines, MQTT, Hue/Tuya/SmartThings integrations
- Widgets and richer chat UI

## Notes
- This repository includes placeholders only for `.tflite` and `.pmm` files. Replace them with valid binaries before release.