package app.bikeme.bikemanager

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("app.bikeme.bikemanager")
		.start()
}

