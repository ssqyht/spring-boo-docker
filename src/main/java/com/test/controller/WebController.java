package com.test.controller;

import com.test.domain.SysRole;
import com.test.repository.SysRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WebController {

    @Value("${spring.profiles.active}")
    private String profile;

    @Autowired
    private SysRoleRepository roleRepository;

    @GetMapping("/roles")
    public List<SysRole> roles() {
        return roleRepository.findAll();
    }

    @PostMapping("roles")
    public SysRole post(SysRole request) {
        return roleRepository.save(request);
    }

    @PutMapping("roles")
    public SysRole put(SysRole request) {
        return roleRepository.save(request);
    }


    @GetMapping("roles/{id}")
    public SysRole get(@PathVariable("id") Long id) {
        return roleRepository.findOne(id);
    }

    @DeleteMapping("roles/{id}")
    public void delete(@PathVariable("id") Long id) {
        roleRepository.delete(id);
    }

    @GetMapping("/profile")
    public String profile() {
        return profile;
    }

}
