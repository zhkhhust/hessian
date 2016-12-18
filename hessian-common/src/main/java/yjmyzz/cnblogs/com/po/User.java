package yjmyzz.cnblogs.com.po;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4392644100936978550L;

	private String passport;
	private Date createDate;

	public String getPassport() {
		return passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
