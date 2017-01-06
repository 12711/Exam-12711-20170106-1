package com.lsm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lsm.dto.Language;
import com.lsm.dto.ResponseData;
import com.lsm.service.LanguageService;

@RestController
@RequestMapping(path = "/language")
public class LanguageController {

	@Autowired 
	LanguageService languageService; 

	@RequestMapping(path = "/all", method = RequestMethod.GET)
	public ResponseData<Language> queryAllLang() {
		ResponseData<Language> responseData = new ResponseData<>();
		responseData.setFilms(languageService.queryAll());
		return responseData;
	}

}
