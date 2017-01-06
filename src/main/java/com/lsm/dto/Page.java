package com.lsm.dto;

public class Page<T> {
	private int page;
	private int pageSize;
	private T t;

	public Page() {
		super();
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public T getT() {
		return t;
	} 

	public void setT(T t) {
		this.t = t;
	}
	
	public int getOffset(){
		return (page-1)*pageSize;
	}

	@Override
	public String toString() { 
		return "Page [page=" + page + ", pageSize=" + pageSize + ", t=" + t + "]";
	}
   
}
