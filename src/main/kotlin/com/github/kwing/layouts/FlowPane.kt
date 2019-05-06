package com.github.kwing.layouts

import java.awt.FlowLayout
import javax.swing.JFrame
import javax.swing.JPanel

class FlowPane(alignment: Int = FlowLayout.CENTER, hgap: Int = 0, vgap: Int = 0): JPanel() {

    init {
        layout = FlowLayout(alignment, hgap, vgap)
    }
}

fun flowpane(alignment: Int = FlowLayout.CENTER, hgap: Int = 0, vgap: Int = 0, block: FlowPane.() -> Unit) = FlowPane(alignment, hgap, vgap).apply(block)

fun JFrame.flowpane(alignment: Int = FlowLayout.CENTER, hgap: Int = 0, vgap: Int = 0, block: FlowPane.() -> Unit) = FlowPane(alignment, hgap, vgap).apply(block)
