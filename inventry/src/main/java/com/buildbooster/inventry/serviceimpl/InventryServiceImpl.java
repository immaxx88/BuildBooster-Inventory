package com.buildbooster.inventry.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buildbooster.inventry.model.InventryModel;
import com.buildbooster.inventry.repository.IInventryRepository;
import com.buildbooster.inventry.service.IInventryService;

@Service
public class InventryServiceImpl implements IInventryService {

	@Autowired
	IInventryRepository catalogRepository;

	@Override
	public StringBuffer saveExcel() {
		final InventryModel entity = new InventryModel();
		// TODO
		catalogRepository.save(entity);
		return null;
	}
}
