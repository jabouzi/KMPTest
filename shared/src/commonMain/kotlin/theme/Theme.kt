/*
 * Copyright 2021 Realm Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Typography
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

//import fontResources

//@Composable
//fun CustomTypography() = Typography(
//    defaultFontFamily = FontFamily(
//        //fontResources("uthmanicv2.ttf", FontWeight.Normal, FontStyle.Normal),
//    )
//)

expect val uthmanicHafsFontFamily: FontFamily
expect val uthmanicHafsV2FontFamily: FontFamily

@Suppress("all")
val myTypography = Typography(
    body1 = TextStyle(
        fontFamily = uthmanicHafsFontFamily, // Custom Font
        fontWeight = FontWeight.Normal,
        fontSize = 40.sp
    ),
    body2 = TextStyle(
        fontFamily = uthmanicHafsV2FontFamily, // Custom Font
        fontWeight = FontWeight.Light,
        fontSize = 40.sp
    )
)

//val typography = Typography(
//    body1 = TextStyle(
//        fontFamily = uthmanicHafsFontFamily,
//        fontWeight = FontWeight.Normal,
//        fontSize = 30.sp
//    )
//)

//val typography = Typography(
//    uthmanicHafsFontFamily = TextStyle(
//        fontFamily = righteousFontFamily, // Custom Font
//        fontWeight = FontWeight.Normal,
//        fontSize = 24.sp
//    ),
//    bodyLarge = TextStyle(
//        fontFamily = montserratFontFamily, // Custom Font
//        fontWeight = FontWeight.Light,
//        fontSize = 24.sp
//    )
//)

private val DarkColorPalette = darkColors(
    primary = Purple200,
    primaryVariant = Purple700,
    secondary = Teal200
)

private val LightColorPalette = lightColors(
    primary = Purple500,
    primaryVariant = Purple700,
    secondary = Teal200
)

@Composable
fun KMPTestTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}

@Composable
fun RallyTheme(content: @Composable () -> Unit) {
    MaterialTheme(colors = ColorPalette, typography = Typography, content = content)
}
