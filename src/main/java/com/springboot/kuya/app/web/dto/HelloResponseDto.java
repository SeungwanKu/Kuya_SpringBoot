package com.springboot.kuya.app.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class HelloResponseDto {

    private final String name;
    private final String contents;
    private final int amount;
    private final int iq;
}
