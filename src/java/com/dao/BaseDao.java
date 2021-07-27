package com.dao;

import com.mysql.jdbc.Connection;
import java.io.Serializable;
import java.util.List;

/**
 * @author Administrator

 */
public interface BaseDao {

	/**
	 * 加载制定ID的持久化对象
	 * 
	 * @param clazz
	 * @param id
	 */
	public Object loadById(Class clazz, Serializable id);

	/**
	 * 加载满足条件的持久化对象
	 * 
	 * @param hql
	 */
	public Object loadObject( String hql);

	/**
	 * 删除制定ID的持久化对象
	 * 
	 * @param clazz
	 * @param id
	 */
	public void  delById(Class clazz, Serializable id);

	/**
	 * 保存或更新制定持久化对象
	 * 
	 * @param obj
	 */
	public void saveOrUpdate(Object obj);

	/**
	 * 装载制定类的所有持久化对象
	 * 
	 * @param clazz
	 */
	public List listAll(String clazz);

	/**
	 * 分页装载制定类的所有持久化对象
	 * 
	 * @param clazz
	 * @param pageNo
	 * @param pageSize
	 */
	public List listAll(String clazz, int pageNo, int pageSize);

	/**
	 * 统计指定类的所有持久化对象
	 * 
	 * @param clazz
	 */
	public int countAll(String clazz);

	/**
	 * 查询指定类的满足条件的持久化对象
	 * 
	 * @param hql
	 */
	public List query(String hql);

	/**
	 * 分页查询指定类的满足条件的持久化对象
	 * 
	 * @param hql
	 * @param pageNo
	 * @param pageSize
	 */
	public List query(String hql, int pageNo, int pageSize);

	/**
	 * 统计指定类的查询结果
	 * 
	 * @param hql
	 */
	public int countQuery(String hql);

	/**
	 * 条件更新数据库
	 * 
	 * @param hql
	 */
	public int update(String hql);

	/**
	 * 从连接池获取JDBC连接
	 */
	public Connection getConnection();
        
       
        
}