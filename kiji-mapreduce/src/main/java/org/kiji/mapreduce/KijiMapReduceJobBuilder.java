/**
 * (c) Copyright 2012 WibiData, Inc.
 *
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
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

package org.kiji.mapreduce;

import org.kiji.annotations.ApiAudience;
import org.kiji.annotations.Inheritance;
import org.kiji.schema.Kiji;
import org.kiji.schema.layout.KijiTableLayout;

/**
 * Base class for MapReduce jobs that interact with a Kiji instance.  Users should use a concrete
 * implementation such as {@link org.kiji.mapreduce.KijiGatherJobBuilder}.
 *
 * @param <T> The type of the builder class.
 */
@ApiAudience.Framework
@Inheritance.Sealed
public abstract class KijiMapReduceJobBuilder<T extends KijiMapReduceJobBuilder<T>>
    extends MapReduceJobBuilder<T> {

  /** Constructs a builder for jobs that interact with a Kiji instance. */
  KijiMapReduceJobBuilder() {
  }

  /**
   * Returns the kiji instance this job should be interacting with.
   *
   * @return The kiji instance this job works with.
   */
  protected abstract Kiji getKiji();

  /**
   * Returns the layout of a table to serialize into the job configuration.  May return null.
   *
   * @return A table layout to serialize into the job configuration.
   */
  protected abstract KijiTableLayout getTableLayout();
}
