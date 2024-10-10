package com.spring_data_jpa.projeto_jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring_data_jpa.projeto_jpa.model.User;
import com.spring_data_jpa.projeto_jpa.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner{
    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception{
        User user = new User();
        user.setName("Cryslei2");
        user.setPassword("123122323");
        user.setUsername("crys2");
        repository.save(user);

        for(User u: repository.findAll()){
            System.out.println(u);
        }
    }


}
