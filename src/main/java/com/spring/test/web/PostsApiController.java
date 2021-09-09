package com.spring.test.web;

import com.spring.test.service.posts.PostsService;
import com.spring.test.web.dto.PostsResponseDto;
import com.spring.test.web.dto.PostsSaveRequestDto;
import com.spring.test.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")   /* 등록 API*/
    public Long save(@RequestBody PostsSaveRequestDto requestDto){
        return postsService.save(requestDto);
    }
    
    @PutMapping("/api/v1/posts/{id}")   /* 수정 API*/
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto){
        return postsService.update(id, requestDto);
    }
    
    @GetMapping("/api/v1/posts/{id}")   /* 조회 API*/
    public PostsResponseDto findById (@PathVariable Long id){
        return postsService.findById(id);
    }
}
