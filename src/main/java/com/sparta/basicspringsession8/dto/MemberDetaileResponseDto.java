package com.sparta.basicspringsession8.dto;

import lombok.Getter;

@Getter
public class MemberDetaileResponseDto {
    private final Long id;
    private final String name;

    public MemberDetaileResponseDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
