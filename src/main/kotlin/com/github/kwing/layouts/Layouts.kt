package com.github.kwing.layouts

import javax.swing.JComponent

inline fun <T: JComponent> opcr(parent: JComponent, elem: T, op: T.() -> Unit = {}) = elem.apply {
    parent.addChildIfPossible(elem)
    op(this)
}

fun JComponent.addChildIfPossible(elem: JComponent, index: Int? = null) {
    elem.components?.apply {
        if (!this.contains(elem)) {
            if (index != null && index < this.size) {
                add(elem, index)
            } else {
                add(elem)
            }
        }
    }
}