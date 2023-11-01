package com.xavero.jobs_manager.exceptions

import org.springframework.context.MessageSource
import org.springframework.context.i18n.LocaleContextHolder
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@ControllerAdvice
class ExceptionHandlerController(private val messageSource: MessageSource) {

    @ExceptionHandler(MethodArgumentNotValidException::class)
    fun handleMethodArgumentNotValidException(e: MethodArgumentNotValidException): ResponseEntity<ArrayList<CustomErrorMessage>> {
        val errorList: ArrayList<CustomErrorMessage> = ArrayList()
        e.bindingResult.fieldErrors.forEach { err ->
            val message = messageSource.getMessage(err, LocaleContextHolder.getLocale())
            errorList.add(
                CustomErrorMessage(message, err.field)
            )
        }
        return ResponseEntity(errorList, HttpStatus.BAD_REQUEST)
    }

//    @ExceptionHandler(UserFoundException::class)
//    fun handleUserFoundException(e: UserFoundException): ResponseEntity<CustomErrorMessage> {
//        val message = messageSource.getMessage("user.found", null, LocaleContextHolder.getLocale())
//        return ResponseEntity(CustomErrorMessage(message), HttpStatus.BAD_REQUEST)
//    }
}