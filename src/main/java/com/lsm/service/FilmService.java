package com.lsm.service;

import java.util.List;

import com.lsm.dto.Film;
import com.lsm.dto.Page;

public interface FilmService {
	 
		//插入电影
		int insertFilm(Film film);
		
		//分页模糊查询电影
		List<Film> queryByPage(Page page);
		
		//查询总数
		
		int queryCount(Page page);
		
		int deleteOne(Integer id);
		
		int updateOne(Film film);
}
