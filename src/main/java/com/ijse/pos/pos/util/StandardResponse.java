package com.ijse.pos.pos.util;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class StandardResponse {
    private int code;
    private String message;
    private Object data;
}
