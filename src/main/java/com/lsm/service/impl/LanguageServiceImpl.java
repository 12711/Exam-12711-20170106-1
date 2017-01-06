package com.lsm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lsm.dto.Language;
import com.lsm.mapper.LanguageMapper;
import com.lsm.service.LanguageService;

@Service
public class LanguageServiceImpl  implements LanguageService{
   @Autowired
   LanguageMapper languageMapper;
   
	@Override
	public List<Language> queryAll() {
	
		return languageMapper.queryAll();
	}

}
