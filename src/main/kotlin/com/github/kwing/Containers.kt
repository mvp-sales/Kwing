package com.github.kwing

import com.github.kwing.layouts.opcr
import javax.swing.JComponent
import javax.swing.JFrame
import javax.swing.JPanel

fun frame(title: String = "", width: Int, height: Int, block: JFrame.() -> Unit): JFrame {
    val frame = JFrame()
    frame.title = title
    frame.setSize(width, height)
    frame.apply(block)
//    frame.pack()
    return frame
}

fun JComponent.panel(op: JPanel.() -> Unit = {}): JPanel {
    val panel = JPanel()
    return opcr(this, panel, op)
}

/*
fun filechooser(currentDirectory: File? = null, op: JFileChooser.() -> Unit = {}): JFileChooser {
    val filechooser =
}*/
