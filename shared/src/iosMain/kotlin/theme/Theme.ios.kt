package theme

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.platform.Typeface
import org.jetbrains.skia.FontStyle
import org.jetbrains.skia.Image
import org.jetbrains.skia.Typeface

private fun loadCustomFont(name: String): Typeface {
    println("NAME $name")
    val font =  Typeface.makeFromName(name, FontStyle.NORMAL)
    println("FONT ${font.familyName}")
    return font
}

actual val uthmanicHafsFontFamily: FontFamily = FontFamily(
    Typeface(loadCustomFont("uthmanic"))
)

actual val uthmanicHafsV2FontFamily: FontFamily = FontFamily(
    Typeface(loadCustomFont("uthmanicv2"))
)

