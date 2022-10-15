package main.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import main.pojo.Users;
import main.repository.UserInfoRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UserInfoRepository userInfoRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Users> user = userInfoRepository.findByEmail(username);
		user.orElseThrow(() -> new UsernameNotFoundException("User not found " + username));
		return user.map(MyUserDetails::new).get();
	}

}
