package org.example

import org.example.modules.Lessons
import org.example.modules.Variables

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val variables = Variables()
    val lessons = Lessons()

    variables.variables()
    lessons.lesson()
}