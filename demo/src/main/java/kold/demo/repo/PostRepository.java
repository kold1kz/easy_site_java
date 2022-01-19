package kold.demo.repo;

import kold.demo.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository  extends CrudRepository<Post, Long> {

}
