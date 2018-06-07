/*
 * Copyright 2017 Confluent Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.confluent.connect.s3.hive;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import io.confluent.connect.s3.S3SinkConnectorConfig;
import io.confluent.connect.s3.hive.HiveMetaStoreException;

import org.apache.hadoop.conf.Configuration;

@SuppressFBWarnings("NM_SAME_SIMPLE_NAME_AS_SUPERCLASS")
public class HiveMetaStore extends io.confluent.connect.storage.hive.HiveMetaStore {

  public HiveMetaStore(
          Configuration conf,
          S3SinkConnectorConfig connectorConfig
  ) throws HiveMetaStoreException {
    super(conf, connectorConfig);
  }

}