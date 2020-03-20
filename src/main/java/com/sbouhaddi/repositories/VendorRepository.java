/**
 * 
 */
package com.sbouhaddi.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.sbouhaddi.domain.Vendor;

/**
 * @author bouhaddisabri
 *
 */
public interface VendorRepository extends ReactiveMongoRepository<Vendor, String> {
}
