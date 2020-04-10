/**
 * 
 */
package com.accounts.accountsapp.serviceimpl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.accounts.accountsapp.request.HeadDTO;
import com.accounts.accountsapp.response.HeadResponse;
import com.accounts.accountsapp.service.HeadService;

/**
 * @author Rinsha
 *
 */
@Service
public class HeadServiceImpl implements HeadService{

	@Override
	public HeadResponse test() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(HeadDTO headDTO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateHead(long id, HeadDTO headDTO) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Page<HeadResponse> getAllHeadDetails(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteHead(Long id) {
		// TODO Auto-generated method stub
		
	}

}
