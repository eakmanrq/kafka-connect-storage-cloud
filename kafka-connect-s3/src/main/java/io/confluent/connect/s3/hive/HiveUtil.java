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

import org.apache.hadoop.hive.metastore.api.FieldSchema;
import org.apache.kafka.connect.data.Schema;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import io.confluent.connect.s3.S3SinkConnectorConfig;
import io.confluent.connect.storage.partitioner.Partitioner;
import io.confluent.connect.storage.common.StorageCommonConfig;

// NOTE: DO NOT add or modify this class as it is maintained for compatibility
@SuppressFBWarnings("NM_SAME_SIMPLE_NAME_AS_SUPERCLASS")
public abstract class HiveUtil extends io.confluent.connect.storage.hive.HiveUtil {

  public HiveUtil(S3SinkConnectorConfig connectorConfig, HiveMetaStore hiveMetaStore) {
    super(connectorConfig, hiveMetaStore);
    this.url = connectorConfig.getString(StorageCommonConfig.STORE_URL_CONFIG);
  }

  //    @Override
  //    public void createTable(
  //            String database,
  //            String tableName,
  //            Schema schema,
  //            Partitioner<FieldSchema> partitioner
  //    ) {
  //        createTable(database, tableName, schema, (Partitioner) partitioner);
  //    }

  public abstract void createTable(
          String database,
          String tableName,
          Schema schema,
          Partitioner<FieldSchema> partitioner
  );

}