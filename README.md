# Mediun Filter (KMP + Compose Multiplatform)

A Kotlin Multiplatform project that implements a "Filter" screen design from Figma using Compose Multiplatform UI shared across Android and iOS.

## Tech Stack
- Kotlin Multiplatform (Android + iOS)
- Compose Multiplatform (Material3, Foundation, Resources)
- Gradle Version Catalog (`gradle/libs.versions.toml`)

## Project Structure
- `composeApp/`
  - Shared KMP module containing all Compose UI
  - Entry composable: `com/example/mediunfilter/App.kt`
  - Resources: `src/commonMain/composeResources/`
    - `drawable/` contains VectorDrawable XMLs for icons/images used by Compose
- `iosApp/`
  - iOS host app (SwiftUI container) embedding the shared UI framework

## Design Reference
Figma selection: `https://www.figma.com/design/Ap70zqm4dXmo8u9u8tfCGR/Mediun_Filter?node-id=1-106`

Key colors from design:
- Background yellow: `#F5CB58`
- White panel (Rectangle 140): `#F8F8F8`
- Accent orange: `#E95322`
- Light orange: `#FFDECF`

## Running the app
Prereqs: Java 11+, Android Studio (for Android), Xcode (for iOS).

### Android
```bash
./gradlew :composeApp:assembleDebug
```
Install the APK from `composeApp/build/outputs/apk/` or run from Android Studio.

### iOS (Simulator)
Open `iosApp/iosApp.xcodeproj` in Xcode and run a simulator target.

## UI Notes
- The screen layout is implemented entirely in `App.kt`.
- The rounded white background panel from Figma ("Rectangle 140") is implemented as `Rectangle140Background()` with 30.dp top corner radius.
- Bottom navigation and top icons are composed as vectors for crisp scaling.

## Assets
- Vector icons and graphics live in `composeApp/src/commonMain/composeResources/drawable/` as VectorDrawable XMLs.
- Previously exported SVGs were removed; use clear, stable names for new assets (e.g., `bottom_home.xml`, `icon_cart.xml`).
- To add a new drawable:
  1) Export path data from Figma (or provide a clean SVG),
  2) Convert to VectorDrawable XML,
  3) Reference via `painterResource(Res.drawable.your_name)`.

## Development Tips
- Compose Previews can be used in Android Studio; ensure `debugImplementation(compose.uiTooling)` is present.
- If Gradle warns about native access on macOS, it’s safe to ignore; compile still succeeds.

## License
MIT (or project default).