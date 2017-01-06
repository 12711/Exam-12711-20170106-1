package com.lsm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lsm.dto.Film;
import com.lsm.dto.Page;
import com.lsm.dto.ResponseData;
import com.lsm.service.FilmService;

@RestController
@RequestMapping(path = "/file")
public class FilmController {
	@Autowired
	FilmService filmService;  

	@RequestMapping(path = "/querypage", method = RequestMethod.POST)
	public ResponseData<Film> queryByPage(@RequestParam("title") String title,
			@RequestParam(name = "page", defaultValue = "1") int page,
			@RequestParam(name = "pageSize", defaultValue = "10") int pageSize) {
		ResponseData<Film> datas = new ResponseData<>();
		Page page1 = new Page();
		page1.setPage(page); 
		page1.setPageSize(pageSize);
		Film film = new Film();
		film.setTitle(title); 
		page1.setT(film);
		
		System.out.println(title+":"+page+":"+pageSize);
		
		System.out.println("页数="+filmService.queryCount(page1));
		int totle = filmService.queryCount(page1) % pageSize == 0 ? filmService.queryCount(page1) / pageSize
				: filmService.queryCount(page1)/pageSize + 1; 
		datas.setTotle(totle);
		
		System.out.println("page1="+page1);
		
		datas.setFilms(filmService.queryByPage(page1));
		return datas;
	}
	
	@RequestMapping(path="/delete")
	public ResponseData<Film> deleteOne(@RequestParam("filmId") Integer filmId){
		System.out.println("filmld="+filmId);
		ResponseData<Film> responseData=new ResponseData<>();
		try{
		   filmService.deleteOne(filmId); 
		   responseData.setMessage("删除成功!");
		 }catch(Exception e){
			responseData.setMessage("删除失败");
		}
		
		return responseData;
	}
	
	@RequestMapping(path="/update",method=RequestMethod.POST)
	public ResponseData<Film> updateFilm(@RequestBody Film film){
		
		System.out.println("Film="+film);
		ResponseData<Film> responseData=new ResponseData<>();
		filmService.updateOne(film);
		return responseData;
	}
	
	@RequestMapping(path="/insert",method=RequestMethod.POST)
	public ResponseData<Film> insertFilm(@RequestBody Film film){
		
		System.out.println("Filminsert="+film);
		ResponseData<Film> responseData=new ResponseData<>();
		filmService.insertFilm(film);
		responseData.setMessage("插入成功");
		return responseData;
	}
	
}
