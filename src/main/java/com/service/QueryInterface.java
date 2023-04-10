package com.service;

import java.util.List;

import com.Model.Query;
import com.exception.QueryException;

public interface QueryInterface {

	public List<Query> getAllQueries();
	public Query updateQuery(int qid,String Answer) throws QueryException;
}
