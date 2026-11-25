# Building Bloodshed & Mayhem

This repository is an older Android/Eclipse ADT project. It now has a Gradle build configuration so GitHub Actions can build it on a hosted runner.

## GitHub Actions

The workflow runs on pushes to `master` and `build/**`, on pull requests targeting `master`, and when started manually from the Actions tab.

After a successful run, open the workflow run and download the **app-debug-apk** artifact. It contains the unsigned debug APK at `app-debug.apk`.

## Local build

Requirements:
- JDK 17
- Android SDK Platform 35
- Android SDK Build-Tools 35.0.0
- Gradle 8.9

Run:

```bash
gradle --no-daemon assembleDebug
```

The APK is written to `build/outputs/apk/debug/app-debug.apk`.

This workflow creates a debug APK. It does not create a signed release APK.
