/*******************************************************************************
 * * Copyright 2012 Impetus Infotech.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 ******************************************************************************/
package com.impetus.kundera.configure.schema;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.impetus.kundera.configure.ClientProperties;

/**
 * The Class SchemaMetadata.
 * 
 * Holds the instance of puToSchemaCol map.
 * 
 * @author Kuldeep.Kumar
 */
public final class SchemaMetadata
{
    private static Map<String, ClientProperties> configurationProperties;

    /**
     * The pu to schema metadata holds the map of pu to list of tableInfo.
     * 
     */
    private Map<String, List<TableInfo>> puToSchemaMetadata;

    /**
     * Gets the pu to schema metadata.
     * 
     * @return the puToSchemaMetadata
     */

    public Map<String, List<TableInfo>> getPuToSchemaMetadata()
    {
        if (puToSchemaMetadata == null)
        {
            puToSchemaMetadata = new HashMap<String, List<TableInfo>>();
        }
        return puToSchemaMetadata;
    }

    /**
     * Sets the pu to schema col.
     * 
     * @param puToSchemaCol
     *            the puToSchemaCol to set
     */
    public void setPuToSchemaMetadata(Map<String, List<TableInfo>> puToSchemaCol)
    {
        this.puToSchemaMetadata = puToSchemaCol;
    }

    /**
     * @return the configurationProperties
     */
    public Map<String, ClientProperties> getConfigurationProperties()
    {
        if (configurationProperties == null)
        {
            configurationProperties = new HashMap<String, ClientProperties>();
        }
        return configurationProperties;
    }
}
