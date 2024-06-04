package royerdavid.pokedex.di

import android.content.Context
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual class KoinInitializer(
    private val applicationContext: Context
) {
    actual fun init() {
        startKoin {
            androidContext(applicationContext)
            koinLogs()
            modules(appModule)
        }
    }
}
