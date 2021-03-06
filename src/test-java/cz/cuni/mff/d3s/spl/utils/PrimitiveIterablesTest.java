/*
 * Copyright 2015 Charles University in Prague
 * Copyright 2015 Vojtech Horky
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cz.cuni.mff.d3s.spl.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimitiveIterablesTest {
	private static void assertIterable(double... values) {
		int index = 0;
		for (Double value : PrimitiveIterables.makeIterable(values)) {
			assertTrue("Iterable has more elements", index < values.length);
			assertEquals(values[index], value.longValue(), 0.0001);
			index++;
		}
		assertTrue("Iterable does not have all elements", index == values.length);
	}
	
	@Test
	public void smokeTest() {
		assertIterable(0);
		assertIterable(0, 1, 2);
		assertIterable(0, 1, 2, 3);
	}
}
