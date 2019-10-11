package com.ekahau.prototypes.khtf.libg

import com.ekahau.prototypes.khtf.libe.LibEntryPoint2

class LibGCase() {

    private val entry = LibEntryPoint2()

    fun doSomething1() {
        entry.addValue1("From LibG")
    }

    fun doSomething2() {
        entry.addValue2("From LibG")
    }

    fun getContent(): String {
        return entry.getString()
    }
}