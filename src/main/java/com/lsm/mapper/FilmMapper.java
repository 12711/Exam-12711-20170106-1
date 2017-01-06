package com.lsm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lsm.dto.Film;
import com.lsm.dto.Page;

public interface FilmMapper {
	public Film queryByFileName(Film film);
	   
	   public int insertFilm(Film film);
	   
	   public int queryCount(Film film);
	   
	   public List<Film> queryByPage(Page page);
	   
	   public int deleteById(@Param("id")Integer id);
	   
	   public int updateOne(Film film);
}
