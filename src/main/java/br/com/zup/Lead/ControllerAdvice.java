package br.com.zup.Lead;

import br.com.zup.Lead.exception.MensagemDeErro;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public List<MensagemDeErro> manipularErrosDeValidacao(MethodArgumentNotValidException exception) {
        List<MensagemDeErro> erros = new ArrayList<>();

        for (FieldError fieldError : exception.getFieldErrors()) {
           MensagemDeErro erroCamposVazio = new MensagemDeErro(fieldError.getDefaultMessage(), fieldError.getField());
            erros.add(erroCamposVazio);
        }
        return erros;
    }
}
