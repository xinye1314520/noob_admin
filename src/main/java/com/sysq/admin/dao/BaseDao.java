package com.sysq.admin.dao;

import java.util.List;

public interface BaseDao<T> {

	List<T> list();
}
