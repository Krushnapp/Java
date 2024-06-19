@ExceptionHandler:

Handles exceptions thrown by request handling methods in controllers.
@ControllerAdvice:

Global controller advice that allows centralized exception handling across multiple controllers.
@RestControllerAdvice:

Combination of @ControllerAdvice and @ResponseBody, specifically for RESTful web services.
@ResponseStatus:

Specifies the HTTP status code to be returned when a specific exception is thrown.
@ResponseStatusException:

Allows for easy creation of exceptions with specific HTTP status codes and optional reason phrases.
@ExceptionHandler + @ResponseStatus:

Combination of @ExceptionHandler and @ResponseStatus to handle and specify the HTTP status code for exceptions.
@Order:

Specifies the order of execution for multiple @ExceptionHandler methods in different @ControllerAdvice classes.
@ControllerAdvice + @Order:

Combination of @ControllerAdvice and @Order to provide ordered exception handling across multiple advice classes.