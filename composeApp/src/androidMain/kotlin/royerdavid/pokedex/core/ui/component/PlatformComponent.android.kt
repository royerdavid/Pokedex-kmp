package royerdavid.pokedex.core.ui.component

import android.app.Activity
import androidx.compose.foundation.lazy.grid.LazyGridState
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

@Composable
actual fun ApplyStatusBarTheme(darkTheme: Boolean) {
    val view = LocalView.current
    if (!view.isInEditMode) {
        val argb = MaterialTheme.colorScheme.primary.toArgb()
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = argb
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }
    }
}

@Composable
actual fun DesktopVerticalScrollbar(
    modifier: Modifier,
    lazyGridState: LazyGridState
) {
}
