package om.endtoend.springboot.uilistener.springbootendtoendapplistener.kafka;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import om.endtoend.springboot.uilistener.springbootendtoendapplistener.kafka.dto.UserDetailsDto;
import om.endtoend.springboot.uilistener.springbootendtoendapplistener.kafka.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class UserServiceListener {

    @Autowired
    UserService userService;

    @KafkaListener(topics = "user-details",
            groupId = "user-group")
    public void userDetails(String userDetailsDto) throws JsonProcessingException {

        UserDetailsDto userDetailsDto1 =
                new ObjectMapper().readValue(userDetailsDto, UserDetailsDto.class);

        System.out.println("Received the call");
        userService.saveUserDetails(userDetailsDto1);

//        System.out.println(userDetailsDto1);
    }


}
