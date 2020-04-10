package com.accounts.accountsapp.serviceimpl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.accounts.accountsapp.request.AccountsDTO;
import com.accounts.accountsapp.response.AccountsResponse;
import com.accounts.accountsapp.service.AccountsService;

@Service
public class AccountsServiceImpl implements AccountsService {

	@Override
	public AccountsResponse test() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(AccountsDTO accountsDTO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateAccount(long id, AccountsDTO accountsDTO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Page<AccountsResponse> getAllAccountDetails(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAccount(Long id) {
		// TODO Auto-generated method stub
		
	}

}
