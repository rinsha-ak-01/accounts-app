/**
 * 
 */
package com.accounts.accountsapp.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.accounts.accountsapp.request.HeadDTO;
import com.accounts.accountsapp.response.HeadResponse;

/**
 * @author Rinsha
 *
 */

public interface HeadService {
	
	public HeadResponse test();
	
	public void save(HeadDTO headDTO);
	
	public void updateHead(long id, HeadDTO headDTO);
	
	public Page<HeadResponse> getAllHeadDetails(Pageable pageable);
	
	public void deleteHead(Long id);

}
