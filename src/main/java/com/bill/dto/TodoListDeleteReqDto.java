package com.bill.dto;

import io.swagger.v3.oas.annotations.media.Schema;

public class TodoListDeleteReqDto {
    @Schema(description = "seqNo", required = true, example = "1")
    public Integer seqNo;
}
