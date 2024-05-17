package com.t3t.bookstoreapi.elastic.repository;

import com.t3t.bookstoreapi.elastic.model.dto.ElasticDocument;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
@ConditionalOnProperty(name = "feature.enabled", havingValue = "true", matchIfMissing = false)
public interface ElasticRepository extends ElasticsearchRepository<ElasticDocument, String>, ElasticRepositoryCustom {
}
