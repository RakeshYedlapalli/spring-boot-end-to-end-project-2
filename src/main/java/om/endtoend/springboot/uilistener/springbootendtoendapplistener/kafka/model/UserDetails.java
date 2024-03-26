package om.endtoend.springboot.uilistener.springbootendtoendapplistener.kafka.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "user_details")
public class UserDetails {

    @Id
    private String userId;
    private String username;
    private String firstName;
    private String lastName;
    private String dob;
    private String password;
}
