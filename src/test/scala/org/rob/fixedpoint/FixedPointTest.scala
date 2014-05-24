package org.rob.fixedpoint

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FunSpec

class FixedPointTest extends FunSpec with ShouldMatchers {

	describe ("Fixed Point Finder") {
		it ("Finds the value of x where x = 1 + x/2") {
			val result = FixedPoint.fixedPoint(x => 1 + x/2)(1)
			result should be > (1.999)
			result should be < (2.001)
		}
		
		it ("Finds the squareroot of 2 by finding the FixedPoint of x = y / x for y = 2") {
			val result = FixedPoint.fixedPoint(y => (y + 2 / y) / 2)(1)
			result should be > (1.4)
			result should be < (1.5)
		}
	}
	
}