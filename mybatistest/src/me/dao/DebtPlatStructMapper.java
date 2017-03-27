package me.dao;

import java.util.List;
import me.domain.DebtPlatStruct;
import me.domain.DebtPlatStructInfo;

public interface DebtPlatStructMapper {

	public List<DebtPlatStruct> getDebtPlatStruct();
	
	public List<DebtPlatStructInfo> getDebtPlatStructInfoById(String period);
}
