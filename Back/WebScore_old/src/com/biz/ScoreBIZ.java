package com.biz;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vo.*;
import com.dao.*;
import com.entity.*;

@Service
public class ScoreBIZ {

	@Autowired
	ScoreDAO scoreDao;

	public List<ScoreEntity> getAllScore() {
		return scoreDao.getAllScore();
	}

	public int getDelScore(String del_name) {
		return scoreDao.getDelScore(del_name);
	}

	public int getInsertScore(ScoreVO vo) {
		return 0;
	}

	public ScoreEntity getFindScore(String name) {
		return scoreDao.getFindScore(name);
	}

	public int getUpdateScore(ScoreVO vo) {		
		// controller 받은 vo의 국, 영, 수학 총점 평균 학점을 구해서 entity대입 후
		// dao 에 전달 후 insert 결과를 리턴받는다.
		ScoreEntity se = new ScoreEntity();
		/* ScoreEntity se = new ScoreEntity(vo); 포함관계시 */
		ScoreCalc calc = new ScoreCalc();
		se.setName(vo.getName());
		se.setKor(vo.getKor());
		se.setEng(vo.getEng());
		se.setMat(vo.getMat());
		se.setTot(calc.getTot(vo.getKor(), vo.getEng(), vo.getMat()));
		se.setAvg(calc.getAvg(se.getTot()));
		se.setGrad(calc.getGrad(se.getAvg()));		
		return   scoreDao.getUpdateScore(se);
	}
}

