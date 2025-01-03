package com.mindlink.forum.models.DTO.CommentDtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentCreateDto {

    private String content;
    private Long postId;
    private Long userId;

}
