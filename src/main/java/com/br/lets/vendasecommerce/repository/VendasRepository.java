package com.br.lets.vendasecommerce.repository;

import com.br.lets.vendasecommerce.domain.VendasEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface VendasRepository extends ReactiveMongoRepository<VendasEntity, String> {

}
