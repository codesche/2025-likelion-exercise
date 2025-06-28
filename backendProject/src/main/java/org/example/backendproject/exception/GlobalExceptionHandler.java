package org.example.backendproject.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException.Conflict;
import org.springframework.web.client.HttpClientErrorException.MethodNotAllowed;
import org.springframework.web.client.HttpClientErrorException.NotFound;
import org.springframework.web.client.HttpClientErrorException.TooManyRequests;
import org.springframework.web.client.HttpClientErrorException.UnprocessableEntity;
import org.springframework.web.client.HttpClientErrorException.UnsupportedMediaType;
import org.springframework.web.client.HttpServerErrorException.BadGateway;
import org.springframework.web.client.HttpServerErrorException.GatewayTimeout;
import org.springframework.web.client.HttpServerErrorException.ServiceUnavailable;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@RestControllerAdvice       // 스프링에서 모든 컨트롤러의 예외를 한 곳에서 처리하기 위한 어노테이션
@Slf4j
public class GlobalExceptionHandler {

    // 400: 파라미터 타입 오류, JSON 파싱 오류 등
    @ExceptionHandler({
        MethodArgumentTypeMismatchException.class,
        HttpMessageNotReadableException.class,
        MissingServletRequestParameterException.class
    })
    public ResponseEntity<?> handleBadRequest(Exception e) {
        log.warn("[BAD_REQUEST] {}", e.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("잘못된 요청이라요: " + e.getMessage());
    }

    // 컨트롤러에서 RuntimeException 에러가 발생했을 때 이 메서드가 대신 처리하도록 매핑
    @ExceptionHandler(value = RuntimeException.class)
    public ResponseEntity<ErrorResponse> handleRuntimeException(RuntimeException e) {
        ErrorResponse errorResponse = new ErrorResponse(
            400,
            "내가 전달하는 메세지",
            e.getMessage()
        );

        log.error(errorResponse.toString());

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
    }

    // 400: DTO validation(@Valid) 실패
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleValidationException(MethodArgumentNotValidException e) {
        log.warn("[VALIDATION_FAIL] {}", e.getMessage());

        //유효성 검증 실패한 모든 필드 오류 리스트를 가져옴
        //유효성 검증 실패한 필드명과 이유를 콤마로 연결해서 한 줄 메시지로 만들어줌
        String msg = e.getBindingResult().getFieldErrors().stream()
            .map(fieldError -> fieldError.getField() + ": " + fieldError.getDefaultMessage())
            .reduce((m1, m2) -> m1 + ", " + m2)
            .orElse("유효성 검사 실패");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(msg);
    }

    // 401: 인증 실패
    @ExceptionHandler(BadCredentialsException.class)
    public ResponseEntity<?> handleBadCredentials(BadCredentialsException e) {
        log.warn("[LOGIN_FAIL] {}", e.getMessage());
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(e.getMessage());
    }

    // 403: 인가(권한) 실패
    @ExceptionHandler(AccessDeniedException.class)
    public ResponseEntity<?> handleAccessDenied(AccessDeniedException e) {
        log.warn("[ACCESS_DENIED] {}", e.getMessage());
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body("권한이 없습니다.");
    }

    // 404: 리소스 없음
    @ExceptionHandler(NotFound.class)
    public ResponseEntity<?> handleNotFound(NotFound e) {
        log.warn("[NOT_FOUND] {}", e.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("리소스가 없습니다.");
    }

    // 405: 허용하지 않는 메서드
    @ExceptionHandler(MethodNotAllowed.class)
    public ResponseEntity<?> handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        log.warn("[METHOD_ARGUMENT_NOT_VALID] {}", e.getMessage());
        return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED).body("허용하지 않는 메서드입니다.");
    }

    // 409: 요청 충돌 - 예) 중복 데이터
    @ExceptionHandler(Conflict.class)
    public ResponseEntity<?> handleConflict(Conflict e) {
        log.warn("[CONFLICT] {}", e.getMessage());
        return ResponseEntity.status(HttpStatus.CONFLICT).body("요청이 충돌하고 있습니다.");
    }

    // 415: 지원하지 않는 미디어 타입
    @ExceptionHandler(UnsupportedMediaType.class)
    public ResponseEntity<?> handleUnsupportedMediaType(UnsupportedMediaType e) {
        log.warn("[UNSUPPORTED_MEDIA_TYPE] {}", e.getMessage());
        return ResponseEntity.status(HttpStatus.UNSUPPORTED_MEDIA_TYPE).body("지원하지 않는 미디어 타입입니다.");
    }

    // 422: 처리할 수 없는 엔티티(유효성 통과 실패 등)
    @ExceptionHandler(UnprocessableEntity.class)
    public ResponseEntity<?> handleUnprocessableEntity(UnprocessableEntity e) {
        log.warn("[UNPROCESSABLE_ENTITY] {}", e.getMessage());
        return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body("처리할 수 없는 엔티티입니다.");
    }

    // 429: 너무 많은 요청(요청 제한)
    @ExceptionHandler(TooManyRequests.class)
    public ResponseEntity<?> handleTooManyRequests(TooManyRequests e) {
        log.warn("[TOO_MANY_REQUESTS] {}", e.getMessage());
        return ResponseEntity.status(HttpStatus.TOO_MANY_REQUESTS).body("너무 많은 요청이 들어오고 있습니다.");
    }

    // 500: 그 외 모든 예외
    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handleException(Exception e) {
        log.error("[EXCEPTION][UNHANDLED] ", e);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("서버 내부 오류가 발생했습니다.");
    }

    // 502: 게이트웨이/프록시 오류
    @ExceptionHandler(BadGateway.class)
    public ResponseEntity<?> handleBadGateway(BadGateway e) {
        log.warn("[BAD_GATEWAY] {}", e.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body("게이트웨이/프록시 오류가 발생했습니다.");
    }

    // 503: 서비스 사용 불가
    @ExceptionHandler(ServiceUnavailable.class)
    public ResponseEntity<?> handleServiceUnavailable(ServiceUnavailable e) {
        log.warn("[SERVICE_UNAVAILABLE] {}", e.getMessage());
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body("서비스를 사용할 수 없습니다.");
    }

    // 504: 게이트웨이/프록시 시간 초과
    @ExceptionHandler(GatewayTimeout.class)
    public ResponseEntity<?> handleGatewayTimeout(GatewayTimeout e) {
        log.warn("[GATEWAY_TIMEOUT] {}", e.getMessage());
        return ResponseEntity.status(HttpStatus.GATEWAY_TIMEOUT).body("게이트웨이/프록시 시간 초과가 발생했습니다.");
    }


}
