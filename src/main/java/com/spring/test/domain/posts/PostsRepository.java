package com.spring.test.domain.posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long>{    /* Entity 타입, PK타입 */

}

