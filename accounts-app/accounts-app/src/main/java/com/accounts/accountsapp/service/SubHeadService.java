package com.accounts.accountsapp.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.accounts.accountsapp.request.SubHeadDTO;
import com.accounts.accountsapp.response.SubHeadResponse;

public interface SubHeadService {
		
	public SubHeadResponse test();

	public void save(SubHeadDTO subHeadDTO);

	public void updateSubHead(long id, SubHeadDTO subHeadDTO);

	public Page<SubHeadResponse> getAllSubHeadDetails(Pageable pageable);

	public void deleteSubHead(Long id);

}
