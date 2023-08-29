package job.in;

import org.springframework.data.mongodb.repository.MongoRepository;

import job.in.models.Post;

public interface PostRepository extends MongoRepository<Post,String>{
	

}
