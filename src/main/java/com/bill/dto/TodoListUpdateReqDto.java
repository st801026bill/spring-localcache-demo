package com.bill.dto;

import io.swagger.v3.oas.annotations.media.Schema;

public class TodoListUpdateReqDto {
    @Schema(description = "seqNo", required = true, example = "1")
    public Integer seqNo;
    @Schema(description = "todo", required = true, example = "運動")
    public String todo;
}
