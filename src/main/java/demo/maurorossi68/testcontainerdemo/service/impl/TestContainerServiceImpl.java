package demo.maurorossi68.testcontainerdemo.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.maurorossi68.testcontainerdemo.dao.NumberJDAO;
import demo.maurorossi68.testcontainerdemo.entity.NumberEntity;
import demo.maurorossi68.testcontainerdemo.service.TestContainerService;

@Service
public class TestContainerServiceImpl implements TestContainerService {

	@Autowired
	NumberJDAO numberJDAO;
	
	@Override
	public boolean verificarEsPar(String number) throws Exception {
		boolean value = Integer.valueOf(number)%2==0;
		NumberEntity data = new NumberEntity();
		data.setDate(new Date());
		data.setNumber(Integer.valueOf(number));
		numberJDAO.save(data);
		
		return value;
		
	}

}
