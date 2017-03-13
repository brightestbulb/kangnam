package org.kangnam.persistence;

import java.util.List;

import org.kangnam.domain.SlVO;

public interface SlDAO
{
	// 금일 판매 금액 출력
	public List<SlVO> today_sell() throws Exception;

}
