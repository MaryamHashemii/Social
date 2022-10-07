plugins {
    id("java-platform")
    id("maven-publish")
}

val core = "1.6.0"
val androidX = "1.3.1"
val constraintLayout = "2.1.0"
val material = "1.4.0"

val lifeDataLifecycle = "2.2.0"

val hilt = Versions.HILT_VERSION
val coroutine = "1.3.9"

val retrofit = "2.9.0"
val okHttpClient = "5.0.0-alpha.2"
val gson = "2.9.0"

val room = "2.3.0"
val navigation = Versions.NAVIGATION

val play_service = "17.1.0"

val fresco = "2.6.0"

val junit = "4.13.2"
val junit_ext = "1.1.3"
val robo_electric = "4.8"
val espresso = "3.4.0"

val mockito_core = "2.25.0"
val mockito_inline = "2.13.0"

val paging="3.0.0-alpha12"







dependencies {
    constraints {
        api("${Libs.CORE_KTX}:$core")
        api("${Libs.ANDROID_X}:$androidX")
        api("${Libs.CONSTRAINT_LAYOUT}:$constraintLayout")
        api("${Libs.MATERIAL}:$material")

        api("${Libs.LIVE_DATA_LIFECYCLE}:$lifeDataLifecycle")

        api("${Libs.HILT_ANDROID}:$hilt")
        api("${Libs.HILT_COMPILER}:$hilt")

        api("${Libs.COROUTINE}:$coroutine")

        api("${Libs.RETROFIT}:$retrofit")
        api("${Libs.OK_HTTP_CLIENT}:$okHttpClient")
        api("${Libs.LOGGING_INTERCEPTOR}:$okHttpClient")
        api("${Libs.GSON}:$gson")

        api("${Libs.ROOM_KTX}:$room")
        api("${Libs.ROOM_COMPILER}:$room")
        api("${Libs.ROOM_RUNTIME}:$room")

        api("${Libs.NAVIGATION_FRAGMENT}:${navigation}")
        api("${Libs.NAVIGATION_UI}:${navigation}")


        api("${Libs.PLAY_SERVICE}:${play_service}")


        api("${Libs.FRESCO}:$fresco")

        api("${Libs.JUNIT}:$junit")
        api("${Libs.JUNIT_EXT}:$junit_ext")
        api("${Libs.ROBO_ELECTRIC}:$robo_electric")
        api("${Libs.ESPRESSO}:$espresso")

        api("${Libs.MOCKITO_CORE}:$mockito_core")
        api("${Libs.MOCKITO_INLINE}:$mockito_inline")

        api("${Libs.PAGING}:$paging")


    }
}

publishing {
    publications {
        create<MavenPublication>("myPlatform") {
            from(components["javaPlatform"])
        }
    }
}
