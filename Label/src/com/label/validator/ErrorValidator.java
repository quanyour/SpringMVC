package com.label.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.label.bean.ErrorBean;

public class ErrorValidator implements Validator{

	@Override
	public boolean supports(Class<?> arg0) {
		return ErrorBean.class.equals(arg0);
	}

	@Override
	public void validate(Object arg0, Errors arg1) {
		ValidationUtils.rejectIfEmpty(arg1, "username", null,"�û�������Ϊ��");
		ValidationUtils.rejectIfEmpty(arg1, "sex", null,"�Ա���Ϊ��");
		ValidationUtils.rejectIfEmpty(arg1, "age", null,"���䲻��Ϊ��");
	}
	
}
