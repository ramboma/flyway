/**
 * Copyright (C) 2010-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.googlecode.flyway.core.resolver;

import com.googlecode.flyway.core.dbsupport.DbSupport;
import com.googlecode.flyway.core.dbsupport.JdbcTemplate;

/**
 * Executes a migration.
 */
public interface MigrationExecutor {
    /**
     * Executes the migration this executor is associated with.
     *
     * @param jdbcTemplate The jdbcTemplate to use to execute the migration against the DB.
     * @param dbSupport    The database-specific support.
     */
    void execute(JdbcTemplate jdbcTemplate, DbSupport dbSupport);
}