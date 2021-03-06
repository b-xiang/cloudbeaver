/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2020 DBeaver Corp and others
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
package io.cloudbeaver.server.model.sql;

import org.jkiss.dbeaver.model.meta.Property;

/**
 * Web SQL query results.
 */
public class WebSQLQueryResults {

    private Integer updateRowCount;
    private WebSQLQueryResultSet resultSet;

    @Property
    public Integer getUpdateRowCount() {
        return updateRowCount;
    }

    public void setUpdateRowCount(int updateRowCount) {
        this.updateRowCount = updateRowCount;
    }

    @Property
    public WebSQLQueryResultSet getResultSet() {
        return resultSet;
    }

    public void setResultSet(WebSQLQueryResultSet resultSet) {
        this.resultSet = resultSet;
    }
}
