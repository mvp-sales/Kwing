package com.github.kwing

import com.github.kwing.layouts.opcr
import java.awt.Color
import javax.swing.*
import javax.swing.colorchooser.ColorSelectionModel
import javax.swing.text.Document

fun border(top: Int = 0, left: Int = 0, bottom: Int = 0, right: Int = 0) = BorderFactory.createEmptyBorder(top, left, bottom, right)

fun JComponent.label(text: String? = "", image: Icon? = null, horizontalAlignment: Int = JLabel.CENTER, op: JLabel.() -> Unit = {}): JLabel {
    val label = JLabel(text, image, horizontalAlignment)
    opcr(this, label, op)
    return label
}

fun JComponent.button(text: String? = null, icon: Icon? = null, op: JButton.() -> Unit = {}): JButton {
    val btn = JButton(text, icon)
    opcr(this, btn, op)
    return btn
}

fun JComponent.textfield(doc: Document? = null, text: String? = null, columns: Int = 0, op: JTextField.() -> Unit = {}): JTextField {
    val tf = JTextField(doc, text, columns)
    opcr(this, tf, op)
    return tf
}

fun JComponent.checkbox(text: String? = null, icon: Icon? = null, selected: Boolean = false, op: JCheckBox.() -> Unit = {}): JCheckBox {
    val checkbox = JCheckBox(text, icon, selected)
    opcr(this, checkbox, op)
    return checkbox
}

fun JComponent.radiobutton(text: String? = null, icon: Icon? = null, selected: Boolean = false, op: JRadioButton.() -> Unit = {}): JRadioButton {
    val rbtn = JRadioButton(text, icon, selected)
    opcr(this, rbtn, op)
    return rbtn
}

fun JComponent.slider(orientation: Int, min: Int = 0, max: Int = 100, value: Int = 50, op: JSlider.() -> Unit = {}): JSlider {
    val slider = JSlider(orientation, min, max, value)
    opcr(this, slider, op)
    return slider
}

fun JComponent.slider(rangeModel: BoundedRangeModel? = null, op: JSlider.() -> Unit = {}): JSlider {
    val slider = JSlider(rangeModel)
    opcr(this, slider, op)
    return slider
}

fun <T> JComponent.combobox(items: Array<T>? = null, op: JComboBox<T>.() -> Unit = {}): JComboBox<T> {
    val cbox = if (items != null) JComboBox<T>(items) else JComboBox()
    opcr(this, cbox, op)
    return cbox
}

//TODO create enum for separator orientation
fun JComponent.separator(orientation: Int, op: JSeparator.() -> Unit = {}): JSeparator {
    val sep = JSeparator()
    sep.orientation = orientation
    opcr(this, sep, op)
    return sep
}

fun JComponent.progressbar(orientation: Int = SwingConstants.HORIZONTAL, min: Int = 0, max: Int = 100, op: JProgressBar.() -> Unit = {}): JProgressBar {
    val progressbar = JProgressBar(orientation, min, max)
    opcr(this, progressbar, op)
    return progressbar
}

fun JComponent.progressbar(rangeModel: BoundedRangeModel? = null, op: JProgressBar.() -> Unit = {}): JProgressBar {
    val progressbar = JProgressBar(rangeModel)
    opcr(this, progressbar, op)
    return progressbar
}

fun JComponent.spinner(model: SpinnerModel? = null, op: JSpinner.() -> Unit = {}): JSpinner {
    val spinner = if (model != null) JSpinner(model) else JSpinner()
    opcr(this, spinner, op)
    return spinner
}

fun JComponent.textarea(model: Document? = null, text: String? = null, rows: Int = 0, columns: Int = 0, op: JTextArea.() -> Unit = {}): JTextArea {
    val textArea = JTextArea(model, text, rows, columns)
    opcr(this, textArea, op)
    return textArea
}

fun JComponent.passwordfield(model: Document? = null, text: String? = null, columns: Int = 0, op: JPasswordField.() -> Unit = {}): JPasswordField {
    val passfield = JPasswordField(model, text, columns)
    opcr(this, passfield, op)
    return passfield
}

fun JComponent.colorchooser(initialColor: Color = Color.WHITE, op: JColorChooser.() -> Unit = {}): JColorChooser {
    val colorchooser = JColorChooser(initialColor)
    opcr(this, colorchooser, op)
    return colorchooser
}


fun JComponent.colorchooser(colorModel: ColorSelectionModel, op: JColorChooser.() -> Unit = {}): JColorChooser {
    val colorchooser = JColorChooser(colorModel)
    opcr(this, colorchooser, op)
    return colorchooser
}

fun JComponent.setTooltip(text: String = "", op: JToolTip.() -> Unit = {}): JToolTip {
    val tooltip = JToolTip()
    tooltip.tipText = text
    tooltip.component = this
    return tooltip
}

fun JComponent.menubar(op: JMenuBar.() -> Unit = {}): JMenuBar {
    val menubar = JMenuBar()
    opcr(this, menubar, op)
    return menubar
}

fun JComponent.menu(text: String? = null, op: JMenu.() -> Unit = {}): JMenu {
    val menu = JMenu(text)
    opcr(this, menu, op)
    return menu
}