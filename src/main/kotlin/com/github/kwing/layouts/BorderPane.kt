package com.github.kwing.layouts

import java.awt.BorderLayout
import javax.swing.JComponent
import javax.swing.JFrame
import javax.swing.JPanel

class BorderPane: JPanel() {

    var north: JComponent? = null
        set(value) {
            this.add(value, BorderLayout.NORTH)
        }
    var south: JComponent? = null
        set(value) {
            this.add(value, BorderLayout.SOUTH)
        }
    var center: JComponent? = null
        set(value) {
            this.add(value, BorderLayout.CENTER)
        }
    var east: JComponent? = null
        set(value) {
            this.add(value, BorderLayout.EAST)
        }
    var west: JComponent? = null
        set(value) {
            this.add(value, BorderLayout.WEST)
        }
    var lineStart: JComponent? = null
        set(value) {
            this.add(value, BorderLayout.LINE_START)
        }
    var lineEnd: JComponent? = null
        set(value) {
            this.add(value, BorderLayout.LINE_END)
        }
    var pageStart: JComponent? = null
        set(value) {
            this.add(value, BorderLayout.PAGE_START)
        }
    var pageEnd: JComponent? = null
        set(value) {
            this.add(value, BorderLayout.PAGE_END)
        }

    init {
        layout = BorderLayout()
    }
}

fun borderpane(block: BorderPane.() -> Unit) = BorderPane().apply(block)

fun JFrame.borderpane(block: BorderPane.() -> Unit) = BorderPane().apply(block)
