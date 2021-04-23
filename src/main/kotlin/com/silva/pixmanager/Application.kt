package com.silva.pixmanager

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.silva.pixmanager")
		.start()
}

