package com.acadmaster.springRest.ExceptionHandler;

        import java.util.Date;
        import java.util.NoSuchElementException;
        import org.springframework.http.HttpStatus;
        import org.springframework.http.ResponseEntity;
        import org.springframework.web.bind.annotation.ControllerAdvice;
        import org.springframework.web.bind.annotation.ExceptionHandler;
        import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    ErrorHandler errObj = new ErrorHandler();

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorHandler> handleAllUncaughtException(Exception exception) {
        errObj.setTimestamp(new Date().toString());
        errObj.setStatus("500");
        errObj.setErrorMessage("Page not found!");
        return new ResponseEntity<ErrorHandler>(errObj,HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<ErrorHandler> generateException()
    {
        errObj.setTimestamp(new Date().toString());
        errObj.setStatus("404");
        errObj.setErrorMessage("Invalid request! Value is not present in DB.");
        return new ResponseEntity<ErrorHandler>(errObj,HttpStatus.NOT_FOUND);
    }





    /* @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<ErrorHandler> NoHandlerException()
    {
        errObj.setTimestamp(new Date().toString());
        errObj.setStatus("404");
        errObj.setErrorMessage("Invalid request! Value is not present in DB.");
        return new ResponseEntity<ErrorHandler>(errObj,HttpStatus.NOT_FOUND);
    }*/

    /*@ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ErrorHandler> generateException(RuntimeException re)
    {
        errObj.setTimestamp(new Date().toString());
        errObj.setStatus("404");
        errObj.setErrorMessage("Page not found!");
        return new ResponseEntity<ErrorHandler>(errObj,HttpStatus.INTERNAL_SERVER_ERROR);
    }*/

}
