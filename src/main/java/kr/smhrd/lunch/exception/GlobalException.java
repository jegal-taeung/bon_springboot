package kr.smhrd.lunch.exception;

import kr.smhrd.lunch.util.api.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(IndexOutOfBoundsException.class)
    public ResponseEntity<ApiResponse<?>> indexOutOfBoundsException(IndexOutOfBoundsException ex) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(ApiResponse.fail("유효하지 않은 인덱스입니다.", HttpStatus.BAD_REQUEST));
    }
}
