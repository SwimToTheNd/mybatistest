package me.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.alibaba.fastjson.JSON;

import me.dao.DebtPlatStructMapper;
import me.domain.DebtPlatStruct;
import me.domain.DebtPlatStructInfo;
import me.util.MyBatisUtil;

/**
 * 测试一对多的映射
 * 
 * @author BloodFly
 *
 */
public class Test_02_Mapper {
	public static void main(String[] args) {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		DebtPlatStructMapper dPlatStructMapper = sqlSession.getMapper(DebtPlatStructMapper.class);
		List<DebtPlatStruct> debtPlatStructs = dPlatStructMapper.getDebtPlatStruct();
		System.out.println(JSON.toJSONString(debtPlatStructs));
		
		System.out.println(JSON.toJSON(null));
		
		List<DebtPlatStructInfo> lPlatStructInfos = dPlatStructMapper.getDebtPlatStructInfoById("2018");
		System.out.println(JSON.toJSON(lPlatStructInfos));
	}
}
