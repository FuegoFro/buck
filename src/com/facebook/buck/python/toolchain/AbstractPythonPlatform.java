/*
 * Copyright 2015-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.facebook.buck.python.toolchain;

import com.facebook.buck.model.BuildTarget;
import com.facebook.buck.model.Flavor;
import com.facebook.buck.model.FlavorConvertible;
import com.facebook.buck.util.immutables.BuckStyleImmutable;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable(copy = true)
@BuckStyleImmutable
interface AbstractPythonPlatform extends FlavorConvertible {

  /** @return the {@link Flavor} associated with this python platform. */
  @Value.Parameter
  @Override
  Flavor getFlavor();

  /** @return the {@link PythonEnvironment} for this python platform. */
  @Value.Parameter
  PythonEnvironment getEnvironment();

  /** @return the {@link BuildTarget} wrapping the C/C++ library used by C/C++ extensions. */
  @Value.Parameter
  Optional<BuildTarget> getCxxLibrary();
}
