package com.model;

/**
 * TStu generated by MyEclipse Persistence Tools
 */

public class TStu implements java.io.Serializable
{

	private Integer stuId;
	
	private String stuXuehao;
	private String stuRealname;
	private String stuSex;
	private String stuAge;


	private String loginName;
	private String loginPw;
	private String del;
	
	
	public String getDel()
	{
		return del;
	}
	public void setDel(String del)
	{
		this.del = del;
	}
	public String getLoginName()
	{
		return loginName;
	}
	public void setLoginName(String loginName)
	{
		this.loginName = loginName;
	}
	public String getLoginPw()
	{
		return loginPw;
	}
	public void setLoginPw(String loginPw)
	{
		this.loginPw = loginPw;
	}
	public String getStuAge()
	{
		return stuAge;
	}
	public void setStuAge(String stuAge)
	{
		this.stuAge = stuAge;
	}
	public Integer getStuId()
	{
		return stuId;
	}
	public void setStuId(Integer stuId)
	{
		this.stuId = stuId;
	}
	public String getStuRealname()
	{
		return stuRealname;
	}
	public void setStuRealname(String stuRealname)
	{
		this.stuRealname = stuRealname;
	}
	public String getStuSex()
	{
		return stuSex;
	}
	public void setStuSex(String stuSex)
	{
		this.stuSex = stuSex;
	}
	public String getStuXuehao()
	{
		return stuXuehao;
	}
	public void setStuXuehao(String stuXuehao)
	{
		this.stuXuehao = stuXuehao;
	}

}