package com.spring.test.domain.posts;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Builder;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@NoArgsConstructor
@Entity
public class Posts {

    @Id /* 해당 테이블 Pk */
    @GeneratedValue(strategy = GenerationType.IDENTITY) /* PK 생성규칙 */
    private Long id;

    @Column(length= 500, nullable = false)  /* 테이블 컬럼 조건 */
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author){

        this.title = title;
        this.content = content;
        this.author = author;
    }


}

