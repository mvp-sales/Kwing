package com.github.kwing

import com.github.kwing.layouts.flowpane
import java.awt.FlowLayout
import javax.swing.JFrame
import javax.swing.JLabel

fun main() {
    frame(width = 640, height = 400) {
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        isVisible = true
        contentPane = flowpane(alignment = FlowLayout.TRAILING, hgap = 10) {
            label("Exemplo") {
                border = border(24, 8, 24, 8)
                horizontalAlignment = JLabel.CENTER
            }
            label {
                text = "Exemplo 2"
            }
        }
    }
}