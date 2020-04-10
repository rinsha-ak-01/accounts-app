package com.accounts.accountsapp.serviceimpl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.accounts.accountsapp.request.SubHeadDTO;
import com.accounts.accountsapp.response.SubHeadResponse;
import com.accounts.accountsapp.service.SubHeadService;

@Service
public class SubHeadServiceImpl implements SubHeadService {

	@Override
	public SubHeadResponse test() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(SubHeadDTO subHeadDTO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateSubHead(long id, SubHeadDTO subHeadDTO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Page<SubHeadResponse> getAllSubHeadDetails(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteSubHead(Long id) {
		// TODO Auto-generated method stub
		
	}

}
