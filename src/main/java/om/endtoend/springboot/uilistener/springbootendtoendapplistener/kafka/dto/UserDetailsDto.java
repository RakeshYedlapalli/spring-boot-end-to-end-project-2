package om.endtoend.springboot.uilistener.springbootendtoendapplistener.kafka.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class UserDetailsDto implements Serializable {

    private Integer userId;
    private String username;
    private String firstName;
    private String lastName;
    private String dob;
    private String password;
}
