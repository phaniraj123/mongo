package mongodbexample;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface StuRep extends MongoRepository<Student, Integer> {
    // void deleteById(Integer id);

}
    

