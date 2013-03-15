/**
 * Copyright 2012 Impetus Infotech.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.impetus.kundera.cache.ehcache;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.impetus.kundera.client.Client;
import com.impetus.kundera.client.EnhanceEntity;
import com.impetus.kundera.metadata.model.EntityMetadata;
import com.impetus.kundera.persistence.AbstractEntityReader;
import com.impetus.kundera.persistence.EntityReader;
import com.impetus.kundera.persistence.PersistenceDelegator;

/**
 * <Prove description of functionality provided by this Type> 
 * @author amresh.singh
 */
public class CoreTestEntityReader extends AbstractEntityReader implements EntityReader
{

    @Override
    public List<EnhanceEntity> populateRelation(EntityMetadata m, Client client)
    {
        return null;
    }

    @Override
    public EnhanceEntity findById(Object primaryKey, EntityMetadata m, Client client)
    {
        return super.findById(primaryKey, m, client);
    }

    @Override
    public Object recursivelyFindEntities(Object entity, Map<String, Object> relationsMap, EntityMetadata m,
            PersistenceDelegator pd)
    {
        return super.recursivelyFindEntities(entity, relationsMap, m, pd);
    }

    @Override
    protected List<EnhanceEntity> onAssociationUsingLucene(EntityMetadata m, Client client, List<EnhanceEntity> ls)
    {
        return super.onAssociationUsingLucene(m, client, ls);
    }

    @Override
    protected List<EnhanceEntity> transform(EntityMetadata m, List<EnhanceEntity> ls, List resultList)
    {
        return super.transform(m, ls, resultList);
    }

    @Override
    protected Set<String> fetchDataFromLucene(Client client)
    {
        return super.fetchDataFromLucene(client);
    }

    @Override
    protected Object getId(Object entity, EntityMetadata metadata)
    {
        return super.getId(entity, metadata);
    }
    
    

}
