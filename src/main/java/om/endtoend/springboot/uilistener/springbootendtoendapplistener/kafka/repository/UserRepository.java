package om.endtoend.springboot.uilistener.springbootendtoendapplistener.kafka.repository;


import om.endtoend.springboot.uilistener.springbootendtoendapplistener.kafka.model.UserDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<UserDetails,String> {

}
