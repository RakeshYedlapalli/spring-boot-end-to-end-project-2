package om.endtoend.springboot.uilistener.springbootendtoendapplistener.kafka.service;

import om.endtoend.springboot.uilistener.springbootendtoendapplistener.kafka.dto.UserDetailsDto;
import om.endtoend.springboot.uilistener.springbootendtoendapplistener.kafka.model.UserDetails;
import om.endtoend.springboot.uilistener.springbootendtoendapplistener.kafka.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public void saveUserDetails (UserDetailsDto userDetailsDto) {

        UserDetails userDetails = new UserDetails();
        userDetails.setDob(userDetailsDto.getDob());
        userDetails.setUsername(userDetailsDto.getUsername());
        userDetails.setPassword(userDetailsDto.getPassword());
        userDetails.setUserId(UUID.randomUUID().toString());
        userDetails.setLastName(userDetailsDto.getLastName());
        userDetails.setUsername(userDetailsDto.getUsername());

        userRepository.save(userDetails);
    }

}
