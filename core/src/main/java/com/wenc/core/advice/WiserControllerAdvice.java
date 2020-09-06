package com.wenc.core.advice;

import com.wenc.core.exception.ServiceException;
import com.wenc.core.model.BaseRetModel;
import com.wenc.core.util.LogHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Wiser切面捕捉异常处理。
 *
 * @author w.li
 * @date 2020-1-30
 * @since 1.0
 *
 */
@RestControllerAdvice
public class WiserControllerAdvice {

    private Logger LOG = LoggerFactory.getLogger(WiserControllerAdvice.class);

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){

    }

    @ExceptionHandler({ServiceException.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public BaseRetModel<String> handlerServiceException(
            HttpServletRequest request,
            HttpServletResponse response,
            ServiceException serviceExcpetion)
    {
        BaseRetModel<String> retModel = new BaseRetModel<>();
        LogHelper.debug(LOG,"ServiceException:code {}, msg {}",serviceExcpetion.getErrCode(),serviceExcpetion.getErrCode());
        return retModel.err(serviceExcpetion.getErrCode(),serviceExcpetion.getErrMsg());

    }

}
