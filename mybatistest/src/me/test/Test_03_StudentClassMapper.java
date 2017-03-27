package me.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.alibaba.fastjson.JSON;

import me.dao.ClassStudentMapper;
import me.domain.Clazz;
import me.domain.StudentClassInfo;
import me.util.MyBatisUtil;

public class Test_03_StudentClassMapper {

	public static void main(String[] args) {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		ClassStudentMapper classStudentMapper=  sqlSession.getMapper(ClassStudentMapper.class);
		List<Clazz> lClazzs = classStudentMapper.getClazzInfo();
		System.out.println(JSON.toJSON(lClazzs));
		
		StudentClassInfo sClassInfo = classStudentMapper.getStudentClassInfoByID(9);
		System.out.println(sClassInfo.getClazz());
		System.out.println(JSON.toJSON(sClassInfo));
	}

}
