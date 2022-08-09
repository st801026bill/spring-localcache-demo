package com.bill.dto;

import io.swagger.v3.oas.annotations.media.Schema;

public class TodoListCreateReqDto {
    @Schema(description = "todo", required = true, example = "運動")
    public String todo;
}
