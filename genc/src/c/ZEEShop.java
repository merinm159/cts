package c;

import java.util.*;

public class ZEEShop extends Thread {

	private String memberCategory;
	private int count;
	private List<Member> memberList = new ArrayList<>();

	public ZEEShop(String memberCategory, List<Member> memberList) {
		this.memberCategory = memberCategory;
		this.memberList = memberList;
	}

	public String getMemberCategory() {
		return this.memberCategory;
	}

	public void setMemberCategory(String memberCategory) {
		this.memberCategory = memberCategory;
	}

	public int getCount() {
		return this.count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public List<Member> getMemberList() {
		return memberList;
	}

	public void setMemberList(List<Member> memberList) {
		this.memberList = memberList;
	}

	public void run() {
		for (Member m : memberList) {
			if (m.getCategory().equalsIgnoreCase(this.memberCategory))
				this.count++;
		}
	}

}
