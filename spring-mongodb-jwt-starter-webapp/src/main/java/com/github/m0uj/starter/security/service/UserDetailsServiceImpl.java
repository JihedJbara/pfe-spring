package com.github.m0uj.starter.security.service;

import com.github.m0uj.starter.commons.domain.service.UserSelectionService;
import com.github.m0uj.starter.commons.storage.pojo.Role;
import com.github.m0uj.starter.commons.storage.pojo.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jihed_pc le 09/03/2018.
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    private final UserSelectionService userSelectionService;

    public UserDetailsServiceImpl(UserSelectionService userSelectionService) {
        this.userSelectionService = userSelectionService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userSelectionService.selectByUsername(username);
        if (user == null)
            throw new UsernameNotFoundException(username);
        return new org.springframework.security.core.userdetails.User(user.getUsername(),
                user.getPassword(),
                user.isEnable(),
                true,
                true,
                true,
                getAuthorities(user));
    }

    private List<GrantedAuthority> getAuthorities(User user) {
        List<GrantedAuthority> authorities = new ArrayList<>();
        user.getRoles().stream().forEach(role -> authorities.add(new SimpleGrantedAuthority(((Role)role).getName())));

        return authorities;
    }
}



