package com.student.repository;

import java.util.Optional;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.student.entity.ProductInfo;

@EnableScan
@Repository
public interface ProductInfoRepository extends CrudRepository<ProductInfo, String> {

	Optional<ProductInfo> findById(String id);
}