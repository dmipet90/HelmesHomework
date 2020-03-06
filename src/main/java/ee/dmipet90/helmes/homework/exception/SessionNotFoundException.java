package ee.dmipet90.helmes.homework.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Session not found")
public class SessionNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
}
