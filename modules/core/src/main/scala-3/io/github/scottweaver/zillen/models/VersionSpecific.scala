/*
 * Copyright 2021 io.github.scottweaver
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

package io.github.scottweaver
package zillen

import zio.prelude._

object VersionSpecific {

  trait ContainerNameAssertion { self: Subtype[String] =>
    override inline def assertion =
      Assertion.matches("""^/?[a-zA-Z0-9][a-zA-Z0-9_.-]+$""")
  }

  trait HostPortValidation { self: Subtype[Int] =>
    override inline def assertion = Assertion.between(1, 65535)
  }
}
