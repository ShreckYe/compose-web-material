package com.huanshankeji.compose.web.dom.ext

import org.w3c.dom.HTMLElement

/**
 * @see com.huanshankeji.compose.web.attributes.ext.onInput
 */
val HTMLElement.value: String
    get() = asDynamic().value as String
