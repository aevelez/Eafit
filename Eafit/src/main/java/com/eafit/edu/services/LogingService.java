package com.eafit.edu.services;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eafit.edu.models.UserEafit;
import com.eafit.edu.repositories.IUserRepository;
import com.eafit.edu.models.LogHistory;
import com.eafit.edu.repositories.ILogHistoryRepository;

@Service
public class LogingService implements ILogingService{

	@Autowired
	private IUserRepository UserRepository;
	@Autowired
	private ILogHistoryRepository LogHistoryRepository;
	
	@Override
	public UserEafit Log(String userName, String password) {
		
		Optional<UserEafit> userBD = UserRepository.findById(userName);
		Date date = new Date();
		
		if (userBD.isPresent())
		{
			if (userBD.get().getPassword().equals(password))
			{
				LogHistory loghistory = new LogHistory();
				loghistory.setName(userBD.get().getName());
				loghistory.setLoginDate(date);
				LogHistoryRepository.save(loghistory);
				return userBD.get();
			}
			return null;
		}
		return null;
	}
	
	@Override
	public boolean ChangePassword(String userName, String newPassword) {
		
		try {
			Optional<UserEafit> user = UserRepository.findById(userName);
			if(user == null)
				return false;
			
			user.get().setPassword(newPassword);
			UserRepository.save(user.get());
			
			return true;
		} catch (Exception e) {
		e.printStackTrace();
			return false;
		}
	}

}
