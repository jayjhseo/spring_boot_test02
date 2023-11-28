package com.test001.sbb10;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Sbb10ApplicationTests {
	@Autowired
	private ArticleRepository articleRepository;
	@Test
	void test01() {
		Article a = new Article();
		a.setTitle("제목 1");
		a.setContent("내용 1");
		this.articleRepository.save(a);

	}

}
