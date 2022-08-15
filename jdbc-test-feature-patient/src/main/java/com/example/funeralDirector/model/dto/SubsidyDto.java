package main.java.com.example.funeralDirector.model.dto;

import java.util.List;

import main.java.com.example.funeralDirector.model.dao.SubsidyDao;

public class SubsidyDto {
	private String SubsidyName; 
	private int Subsidy;
	private String Account_number;
	
	public SubsidyDto() {
		// TODO Auto-generated constructor stub
	}

	public String getSubsidyName() {
		return SubsidyName;
	}

	public void setSubsidyName(String subsidyName) {
		SubsidyName = subsidyName;
	}

	public int getSubsidy() {
		return Subsidy;
	}

	public void setSubsidy(int subsidy) {
		Subsidy = subsidy;
	}

	public String getAccount_number() {
		return Account_number;
	}

	public void setAccount_number(String account_number) {
		Account_number = account_number;
	}

	
	@Override
	public String toString() {
		return "돈낸사람 " 
				+ SubsidyName + "\n, "
				+ "Subsidy=" + Subsidy +"\n"
				+ "Account_number=" + Account_number  +"\n"
				+ "부조한 한 사람 :" + getSubsidyName() +"\n"
				+ "부조한 금액 :" + getSubsidy() +"\n"
				+ "들어온 계좌 정보 :"+ getAccount_number() +"\n"
				+ "getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public List<SubsidyDao> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
