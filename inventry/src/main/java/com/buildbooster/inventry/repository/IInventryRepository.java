package com.buildbooster.inventry.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.buildbooster.inventry.model.InventryModel;

@Repository
public interface IInventryRepository extends JpaRepository<InventryModel, Long> {

}
