package com.huanshankeji.compose.html.material3

import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import com.huanshankeji.compose.web.attributes.Attrs
import com.huanshankeji.compose.web.attributes.attr
import org.jetbrains.compose.web.dom.TagElement
import org.jetbrains.compose.web.dom.Text
import org.w3c.dom.HTMLElement

// https://github.com/material-components/material-web/blob/main/docs/components/icon.md

/**
 * @param content see https://github.com/material-components/material-web/blob/main/docs/components/icon.md#usage
 */
@Composable
fun MdIcon(filled: Boolean? = null, attrs: Attrs<HTMLElement>?, content: @Composable () -> Unit) {
    require("@material/web/icon/icon.js")

    @Suppress("RemoveExplicitTypeArguments")
    TagElement<HTMLElement>("md-icon", {
        filled?.let { attr("filled", it) }

        attrs?.invoke(this)
    }) {
        content()
    }
}

@Composable
fun MdIcon(filled: Boolean? = null, attrs: Attrs<HTMLElement>?, materialIconName: String) =
    MdIcon(filled, attrs) { Text(materialIconName) }
