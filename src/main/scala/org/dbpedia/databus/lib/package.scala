/*-
 * #%L
 * databus-maven-plugin
 * %%
 * Copyright (C) 2018 Sebastian Hellmann (on behalf of the DBpedia Association)
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * #L%
 */
package org.dbpedia.databus

import java.math.BigInteger

/**
  * Created by Markus Ackermann.
  * No rights reserved.
  */
package object lib {

  case class RSAModulusAndExponent(modulus: BigInt, exponent: BigInt) {

    def modulusHex = modulus.toString(16).toUpperCase

    def shortenedDescription =
      s"""
         |modulus:  ${modulusHex.take(30)}...
         |exponent: $exponent
       """.stripMargin
  }
}
