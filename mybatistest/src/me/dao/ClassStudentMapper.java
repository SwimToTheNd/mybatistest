package me.dao;

import java.util.List;

import me.domain.Clazz;
import me.domain.StudentClassInfo;
import net.sf.cglib.core.ClassInfo;

public interface ClassStudentMapper {

	public List<Clazz> getClazzInfo();
	
	public StudentClassInfo getStudentClassInfoByID(int id);
}
