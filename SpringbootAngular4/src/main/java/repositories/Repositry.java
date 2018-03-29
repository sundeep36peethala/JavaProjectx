
package repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import model.Myclass;

@Repository
public interface Repositry extends MongoRepository<Myclass, String> {

}