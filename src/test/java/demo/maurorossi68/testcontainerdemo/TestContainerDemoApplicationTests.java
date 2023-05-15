package demo.maurorossi68.testcontainerdemo;

import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.testcontainers.junit.jupiter.Testcontainers;

import demo.maurorossi68.testcontainerdemo.TestContainerDemoApplication;
import demo.maurorossi68.testcontainerdemo.dao.NumberJDAO;
import demo.maurorossi68.testcontainerdemo.entity.NumberEntity;

@Testcontainers
@TestInstance(Lifecycle.PER_METHOD)
@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = {
        TestContainerDemoApplication.class,
        OracleTestProfileJPAConfig.class})
class TestContainerDemoApplicationTests {

	@Autowired
	NumberJDAO numberJDAO;
	
	@Test
	void contextLoads() {
		NumberEntity data = new NumberEntity();
		data.setDate(new Date());
		data.setNumber(3);
		System.out.println("Creado un dato en DB");
		Assertions.assertNotNull(numberJDAO.save(data));
	}

}
