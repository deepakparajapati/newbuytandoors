//package com.buytandoors.webapp.serviceimpl;
//
//import java.util.Arrays;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Component;
//
//import com.buytandoors.webapp.dao.AdminUser;
//import com.buytandoors.webapp.repository.AdminUserRepository;
//
//@Component(value = "userDetailService")
//public class UserDetailServiceImpl implements UserDetailsService{
//	
//	@Autowired
//	private AdminUserRepository adminUserRepository;
//
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		AdminUser user = adminUserRepository.findByUsername(username);
//		if(user == null){
//			throw new UsernameNotFoundException("Invalid username or password.");
//		}
//		return new User(user.getUsername(), user.getPassword(), getAuthority());
//	}
//
//	private List<SimpleGrantedAuthority> getAuthority() {
//		return Arrays.asList(new SimpleGrantedAuthority("ADMIN"));
//	}
//
//}