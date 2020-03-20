/**
 * 
 */
package com.sbouhaddi.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.sbouhaddi.domain.Category;

/**
 * @author bouhaddisabri
 *
 */
public interface CategoryRepository extends ReactiveMongoRepository <Category, String>{
}
