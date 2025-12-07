package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.InquiryDao;
import com.example.demo.entity.Inquiry;

@Service
public class InquiryServiceImpl implements InquiryService {

	private final InquiryDao dao;
	
	@Autowired 
	InquiryServiceImpl(InquiryDao dao) {
		// TODO 自動生成されたメソッド・スタブ
		this.dao = dao;

	}
	
	@Override
	public void save(Inquiry inquiry) {
		// TODO 自動生成されたメソッド・スタブ
		dao.insertInquiry(inquiry);

	}

	@Override
	public List<Inquiry> getAll() {
		// TODO 自動生成されたメソッド・スタブ
		return dao.getAll();
	}

	@Override
	public void update(Inquiry inquiry) {
		// TODO 自動生成されたメソッド・スタブ
		if(dao.updateInquiry(inquiry) == 0) {
			throw new InquiryNotfoundException("can't find the same ID");
		}
		
	}

}
