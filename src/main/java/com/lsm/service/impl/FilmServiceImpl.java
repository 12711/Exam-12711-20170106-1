package com.lsm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lsm.dto.Film;
import com.lsm.dto.Page;
import com.lsm.mapper.FilmMapper;
import com.lsm.service.FilmService;

@Service
public class FilmServiceImpl implements FilmService{
	
	@Autowired
	FilmMapper filmMapper;

	@Override
	public int insertFilm(Film film) {
		
		return filmMapper.insertFilm(film);
	}

	@Override
	public List<Film> queryByPage(Page page) {
		
		return  filmMapper.queryByPage(page);
	}

	@Override
	public int queryCount(Page page) {
		
		return filmMapper.queryCount((Film)page.getT());  
	}

	@Override
	public int deleteOne(Integer id) {
		
		return filmMapper.deleteById(id);
	}

	@Override
	public int updateOne(Film film) {
		
		return filmMapper.updateOne(film);
	}

}
