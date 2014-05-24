package org.rob.fixedpoint

import math.abs

object FixedPoint {

	def fixedPoint (f: Double => Double)(firstGuess: Double) = {
		
		val tolerance: Double = 0.0001
		
		def isCloseEnough(x: Double, y: Double): Boolean = {
			val diff = abs((x - y)/x)/x
			val ret = diff < tolerance
			ret
		}
	  
		def iterate(guess: Double) : Double = {
			val nextGuess = f(guess)
			
			if (isCloseEnough(guess, nextGuess)) {
				println ("Fixed point : " + nextGuess)
				nextGuess
			} else {
				println ("Next guess: " + nextGuess)
				iterate(nextGuess)
			}
		}
		
		iterate(firstGuess)
	}
}